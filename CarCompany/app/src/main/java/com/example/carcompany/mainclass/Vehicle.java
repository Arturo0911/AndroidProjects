package com.example.carcompany.mainclass;

public class Vehicle {

    private String color ;


    public Vehicle(){

    }

    public Vehicle(String color){
        this.setColor(color);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
