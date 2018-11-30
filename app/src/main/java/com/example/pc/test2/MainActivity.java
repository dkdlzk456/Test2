package com.example.pc.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGourp1;
    RadioGroup radioGourp2;
    Button matchButton;
    EditText myMoth;
    EditText myDay;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        matchButton = findViewById(R.id.matchButton);
        matchButton.setOnClickListener(matchListener);
    }


    View.OnClickListener matchListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {


            // 홍길동님의 정보


            int myGender = G.MAN;
            int myBlood = i;

            myMoth = findViewById(R.id.myMoth);
            myDay = findViewById(R.id.myDay);
            radioGourp1 = findViewById(R.id.radioGourp1);
            radioGourp2 = findViewById(R.id.radioGourp2);



            String memo = myMoth.getText().toString();
            String memo1 = myDay.getText().toString();
            int Moth=Integer.valueOf(memo);
            int Day = Integer.valueOf(memo1);
            int myHoro = findHoro(Moth,Day);

          //  int matchGender = (G.MAN + 1) % 2;
           int matchBlood = matchBlood(myBlood);
            int matchHoro = matchHoro(myHoro);


            // 매칭 정보를 리스트 화면으로 보냄
            Intent intent = new Intent(getBaseContext(), CharListActivity.class);

            intent.putExtra("matchBlood", matchBlood);
            intent.putExtra("matchHoro", matchHoro);
            startActivity(intent);

        }

    };


    // 혈액형 매칭 함수

    public int matchBlood(int blood) {
        if (radioGourp1.getCheckedRadioButtonId() == R.id.genderMan) {
            if (radioGourp2.getCheckedRadioButtonId() == R.id.Abutton) {
                i = G.O;
                return i;
            }
            else if (radioGourp2.getCheckedRadioButtonId() == R.id.Bbutton) {
                i = G.AB;
                return i;
            }
            else if (radioGourp2.getCheckedRadioButtonId() == R.id.Obutton) {
                i = G.A;
                return i;
            }
            else if (radioGourp2.getCheckedRadioButtonId() == R.id.ABbutton) {
                i = G.AB;
                return i;
            }
        } else {

            if (blood == G.A) {
                i = G.O;
                return G.O;

            }

            if (blood == G.B) {
                i = G.AB;
                return G.AB;
            }
        }
        return 0;
    }

    public int dayTo(int month, int day) {
        return month * 30 + day;
    }

    // 생일로 별자리 찾기
    public int findHoro(int month, int day) {

        int my = dayTo(month, day);

        if (dayTo(12, 23) <= my) {
            return G.CAPRICORN;
        } else if (dayTo(1, 20) >= my) {
            return G.CAPRICORN;
        } else if (dayTo(1, 21) <= my && my <= dayTo(2, 19)) {
            return G.AQUARIUS;
        } else if (dayTo(2, 20) <= my && my <= dayTo(3, 20)) {
            return G.PISCES;
        }
        return 0;
    }
    // 별자리로 길한 궁합 찾기

    public int matchHoro(int horoscope) {

        switch (horoscope) {
            case G.CAPRICORN:
                return G.VIRGO;
        }
        return 0;
    }

}