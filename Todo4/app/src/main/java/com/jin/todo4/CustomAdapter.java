package com.jin.todo4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Jin on 2016-12-26.
 */

public class CustomAdapter extends BaseAdapter{

    private List<Food> foodList;

    public CustomAdapter(List<Food> foodList){this.foodList = foodList;}

    @Override
    public int getCount(){return foodList.size();}

    @Override
    public Object getItem(int i){return foodList.get(i);}

    @Override
    public long getItemId(int i){return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        Context context = viewGroup.getContext();
        Food food = foodList.get(i);

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        }

        TextView textName = (TextView)view.findViewById(R.id.foodName);
        TextView textPrice = (TextView)view.findViewById(R.id.foodPrice);
        ImageView image = (ImageView)view.findViewById(R.id.foodImage);

        textName.setText(food.getName());
        textPrice.setText(food.getPrice());
        Glide.with(viewGroup.getContext()).load(food.getImage()).into(image);

        return view;
    }
}
