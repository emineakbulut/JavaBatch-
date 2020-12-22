package com.syntax.replhw;

public class Task131 {
    static String country;
    static String continent;

   static void display(){
        System.out.println(country+" located on "+continent+" continent");
    }
    public static void main(String[] args){
        country="Morocco";
        continent="Africa";
        Task131.display();
    }
}
