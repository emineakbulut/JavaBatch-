package com.syntax.replhw;


import java.util.Scanner;

public class Task99 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below
       boolean isPalindrome = true;
       String givenString1=givenString.replaceAll(" ","");
       String givenString2=givenString1.toLowerCase();
        int i = 0;
        int j = givenString1.length() - 1;
        while (i<j){
            if(givenString2.charAt(i)!=givenString2.charAt(j)){
                isPalindrome = false;
                break;//to get out of loop,
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome);
    }
}