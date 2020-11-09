package com.syntax.newClass15;

public class TaskLetters {
    public static void main(String[] args) {
         /*
        Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
Create a String and print it in reverse order (Sunday → yadnuS).
         */

        String string = "Strings";
        int length = string.length();

        if(!string.isEmpty()){
            if(length>3 && length%2==0){
                System.out.println(string.charAt(length/2));
            }

        }
    }
}
