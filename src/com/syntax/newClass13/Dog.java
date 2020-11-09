package com.syntax.newClass13;

public class Dog {
    //Write some of the attribute that adog can have

    String breed;
    int age;
    String color;
    String name;

    void bark(){
        System.out.println("Dog barks");

    }


    void fetch() {
        System.out.println("Fetches ball");
    }

    void sleep() {
        System.out.println("Dog sleeps");
    }

        public static void main (String[] args) {

            Dog dog1=new Dog();
            dog1.age= 3;
            dog1.name="Lessie";
            dog1.breed="Bulldog";
            dog1.color="White";

            dog1.bark();
            dog1.fetch();
            dog1.sleep();


    }


}