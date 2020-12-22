package com.hazirlik;

public class Deneme {
    static String surround(String s, char search_term) {

        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == search_term) {

                stringBuilder.insert(s.indexOf(search_term), '(');
                //s= stringBuilder.insert(s.indexOf(search_term)+2, ')').toString();
                i+=4;
            }

        }
        return stringBuilder.toString();
    }
    public static void main(String[] args){
        System.out.println(surround("abcabcabc",'c')); //"ab(c)ab(c)ab(c)"
        //System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }
}
