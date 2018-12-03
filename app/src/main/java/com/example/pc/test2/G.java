package com.example.pc.test2;

public class G {


    static final int MAN = 0;

    static final int WOMAN = 1;


    static final int A = 0;

    static final int B = 1;

    static final int O = 2;

    static final int AB = 3;


    static final int CAPRICORN = 0;

    static final int AQUARIUS = 1;

    static final int PISCES = 2;

    static final int ARIES = 3;

    static final int TAURUS = 4;

    static final int GEMINI = 5;

    static final int CANCER = 6;

    static final int LEO = 7;

    static final int VIRGO = 8;

    static final int LIBRA = 9;

    static final int SCORPIO = 10;

    static final int SAGITTARIUS = 11;


    // 캐릭터 데이터 (원래는 DB로 구현할 예정이였음 - 일단 하드코딩)

/*    static String[] CHAR_PES_COM = {"나와 가장 궁합이 높은 캐릭터", "나와 가장 궁합이 높은 캐릭터", "나와 가장 궁합이 높은 캐릭터", "나와 가장 궁합이 높은 캐릭터", "나와 가장 궁합이 높은 캐릭터", "나와 가장 궁합이 높은 캐릭터",
            "나와 가장 궁합이 높은 캐릭터", "두번쨰로 궁합이 맞는 캐릭터", "두번쨰로 궁합이 맞는 캐릭터",};*/

    static String[] CHAR_TITLE = {"어떤 마술의 금서목록", "학생회 일존","카드캡터 체리", "날아라슈퍼모드", "이런 영웅은 싫어",
            "아이돌 마스터 SideM", "도쿄구울", "아이카츠!", "주문은 토끼입니까?", "주문은 토끼입니까?",
            "주문은 토끼입니까?" , "주문은 토끼입니까?", "주문은 토끼입니까?", "주문은 토끼입니까?", "주문은 토끼입니까?"};

    static String[] CHAR_NAMES = {"미사나 미코토", "시나 미나츠", "다이도우지 토모요(신지수)", "저팔계", "백모래",
            "아카즈키 료", "후에구치 히나미", "신죠 히나키", "카후우 치노", "키리마 샤로",
            "나츠 메구미", "테데자 리제", "호토 코코아", "조가 마야", "우지마츠 치야"};

    static String[] CHAR_HEIGHTS = {"161cm", "159cm", "???", "158cm", "176cm",
            "164cm", "148cm", "???", "144cm", "151cm",
            "145cm", "160cm", "154cm", "140cm", "157cm"};

    static String[] CHAR_STAR = {"황소자리", "처녀자리", "처녀자리", "처녀자리", "처녀자리",
            "처녀자리", "쌍둥이자리", "쌍둥이자리", "사수자리", "게자리",
            "전갈자리", "물독자리", "양자리", "사자자리", "처녀자리"};

    static String[] CHAR_HP = {"AB", "O", "A", "AB", "O",
            "O", "AB", "B", "AB", "A",
            "A", "A", "B", "O", "O"};

    static int[] CHAR_GENDERS = {G.WOMAN, G.WOMAN, G.WOMAN, G.MAN, G.MAN,
            G.MAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN,
            G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN};

    static int[] CHAR_BLOODS = {G.AB, G.O, G.A, G.AB, G.O,
            G.O, G.AB, G.B, G.AB, G.A,
            G.A, G.A, G.B, G.O, G.O};

    static int[] CHAR_HOROS = {G.TAURUS, G.VIRGO, G.VIRGO, G.VIRGO, G.VIRGO,
            G.VIRGO, G.GEMINI, G.GEMINI, G.SAGITTARIUS, G.CANCER,
            G.SCORPIO, G.AQUARIUS, G.ARIES, G.LEO, G.VIRGO};

    static int[] CHAR_MONTHS = {5, 9, 9, 9, 9,
            9, 5, 6, 12, 7,
            11, 2, 4, 8, 9};

    static int[] CHAR_DAYS = {2, 6, 2, 21, 1,
            15, 22, 11, 4, 15,
            2, 14, 10, 8, 19};


}