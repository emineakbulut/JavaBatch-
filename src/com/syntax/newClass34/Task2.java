package com.syntax.newClass34;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Task2 {
    public static void main(String[] args) {

/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */
                Person meteObj= new Person("Metehan", "Kaia", 25, 190_000);
                Person burjuObj= new Person("Burju", "Kanliska", 55, 500_000);
                Person aishaObj= new Person("Aisha", "Gocha", 45, 200_000);
                Person bahaObj= new Person("Baha", "Kanliska", 77, 900_000);
                Person ruchiObj= new Person("Ruchi", "Kaia", 66, 800_000);
                Person aykaObj= new Person("Ayka", "Kanliska", 35, 200_000);

                Map<Integer, Person> personMap= new TreeMap();
                personMap.put(5, meteObj);
                personMap.put(3,burjuObj);
                personMap.put(2, aishaObj);
                personMap.put(1,bahaObj);
                personMap.put(4, ruchiObj);
                personMap.put(6,aykaObj);

                Set<Map.Entry<Integer, Person>> entrySet= personMap.entrySet();

                Iterator<Map.Entry<Integer, Person>> iterator= entrySet.iterator();
                while (iterator.hasNext()){
                    Map.Entry<Integer, Person> next= iterator.next();
                    System.out.println( next.toString());
                }
            }
}
        class Person{
            private String name;
            private String lastName;
            private int age;
            private double salary;
            public Person(){}//good practice bc if someone wants to create an obj you dont need to init all fiels
            public Person(String name, String lastName, int age, double salary){
                this.name=name;
                this.lastName=lastName;
                this.age=age;
                this.salary=salary;
            }
            public  void printDetails() {
                System.out.println(toString());
            }
            @Override
            public String toString() {
                return "name= " + getName() +
                        ", lastName= " + getLastName() +
                        ", age= " + getAge() +
                        ", salary= " + getSalary();
            }
            public String getName() {
                return name;
            }
            public String getLastName() {
                return lastName;
            }
            public int getAge() {
                return age;
            }
            public double getSalary() {
                return salary;
            }
        }


