package com.jin.newtodo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jin on 2016-12-23.
 */

public class PetAdapter extends BaseAdapter{
    List<PetInform> petList;

    public PetAdapter(List<PetInform> petList){this.petList = petList;}

    @Override
    public int getCount(){ return petList.size();}

    @Override
    public Object getItem(int position){ return petList.get(position);}

    @Override
    public long getItemId(int position){ return 0;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pet,null);
        TextView textname = (TextView)view.findViewById(R.id.text_name);
        TextView texttype = (TextView)view.findViewById(R.id.text_type);
        TextView textage = (TextView)view.findViewById(R.id.text_age);

        Pet petInf = petList.get(position);

        String name = petInf.getName();
        String type = petInf.getType();
        String age = String.valueOf(petInf.getAge());

        texttype.setText(type);
        textage.setText(age);
        textname.setText(name);

        return view;
    }
}
