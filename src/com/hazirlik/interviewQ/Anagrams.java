package com.hazirlik.interviewQ;

import java.util.Arrays;

class Anagrams {
    /*
    Write a return method that check if a string is build out of the same letters as another string
    Ex: same( "abc", "cab");--true, same("abc", "abb"); -->false;
         same("aabc", "abc");--true;
     */
    public boolean isSameLetter(String s1, String s2) {
        boolean isSame;
        s1=s1.replaceAll(" ","");
        s2=s2.replaceAll(" ","");


        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        isSame = Arrays.equals(arr1, arr2);

        return isSame;
    }

    public static void main (String[]args){
        Anagrams s = new Anagrams();

        System.out.println(s.isSameLetter("bac aaac", "bac  ac"));

    }

}