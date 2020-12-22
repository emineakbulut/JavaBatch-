package com.syntax.newClass25;

public class FinalMethodClass {

    final double PI=3.14;

    void calculateAreaOfCircle(double radius){
        //Math.PI=20; because it has been declared as final
        System.out.println("Area of the circle "+(Math.PI*radius*radius));
    }

    double add(double num1, double num2){

        return  num1+num2;
    }

    final public void printName(){
        System.out.println("hello world");
    }
}
