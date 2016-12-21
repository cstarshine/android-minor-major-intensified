package com.jin.asdf;

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

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.lmage);
        TextView textViewId = (TextView)view.findViewById(R.id.textViewId);
        TextView textViewName = (TextView)view.findViewById(R.id.textViewName);
        //textView.setText(getItem(position).toString());

        student stu = studentList.get(position);

        String id = String.valueOf(stu.getId());
        String name = stu.getName();

        textViewId.setText(id);
        textViewName.setText(name);

        return view;
    }
}
