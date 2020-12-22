package com.syntax.replhw;
/*
Create an instance final method that will reverse a String and return that new String
Call method from the main method
Expected Output:
olleh
 */

public class Task172 {
    public static void main(String[] args) {
        Task172 main=new Task172();

        System.out.println(main.string("hello"));
    }

    final String string(String str){
      StringBuilder newString= new StringBuilder(str).reverse();
        return String.valueOf(newString);
    }
}
