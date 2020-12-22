package com.syntax.replhw;

public class Task143 {
    /*
    For you to do:
Create the maxLength method that will accept String array of words and return the word with the largest length.
Method should visible only within same package!
Expected Output:
this is long
     */

    static String maxLength(String[] arr) {
        String maxLength = "";
        for (int i = 0; i < arr.length; i++) {

            maxLength = String.valueOf(arr[i]);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
