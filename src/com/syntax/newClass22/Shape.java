package com.syntax.newClass22;

public class Shape {

     /*
    Write program: Shape class has a constructor that
    takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle.
    Test your code
     */

    double radius;
    Shape(double radius){
        this.radius=radius;
    }
    void printRadius(){
        System.out.println(radius);
    }
}
