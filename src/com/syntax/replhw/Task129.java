package com.syntax.replhw;

public class Task129 {
    /*
    Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
Expected Output:3     */

    private static int count;
    //constructor
    public Task129() {
        count++;
    }

    public static void main(String[] args) {

        Task129 Main1 = new Task129();
        Task129 Main2 = new Task129();
        Task129 Main3 = new Task129();

        System.out.println(count);
    }
}
