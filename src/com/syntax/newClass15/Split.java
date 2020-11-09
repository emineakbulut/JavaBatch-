package com.syntax.newClass15;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

        String name = "Burju*Maria*Qasim";
        String[] array = name.split("[^A-Z a-z]");
        System.out.println(Arrays.toString(array));
    }
}
