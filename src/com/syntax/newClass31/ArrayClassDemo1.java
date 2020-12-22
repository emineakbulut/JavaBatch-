package com.syntax.newClass31;

import java.util.ArrayList;

public class ArrayClassDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(15.00);
        System.out.println("Before replacement");
        System.out.println(doubleArrayList);
        // replaces the value at specified index
        doubleArrayList.set(1,20.25);
        System.out.println("After replacement");
        System.out.println(doubleArrayList);
        doubleArrayList.remove(0);
        System.out.println("After removal");
        System.out.println(doubleArrayList);

        System.out.println("printing from top to bottom");
        for (Double singleNum:doubleArrayList
        ) {
            System.out.println(singleNum);
        }

        System.out.println("Looping in reverse order");
        for (int i = doubleArrayList.size()-1; i>=0; i--) {
            System.out.println(doubleArrayList.get(i));
        }


    }

}

