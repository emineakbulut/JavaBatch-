package com.syntax.replhw;

public class Task179 implements Functions{
    double secondNumber;
    double firstNumber;
    static double result;

    Task179(double firstNumber, double secondNumber) {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }

    @Override
    public double adding(double firstNumber,double secondNumber) {
        result=firstNumber+secondNumber;
        return result;
    }

    @Override
    public double subtracting(double firstNumber,double secondNumber) {
        result=firstNumber-secondNumber;
        return result;

    }

    @Override
    public double multiply(double firstNumber,double secondNumber) {
        result=firstNumber*secondNumber;
        return result;
    }

    @Override
    public double dividing(double firstNumber,double secondNumber) {
        result=firstNumber/secondNumber;
        return result;
    }

    @Override
    public void display(double result) {
        System.out.println("Result is ::: "+result);
    }

    public static void main(String[] args) {
        Task179 main=new Task179(100.00,20.00);
        main.adding(100.00,20.00);
        main.display(result);
        main.subtracting(100.00,20.00);
        main.display(result);
        main.multiply(100.00,20.00);
        main.display(result);
        main.dividing(100.00,20.00);
        main.display(result);
    }
}
