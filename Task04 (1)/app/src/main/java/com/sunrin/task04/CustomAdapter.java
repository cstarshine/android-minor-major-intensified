package com.sunrin.task04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private List<Pet> pets;

    public CustomAdapter(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public int getCount() {
        return pets.size();
    }

    @Override
    public Object getItem(int i) {
        return pets.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Context context = viewGroup.getContext();
        Pet pet = pets.get(i);

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_pet, viewGroup, false);
        }

        TextView textType = (TextView) view.findViewById(R.id.text_type);
        TextView textName = (TextView) view.findViewById(R.id.text_name);
        TextView textAge = (TextView) view.findViewById(R.id.text_age);

        textType.setText("종류 : " + pet.getType());
        textName.setText("이름 : " + pet.getName());
        textAge.setText("나이 : " + pet.getAge());

        return view;
    }

}