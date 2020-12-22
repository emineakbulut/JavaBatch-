package com.syntax.replhw;

public class Task137 {
    static int countVowels(String s){
        String s1 =	s.replaceAll("[^aeiou]","");

        int countVowels = s1.length();

        return countVowels;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
