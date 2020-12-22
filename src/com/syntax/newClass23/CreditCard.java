package com.syntax.newClass23;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */

    double balance;
    double interest;
    public  CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    //Breaktill 1:30
    double  getInterest(){
        return balance * interest;
    }
    public static void print(){
        System.out.println("I am a static  in CreditCard method i belong to class and i don't need an object to be called");
    }

}
class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);


    }
    double getInterest(){
        return balance * interest*3;
    }
    public static void print(){
        System.out.println("I am overridden method in child class");
    }

}
class AmericanExpress extends CreditCard{
    public AmericanExpress(double balance, double interest) {
        super(balance, interest);
    }
    double getInterest(){
        return balance * interest*2;
    }
}
class CreditCardTester {
    public static void main(String[] args) {
        Visa visa = new Visa(1000,0.29);
        System.out.println(visa.getInterest());
        AmericanExpress americanExpress = new AmericanExpress(1000, 0.24);
        System.out.println(americanExpress.getInterest());
        Visa.print();
    }
}
