package com.jin.asdf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    GridView gridView;
    //String[] ITEMS = {"a","b","c","d","e","f"};
    List<student> studentList = new ArrayList<>();
//DataTransferObject
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList.add(new student(true,"홍길동",13));
        studentList.add(new student(true,"짱구",14));
        studentList.add(new student(false,"철수",15));
        studentList.add(new student(false,"유리",16));
        studentList.add(new student(true,"태준",17));
        studentList.add(new student(false,"정우",18));
        studentList.add(new student(true,"미어캣",19));
        studentList.add(new student(false,"호랑이",20));
        studentList.add(new student(true,"은표",21));
        studentList.add(new student(false,"짱아",22));
        studentList.add(new student(true,"코난",23));
        studentList.add(new student(false,"최도이",24));

        listView = (ListView) findViewById(R.id.list);
        CustomAdapter adapter = new CustomAdapter(studentList);
        listView.setAdapter(adapter);

        //listView = (ListView)findViewById(R.id.list);
        //ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ITEMS);
        //listView.setAdapter(adapter);

//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0) {
//                    //Toast.makeText(getApplicationContext(), ITEMS[position], Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
}
