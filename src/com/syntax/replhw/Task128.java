package com.syntax.replhw;

public class Task128 {
    /*
    Declare a static variable number that will hold an integer value:
Access number from the main method and assign value to it.
Create an Object of the class, access number in a nonstatic way and assigning value of 200.
Print out number using class name and using instance
Expected Output:
200
200
     */
    static int number;

    public static void main(String[] args) {
        number=200;
        System.out.println(Task128.number);
        Task128 main=new Task128();
        System.out.println(main.number);

    }
}
