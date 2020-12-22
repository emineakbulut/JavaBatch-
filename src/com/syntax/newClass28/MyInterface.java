package com.syntax.newClass28;

public  interface MyInterface extends MyInterface2,MyInterface3 {
    //before Java 8
    String name ="Hellllo";
    void printInfo();


    //java 8
    static void printNumber(){
        System.out.println("1234567989");
    }
    default void printName(){
        //these default are used to support lambdas
    }

}