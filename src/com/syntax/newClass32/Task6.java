package com.syntax.newClass32;

import java.util.HashSet;
import java.util.Iterator;

public class Task6 {
    /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID.
        Display name of each student.
         */

        public static void main (String[] args) {
        StudentType student1 = new StudentType("Sofiane", 12345);
        StudentType student2 = new StudentType("Abderrahman", 13456);
        StudentType student3 = new StudentType("Elias", 14567);
        StudentType student4 = new StudentType("Nabila", 156789);
        StudentType student5 = new StudentType("Karima", 167890);
        HashSet<StudentType> hash = new HashSet<>();
        hash.add(student1);
        hash.add(student2);
        hash.add(student3);
        hash.add(student4);
        hash.add(student5);
        Iterator<StudentType> itr = hash.iterator();
        while (itr.hasNext()) {
            StudentType studentType = (StudentType) itr.next();
            System.out.println("Student name: " + studentType.name + " ---- " + "Student Id: " + studentType.Id);
        }
    }
}
class StudentType {
    String name;
    int Id;
    StudentType (String name, int Id) {
        this.name = name;
        this.Id = Id;
    }
}