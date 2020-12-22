package com.syntax.newClass23;

public class PrevClassTask2 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments
    and observe result.
     */
    static void print(double var){
        System.out.println(var);
    }
    static void print(int var){
        System.out.println(var);
    }
    static void print(String var){
        System.out.println(var);
    }

    public static void main(String[] args) {

        PrevClassTask2.print(10);
        PrevClassTask2.print(10.0);
        PrevClassTask2.print("10");
    }
}
