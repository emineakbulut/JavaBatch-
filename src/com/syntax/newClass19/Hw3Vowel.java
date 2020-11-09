package com.syntax.newClass19;

public class Hw3Vowel {

    private String vowelsOnly(String name){
        return name.replaceAll("[^AEIOUaeiou]","");
    }
}
