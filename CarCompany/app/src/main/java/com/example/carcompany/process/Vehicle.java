package com.example.carcompany.process;

import java.util.ArrayList;
import java.util.Arrays;

public class Vehicle {

    public static ArrayList<ArrayList<String>> vehicleList = new ArrayList<ArrayList<String>>();


    // this method gonna store the type of service such (car washing, car maintenance, car painting)
    public static String serviceType;

    /**
     * @param plate
     * @param color
     * @param make
     * @param model
     * @param year
     * @param ownerName
     * @param ownerCredential
     * @param ownerLastname
     * */
    public void addToArray(String plate, String make,String model, String year,
                           String color, String ownerName, String ownerLastname,String ownerCredential){
        ArrayList<String> vector = new ArrayList<String>(Arrays.asList(plate, make, model, year, color, ownerName, ownerLastname, ownerCredential));

        vehicleList.add(vector);
    }

}
