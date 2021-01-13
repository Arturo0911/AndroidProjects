package com.example.carcompany.process;

import java.util.ArrayList;
import java.util.Arrays;

public class Vehicle {

    public static ArrayList<ArrayList<String>> vehicleList = new ArrayList<ArrayList<String>>();


    // this method gonna store the type of service such (car washing, car maintenance, car painting)
    // setting default car washing
    public static String serviceType = "Car washing";

    // wash     maintenance_2       paint_2
    public static String imageName = "wash";

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
                           String color, String ownerName, String ownerLastname,String ownerCredential, String service, String imgName){
        ArrayList<String> vector = new ArrayList<String>(Arrays.asList(plate, make, model, year, color, ownerName, ownerLastname, ownerCredential, service, imgName));

        vehicleList.add(vector);
    }

}
