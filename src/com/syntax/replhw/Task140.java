package com.syntax.replhw;

public class Task140 {
    /*
    Create a method to display details in following format:
My name is ___ and I live in ___. I study at ___ in batch ___
Assign values to the variables and execute method display
Expected Output:
My name is John and I live in Miami. I study at Syntax in batch
     */
    static String name;
    public static String city;
    static String school;
    static int batchNum;

    void display (){

        name="Jhon";
        city="Miami";
        school="Syntax";
        batchNum=6;
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + school + " in batch " + batchNum);
    }
    public static void main(String[] args) {
        Task140 main=new Task140();
        main.display();




    }

}
