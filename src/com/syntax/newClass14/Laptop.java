package com.syntax.newClass14;

public class Laptop {

    String make;
    String model;
    int storage;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies() {
        System.out.println("Playing movies");
    }

    void browseInternet() {
        System.out.println("browsing the Internet");
    }

    void makeVideoCall(String contact) {
        System.out.println("Video calling to " + contact);
    }

    String getModel() {
        return "HI";
    }

    int getRAMCapacity() {
        return RAMCapacity * 2;
    }

    int upgradeRam(int newRAMUnit) {
        return newRAMUnit * RAMCapacity;
    }
}