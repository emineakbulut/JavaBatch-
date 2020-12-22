package com.syntax.newClass19;

public class Hw2Reversed {
    /*
    Create a method that will take a String as a parameter
     and returns reversed String. Method should be
      available to all classes within your project(means must be public)
       and accessible by class name.(means must be static)
     */
    public static String reverseString(String string){
        StringBuilder stringBuilder=new StringBuilder(string);
        return stringBuilder.reverse().toString();

    }
}
