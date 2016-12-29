package com.jin.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jin on 2016-12-28.
 */

public class ScheAdapter extends BaseAdapter{

    private List<Sche> sches;

    public ScheAdapter(List<Sche> sches){this.sches = sches;}

    @Override
    public int getCount(){ return sches.size(); }

    @Override
    public Object getItem(int i){ return sches.get(i); }
33
    @Override
    public long getItemId(int i){ return 0; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){


        Context context = viewGroup.getContext();
        View view1 = LayoutInflater.from(context).inflate(R.layout.schedule, viewGroup, false);
        Sche sche = sches.get(i);

        TextView textSche = (TextView)view1.findViewById(R.id.schetext);

        textSche.setText(sche.getSche());

        return view;
    }

}
