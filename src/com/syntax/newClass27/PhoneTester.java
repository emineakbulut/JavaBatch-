package com.syntax.newClass27;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iPhone=new Iphone();
        iPhone.call();
        iPhone.text();
        iPhone.playMusic();
        iPhone.takePicture();

        Phone samsung = new Samsung();

        samsung.call();
        samsung.text();
        samsung.playMusic();
        samsung.takePicture();

        //same output
        //Break till 09:00

        Phone[] allPhones = {iPhone, samsung};
        for (Phone phone : allPhones
        ) {
            phone.call();
            phone.text();
            phone.playMusic();
            phone.takePicture();
        }

    }
}
