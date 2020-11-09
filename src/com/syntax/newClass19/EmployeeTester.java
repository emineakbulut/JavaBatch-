package com.syntax.newClass19;

import java.util.Scanner;

public class EmployeeTester {
    public static void main(String[] args) {


        Employees employee1 = new Employees();
        employee1.age=200;
        employee1.name="Davit";
        employee1.grade='M';
        System.out.println(employee1.age);
//======================================================================================================
        Employees employee2 =
                new Employees(5,
                        "Vlad",
                        'A');
        System.out.println(employee2.age);

        Scanner scanner=new Scanner(System.in);

    }
}
