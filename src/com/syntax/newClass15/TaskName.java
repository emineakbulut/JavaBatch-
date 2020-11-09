package com.syntax.newClass15;

import java.util.Scanner;

public class TaskName {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first
	names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
8:18
Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
Create a String and print it in reverse order (Sunday → yadnuS).
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mom's first name?");
        String mName=scan.nextLine();
        System.out.println("Dad's first name?");
        String dName= scan.nextLine();
        System.out.println("Boy or girl?");
        String gender = scan.nextLine();
        String gname,bname;

        if(gender.equalsIgnoreCase("girl")) {
           gname = mName.substring(0,2)+dName.substring(dName.length()-2);
            System.out.println("Suggested baby name is "+gname);
        }else{
            bname = dName.substring(0,2)+mName.substring(mName.length()-2);
            System.out.println("Suggested baby name; "+dName);
        }


    }
}
