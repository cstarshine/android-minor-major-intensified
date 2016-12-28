package com.jin.todo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter customAdapter;
    private List<Food> foods = new ArrayList<>();

    private EditText editName, editPrice, editImage;
    private Button save;

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();

        editImage = (EditText) findViewById(R.id.link);
        editName = (EditText)findViewById(R.id.name);
        editPrice = (EditText)findViewById(R.id.price);

        save = (Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String image = editImage.getText().toString();
                String price = editPrice.getText().toString();

                realm.beginTransaction();
                Food food = realm.createObject(Food.class);
                food.setName(name);
                food.setImage(image);
                food.setPrice(price);

                realm.commitTransaction();

                customAdapter = new CustomAdapter(getFoods());
                listView.setAdapter(customAdapter);
            }
        });
    }
    private List<Food> getFoods(){
        RealmResults<Food> all = realm.where(Food.class).findAll();
        foods = new ArrayList<>();
        for(int i = 0; i<all.size();i++){
            foods.add(all.get(i));
        }
        return foods;
    }
}
