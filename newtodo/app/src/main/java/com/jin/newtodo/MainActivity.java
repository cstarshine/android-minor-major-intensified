package com.jin.newtodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView PetList;
    List<Pet> petList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PetList = (ListView)findViewById(R.id.);

        PetAdapter pet= new PetAdapter(petList);

        PetList.setAdapter(pet);
    }
}
