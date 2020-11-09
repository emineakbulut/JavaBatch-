package com.syntax.newclass17;

public class Student {

    String name;
    int age;
    double marks;
    static int numberOfStudentsEnrolled;

    public void printInfo() {
        int number = 12;
        System.out.println("Name " + name + " Age " + age + " Marks " + marks);
    }

    public void printMarks() {

        System.out.println(" Marks " + marks);
    }

    public void StudentsRegistered() {
        System.out.println("Total number of student up till now " + numberOfStudentsEnrolled);
    }
}
