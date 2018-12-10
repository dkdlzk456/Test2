package com.example.pc.test2;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends FragmentActivity {
    RadioGroup radioGourp1;
    RadioGroup radioGourp2;
    Button matchButton;
    EditText myMoth;
    EditText myDay;
    int i;
    String memo;
    String memo1;
    int Moth;
    int Day;
    int j;
    int h;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        matchButton = findViewById(R.id.matchButton);
        matchButton.setOnClickListener(matchListener);

        ImageButton imageButton2 = findViewById(R.id.dilogButton2);
        imageButton2.setOnClickListener(imageButtonListener2);
        ImageButton imageButton = findViewById(R.id.dilogButton);
        imageButton.setOnClickListener(imageButtonListener);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    View.OnClickListener imageButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
      Intent intent = new Intent(getBaseContext(), dilogActivity.class);
      startActivity(intent);
        }
    };
    View.OnClickListener imageButtonListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getBaseContext(), dilog2Activity.class);
            startActivity(intent);
        }
    };


    View.OnClickListener matchListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {


            int myGender = j;
            int myBlood = i;
            int myBlood2 = h;

            myMoth = findViewById(R.id.myMoth);
            myDay = findViewById(R.id.myDay);
            radioGourp1 = findViewById(R.id.radioGourp1);
            radioGourp2 = findViewById(R.id.radioGourp2);


            memo = myMoth.getText().toString();
            memo1 = myDay.getText().toString();

            try {
                Moth = Integer.valueOf(memo);
                Day = Integer.valueOf(memo1);


                int myHoro = findHoro(Moth, Day);
                int matchGender = matchGender(myGender);
                int matchBlood = matchBlood(myBlood);
                final int matchHoro = matchHoro(myHoro);
                int mathBlood2 = mathBlood2(myBlood2);
                 int matchHoro2 = matchHoro2(myHoro);
                 int matchHoro3 = matchHoro3(myHoro);

               if(Moth != 0 && Moth <= 12 && Moth > 0 ) {
                   if(Day > 0 && Day !=0 && Day <= 31) {
                       if(i >=0 && i < 4 || h >= 0 && h < 4) {
                           final Intent intent = new Intent(getBaseContext(), CharListActivity.class);
                           intent.putExtra("matchGender", matchGender);
                           intent.putExtra("matchBlood", matchBlood);
                           intent.putExtra("mathBlood2", mathBlood2);
                           intent.putExtra("matchHoro", matchHoro);
                           intent.putExtra("matchHoro2",matchHoro2);
                           intent.putExtra("matchHoro3",matchHoro3);
                           startActivity(intent);
                           Handler delayHandler = new Handler();
                           delayHandler.postDelayed(new Runnable() {
                               @Override
                               public void run() {
                                   Log.d("matchHoro", String.valueOf(matchHoro));
                               }
                           }, 3000);

                       }
                       else
                           Toast.makeText(getBaseContext(), "입력이 잘못 되었습니다.",Toast.LENGTH_LONG).show();
                   } else
                       Toast.makeText(getBaseContext(), "입력이 잘못 되었습니다.",Toast.LENGTH_LONG).show();
               }
            } catch (Exception e) {
                Toast.makeText(getBaseContext(), "입력이 잘못 되었습니다.", Toast.LENGTH_LONG).show();
            }
        }

    };

    public int matchGender(int gender) {
        if (radioGourp1.getCheckedRadioButtonId() == R.id.genderMan) {
            j = G.WOMAN;
            return j;

        } else j = G.MAN;
        return j;
    }

    // 혈액형 두번째 비교
    public int mathBlood2(int blood2) {
        if (radioGourp1.getCheckedRadioButtonId() == R.id.genderMan) {
            if (radioGourp2.getCheckedRadioButtonId() == R.id.Abutton) {
                h = G.A;
                return h;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.Bbutton) {
                h = G.O;
                return h;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.Obutton) {
                h = G.B;
                return h;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.ABbutton) {
                h = G.B;
                return h;
            }
        } else if (radioGourp1.getCheckedRadioButtonId() == R.id.genderWomun) {
            if (radioGourp2.getCheckedRadioButtonId() == R.id.Abutton) {
                h = G.A;
                return h;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.Bbutton) {
                h = G.O;
                return h;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.Obutton) {
                h = G.B;
                return h;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.ABbutton) {
                h = G.B;
                return h;
            }
        }
        return 0;
    }

    //혈액형 첫번째 비교
    public int matchBlood(int blood) {
        if (radioGourp1.getCheckedRadioButtonId() == R.id.genderMan) {
            if (radioGourp2.getCheckedRadioButtonId() == R.id.Abutton) {
                i = G.O;
                return i;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.Bbutton) {
                i = G.AB;
                return i;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.Obutton) {
                i = G.A;
                return i;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.ABbutton) {
                i = G.AB;
                return i;
            }

        } else if (radioGourp1.getCheckedRadioButtonId() == R.id.genderWomun) {
            if (radioGourp2.getCheckedRadioButtonId() == R.id.Abutton) {
                i = G.O;
                return i;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.Bbutton) {
                i = G.AB;
                return i;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.Obutton) {
                i = G.A;
                return i;
            } else if (radioGourp2.getCheckedRadioButtonId() == R.id.ABbutton) {
                i = G.AB;
                return i;
            }
        }
        return 0;
    }

    public int dayTo(int month, int day) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return month * 31 + day;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return month * 30 + day;
        } else
            return month * 28 + day;
    }


    // 생일로 별자리 찾기
    public int findHoro(int month, int day) {

        final int my = dayTo(month, day);

        if (dayTo(12, 23) <= my || dayTo(1, 20) >= my) {
            return G.CAPRICORN;
        } else if (dayTo(1, 21) >= my && dayTo(2, 19) >= my) {
            return G.AQUARIUS;
        } else if (dayTo(2, 20) <= my && my <= dayTo(3, 20)) {
            return G.PISCES;
        } else if (dayTo(3, 21) <= my && my <= dayTo(4, 20)) {
            return G.ARIES;
        } else if (dayTo(4, 21) <= my && my <= dayTo(5, 21)) {
            return G.TAURUS;
        } else if (dayTo(5, 22) <= my && my <= dayTo(6, 21)) {
            return G.GEMINI;
        } else if (dayTo(6, 22) <= my && my <= dayTo(7, 23)) {
            return G.CANCER;
        } else if (dayTo(7, 24) <= my && my <= dayTo(8, 23)) {
            return G.LEO;
        } else if (dayTo(8, 24) <= my && my <= dayTo(9, 23)) {
            return G.VIRGO;
        } else if (dayTo(9, 24) <= my && my <= dayTo(10, 23)) {
            return G.LIBRA;
        } else if (dayTo(10, 24) <= my && my <= dayTo(11, 22)) {
            return G.SCORPIO;
        } else if (dayTo(11, 23) <= my && my <= dayTo(12, 22)) {
            return G.SAGITTARIUS;
        } else return 0;
    }
    // 별자리로 길한 궁합 찾기 첫번째 비교

    public int matchHoro(int horoscope) {

        switch (horoscope) {
            case G.CAPRICORN:
                return G.VIRGO;
            case G.AQUARIUS:
                return G.GEMINI;
            case G.PISCES:
                return G.CANCER;
            case G.ARIES:
                return G.LEO;
            case G.TAURUS:
                return G.CAPRICORN;
            case G.GEMINI:
                return G.AQUARIUS;
            case G.CANCER:
                return G.PISCES;
            case G.LEO:
                return G.ARIES;
            case G.VIRGO:
                return G.TAURUS;
            case G.LIBRA:
                return G.AQUARIUS;
            case G.SCORPIO:
                return G.PISCES;
            case G.SAGITTARIUS:
                return G.LEO;
        }
        return 0;
    }
    // 별자리로 길한 궁합 찾기 두번째 비교
    public int matchHoro2(int horoscope) {

        switch (horoscope) {
            case G.CAPRICORN:
                return G.TAURUS;
            case G.AQUARIUS:
                return G.AQUARIUS;
            case G.PISCES:
                return G.SCORPIO;
            case G.ARIES:
                return G.SAGITTARIUS;
            case G.TAURUS:
                return G.VIRGO;
            case G.GEMINI:
                return G.LIBRA;
            case G.CANCER:
                return G.SCORPIO;
            case G.LEO:
                return G.SAGITTARIUS;
            case G.VIRGO:
                return G.CAPRICORN;
            case G.LIBRA:
                return G.GEMINI;
            case G.SCORPIO:
                return G.CANCER;
            case G.SAGITTARIUS:
                return G.ARIES;
        }
        return 0;
    }
    // 별자리로 길한 궁합 찾기 세번째 비교
    public int matchHoro3(int horoscope) {

        switch (horoscope) {
            case G.CAPRICORN:
                return G.CAPRICORN;
            case G.AQUARIUS:
                return G.LIBRA;
            case G.PISCES:
                return G.PISCES;
            case G.ARIES:
                return G.LEO;
            case G.TAURUS:
                return G.TAURUS;
            case G.GEMINI:
                return G.GEMINI;
            case G.CANCER:
                return G.CANCER;
            case G.LEO:
                return G.LEO;
            case G.VIRGO:
                return G.VIRGO;
            case G.LIBRA:
                return G.LIBRA;
            case G.SCORPIO:
                return G.SCORPIO;
            case G.SAGITTARIUS:
                return G.SAGITTARIUS;
        }
        return 0;
    }
}