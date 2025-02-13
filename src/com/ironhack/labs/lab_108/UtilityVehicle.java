package com.ironhack.labs.lab_108;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String fourWheelInfo(){
        String res;
        if(this.fourWheelDrive){
            res = "This car is a four wheel drive.";
        }else{
            res = "This car is not a four wheel drive.";
        }
        return res;
    }
}
