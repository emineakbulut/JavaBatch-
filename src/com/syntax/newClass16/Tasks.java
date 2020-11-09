package com.syntax.newClass16;

public class Tasks {
    /*
    Create a method that will take 2 parameters as a numbers and prints which number is larger.
Create a method that will take a number and prints whether the number is even or odd.
Create a method that will print whether given String is palindrome or not.
Create a method that will say Hello in different language based on the country that will passed when method is executed.
     */
    public static void method1(int i,double j){//you can type multiple datatype

        if (i>j){
            System.out.println(i+" is greater than "+j);
        }else if (j>i){
            System.out.println(j+" is greater than "+i);
        }else{
            System.out.println("Numbers are equal");
        }
    }
    public static void method2(int i){// if you don't type static you need to create an object on the main page
        if(i%2==0){
            System.out.println("The number "+i+" is even");
        }else{
            System.out.println("The number "+i+" is odd");
        }
    }
    public static void method3(String string){
        int i=0;
        int j=string.length()-1;
        while(i<j){
            if(string.charAt(i)!=string.charAt(j)){
            System.out.println("Your name is not Palindrome");
            return;
            }
            i++;
            j--;
        }
        System.out.println("Your name is palindrome");
        }

    public static void method4(String country){
        String lang="";
        switch (country){
            case"Turkey":
                lang="Merhaba";
                break;
            case"USA":
                lang="Hello";
                break;
            case"Spain":
                lang="Hola";
                break;
            default:
                lang="Unknown";
                break;
        }
        System.out.println(lang);
    }
}
