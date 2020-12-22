package com.syntax.newClass19;

public class Student {
    /*
    Write a java program of Class Students that takes students name
     and 3 subject grades. Inside your class also have a method
      to Calculate Average Grade. Test Student class for 5 different students
       with different marks. Your program should print an
       average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    String name;
    double subj1;
    double subj2;
    double subj3;
    Student(String nameValue, double subj1Value,double subj2Value, double subj3Value){
        name=nameValue;
        subj1=subj1Value;
        subj2=subj2Value;
        subj3=subj3Value;
    }
    void printGradeAvarege(){
        double avg=(subj1+subj2+subj3)/3;
        System.out.println("Average marks for "+name+" are "+avg);
    }

    public static void main(String[] args) {
        Student student1=new Student("Emine",90,90,92);
        student1.printGradeAvarege();
        Student student2=new Student("Zeynep",80,100,99);
        student2.printGradeAvarege();
    }
}
