package com.syntax.replhw;
/*
1. Complete the Car.java class:
Create the following variable (Choose proper datatype)
* make
* model
* numberOfDoors
* topSpeed
* price
following the proper naming convention for variables.
Write four constructors:
* The first constructor(with all parameters)
* A secondary constructor Have all parameters except numberOfDoors. (numberOfDoors value should assign to 4 inside constructor)
* A third constructor Have all parameters except make and model . (make and model value should assign to "unknown" inside constructor)
* A fourth constructor Have all parameters except topSpeed and price;(topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)

Create a display method in Cars class to print the class variable value in console.
2. Test your code with the Main.java class:
Create several Car objects using all Constructors.
then call display method with each object.
Output:
Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
 */

public class Task146Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

     Task146Car(String make, String model, int numberOfDoors, int topSpeed, double price){
         this.make=make;
         this.model=model;
         this.numberOfDoors=numberOfDoors;
         this.topSpeed=topSpeed;
         this.price=price;

    }
    Task146Car(String make,String model,int topSpeed,double price){
        this.numberOfDoors = 4;
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;

    }
    Task146Car(int numberOfDoors,int topSpeed,double price){
        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Task146Car(String make, String model, int numberOfDoors){
        this.make="Toyota";
        this.model="Prius";
        this.numberOfDoors=4;
        this.topSpeed=90;
        this.price=price;

    }

    void print(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

    public static void main(String[] args) {
        Task146Car car=new Task146Car("Toyota","Prius",4,120,30000.0);
        car.print();
        Task146Car car1=new Task146Car("Toyota","Prius",120,30000.0);
        car1.print();
        Task146Car car2=new Task146Car(4,120,30000.0);
        car2.print();
        Task146Car car3=new Task146Car("Toyota","Prius",4);
        car3.print();
    }
}
