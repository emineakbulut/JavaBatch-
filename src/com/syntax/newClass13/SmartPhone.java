package com.syntax.newClass13;

public class SmartPhone {

    String brand;
    String color;
    String model;

    void call (String phoneNumber) {
        System.out.println("Calling "+phoneNumber);
    }

    void text (String text) {
        System.out.println(brand+model+" send text "+text);
    }

    void pics() {
        System.out.println(brand+" can take a picture");
    }

    public static void main(String[] args) {
        SmartPhone eminePhone =new SmartPhone();
        SmartPhone bekirPhone=new SmartPhone();

        eminePhone.call("1234");
        bekirPhone.call("4567");
    }
}
