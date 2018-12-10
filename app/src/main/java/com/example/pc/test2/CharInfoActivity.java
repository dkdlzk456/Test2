package com.example.pc.test2;

import android.content.Intent;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class CharInfoActivity extends FragmentActivity {

    private AdView mAdView;
    TextView charInfoTextView;
    ImageView imageViewList;
    String charName;
    String charInfo;
    int sum;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_info);

        charInfoTextView = findViewById(R.id.charInfoTextView);
        imageViewList = findViewById(R.id.imageViewList);

        Intent intent = getIntent();

        charName = intent.getStringExtra("charName");
        charInfo = findCharInfo(charName);
        charInfoTextView.setText(charInfo);

        int imageView = intent.getIntExtra("imageView",0);
        int imageViews = CharInfo(imageView);
        imageViewList.setImageResource(imageViews);


        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public int CharInfo(int imageView) {

        for (int i = 0; i < G.CHAR_NAMES.length; i++) {
            if(charName.equals(G.CHAR_NAMES[i])){
                return G.CHAR_IMGS[i];
            }
        }
       return 0;
    }
    public String findCharInfo(String charName) {

        for (int i = 0; i < G.CHAR_NAMES.length; i++) {
            if (charName.equals(G.CHAR_NAMES[i])) {
                return "\n 등장하는 곳: " + G.CHAR_TITLE[i] + "\n 이름 : " + G.CHAR_NAMES[i] + "\n 신장 : " + G.CHAR_HEIGHTS[i] + "\n 별자리: " + G.CHAR_STAR[i] + "\n 혈액형: " + G.CHAR_HP[i] + "형" + "\n 생일: " + G.CHAR_MONTHS[i] + "월" + " " + G.CHAR_DAYS[i] + "일"; // 더 필요한 정보를 계속 붙여줌.
            }
        }
        return null;
    }
}