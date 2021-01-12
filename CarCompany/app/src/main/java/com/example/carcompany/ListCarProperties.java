package com.example.carcompany;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.carcompany.process.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class ListCarProperties extends Activity {

    private ListView listCarProperties;

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_cars);

        listCarProperties = (ListView) findViewById(R.id.listCarProperties);

         ArrayList<String> carResources = Vehicle.vehicleList.get(0);

         ArrayList<String> vector = new ArrayList<>();
         vector.add("Arturo");
         vector.add("Negreiros");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListCarProperties.this, android.R.layout.simple_list_item_1, vector);

        listCarProperties.setAdapter(adapter);


    }
}
