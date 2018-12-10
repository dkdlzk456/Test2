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

    static String[] CHAR_TITLE = {"어떤 마술의 금서목록", "학생회 일존", "카드캡터 체리", "날아라슈퍼모드", "이런 영웅은 싫어",
            "아이돌 마스터 SideM", "도쿄구울", "아이카츠!", "주문은 토끼입니까?", "주문은 토끼입니까?",
            "주문은 토끼입니까?", "주문은 토끼입니까?", "주문은 토끼입니까?", "주문은 토끼입니까?", "주문은 토끼입니까?"
            , "나루토", "나루토", "나루토", "나루토", "나루토",
            "나루토", "나루토", "나루토", "나루토", "나루토"
            , "나루토", "나루토", "나루토", "나루토", "나루토",
            "나루토", "나루토", "나루토", "나루토", "나루토"
            , "나루토", "나루토", "짱구는 못말려", "러브 라이브", "러브 라이브"
            , "러브 라이브", "러브 라이브", "러브 라이브", "러브 라이브", "러브 라이브"
            , "러브 라이브", "러브 라이브", "러브 라이브 션샤인", "러브 라이브 션샤인", "러브 라이브 션샤인"
            , "러브 라이브 션샤인", "러브 라이브 션샤인", "러브 라이브 션샤인", "러브 라이브 션샤인", "러브 라이브 션샤인"
            , "러브 라이브 션샤인", "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아"
            , "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아"
            , "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아"
            , "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아", "나의 히어로 아카데미아"
            , "나의 히어로 아카데미아", "나의 히어로 아카데미아", "도쿄구울", "도쿄구울", "도쿄구울"
            , "도쿄구울", "도쿄구울", "도쿄구울", "도쿄구울", "도쿄구울"
            , "도쿄구울", "도쿄구울", "도쿄구울", "도쿄구울", "역시 내 청춘 러브코메디는 잘못됐다."
            , "역시 내 청춘 러브코메디는 잘못됐다.", "역시 내 청춘 러브코메디는 잘못됐다.", "역시 내 청춘 러브코메디는 잘못됐다.", "역시 내 청춘 러브코메디는 잘못됐다.", "역시 내 청춘 러브코메디는 잘못됐다."
            , "역시 내 청춘 러브코메디는 잘못됐다.", "역시 내 청춘 러브코메디는 잘못됐다.", "케이온", "케이온", "케이온"
            , "케이온", "케이온", "케이온", "케이온", "클라나드"
            , "클라나드", "클라나드", "클라나드", "클라나드", "클라나드"
            , "클라나드", "클라나드", "클라나드", "클라나드", "클라나드"
            , "월간 순정 노자키군", "월간 순정 노자키군", "월간 순정 노자키군", "월간 순정 노자키군", "월간 순정 노자키군"
            , "월간 순정 노자키군", "월간 순정 노자키군", "논논비요리", "논논비요리", "논논비요리"
            , "논논비요리", "헌터 x 헌터", "헌터 x 헌터", "헌터 x 헌터", "헌터 x 헌터"
            , "헌터 x 헌터", "건어물여동생!우마루짱", "건어물여동생!우마루짱", "건어물여동생!우마루짱", "건어물여동생!우마루짱"
            , "건어물여동생!우마루짱", "건어물여동생!우마루짱", "건어물여동생!우마루짱", "일곱개의 대죄", "일곱개의 대죄"
            , "일곱개의 대죄", "일곱개의 대죄", "일곱개의 대죄", "일곱개의 대죄", "짱구는 못말려"
            , "짱구는 못말려", "짱구는 못말려", "짱구는 못말려", "일곱개의 대죄", "일곱개의 대죄"
            , "일곱개의 대죄", "나츠메 우인장", "나츠메 우인장", "나츠메 우인장", "나츠메 우인장"
            , "FATE", "FATE", "FATE", "FATE", "혈계전선"
            , "혈계전선", "혈계전선", "혈계전선", "혈계전선", "혈계전선"
            , "혈계전선", "혈계전선", "혈계전선","ARIA","ARIA"
            ,"ARIA","ARIA","ARIA","ARIA"};


    static int[] CHAR_IMGS = {R.drawable.micoto, R.drawable.minach, R.drawable.jisoo, R.drawable.jupal, R.drawable.backmole,
            R.drawable.akazki, R.drawable.hinami, R.drawable.sdsds, R.drawable.chno, R.drawable.shalo,
            R.drawable.magoomi, R.drawable.lije, R.drawable.cocoa, R.drawable.maya, R.drawable.chya
            , R.drawable.narutotobirama, R.drawable.narutohasirama, R.drawable.narutoetach, R.drawable.narutonage, R.drawable.narutokiba
            , R.drawable.narutosino, R.drawable.narutominato, R.drawable.narutologli, R.drawable.narutosahi, R.drawable.narutosashce
            , R.drawable.narutomategae, R.drawable.narutomadara, R.drawable.narutosikamaru, R.drawable.narutokakasi, R.drawable.naruto,
            R.drawable.narutoashma, R.drawable.narutochogy, R.drawable.narutosalada, R.drawable.narutotenten, R.drawable.narutosacoora
            , R.drawable.narutohinata, R.drawable.narutoeno, R.drawable.yoory, R.drawable.nico, R.drawable.umi
            , R.drawable.honoka, R.drawable.nojomi, R.drawable.maki, R.drawable.hanayo, R.drawable.rin
            , R.drawable.cotori, R.drawable.ari, R.drawable.carin, R.drawable.aumu, R.drawable.kashmi
            , R.drawable.barde, R.drawable.kanata, R.drawable.sezna, R.drawable.ai, R.drawable.shizcoo
            , R.drawable.rina, R.drawable.chyoo, R.drawable.toru, R.drawable.mina, R.drawable.kyoka
            , R.drawable.momo, R.drawable.urara, R.drawable.syoto, R.drawable.cojy, R.drawable.majo
            , R.drawable.kachki, R.drawable.ojiro, R.drawable.yooga, R.drawable.rikido, R.drawable.denky
            , R.drawable.izekoo, R.drawable.hanta, R.drawable.tenya, R.drawable.minoru, R.drawable.kiricima
            , R.drawable.hoomikake, R.drawable.shoota, R.drawable.kamishirorige, R.drawable.touka, R.drawable.ayato
            , R.drawable.yomorengi, R.drawable.nimoora, R.drawable.syoo, R.drawable.naki, R.drawable.nishiki
            , R.drawable.ken, R.drawable.uta, R.drawable.cotaro, R.drawable.shinno, R.drawable.tochka
            , R.drawable.hikigaya, R.drawable.hayato, R.drawable.jaemocoora, R.drawable.yookino, R.drawable.comach
            , R.drawable.yooe, R.drawable.haruno, R.drawable.mio, R.drawable.ui, R.drawable.chmoogi
            , R.drawable.rich, R.drawable.ajesa, R.drawable.yuyi, R.drawable.managenoeoka, R.drawable.cotomy
            , R.drawable.shnohanamae, R.drawable.gooco, R.drawable.hujibayacyo, R.drawable.hujibayalyo, R.drawable.sanae
            , R.drawable.tomoyo, R.drawable.nagisa, R.drawable.yohae, R.drawable.akio, R.drawable.tomoya_man
            , R.drawable.mizoshibamizoto, R.drawable.nojakigoon, R.drawable.hilotaka, R.drawable.nasayooki, R.drawable.nojakigun
            , R.drawable.seoyoojeki, R.drawable.kashimayoouoo, R.drawable.coshiyaginachmy, R.drawable.hotaro, R.drawable.comari
            , R.drawable.renge, R.drawable.paradanit, R.drawable.kripika, R.drawable.gon, R.drawable.hisoka
            , R.drawable.kirea, R.drawable.kirie, R.drawable.umaru, R.drawable.abina, R.drawable.cilpinpode
            , R.drawable.tahay, R.drawable.tagashy, R.drawable.alragsh, R.drawable.stalotsa, R.drawable.ban
            , R.drawable.king, R.drawable.asekanore, R.drawable.melreodase, R.drawable.aser, R.drawable.hoone
            , R.drawable.jjanggu, R.drawable.culsu, R.drawable.menggu, R.drawable.erijabese, R.drawable.mulrin
            , R.drawable.daen, R.drawable.nachmetakashi, R.drawable.tanumakaname, R.drawable.seji, R.drawable.sooechi
            , R.drawable.tosakarin, R.drawable.matosacoora, R.drawable.sopiria, R.drawable.aoe, R.drawable.zed
            , R.drawable.werchi, R.drawable.stiben, R.drawable.gelbelete, R.drawable.jeb, R.drawable.ponline
            , R.drawable.chain, R.drawable.miselra, R.drawable.kk, R.drawable.mizenasiakari, R.drawable.aeka
            , R.drawable.parali, R.drawable.arise, R.drawable.arishia, R.drawable.gelloli};

    static String[] CHAR_NAMES = {"미사나 미코토", "시나 미나츠", "다이도우지 토모요(신지수)", "저팔계", "백모래",
            "아카즈키 료", "후에구치 히나미", "신죠 히나키", "카후우 치노", "키리마 샤로",
            "나츠 메구미", "테데자 리제", "호토 코코아", "조가 마야", "우지마츠 치야",
            "센쥬 토비라마", "센쥬 하시라마", "우치하 이타치", "휴우가 네지", "이누즈카 키바"
            , "아부라메 시노", "나미카제 미나토", "록 리", "사이", "우치하 사스케",
            "마이트 가이", "우치하 마다라", "나라 시카마루", "하타케 카카시", "우즈마키 나루토"
            , "사로토비 아스마", "아키미치 쵸지", "우치하 사라다", "텐텐", "하루노 사쿠라",
            "휴우가 히나타", "야마나카 이노", "한유리", "야자와 니코", "소노다 우미"
            , "코우사카 호노카", "토죠 노조미", "니시키노 마키", "코이즈미 하나요", "호시조라 린"
            , "미나미 코토리", "아야세 에리", "아사카 카린", "우에하라 아유무", "나카스 카스미"
            , "엠마 베르데", "코노에 카나타", "유키 세츠나", "미야시타 아이", "오사카 시즈쿠"
            , "텐노지 리나", "아스이 츠유", "하가쿠레 토오루", "아시도 미나", "지로 쿄카"
            , "야오요로즈 모모", "우라라카 오챠코", "토도로키 쇼타", "코다 코지", "쇼지 메조"
            , "바쿠고 카츠키", "오지로 마시라오", "아오야마 유가", "사토 리키도", "카미나리 덴키"
            , "미도리야 이즈쿠", "세로 한타", "이이다 텐야", "미네타 미노루", "키리시마 에이지로"
            , "토코야미 후미카케", "아이자와 쇼타", "카미시로 리제", "키리시마 토우카", "키리시마 아야토"
            , "요모렌지", "후루타 니무라", "츠키야마 슈", "나키", "니시오 니시키"
            , "카네키켄", "우타", "아몬 코타로", "타치바나 신노스케", "토츠카 사이카"
            , "히키가야 하치만", "하야마 하야토", "자이모쿠자 요시테루", "유키노시타 유키노", "히키가야 코마치"
            , "유이가하마 유이", "유키노시타 하루노", "아키야마 미오", "히라사와 우이", "코토부키 츠무기"
            , "타이나카 리츠", "나카노 아즈사", "히라사와 유이", "마나베 노도카", "이치노세 코토미"
            , "스노하라 메이", "이부키 후코", "후지바야시 쿄", "후지바야시 료", "후루카와 사나에"
            , "사카가미 토모요", "후루카와 나기사", "스노하라 요헤이", "후루카와 아키오", "오카지키 토모야"
            , "미코시바 미코토", "노자키 우메타로", "와카마츠 히로타카", "호리 마사유키", "사쿠라 치요"
            , "세오 유즈키", "카시마 유우", "코시가야 나츠미", "이치죠 호타루", "코시가야 코마리"
            , "미야우치 렌게", "레오리오 파라디나이트", "크라피카", "곤 프릭스", "히소카 모로"
            , "키르아 조르딕", "모토바 키리에", "도마 우마루", "에비나 나나", "타치바나 실핀포드"
            , "도마 타이헤이", "모토바 타케시", "타치바나 알렉스", "에스타롯사", "반"
            , "킹", "에스카노르", "멜리오다스", "아서 펜드래곤", "이훈이"
            , "신짱구", "김철수", "맹구", "엘리자베스 리오네스", "멀린"
            , "다이앤", "나츠메 타카시", "타누마 카나메", "마토바 세이지", "나토리 슈이치"
            , "토오사카 린", "마토 사쿠라", "솔라우 누아다레 소피아리", "토오사카 아오이", "제드 오브라이언"
            , "레오나르도 워치", "스티븐 알랭 스타페이즈", "길베르트 프랑커 알트슈타인", "재프 렌프로", "클라우스 폰 라인헤르츠"
            , "체인 스메라기", "미셸라 워치", "K.K","미즈나시 아카리","아이카 그란체스터"
            ,"아키라 페라리","아리스 캐롤","아리시아 플로렌스","아테나 글로리"};

    static String[] CHAR_HEIGHTS = {"161cm", "159cm", "???", "158cm", "176cm",
            "164cm", "148cm", "???", "144cm", "151cm",
            "145cm", "160cm", "154cm", "140cm", "157cm"
            , "182.3cm", "185.1cm", "178cm", "172.14cm", "173cm",
            "185cm", "179.2cm", "177cm", "176cm", "182cm"
            , "184cm", "179cm", "176cm", "181cm", "180cm"
            , "190.8cm", "172.3cm", "147cm", "164cm", "165cm"
            , "163cm", "164cm", "104.2cm", "154cm", "159cm"
            , "157cm", "159cm", "161cm", "156cm", "155cm"
            , "159cm", "162cm", "167cm", "159cm", "155cm"
            , "166cm", "158cm", "154cm", "163cm", "157cm"
            , "149cm", "150cm", "152cm", "159cm", "154cm"
            , "173cm", "156cm", "176cm", "186cm", "187cm"
            , "172cm", "169cm", "168cm", "185cm", "168cm"
            , "166cm", "177cm", "179cm", "108cm", "170cm"
            , "158cm", "183cm", "164cm", "156cm", "180cm"
            , "182cm", "175cm", "180cm", "173cm", "177cm"
            , "170cm", "177cm", "191cm", "171.5cm", "???"
            , "???", "???", "???", "???", "???"
            , "???", "???", "160cm", "154cm", "157cm"
            , "154cm", "150cm", "156cm", "158cm", "160cm"
            , "152cm", "150cm", "160cm", "159cm", "158cm"
            , "161cm", "155cm", "167cm", "175cm", "173cm"
            , "177cm", "190cm", "185cm", "164cm", "145cm"
            , "163cm", "176cm", "155cm", "164cm", "140cm"
            , "139cm", "193cm", "171cm", "154cm", "187cm"
            , "158cm", "139cm", "160cm", "155cm", "158cm"
            , "170cm", "192cm", "168cm", "200cm", "210cm"
            , "160cm", "165~325cm", "152cm", "170cm", "106.2cm"
            , "105.9cm", "108.7cm", "113.9cm", "162cm", "177cm"
            , "915cm", "167cm", "171cm", "174cm", "175cm"
            , "159cm", "156cm", "165cm", "160cm", "176cm"
            , "161cm", "182cm", "176cm", "178cm", "201cm"
            , "158cm", "160cm", "177cm","155cm","160cm"
            ,"168cm","145cm","165cm","170cm"};

    static String[] CHAR_STAR = {"황소자리", "처녀자리", "처녀자리", "처녀자리", "처녀자리",
            "처녀자리", "쌍둥이자리", "쌍둥이자리", "사수자리", "게자리",
            "전갈자리", "물독자리", "양자리", "사자자리", "처녀자리"
            , "물고가자리", "천칭자리", "쌍둥이자리", "게자리", "게자리",
            "물병자리", "물병자리", "사수자리", "사수자리", "사자자리"
            , "염소자리", "염소자리", "처녀자리", "처녀자리", "천칭자리"
            , "천칭자리", "황소자리", "양자리", "물고기자리", "양자리",
            "염소자리", "처녀자리", "쌍둥이자리", "게자리", "물고기자리"
            , "사자자리", "쌍둥이자리", "양자리", "염소자리", "전갈자리"
            , "처녀자리", "천칭자리", "게자리", "물고기 자리", "물병자리"
            , "물병자리", "사수자리", "사자자리", "쌍둥이자리", "양자리"
            , "전갈자리", "물병자리", "쌍둥이자리", "사자자리", "사자자리"
            , "처녀자리", "염소자리", "염소자리", "물병자리", "물병자리"
            , "양자리", "쌍둥이자리", "쌍둥이자리", "쌍둥이자리", "게자리"
            , "게자리", "사자자리", "사자자리", "천칭자리", "천칭자리"
            , "사수자리", "전갈자리", "천칭자리", "게자리", "게자리"
            , "게자리", "물고기자리", "물고기자리", "물병자리", "물병자리"
            , "사수자리", "사수자리", "양자리", "처녀자리", "황소자리"
            , "사자자리", "천칭자리", "사수자리", "염소자리", "물고기자리"
            , "쌍둥이자리", "게자리", "염소자리", "물고기자리", "게자리"
            , "사자자리", "전갈자리", "사수자리", "염소자리", "황소자리"
            , "쌍둥이자리", "게자리", "처녀자리", "처녀자리", "천칭자리"
            , "천칭자리", "염소자리", "물병자리", "게자리", "전갈자리"
            , "물병자리", "쌍둥이자리", "처녀자리", "사수자리", "양자리"
            , "게자리", "전갈자리", "물병자리", "쌍둥이자리", "처녀자리"
            , "사수자리", "물고기자리", "양자리", "황소자리", "쌍둥이자리"
            , "게자리", "물고기자리", "천칭자리", "천칭자리", "염소자리"
            , "쌍둥이자리", "사자자리", "염소자리", "염소자리", "물병자리"
            , "양자리", "게자리", "사자자리", "사자자리", "물병자리"
            , "황소자리", "게자리", "처녀자리", "쌍둥이자리", "사수자리"
            , "염소자리", "게자리", "처녀자리", "전갈자리", "전갈자리"
            , "물병자리", "물고기자리", "사자자리", "처녀자리", "물고기자리"
            , "황소자리", "쌍둥이자리", "처녀자리", "사수자리", "염소자리"
            , "물병자리", "양자리", "게자리","물병자리","물병자리"
             ,"사자자리","처녀자리","전갈자리","염소자리"};

    static String[] CHAR_HP = {"AB", "O", "A", "AB", "O",
            "O", "AB", "B", "AB", "A",
            "A", "A", "B", "O", "O",
            "A", "B", "AB", "O", "B"
            , "AB", "B", "A", "A", "AB"
            , "B", "O", "AB", "O", "B"
            , "O", "B", "A", "B", "O"
            , "A", "B", "B", "A", "A"
            , "O", "O", "AB", "B", "A"
            , "O", "B", "AB", "A", "B"
            , "O", "O", "O", "A", "A"
            , "B", "B", "A", "AB", "A"
            , "A", "B", "O", "A", "B"
            , "A", "O", "O", "O", "O"
            , "O", "B", "A", "A", "O"
            , "AB", "B", "AB", "O", "O"
            , "A", "AB", "A", "B", "O"
            , "AB", "B", "A", "A", "A"
            , "A", "B", "AB", "B", "O"
            , "O", "B", "A", "O", "O"
            , "B", "AB", "O", "A", "A"
            , "A", "B", "O", "O", "A"
            , "O", "A", "AB", "A", "A"
            , "A", "A", "A", "AB", "O"
            , "B", "O", "B", "O", "AB"
            , "B", "O", "AB", "B", "B"
            , "A", "A", "AB", "O", "B"
            , "A", "B", "B", "AB", "B"
            , "AB", "AB", "B", "A", "A"
            , "B", "O", "AB", "O", "AB"
            , "O", "B", "O", "AB", "A"
            , "O", "O", "O", "O", "A"
            , "O", "AB", "O", "B", "A"
            , "A", "O", "B", "A", "O"
            , "O", "B", "A", "AB"};

    static int[] CHAR_GENDERS = {G.WOMAN, G.WOMAN, G.WOMAN, G.MAN, G.MAN,
            G.MAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN,
            G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.WOMAN, G.WOMAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.MAN
            , G.MAN, G.MAN, G.MAN, G.MAN, G.MAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN
            , G.WOMAN, G.WOMAN, G.WOMAN, G.WOMAN};

    static int[] CHAR_BLOODS = {G.AB, G.O, G.A, G.AB, G.O,
            G.O, G.AB, G.B, G.AB, G.A,
            G.A, G.A, G.B, G.O, G.O
            , G.A, G.B, G.AB, G.O, G.B
            , G.AB, G.B, G.A, G.A, G.AB
            , G.B, G.O, G.AB, G.O, G.B
            , G.O, G.B, G.A, G.B, G.O
            , G.A, G.B, G.B, G.A, G.A
            , G.O, G.O, G.AB, G.B, G.A
            , G.O, G.B, G.AB, G.A, G.B
            , G.O, G.O, G.O, G.A, G.A
            , G.B, G.B, G.A, G.AB, G.A
            , G.A, G.B, G.O, G.A, G.B
            , G.A, G.O, G.O, G.O, G.O
            , G.O, G.B, G.A, G.A, G.O
            , G.AB, G.B, G.AB, G.O, G.O
            , G.A, G.AB, G.A, G.B, G.O
            , G.AB, G.B, G.A, G.A, G.A
            , G.A, G.B, G.AB, G.B, G.O
            , G.O, G.B, G.A, G.O, G.O
            , G.B, G.AB, G.O, G.A, G.A
            , G.A, G.B, G.O, G.O, G.A
            , G.O, G.A, G.AB, G.A, G.A
            , G.A, G.A, G.A, G.AB, G.O
            , G.B, G.O, G.B, G.O, G.AB
            , G.B, G.O, G.AB, G.B, G.B
            , G.A, G.A, G.AB, G.O, G.B
            , G.A, G.B, G.B, G.AB, G.B
            , G.AB, G.AB, G.B, G.A, G.A
            , G.B, G.O, G.AB, G.O, G.AB
            , G.O, G.B, G.O, G.AB, G.A
            , G.O, G.O, G.O, G.O, G.A
            , G.O, G.AB, G.O, G.B, G.A
            , G.A, G.O, G.B, G.A, G.O
            , G.O, G.B, G.A, G.AB};

    static int[] CHAR_HOROS = {G.TAURUS, G.VIRGO, G.VIRGO, G.VIRGO, G.VIRGO,
            G.VIRGO, G.GEMINI, G.GEMINI, G.SAGITTARIUS, G.CANCER,
            G.SCORPIO, G.AQUARIUS, G.ARIES, G.LEO, G.VIRGO
            , G.PISCES, G.LIBRA, G.GEMINI, G.CANCER, G.CANCER
            , G.AQUARIUS, G.AQUARIUS, G.SAGITTARIUS, G.SAGITTARIUS, G.LEO
            , G.CAPRICORN, G.CAPRICORN, G.VIRGO, G.VIRGO, G.LIBRA
            , G.LIBRA, G.TAURUS, G.ARIES, G.PISCES, G.ARIES
            , G.CAPRICORN, G.VIRGO, G.GEMINI, G.CANCER, G.PISCES
            , G.LEO, G.GEMINI, G.ARIES, G.CAPRICORN, G.SCORPIO
            , G.VIRGO, G.LIBRA, G.CANCER, G.PISCES, G.AQUARIUS
            , G.AQUARIUS, G.SAGITTARIUS, G.LEO, G.GEMINI, G.ARIES
            , G.SCORPIO, G.AQUARIUS, G.GEMINI, G.LEO, G.LEO
            , G.VIRGO, G.CAPRICORN, G.CAPRICORN, G.AQUARIUS, G.AQUARIUS
            , G.ARIES, G.GEMINI, G.GEMINI, G.GEMINI, G.CANCER
            , G.CANCER, G.LEO, G.LEO, G.LIBRA, G.LIBRA
            , G.SAGITTARIUS, G.SCORPIO, G.LIBRA, G.CANCER, G.CANCER
            , G.CANCER, G.PISCES, G.PISCES, G.AQUARIUS, G.AQUARIUS
            , G.SAGITTARIUS, G.SAGITTARIUS, G.ARIES, G.VIRGO, G.TAURUS
            , G.LEO, G.LIBRA, G.SAGITTARIUS, G.CAPRICORN, G.PISCES
            , G.GEMINI, G.CANCER, G.CAPRICORN, G.PISCES, G.CANCER
            , G.LEO, G.SCORPIO, G.SAGITTARIUS, G.CAPRICORN, G.TAURUS
            , G.GEMINI, G.CANCER, G.VIRGO, G.VIRGO, G.LIBRA
            , G.LIBRA, G.CAPRICORN, G.AQUARIUS, G.CANCER, G.SCORPIO
            , G.AQUARIUS, G.GEMINI, G.VIRGO, G.SAGITTARIUS, ARIES
            , G.CANCER, G.SCORPIO, G.AQUARIUS, G.GEMINI, G.VIRGO
            , G.SAGITTARIUS, G.PISCES, G.ARIES, G.TAURUS, G.GEMINI
            , G.CANCER, G.PISCES, G.LIBRA, G.LIBRA, G.CAPRICORN
            , G.GEMINI, G.LEO, G.CAPRICORN, G.CAPRICORN, G.AQUARIUS
            , G.ARIES, G.CANCER, G.LEO, G.LEO, G.AQUARIUS
            , G.TAURUS, G.CANCER, G.VIRGO, G.GEMINI, G.SAGITTARIUS
            , G.CAPRICORN, G.CANCER, G.VIRGO, G.SCORPIO, G.SCORPIO
            , G.AQUARIUS, G.PISCES, G.LEO, G.VIRGO, G.PISCES
            , G.TAURUS, G.GEMINI, G.VIRGO, G.SAGITTARIUS, G.CAPRICORN
            , G.AQUARIUS, G.ARIES, G.CANCER,G.AQUARIUS,G.AQUARIUS
            , G.LEO, G.VIRGO, G.SCORPIO, G.CAPRICORN};

    static int[] CHAR_MONTHS = {
            5, 9, 9, 9, 9
            , 9, 5, 6, 12, 7
            , 11, 2, 4, 8, 9
            , 2, 10, 6, 7, 7
            , 1, 1, 11, 11, 7
            , 1, 12, 9, 9, 10
            , 10, 5, 3, 3, 3
            , 12, 9, 6, 7, 3
            , 8, 6, 4, 1, 11
            , 9, 10, 6, 3, 1
            , 2, 12, 8, 5, 4
            , 11, 2, 6, 7, 8
            , 9, 12, 1, 2, 2
            , 4, 5, 5, 6, 6
            , 7, 7, 8, 10, 10
            , 10, 11, 10, 7, 7
            , 7, 2, 3, 1, 2
            , 12, 12, 4, 9, 5
            , 8, 9, 11, 1, 3
            , 6, 7, 1, 2, 7
            , 8, 11, 11, 12, 5
            , 6, 7, 9, 9, 10
            , 10, 12, 2, 7, 10
            , 2, 6, 9, 11, 3
            , 7, 10, 1, 5, 9
            , 12, 3, 4, 5, 6
            , 7, 3, 9, 10, 12
            , 6, 8, 12, 1, 2
            , 4, 7, 7, 8, 2
            , 5, 7, 9, 6, 12
            , 12, 7, 9, 11, 11
            , 2, 3, 8, 9, 2
            , 5, 6, 9, 11, 12
            , 2, 4, 7,1,2
            ,7 ,9 ,10 ,12};

    static int[] CHAR_DAYS = {
            2, 6, 2, 21, 1
            , 15, 22, 11, 4, 15
            , 2, 14, 10, 8, 19
            , 19, 23, 9, 3, 7
            , 23, 25, 27, 25, 23
            , 1, 24, 22, 15, 10
            , 18, 1, 31, 9, 28
            , 27, 23, 5, 22, 15
            , 3, 9, 19, 17, 1
            , 12, 21, 29, 1, 23
            , 5, 16, 8, 30, 3
            , 13, 12, 16, 30, 1
            , 23, 27, 11, 1, 15
            , 20, 28, 30, 19, 29
            , 15, 28, 22, 8, 16
            , 30, 8, 8, 1, 4
            , 9, 29, 3, 28, 4
            , 20, 2, 7, 10, 9
            , 8, 28, 23, 3, 3
            , 18, 7, 15, 22, 2
            , 21, 11, 27, 26, 13
            , 11, 20, 9, 9, 5
            , 14, 24, 17, 20, 30
            , 14, 6, 3, 28, 27
            , 7, 31, 24, 28, 14
            , 3, 3, 4, 5, 6
            , 7, 15, 26, 19, 24
            , 2, 5, 24, 14, 14
            , 1, 1, 25, 17, 4
            , 5, 19, 10, 12, 3
            , 24, 1, 17, 1, 12
            , 3, 2, 19, 5, 29
            , 14, 9, 17, 25, 31
            , 6, 4, 1,30 ,2
            ,29 ,1 ,30 ,24};


}