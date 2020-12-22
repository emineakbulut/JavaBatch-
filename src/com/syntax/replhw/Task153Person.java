package com.syntax.replhw;

public class Task153Person {
    String name;
    String lastName;
    int age;

    void print(){
        System.out.println(name+" "+lastName+" "+age);
    }
}
class Employee extends Task153Person {
    int salary;
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student extends Employee {
    int grade;
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }

}
class Retiree extends Student {
    String seniorActivity;
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
    public static void main(String[] args){
        Employee employee=new Employee();
        employee.name="Joe";
        employee.lastName="Smith";
        employee.age=35;
        employee.salary=35000;
        employee.print();
        Student student=new Student();
        student.name="Adam";
        student.lastName="Smith";
        student.age=15;
        student.grade=10;
        student.print();
        Retiree retiree=new Retiree();
        retiree.name="Frank";
        retiree.lastName="Smith";
        retiree.age=15;
        retiree.seniorActivity="tour";
        retiree.print();


    }

}