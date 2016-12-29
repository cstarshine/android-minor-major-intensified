package com.jin.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class adsche extends AppCompatActivity {

   private Button btcnl, btok;

   private ListView listView;
   private ScheAdapter scheAdapter;
   private List<Sche> sches = new ArrayList<>();

    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adsche);

        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();

        final EditText editText = (EditText)findViewById(R.id.editText);

        btcnl = (Button)findViewById(R.id.cancel);
        btok = (Button)findViewById(R.id.ok);


        btok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edit = editText.getText().toString();
                listView = (ListView) findViewById(R.id.sche);
                realm.beginTransaction();
                Sche sche = realm.createObject(Sche.class);
                sche.setSche(edit);
                realm.commitTransaction();

                scheAdapter = new ScheAdapter(getSches());
                listView.setAdapter(scheAdapter);
            }
        });

        btcnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private List<Sche> getSches(){
        RealmResults<Sche> all = realm.where(Sche.class).findAll();
            sches = new ArrayList<>();
            for(int i=0;i < all.size(); i++ ){
                sches.add(all.get(i));
        }
            return sches;
    }
}
