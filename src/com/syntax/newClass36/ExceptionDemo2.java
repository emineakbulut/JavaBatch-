package com.syntax.newClass36;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        int[] arr={10,20};
        System.out.println("This will execute always");
        try{
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException var){
            System.out.println("Please specify correct index "+var);
        }

        System.out.println("May execute or may not execute");
        System.out.println("1000 lines of code");
    }
}
