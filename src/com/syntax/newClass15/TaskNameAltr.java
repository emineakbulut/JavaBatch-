package com.syntax.newClass15;

import java.util.Scanner;

public class TaskNameAltr {

    public static void main(String[] args) {
        /*
        Write a program that reads two people's first names if they are
        expecting a boy or girl? Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Maria
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRIA
                Example Output:
        Mom’s first name? Maria
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */
        Scanner scanner = new Scanner(System.in);
        String momsName, dadsName, gender, babyName;

        System.out.println("Please enter moms name");
        momsName = scanner.nextLine();

        System.out.println("Please enter dads name");
        dadsName = scanner.nextLine();
        System.out.println("Is it a boy or girl");
        gender = scanner.nextLine();
        if (gender.toLowerCase().startsWith("b")) {
            String first = dadsName.substring(0, dadsName.length() / 2);
            String last = momsName.substring(momsName.length() / 2);
            babyName = first + last;

        }else if(gender.toLowerCase().startsWith("g")){
            String first = momsName.substring(0, momsName.length() / 2);
            String last = dadsName.substring(dadsName.length() / 2);
            babyName = first + last;
        }else {
            babyName="No suggestions";
        }


        System.out.println(babyName);


    }
}
