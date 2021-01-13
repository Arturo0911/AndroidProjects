package com.example.carcompany;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.carcompany.process.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class ListCarProperties extends Activity {

    private ListView carList;
    private CustomizedListCar customizedListCar;

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_cars);

        carList = (ListView) findViewById(R.id.listCarProperties);

         ArrayList<ArrayList<String>> carResources = Vehicle.vehicleList;

        try {
            customizedListCar = new CustomizedListCar(this,carResources);

            carList.setAdapter(customizedListCar);
        }catch (Exception e){
            e.printStackTrace();
            Log.e("error", "onCreate: ", e);
        }

    }
}
