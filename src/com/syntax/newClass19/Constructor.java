package com.syntax.newClass19;

public class Constructor {

     int number;//static bc when its static it belongs class so single copy
     String name;//when not it belongs to obj and many copies needed when its necessary
     char character;

     Constructor(){
         System.out.println("I will be called everytime you create an object of this classrecording please");
     }

     void print(){
        System.out.println("Number"+number+"Name "+name+"Character "+character);
    }

    public static void main(String[] args) {
         Constructor constructor=new Constructor();

    }
}
