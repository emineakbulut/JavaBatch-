package com.syntax.newClass22;

public class MethodOverloading {

    public void print(){
        System.out.println("print with no Arguments");
    }

    public void print(String name,int number){
        System.out.println("String name,int number");

    }

    public String print(int number,String name){
        System.out.println("int number,String name");
        return "name";
    }

//    public static void print(int number,String name){  CE can not overload by making a method as static
//        System.out.println("int number,String name");
//    }


   /* private void print(int number,String name){
        System.out.println("int number,String name"); CE by changing the access modifier we can't
        overload methods
    }*/

   /* public String print(int number,String name){
        System.out.println("int number,String name");
        CE By changing the return type we can't overload method
        return "name";
    }*/


    public void print(int number,String name,String lastname){
        System.out.println("int number,String name,String lastname");
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.print();
        methodOverloading.print("name",123);
        methodOverloading.print(123,"name");
    }
}
