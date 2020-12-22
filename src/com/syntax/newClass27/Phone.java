package com.syntax.newClass27;

public abstract class Phone {

    Phone(){
        System.out.println("Constructor from Phone called");
    }

    public void call(){
        System.out.println("Phone can make calls");
    }

    public void text(){
        System.out.println("Phone can send texts");
    }

    public abstract void takePicture();
    public abstract void playMusic();
}
 class Iphone extends Phone{

    Iphone(){
        System.out.println("Constructor from Iphone called");
    }

    @Override
    public void takePicture() {
        System.out.println(" Can take good pictures in low light");
    }

    @Override
    public void playMusic() {
        System.out.println("Iphone can play musing using Apple");

    }
    public void faceTime(){
         System.out.println("I have faceTime for video calls");
     }
}

class Samsung extends Phone {

    Samsung() {
        System.out.println("Constructor from Samsung called ");
    }

    @Override
    public void takePicture() {

        System.out.println("Can take pictures using telephoto");
    }

    @Override
    public void playMusic() {
        System.out.println("Can play music using Google music");
    }

    public void Duo() {
        System.out.println(" I can make video calls using Duo");
    }
}