package com.syntax.replhw;
/*
In carObject class:
Create instance variables as below.
model
price,
quantity
Create a constructor that will initialize instance variables.
Create a method with name carStockValue.
Write logic to calculate the total values of cars in stock and print the result.
run the application in Main Class
Expected Output:
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
 */

public class Task150 {

    String model;
    double price;
    double quantity;

    Task150(String model,double price,int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;

    }
    void carStockValue(){
        double value;
        value=price*quantity;
        System.out.println(model+" Stock Value "+value);
    }

    public static void main(String[] args) {
        Task150 car1=new Task150("Toyota 2019",25000,10);
        car1.carStockValue();
        Task150 car=new Task150("BMW 2019",65298,10);
        car.carStockValue();

    }
}
