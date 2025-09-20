package com.example.myspinnerdemo2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomAdapter extends BaseAdapter {

    private String[] countryNames;
    private String[] population;
    int[] flags;
    Context context;

    public CustomAdapter(Context context,int[] flags,String[] countryNames, String[] population) {
        this.countryNames = countryNames;
        this.population = population;
        this.flags = flags;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
