package com.syntax.replhw;
/*
In Parent class.
Create a constructor, it will take a String parameter called city.
include the logic of printing the parameter value.
Create another constructor without parameter.
Include the logic of printing "Parent Constructor".
Create a Child Class that should be a subclass of Parent class
Inside child class create a constructor that will make a call to parameterized constructor of the parent class.
In Main class.
Create an Object of the child class by passing String value "Vienna"
Expected Output:
Vienna
 */

public class Task155Parent {
    String city;
    Task155Parent(String city){
        this.city=city;
        System.out.println(city);
    }
    Task155Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child1 extends Task155Parent{
    Child1(String city){
        super(city);//constructorun icine yaziliyor
    }
    public static void main(String[] args) {
        Child1 child=new Child1("Vienna");

    }

}