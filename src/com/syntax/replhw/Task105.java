package com.syntax.replhw;

import java.util.Scanner;

public class Task105 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String newWord= word.replaceAll("[^AaeEiIOoUu]", "");
        System.out.println(newWord);

    }
}
