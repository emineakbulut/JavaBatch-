package com.syntax.newClass36;

public class Exception {
    public static void main(String[] args) {
        System.out.println("important line of code");
        System.out.println("Normal line of code");
        //i say hey java if there is an issue with the code
        try{
            System.out.println(10/0);//not supported by java---> ArithmeticException....After that it wont print everything

        }catch (java.lang.Exception e){
            System.out.println("Can not divide by zero");
        }
        System.out.println("Important line of code");

    }
}
