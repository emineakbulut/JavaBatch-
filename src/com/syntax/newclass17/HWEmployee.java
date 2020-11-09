package com.syntax.newclass17;

import java.security.spec.RSAOtherPrimeInfo;

public class HWEmployee {

    /*
    Create a Class called Employee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */
    String empID;
    double salary;
    static String CEO="Sumair";// static because it is same for all emploees

    public static void main(String[] args) {
        HWEmployee employee1=new HWEmployee();
        HWEmployee employee2=new HWEmployee();

        employee1.empID="12345";
        employee1.salary= 150_000;

        employee2.empID="12346";
        employee2.salary= 155_000;

        System.out.println(employee1.empID+" "+employee1.salary+" "+employee1.CEO);
        //System.out.println(employee1.salary);
        //System.out.println(employee1.CEO);
    }


    }

