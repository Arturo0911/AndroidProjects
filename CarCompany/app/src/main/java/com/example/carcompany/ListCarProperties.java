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

         //ArrayList<String> carResources = Vehicle.vehicleList.get(0);

         ArrayList<ArrayList<String>> vector = new ArrayList<ArrayList<String>>();

         ArrayList<String> valuess_1 = new ArrayList<String>(Arrays.asList("GYE-555", "Chevrolet"));
         ArrayList<String> valuess_2 = new ArrayList<String>(Arrays.asList("UIO-295", "Mazda"));
         vector.add(valuess_1);
         vector.add(valuess_2);


        try {
            customizedListCar = new CustomizedListCar(this,vector);

            carList.setAdapter(customizedListCar);
        }catch (Exception e){
            e.printStackTrace();
            Log.e("error", "onCreate: ", e);
        }


    }
}
