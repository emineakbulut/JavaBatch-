package com.syntax.newClass23;

public class PrevClassTask3 {
    /*
   Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
    */
    private void print(){
        System.out.println("I am a private method. You can also overload me i have no parameters");
    }
    private void print(int var){
        System.out.println("I am a private method you can also overload me i have one int parameters");
    }
    private void print(String var){
        System.out.println("I am a private method you can also overload me i have one String parameters");
    }

    public static void main(String[] args) {
        PrevClassTask3 prevClassTask3=new PrevClassTask3();
        prevClassTask3.print();
        prevClassTask3.print(10);
        prevClassTask3.print("Name");
    }
}
