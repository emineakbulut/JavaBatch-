package com.syntax.newClass29;

public class Main {
    public static void main(String[] args) {
        Student printInfo=new Student();
        printInfo.printName();
        printInfo.printPhoneNumber();
        printInfo.printAddress();
        printInfo.payFee();

        PrintInfo printInfo1=new Employee();
        printInfo1.printName();
        printInfo1.printPhoneNumber();
        printInfo1.printAddress();

    }
}
