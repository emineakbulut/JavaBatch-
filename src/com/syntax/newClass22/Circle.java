package com.syntax.newClass22;

public class Circle extends Shape{

    /*
   Write program: Shape class has a constructor
   that takes the radius and has a subclass as  circle class.
   In circle class create a method to calculate the area of circle.
   Test your code
    */
    Circle(double radius) {
        super(radius);
    }

    public void calculateArea(){
        double area=3.14*radius*radius;
        System.out.println(area);
    }

    public static void main(String[] args) {

        Circle task2=new Circle(2);
        task2.calculateArea();
    }
}
