package com.syntax.newClass20;

public class Hw3 {

    /*
    Write a program  that will have 4 different access levels of constructors
    and create 3 objects of this class:
    1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */

    String name;
    int age;
    double salary;

    private Hw3(String name){//i can only create objects of my class from the same class
        this.name=name;
        System.out.println("Private constructor is called");
    }
    Hw3(int age){
        this.age=age;
        System.out.println("Default constructor is called");
    }
    public Hw3(double salary){
        this.salary=salary;
        System.out.println("Public constructor is called");
    }

    public static void main(String[] args) {
        //Hw3 task1=new Hw3();//CE as now Java will not create the default constructor.
        Hw3 task1=new Hw3("name");
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);

        Hw3 task2=new Hw3(12);
        System.out.println(task2.name);
        System.out.println(task2.age);
        System.out.println(task2.salary);

        Hw3 task3=new Hw3(1000.00);
        System.out.println(task3.name);
        System.out.println(task3.age);
        System.out.println(task3.salary);
    }
}
