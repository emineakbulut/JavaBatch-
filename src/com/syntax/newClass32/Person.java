package com.syntax.newClass32;

public class Person {

    String name;
    long SSN;
    int age;


    public Person(String name, long SSN, int age) {
        this.name = name;
        this.SSN = SSN;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", SSN=" + SSN +
                ", age=" + age +
                '}';
    }

}
