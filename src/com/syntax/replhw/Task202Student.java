package com.syntax.replhw;

import java.util.LinkedHashSet;
import java.util.Set;
/*
Create a student class that will have
variables as studentId, name and lastName
constructor
method to display students details
Create a set that will store 5 different students in an order they been added to the collection.
Execute method to display students details
Expected Output:
Student details: Samir Jawaid with id: 101
Student details: Asel Umurzakova with id: 102
Student details: Diego Juarez with id: 103
Student details: Sohil Aryan with id: 104
Student details: Alijon Nazarov with id: 105
 */

public class Task202Student {
    int studentId;
    String name;
    String lastName;

    public Task202Student(int studentId, String name, String lastName) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
    }

    void display(){
        System.out.println("Student details: "+name+lastName+" with "+studentId);
    }

    public static void main(String[] args) {

        Set<Task202Student> coll=new LinkedHashSet<>();
        coll.add(new Task202Student(101,"Samir","Jawaid"));
        coll.add(new Task202Student(102,"Asel","Umurzakova"));
        coll.add(new Task202Student(103,"Diego","Juarez"));
        coll.add(new Task202Student(104,"Sohil","Aryan"));
        coll.add(new Task202Student(105,"Alijon","Nazarov"));

        for (Task202Student task202Student:coll){
            task202Student.display();
        }

    }
}
