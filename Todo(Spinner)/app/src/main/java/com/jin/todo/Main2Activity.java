package com.jin.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView result;

    String a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result = (TextView) findViewById(R.id.result);

        Intent intent = getIntent();

        a = intent.getStringExtra("a");
        b = intent.getStringExtra("b");
        c = intent.getStringExtra("c");

        onView();
    }

    private void onView() {

        int ai = Integer.parseInt(a);
        int bi = Integer.parseInt(b);
        int ci = Integer.parseInt(c);

        checkA(ai);
        checkB(bi);
        checkC(ci);
    }

    private void checkA(int ai) {
        switch (ai) {
            case 0:
                result.append("외국에서 ");
                break;
            case 1:
                result.append("밤마다 ");
                break;
            case 2:
                result.append("어릴 적 부터 ");
                break;
            case 3:
                result.append("부모 잘못 만나서 ");
                break;
            case 4:
                result.append("타고나길 ");
                break;
            case 5:
                result.append("참하게 생겨서는 ");
                break;
            case 6:
                result.append("매일 아침마다 ");
                break;
            case 7:
                result.append("할일 없이 ");
                break;
            case 8:
                result.append("하루도 안빠지고 ");
                break;
            case 9:
                result.append("재수 없게 ");
                break;
            default:
                result.append("오류");
        }
    }

    private void checkB(int bi) {
        switch (bi) {
            case 1:
                result.append("남의 심부름만 하던 ");
                break;
            case 2:
                result.append("굶을 일은 없었던 ");
                break;
            case 3:
                result.append("돈만 펑펀 쓰던 ");
                break;
            case 4:
                result.append("쫄쫄 굶었던 ");
                break;
            case 5:
                result.append("개 끌고 산책만 하던 ");
                break;
            case 6:
                result.append("쳐먹기만 했던 ");
                break;
            case 7:
                result.append("사기를 잘치던 ");
                break;
            case 8:
                result.append("밖을 싸돌아다니던 ");
                break;
            case 9:
                result.append("남을 괴롭히기 좋아하던 ");
                break;
            case 10:
                result.append("애인을 갈아치우던 ");
                break;
            case 11:
                result.append("책 읽기를 좋아하던 ");
                break;
            case 12:
                result.append("밤일만 밝히던 ");
                break;
            default:
                result.append("오류");
        }
    }

    private void checkC(int ci) {
        switch (ci) {
            case 1:
                result.append("미인대회 탈락자");
                break;
            case 2:
                result.append("조폭 두목");
                break;
            case 3:
                result.append("노름꾼");
                break;
            case 4:
                result.append("게이");
                break;
            case 5:
                result.append("내시");
                break;
            case 6:
                result.append("동네 바보");
                break;
            case 7:
                result.append("의사");
                break;
            case 8:
                result.append("친일파");
                break;
            case 9:
                result.append("백정");
                break;
            case 10:
                result.append("바람둥이");
                break;
            case 11:
                result.append("귀족");
                break;
            case 12:
                result.append("노숙자");
                break;
            case 13:
                result.append("빵셔틀");
                break;
            case 14:
                result.append("왕비");
                break;
            case 15:
                result.append("흥부네 막내");
                break;
            case 16:
                result.append("재벌집 자식");
                break;
            case 17:
                result.append("돌쇠");
                break;
            case 18:
                result.append("왕초");
                break;
            case 19:
                result.append("대통령 자식");
                break;
            case 20:
                result.append("이장님");
                break;
            case 21:
                result.append("앞잡이");
                break;
            case 22:
                result.append("예술가");
                break;
            case 23:
                result.append("왕자");
                break;
            case 24:
                result.append("대통령");
                break;
            case 25:
                result.append("기생");
                break;
            case 26:
                result.append("사업가");
                break;
            case 27:
                result.append("추노");
                break;
            case 28:
                result.append("아랍 석유 재벌");
                break;
            case 29:
                result.append("노예");
                break;
            case 30:
                result.append("공주");
                break;
            case 31:
                result.append("빵집점원");
                break;
            default:
                result.append("오류");
        }
    }
}
