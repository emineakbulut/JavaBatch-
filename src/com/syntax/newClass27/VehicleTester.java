package com.syntax.newClass27;

public class VehicleTester {

    public static void main(String[] args) {
//        Vehicle vehicle= new Vehicle();
//        Car cvar= new Car(); abstract class can not create objects
        Vehicle tesla=new Tesla("Red","x","tesla");
        tesla.start();
        tesla.drive();
        tesla.brake();
        tesla.stop();
        System.out.println("Number of vehicles created "
                +Vehicle.totalVehicle);

        new Toyota("yellow","camry","Toyota");
        System.out.println("Number of vehicles created "
                +Vehicle.totalVehicle);

    }
}
