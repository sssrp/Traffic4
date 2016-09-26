package com.example.pc.traffic;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pc on 26/9/2559.
 */
public class MyAdapter extends BaseAdapter {
    //Explicit
    private Context objContextext;
    private int[] trafficInts;
    private String[] trafficString;

    public MyAdapter(Context objContext, int[] trafficInts, String[] trafficString) {
        this.objContextext = objContext;
        this.trafficInts = trafficInts;
        this.trafficString = trafficString;
    } //constuctor

    @Override
    public int getCount() {
        return trafficString.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i,View view,ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContextext
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //show Icon

        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imvShowicon);
        iconImageView.setBackgroundResource((trafficInts[i]));

        //show Title
        TextView titileTextview = (TextView) view1.findViewById(R.id.txtShowicom);
        titileTextview.setText(trafficString[i]);
        return view1;


    }
}//main class
