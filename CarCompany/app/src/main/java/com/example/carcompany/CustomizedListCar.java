package com.example.carcompany;

import android.content.Context;
import android.text.style.AlignmentSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomizedListCar extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<ArrayList<String>> carProperties;

    public CustomizedListCar(Context context, ArrayList<ArrayList<String>> carProperties){

        this.context = context;
        this.carProperties = carProperties;
    }

    @Override
    public int getCount() {
        return carProperties.size();
    }

    @Override
    public Object getItem(int position) {
        return carProperties.get(position);
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater lytInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = lytInflater.inflate(R.layout.list_car_customized, null);
        }

        TextView plateCar = (TextView) convertView.findViewById(R.id.plateCar);
        TextView modelCar = (TextView) convertView.findViewById(R.id.modelCar);


        plateCar.setText(carProperties.get(position).get(5));
        modelCar.setText(carProperties.get(position).get(6));

        return convertView;

    }
}
