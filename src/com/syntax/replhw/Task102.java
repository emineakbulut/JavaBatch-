package com.syntax.replhw;

import java.util.Scanner;

public class Task102 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        char a=' ';
        for(int i=0; i<word.length(); i++){
            a=word.charAt(i);
            System.out.println(a);
        }

    }

}
