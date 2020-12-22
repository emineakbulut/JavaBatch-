package com.syntax.replhw;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task203Employee {
    /*
Create an Employee class that will be fully encapsulated and will have:
variables as FullName, ssn and salary
constructor to initialize instance variables
getters to have an access to instance variables
Create a set collection that will store # objects of Employee type and using Iterator print the value of each variable
Expected Output:
John Doe
123456789
80000.0
Jane Smith
987654321
90000.0
Jackie Chan
0
1000000.0
     */
    private String fullname;
    private String ssn;
    double salary;

    public Task203Employee(String fullname, String ssn, double salary) {
        this.fullname = fullname;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Set<Task203Employee> employeeSet=new LinkedHashSet<>();
        employeeSet.add(new Task203Employee("Jhon Doe","123456789",80000));
        employeeSet.add(new Task203Employee("Jane Smith","987654321",90000));
        employeeSet.add(new Task203Employee("Jackie Chan","0",1000000));

        for (Task203Employee employee:employeeSet
             ) {
            System.out.println(employee.getFullname());
            System.out.println(employee.getSsn());
            System.out.println(employee.getSalary());
        }
    }
}
