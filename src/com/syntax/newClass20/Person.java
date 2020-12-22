package com.syntax.newClass20;

public class Person {
    String name;
    String Address;
    int age;
    String phone;
    String SSN;
    char gender;
    char martialStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;
    // if i have 100 fields in class and 100 lines of code that
    // i want to execute every time someone is creating an object of my class
    Person() {
        System.out.println(" These are important lines they must be executed each time a constructor is created");
        System.out.println(" These are important lines they must be executed each time a constructor is created");

    }

    Person(String name, int age, String phone, double salary) {
        this();
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
        this.weight = 60;
        this.height = 5.4;
        //i do not need these lines because i know how to use this() in java
        /*System.out.println(" These are important lines they must be executed each time a constructor is created");
        System.out.println(" These are important lines they must be executed each time a constructor is created");*/



    }


    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education) {
        //this(name, age, phone, salary, martialStatus, numberOfKids);
        this();
        this.education = education;


        this.name = name;
        this.age = age;
        this.phone = phone;  //if we don not use this keyword
        this.salary = salary;
        this.martialStatus = martialStatus;
        this.numberOfKids = numberOfKids;
        //i do not need these lines because i know how to use this() in java
        /*System.out.println(" These are important lines they must be executed each time a constructor is created");
        System.out.println(" These are important lines they must be executed each time a constructor is created");*/

    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids) {
        // this(name, age, phone, salary);
        this();
        this.martialStatus = martialStatus;
        this.numberOfKids = numberOfKids;
        //i do not need these lines because i know how to use this() in java
        /*System.out.println(" These are important lines they must be executed each time a constructor is created");
        System.out.println(" These are important lines they must be executed each time a constructor is created");*/

    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education, double height, double weight) {
        this();
        // this(name, age, phone, salary, martialStatus, numberOfKids, education);
//        this.height = height;
        this.weight = weight;
        //i do not need these lines because i know how to use this() in java
        /*System.out.println(" These are important lines they must be executed each time a constructor is created");
        System.out.println(" These are important lines they must be executed each time a constructor is created");*/


    }

    public static void main(String[] args) {
        Person person = new Person("Elif", 33, "123456678", 0, 'M', 0, "SDET", 5.7, 68);
        Person person1 = new Person("Kubra", 39, "123456678", 0);
        Person person2=new Person();

    }
}
