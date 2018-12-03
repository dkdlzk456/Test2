package com.example.pc.test2;

import android.content.Intent;

import android.os.Handler;
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


public class CharListActivity extends AppCompatActivity {

    ListView charListView;
    List<String> findNames;
    ArrayAdapter<String> charAdapter;
    int matchBlood;
    int matchHoro;
    int matchGender;
    int mathBlood2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_list);
        charListView = findViewById(R.id.charListView);


        // 매칭 정보를 전달 받음
        Intent intent = getIntent();
        mathBlood2 = intent.getIntExtra("mathBlood2", 0);
        matchGender = intent.getIntExtra("matchGender", 0);
        matchBlood = intent.getIntExtra("matchBlood", 0);
        matchHoro = intent.getIntExtra("matchHoro", 0);

// 전달받은 매칭 정보로 캐릭터들을 찾아서 리스트 변수에 담아줌

        findNames = findCharacters(matchGender, matchBlood, matchHoro, mathBlood2);
        charAdapter = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_list_item_1, findNames);
        charListView.setAdapter(charAdapter);
        charListView.setOnItemClickListener(charItemClickListener);

    }

    AdapterView.OnItemClickListener charItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            String charName = findNames.get(i);
            Intent intent = new Intent(getBaseContext(), CharInfoActivity.class);
            intent.putExtra("charName", charName);
            startActivity(intent);

        }

    };

public List<String> findCharacters(int matchGender, int matchBlood, int matchHoro, int mathBlood2) {
        List<String> findNames = new ArrayList<>();
        for (int i = 0; i < G.CHAR_NAMES.length; i++) {
            if (matchGender == G.CHAR_GENDERS[i] && matchBlood == G.CHAR_BLOODS[i] && matchHoro == G.CHAR_HOROS[i] || matchGender == G.CHAR_GENDERS[i] && mathBlood2 == G.CHAR_BLOODS[i] && matchHoro == G.CHAR_HOROS[i]) {
                findNames.add(G.CHAR_NAMES[i]);
            }
        }
        return findNames;
    }
}