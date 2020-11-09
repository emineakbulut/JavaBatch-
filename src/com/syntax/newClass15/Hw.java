package com.syntax.newClass15;

public class Hw {
    public static void main(String[] args) {
        /*
        How would you reverse a String character by character?
How would you reverse a String word by word?
How would you check if String is palindrome or not?
How would you swap  2 strings without a temporary variable?
         */

        String name = "Anna";
        String reverse="";
        for(int i = name.length()-1;i>=0;i--){
            System.out.println(i);
            System.out.println(name.charAt(i));
            reverse = reverse+ name.charAt(i);
        }
        StringBuilder input1 = new StringBuilder();
    }
}
