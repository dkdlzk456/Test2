package com.example.pc.test2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class MyDb extends SQLiteOpenHelper {

    public MyDb(Context context) {
        super(context, "my_db", null, 1);
    }

    // jssong.comment.181204
    // onCreate는 최초 한번 실행된 후에는 다시는 실행되지 않음.
    // 그러므로 데이터를 추가할 경우는 앱을 지운 후에 다시 설치해야 함.!!!!
    // 또는 onUpgrade와 version을 사용해도 됨(옵션)
    @Override
    public void onCreate(SQLiteDatabase db) { //MYSQL DB와 같은 개념 TABLE 안에 IDX가 오토로 생성되고
        // content 타입을 VARCHAR() 대신 TEXT으로 하면 글자 수 상관없이 속도가 같다.
        db.execSQL("CREATE TABLE character (" +
                "_id INTEGER  PRIMARY KEY AUTOINCREMENT, " +
                "title TEXT, " +
                "name TEXT, " +
                "height TEXT, " +
                "star TEXT, " +
                "hp TEXT, " +
                "gender INTEGER, " +
                "blood INTEGER, " +
                "horo INTEGER, " +
                "month INTEGER, " +
                "day INTEGER)");

        for(int i = 0; i < G.CHAR_NAMES.length; i++) {
            insertCharactor(db, G.CHAR_TITLE[i], G.CHAR_NAMES[i], G.CHAR_HEIGHTS[i], G.CHAR_STAR[i], G.CHAR_HP[i], G.CHAR_GENDERS[i], G.CHAR_BLOODS[i], G.CHAR_HOROS[i], G.CHAR_MONTHS[i], G.CHAR_DAYS[i]);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void insertCharactor(SQLiteDatabase db, String title, String name, String height, String star, String hp, int gender, int blood, int horo, int month, int day) {
//        SQLiteDatabase db = getWritableDatabase();
        Object[] args = {title, name, height, star, hp, gender, blood, horo, month, day};
        db.execSQL("INSERT INTO character(title, name, height, star, hp, gender, blood, horo, month, day) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", args);
    }

    public  List<CharacterItem> selectCharacterItems(int matchGender, int matchBlood, int matchBlood2, int matchHoro,int matchHoro2,int matchHoro3){
        SQLiteDatabase db = getReadableDatabase();
        String[] args = {String.valueOf(matchGender), String.valueOf(matchBlood),String.valueOf(matchBlood2), String.valueOf(matchHoro),String.valueOf(matchHoro2),String.valueOf(matchHoro3)};
//        Cursor cursor = db.rawQuery("SELECT * FROM character WHERE gender=? AND blood=? AND blood=? AND horo=? AND horo=? AND horo=?", args);
//        String[] args = {String.valueOf(matchGender), String.valueOf(matchBlood),String.valueOf(matchBlood2)};
        Cursor cursor = db.rawQuery("SELECT * FROM character WHERE gender=? AND (blood=? OR blood=?) AND (horo=? OR horo=? OR horo=?)", args);

        List<CharacterItem> characterItems = new ArrayList<>();

        while (cursor.moveToNext()){
            int _id = cursor.getInt(0);
            String title = cursor.getString(1);
            String name = cursor.getString(2);
            String height = cursor.getString(3);
            String star = cursor.getString(4);
            String hp = cursor.getString(5);
            int gender = cursor.getInt(6);
            int blood = cursor.getInt(7);
            int horo = cursor.getInt(8);
            int month = cursor.getInt(9);
            int day = cursor.getInt(10);

            CharacterItem characterItem = new CharacterItem();
            characterItem.set_id(_id);
            characterItem.setTitle(title);
            characterItem.setName(name);
            characterItem.setHeight(height);
            characterItem.setStar(star);
            characterItem.setHp(hp);
            characterItem.setGender(gender);
            characterItem.setBlood(blood);
            characterItem.setHoro(horo);
            characterItem.setMonth(month);
            characterItem.setDay(day);

            characterItems.add(characterItem);
        }
        db.close();
        return characterItems;
    }
}
