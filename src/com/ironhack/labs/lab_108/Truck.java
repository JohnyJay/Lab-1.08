package com.ironhack.labs.lab_108;

public class Truck extends Car{
    private double towingCapacity;


    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public String towingInfo(){
        return "The towing capacity of this truck is " + getTowingCapacity();
    }
}
