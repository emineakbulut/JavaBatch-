package com.syntax.replhw;

import java.util.LinkedList;
import java.util.List;

public class Task196 {
/*
Create a method that will remove an element based on the specified condition from given List and return new List;
 Expected Output:
[USA, Kazakhstan, Pakistan, Russia]
 */
    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        countries.remove(0);
        countries.remove(2);
        countries.remove(4);


        System.out.println(countries);
    }
}
