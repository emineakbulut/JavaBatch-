package com.evde.hazirlik;

public class Parametreler {
    public static void main(String[] args) {

        add(18,6);
        add(22,10);
        mult(11,2);
        callAge("Emine",36);

        subt(9,5);

        int a=10+subt(4,1);
        System.out.println(a);

        int result=subt(11,21)+divide(20,5);
        System.out.println(result);

        String name=name1("emine");
        System.out.println(name);
    }
    public static void add (int num1,int num2){
        //System.out.println("Adding 10 to the num you entered is = "+(num+10));
        System.out.println("The sum : "+(num1+num2));
    }

    private static void mult(int num1,int num2){
        System.out.println("Multiplication of numbers is: "+(num1*num2));
    }

    public static void callAge(String name,int age){
        System.out.println("Hello, "+name+" your age is "+age);
    }
    public static int subt(int i,int j){
        int result=i-j;
       //System.out.println(result);
        return result;
    }
    public static int divide(int num1,int num2){
        return num1/num2;
    }

    public static String name1(String name){
        String message="Hello "+name;
        return message;
    }
}
