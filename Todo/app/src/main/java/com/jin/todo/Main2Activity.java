package com.jin.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView y = (TextView)this.findViewById(R.id.y);
        TextView m = (TextView)this.findViewById(R.id.m);
        TextView d = (TextView)this.findViewById(R.id.d);

        Integer year = getIntent().getIntExtra("year",0);
        Integer month = getIntent().getIntExtra("month",0);
        Integer day = getIntent().getIntExtra("day",0);

        if(month>12 || month<0 || month>12 || month<1 || day>32 || day<1){
            Toast.makeText(MainActivity,"오류발생",Toast.LENGTH_SHORT).show();
        }
        else {
            year = year % 10;

            switch (year) {
                case 0:
                    y.setText("외국에서 ");
                    break;
                case 1:
                    y.setText("밤마다 ");
                    break;
                case 2:
                    y.setText("어릴 적 부터 ");
                    break;
                case 3:
                    y.setText("부모 잘못 만나서 ");
                    break;
                case 4:
                    y.setText("타고나길 ");
                    break;
                case 5:
                    y.setText("참하게 생겨서는 ");
                    break;
                case 6:
                    y.setText("매일 아침마다 ");
                    break;
                case 7:
                    y.setText("할일 없이 ");
                    break;
                case 8:
                    y.setText("하루도 안빠지고 ");
                    break;
                case 9:
                    y.setText("재수 없게 ");
                    break;
                default:
                    m.setText("오류");
            }

            switch (month) {
                case 1:
                    m.setText("남의 심부름만 하던 ");
                    break;
                case 2:
                    m.setText("굶을 일은 없었던 ");
                    break;
                case 3:
                    m.setText("돈만 펑펀 쓰던 ");
                    break;
                case 4:
                    m.setText("쫄쫄 굶었던 ");
                    break;
                case 5:
                    m.setText("개 끌고 산책만 하던 ");
                    break;
                case 6:
                    m.setText("쳐먹기만 했던 ");
                    break;
                case 7:
                    m.setText("사기를 잘치던 ");
                    break;
                case 8:
                    m.setText("밖을 싸돌아다니던 ");
                    break;
                case 9:
                    m.setText("남을 괴롭히기 좋아하던 ");
                    break;
                case 10:
                    m.setText("애인을 갈아치우던 ");
                    break;
                case 11:
                    m.setText("책 읽기를 좋아하던 ");
                    break;
                case 12:
                    m.setText("밤일만 밝히던 ");
                    break;
                default:
                    m.setText("오류");
            }

            switch (day) {
                case 1:
                    d.setText("미인대회 탈락자");
                    break;
                case 2:
                    d.setText("조폭 두목");
                    break;
                case 3:
                    d.setText("노름꾼");
                    break;
                case 4:
                    d.setText("게이");
                    break;
                case 5:
                    d.setText("내시");
                    break;
                case 6:
                    d.setText("동네 바보");
                    break;
                case 7:
                    d.setText("의사");
                    break;
                case 8:
                    d.setText("친일파");
                    break;
                case 9:
                    d.setText("백정");
                    break;
                case 10:
                    d.setText("바람둥이");
                    break;
                case 11:
                    d.setText("귀족");
                    break;
                case 12:
                    d.setText("노숙자");
                    break;
                case 13:
                    d.setText("빵셔틀");
                    break;
                case 14:
                    d.setText("왕비");
                    break;
                case 15:
                    d.setText("흥부네 막내");
                    break;
                case 16:
                    d.setText("재벌집 자식");
                    break;
                case 17:
                    d.setText("돌쇠");
                    break;
                case 18:
                    d.setText("왕초");
                    break;
                case 19:
                    d.setText("대통령 자식");
                    break;
                case 20:
                    d.setText("이장님");
                    break;
                case 21:
                    d.setText("앞잡이");
                    break;
                case 22:
                    d.setText("예술가");
                    break;
                case 23:
                    d.setText("왕자");
                    break;
                case 24:
                    d.setText("대통령");
                    break;
                case 25:
                    d.setText("기생");
                    break;
                case 26:
                    d.setText("사업가");
                    break;
                case 27:
                    d.setText("추노");
                    break;
                case 28:
                    d.setText("아랍 석유 재벌");
                    break;
                case 29:
                    d.setText("노예");
                    break;
                case 30:
                    d.setText("공주");
                    break;
                case 31:
                    d.setText("빵집점원");
                    break;
                default:
                    m.setText("오류");
            }
        }
    }
}
