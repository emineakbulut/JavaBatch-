package com.syntax.newClass19;

public class Constructor {

     int number;//static bc when its static it belongs class so single copy
     String name;//when not it belongs to obj and many copies needed when its necessary
     char character;

     Constructor(){//unlike methods we do not write anything  even void, bc constructor doesnt need
         System.out.println("I will be called everytime you create an object of this class ");
     }
     Constructor(int numberValue, String nameValue, char characterValue){
         System.out.println("I am not a useless constructor i am initializing your fields");
         number=numberValue;
         name=nameValue;
         character=characterValue;
     }

     void print(){//i have to write a return type

         System.out.println("Number"+number+"Name "+name+"Character "+character);
    }

    public static void main(String[] args) {
         Constructor constructor=new Constructor();//prints line 10
         //constructor.print();
        Constructor constructor2=new Constructor(100,"emine",'A');

         //Constructor(name of the class)
        //constructor name of the variable
        //= assignment,new keyword communicates with Java that we need an object
        //Constructor ()-->this initializes the field

    }
}
