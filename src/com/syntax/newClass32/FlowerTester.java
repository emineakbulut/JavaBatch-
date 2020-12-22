package com.syntax.newClass32;

import java.util.ArrayList;

public class FlowerTester {
    public static void main(String[] args) {

        ArrayList<Flower> flowerArrayList=new ArrayList<>();
        flowerArrayList.add(new SunFlower("SunFlower","Yellow"));
        flowerArrayList.add(new Tulip("Tulip","Pink"));
        flowerArrayList.add(new Rose("Rose","White"));
        flowerArrayList.add(new SunFlower("SunFlower","Yellow"));

        for (Flower flower:flowerArrayList
             ) {
            System.out.println(flower.name+" color "+flower.color);
            flower.bloom();
            System.out.println();
        }
        }
    }

