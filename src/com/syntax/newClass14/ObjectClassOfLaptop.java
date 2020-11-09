package com.syntax.newClass14;

public class ObjectClassOfLaptop {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.make="Mac";
        laptop.model="pro 16";
        laptop.storage=1;
        laptop.RAMCapacity=16;
        laptop.color="pink";
        laptop.processor="Core i7";
        laptop.GPU="Nvidia RTX 3090 12GB DDR6x";
        laptop.playMovies();
        laptop.browseInternet();
        laptop.makeVideoCall("Qasim");
        System.out.println(laptop.getModel());
        System.out.println(laptop.getRAMCapacity());
        System.out.println(laptop.upgradeRam(2));





    }
}
