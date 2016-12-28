package com.jin.asdf;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jin on 2016-12-21.
 */

public class CustomAdapter extends BaseAdapter{

    //String[] ITEMS;

    List<student> studentList;

    public CustomAdapter(List<student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public int getCount(){
        return studentList.size();
    }

    @Override
    public Object getItem(int position){
        return studentList.get(position);
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        student stu = studentList.get(position);

        boolean isLeft = stu.isLeft();

        String id = String.valueOf(stu.getId());
        String name = stu.getName();

        if(isLeft) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, null);

            ImageView imageView = (ImageView) view.findViewById(R.id.lmage);
            TextView textId = (TextView) view.findViewById(R.id.textViewId);
            TextView textName = (TextView) view.findViewById(R.id.textViewName);
            //textView.setText(getItem(position).toString());

            textId.setText(id);
            textName.setText(name);

            return view;
        }
        else {

            View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout2, null);

            ImageView imageView2 = (ImageView) view2.findViewById(R.id.lmage2);
            TextView textId2 = (TextView) view2.findViewById(R.id.textViewId2);
            TextView textName2 = (TextView) view2.findViewById(R.id.textViewName2);

            textId2.setText(id);
            textName2.setText(name);

            return view2;
        }
    }
}
