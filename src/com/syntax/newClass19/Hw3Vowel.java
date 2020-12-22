package com.syntax.newClass19;

public class Hw3Vowel {

    private static String vowelsOnly(String name){//.replaceAll needs 2 parameters

        return name.replaceAll("[^AEIOUaeiou]","");//the purpose of regular expression:
        // to identify replaceAll or work with patterns
    }

    public static void main(String[] args) {

        System.out.println(vowelsOnly("All the vowels will be removed"));
    }
}
