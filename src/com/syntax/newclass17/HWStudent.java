package com.syntax.newclass17;

public class HWStudent {
    /*
    Create a Class called Students
Create three  variables  studentName , studentID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */

    String studentName;
    int studentId;
    static int numberOfStudent;

    public static void main(String[] args) {
        HWStudent student1 = new HWStudent();
        student1.studentName = "Moneer";
        student1.studentId = 123;
        HWStudent.numberOfStudent++;

        System.out.println(student1.studentName);
        System.out.println(student1.studentId);
        System.out.println(HWStudent.numberOfStudent);

        HWStudent student2 = new HWStudent();
        student2.studentName = "Davit";
        student2.studentId = 12345;
        HWStudent.numberOfStudent++;

        System.out.println(student2.studentName);
        System.out.println(student2.studentId);
        System.out.println(HWStudent.numberOfStudent);

    }
    }
