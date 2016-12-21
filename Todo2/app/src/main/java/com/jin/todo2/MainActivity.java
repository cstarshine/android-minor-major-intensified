package com.jin.todo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button count = (Button)findViewById(R.id.BtCount);
        Button reset = (Button)findViewById(R.id.BtReset);

        final TextView textcount = (TextView)findViewById(R.id.text_view);
        final EditText editText = (EditText)findViewById(R.id.edit_text);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcount.setText(String.valueOf(editText.length()));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

    }
}
