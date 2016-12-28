package com.jin.todo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner year, month, date;

    Object yearSt, monthSt, daySt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edyear = (EditText)findViewById(R.id.year);
        final EditText edmonth = (EditText)findViewById(R.id.month);
        final EditText edday = (EditText)findViewById(R.id.day);

        Button button = (Button)findViewById(R.id.ok);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer Year = Integer.valueOf(edyear.getText().toString());
                Integer Month = Integer.valueOf(edmonth.getText().toString());
                Integer Day = Integer.valueOf(edday.getText().toString());

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                intent.putExtra("year",Year);
                intent.putExtra("month",Month);
                intent.putExtra("day",Day);

                startActivity(intent);
            }
        });

    }
}
