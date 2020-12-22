package com.syntax.newClass30;

import java.util.Arrays;

public class Collection {
    public static void main(String[] args) {
        String name = "Ali";
        String name1 = "Nabin";
        String name2 = "Qasim";
        //variables can hold one value at time if we ned to store 1000 values we need to
        //declare 1000 variables
        int initialSize = 3;
        int elementStored=0;
        String[] names = new String[initialSize];
        names[0] = "Ali";
        elementStored++;
        names[1] = "Nabin";
        elementStored++;
        names[2] = "Qasim";
        elementStored++;
        // names[3]="Davit"; Array index out of bound as the size of the array was 3
        //we can not store more than 3 elements

        //System.out.println(Arrays.toString(names));-->will print[Ali,Nabin,Qasim,null,null,null......]
        //That will waste alot of memory

        //another way to do long way
        if (names.length>elementStored) {
            String [] temp = new String[initialSize*2];
           temp[0]=names[0];
           temp[1]=names[1];
           temp[2]=names[2];
           temp[3]="Emine";
        }

        //Arrays are fixed in size we have to provide the size of the array in advance
        //before we can use it.

        System.out.println(names.length);
        names = expandArray(names);
        names[3]="Davit";
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));

    }
    public static String[] expandArray(String[] oldArray) {
//
//        String [] newArray = new String[oldArray.length*2];
//        newArray[0]=oldArray[0];
//        newArray[1]=oldArray[1];
//        newArray[2]=oldArray[2];
//        newArray[3]="Emine";
//
//        return newArray;---->before for loop

        String[] newArray = new String[oldArray.length * 2];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;


    }
}
