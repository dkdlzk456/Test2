package com.example.pc.test2;

import android.app.ProgressDialog;
import android.content.Intent;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;

import android.widget.AdapterView;

import android.widget.ArrayAdapter;

import android.widget.ListView;


import java.util.ArrayList;

import java.util.List;

import static com.example.pc.test2.G.CHAR_HOROS;


public class CharListActivity extends FragmentActivity {

    ListView charListView;
    //    List<String> findNames;
//    ArrayAdapter<String> charAdapter;
    List<CharacterItem> characterItems;
    CharacterAdapter charAdapter;

    int matchBlood;
    int matchHoro;
    int matchGender;
    int mathBlood2;
    int matchHoro2;
    int matchHoro3;

    private Handler mHandler;
    private ProgressDialog mProgressDialog;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_list);
        charListView = findViewById(R.id.charListView);

        mHandler = new Handler();

        runOnUiThread(new Runnable()
        {
            @Override
            public void run()
            {
                mProgressDialog = ProgressDialog.show(CharListActivity.this,"",
                        "잠시만 기다려 주세요 \n라고 제작자가 말합니다.",true);
                mHandler.postDelayed( new Runnable()
                {
                    @Override
                    public void run()
                    {
                        try
                        {
                            if (mProgressDialog!=null&&mProgressDialog.isShowing()){
                                mProgressDialog.dismiss();
                            }
                        }
                        catch ( Exception e )
                        {
                            e.printStackTrace();
                        }
                    }
                }, 1000);
            }
        } );









        // 매칭 정보를 전달 받음
        Intent intent = getIntent();
        mathBlood2 = intent.getIntExtra("mathBlood2", 0);
        matchGender = intent.getIntExtra("matchGender", 0);
        matchBlood = intent.getIntExtra("matchBlood", 0);
        matchHoro = intent.getIntExtra("matchHoro", 0);
        matchHoro2 = intent.getIntExtra("matchHoro2",0);
        matchHoro3 = intent.getIntExtra("matchHoro3",0);

// 전달받은 매칭 정보로 캐릭터들을 찾아서 리스트 변수에 담아줌

//        findNames = findCharacters(matchGender, matchBlood, matchHoro, mathBlood2);
//        charAdapter = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_list_item_1, findNames);

//        characterItems = findCharacters(matchGender, matchBlood, matchHoro, mathBlood2);
        MyDb myDb = new MyDb(getBaseContext());
        characterItems = myDb.selectCharacterItems(matchGender, matchBlood, mathBlood2, matchHoro, matchHoro2, matchHoro3);

        charAdapter = new CharacterAdapter(getBaseContext(), R.layout.list_item_character, characterItems);
        charListView.setAdapter(charAdapter);
        charListView.setOnItemClickListener(charItemClickListener);

    }

    AdapterView.OnItemClickListener charItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//            String charName = findNames.get(i);
            CharacterItem characterItem = characterItems.get(i);

            Intent intent = new Intent(getBaseContext(), CharInfoActivity.class);
            intent.putExtra("charName", characterItem.getName());
            startActivity(intent);

        }

    };

//public List<String> findCharacters(int matchGender, int matchBlood, int matchHoro, int mathBlood2) {
//        List<String> findNames = new ArrayList<>();
//        for (int i = 0; i < G.CHAR_NAMES.length; i++) {
//            if (matchGender == G.CHAR_GENDERS[i] && matchBlood == G.CHAR_BLOODS[i] && matchHoro == G.CHAR_HOROS[i] || matchGender == G.CHAR_GENDERS[i] && mathBlood2 == G.CHAR_BLOODS[i] && matchHoro == G.CHAR_HOROS[i]) {
//                findNames.add(G.CHAR_NAMES[i]);
//            }
//        }
//        return findNames;
//    }
//}

//    public List<CharacterItem> findCharacters(int matchGender, int matchBlood, int matchHoro, int mathBlood2) {
//        List<CharacterItem> characterItems = new ArrayList<>();
//        for (int i = 0; i < G.CHAR_NAMES.length; i++) {
//            if (matchGender == G.CHAR_GENDERS[i] && matchBlood == G.CHAR_BLOODS[i] && matchHoro == G.CHAR_HOROS[i] || matchGender == G.CHAR_GENDERS[i] && mathBlood2 == G.CHAR_BLOODS[i] && matchHoro == G.CHAR_HOROS[i]) {
//                CharacterItem characterItem = new CharacterItem();
//                characterItem.setTitle(G.CHAR_TITLE[i]);
//                characterItem.setName(G.CHAR_NAMES[i]);
//                characterItem.setGender(G.CHAR_GENDERS[i]);
//                characterItems.add(characterItem);
//            }
//        }
//        return characterItems;
//    }
}