package com.example.pc.test2;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;


public class CharInfoActivity extends AppCompatActivity {


    TextView charInfoTextView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_info);

        charInfoTextView = findViewById(R.id.charInfoTextView);
        Intent intent = getIntent();

        String charName = intent.getStringExtra("charName");


        String charInfo = findCharInfo(charName);

        charInfoTextView.setText(charInfo);

    }


    public String findCharInfo(String charName) {

        for (int i = 0; i < G.CHAR_NAMES.length; i++) {

            if (charName.equals(G.CHAR_NAMES[i])) {
                return "등장하는 곳: " + G.CHAR_TITLE[i] + "\n 이름 : " + G.CHAR_NAMES[i] + ",\n 신장 : " + G.CHAR_HEIGHTS[i] + ",\n 별자리: " + G.CHAR_STAR[i] + ",\n 혈액형: " + G.CHAR_HP[i] + "형" + ",\n 생일: " + G.CHAR_MONTHS[i] + "월" + " " + G.CHAR_DAYS[i] + "일"; // 더 필요한 정보를 계속 붙여줌.
            }
        }


        return null;

    }

}