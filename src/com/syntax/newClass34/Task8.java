package com.syntax.newClass34;

import java.util.ArrayList;

public class Task8 {

    /*
   Create a collection of integers in which you can keep duplicates.
   Write a logic to find sum of all integers
    */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(11);
        numbers.add(44);
        numbers.add(55);
        numbers.add(66);
        numbers.add(11);
        numbers.add(77);
        System.out.print(numbers + " ");
        System.out.println();
        System.out.println("---------------------Sum of numbers----------------------");
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers is = " + sum);
    }
}

