package com.syntax.newClass30;

import java.util.Arrays;

public class ArraysIssues {
    public static void main(String[] args) {
        String name = "Ali";
        String name1 = "Nabin";
        String name2 = "Qasim";
        //variables can hold one value at time if we ned to store 1000 values we need to
        //declare 1000 variables
        int initialSize = 3;
        String[] names = new String[initialSize];
        names[0] = "Ali";
        names[1] = "Nabin";
        names[2] = "Qasim";
        // names[3]="Davit"; Array index out of bound as the size of the array was 3
        //we can not store more than 3 elementsd

        //Arrays are fixed in size we have to provide the size of the array in adavnce
        //before we can use it.

        System.out.println(names.length);
        names = expandArray(names);
        names[3]="Davit";
        names[4]="Maria";
        names[5]="Mike";
        names = expandArray(names);
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));

    }
    public static String[] expandArray(String[] oldArray) {

        String[] newArray = new String[oldArray.length * 2];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;


    }
}


