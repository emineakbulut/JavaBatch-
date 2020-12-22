package com.syntax.newClass29;

public class Student implements PrintInfo,PayFee{
    @Override
    public void printName() {
        System.out.println("Mohammad");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("123456789");
    }

    @Override
    public void printAddress() {

        System.out.println(" bla bla bla USA");
    }

    @Override
    public void payFee() {
        System.out.println("Paid");
    }
}
