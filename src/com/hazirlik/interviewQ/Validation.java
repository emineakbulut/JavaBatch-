package com.hazirlik.interviewQ;

import java.util.Scanner;

public class Validation {

    public void isPasswordValid(String pass) {
        boolean isDigit = true;
        boolean isUppercase = true;
        boolean isLowerCase = true;
        boolean isSpecialChar = true;
        boolean isSixChar = true;
        boolean isSpace = true;
        boolean isValid = false;
        //Checking the length of the password
        if (pass.length() < 6) {
            isSixChar = false;
            System.out.println("Password is too short");
        }
        //Checking the space

    if (pass.contains(" ")) {
        isSpace = false;
        System.out.println("Password cannot contain space");
    }

    //checking the uppercase and lower case characters

    int countUpperCase = 0;
    int countLowerCase = 0;
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (Character.isUpperCase(c)) {
                countUpperCase++;
            }
            if (Character.isLowerCase(c)) {
                countLowerCase++;
            }
        }
        if (countLowerCase == 0) {
            isLowerCase = false;
            System.out.println("Password should contain at least one lowercase");
        }
        if (countUpperCase == 0) {
            isUppercase = false;
            System.out.println("Password should contain at least one uppercase");
        }

        // checking if password contains special characters
        String specialCharacter = "!@#$&\"%^(*)_+-{}\\[]:;'/|?.,+=><~`";
        int countSpecialChar = 0;
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (specialCharacter.contains(Character.toString(c))) {
                countSpecialChar++;
            }
        }
        if (countSpecialChar == 0) {
            isSpecialChar = false;
            System.out.println("Password must contain at least one special character");
        }
        //checking if password contains numbers
        int count = 0;
        for (int i = 0; i < 9; i++) {
            String s = Integer.toString(i);
            if (pass.contains(s)) {
                count++;
            }
        }
        if (count == 0) {
            isDigit = false;
            System.out.println("Password should contain digit characters");
        }

     // final validation
     if (isDigit && isUppercase && isLowerCase && isSpecialChar && isSixChar && isSpace) {

         System.out.println("Password is valid");
     }

 }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the password:");
        String str = s.nextLine();
        Validation v = new Validation();
        v.isPasswordValid(str);
    }

}
