package com.syntax.newClass23;

public class SquareTask {
    /*
        Create 1 class in which create a method that will calculate the  area of
        Square
        Rectangle
        Use separate class to test your code
         */
    double getArea(double width){
        return width*width;
    }

    double getArea(double height,double width){
        return height*width;
    }

    public static void main(String[] args) {
        SquareTask squareTask=new SquareTask();
        System.out.println("Area of the square "+squareTask.getArea(10));
        System.out.println("Area of the square "+squareTask.getArea(10,20));
    }

}
