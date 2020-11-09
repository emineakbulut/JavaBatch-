package com.syntax.replhw;

import java.util.Scanner;

public class Task104 {
    /*
    Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.

Input Example: Expected Output:
John           Joh
Jane           Jan
Jimmy          Jim
Mike           Mik
Emily          Emi
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

       for(int i=0; i<=4;i++){
           arr[i]=input.nextLine();
           System.out.println(arr[i].substring(0,3));
       }




    }
}
