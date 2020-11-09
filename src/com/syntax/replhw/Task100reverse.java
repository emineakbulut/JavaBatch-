package com.syntax.replhw;

import java.util.Scanner;

public class Task100reverse {
    public static void main(String[] args) {
        /*
        Given the following inputs:
String s;
Write a for loop that will print out the reverse of the string.
Sample input/outputs:
In: manhattan
nattahnam
In: processor
rossecorp
In: racecar
racecar
         */
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();


        String reverse="";//to store the reverse as a string

        for(int i=s.length()-1; i>=0; i--){// I should to start from the last index.So I start length-1 bc index starts from zero.
            reverse=reverse+s.charAt(i);//whatever the value index passing, give me the character which is available on the specific index
        }
        System.out.println(reverse);


    }
}
