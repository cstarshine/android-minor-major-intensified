package com.sunrin.task04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter customAdapter;
    private List<Pet> pets = new ArrayList<>();

    private EditText editType, editName, editAge;
    private Button btnSave;


    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();
        pets.add(new Pet("개", "멍멍이", 12));
        pets.add(new Pet("개", "엉엉이", 30));
        pets.add(new Pet("고양이", "냐옹이", 2));
        pets.add(new Pet("고양이", "나비", 1));
        pets.add(new Pet("코알라", "코쟁이", 11));
        pets.add(new Pet("캥거루", "권투", 13));

        editAge = (EditText) findViewById(R.id.editAge);
        editName = (EditText) findViewById(R.id.editName);
        editType = (EditText) findViewById(R.id.editType);

        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String type = editType.getText().toString();
                int age = Integer.parseInt(editAge.getText().toString());

//                //한마리의 동물을 생성
//                Pet pet = new Pet(type, name, age);
//                //생성된 동물을 리스트에 추가
//                pets.add(pet);



                //DB 시작
                realm.beginTransaction();
                Pet pet = realm.createObject(Pet.class);
                pet.setAge(age);
                pet.setName(name);
                pet.setType(type);
                //DB 끝
                realm.commitTransaction();

                pets.add(pet);
                //adapter를 다시 선언
                customAdapter = new CustomAdapter(getPets());
                listView.setAdapter(customAdapter);

            }
        });


        customAdapter = new CustomAdapter(getPets());
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customAdapter);
    }

    private List<Pet> getPets() {
        //WHERE
        RealmResults<Pet> all = realm.where(Pet.class).findAll();
        pets = new ArrayList<>();
        for (int i = 0; i < all.size(); i++) {
            pets.add(all.get(i));
        }
        return pets;

    }


}
