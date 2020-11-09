package com.syntax.newClass15;

public class Task333 {
    public static void main(String[] args) {
        /*
        Create a String that will hold a sentence.
        Write a program to get a new String without any spaces.
         */
        String sentence;
        sentence = "Today is Halloween";
        String newString = sentence.replaceAll(" ", "");// \\s is the same for " "
        System.out.println(newString);

        //Create a String that should be combination of letters,
        //numbers and special characters. Find out how many alpha characters are there in the String

        System.out.println("__________TASK2__________");
        String a1 = "a1 b 2 c 3 d 4 & * ! @";
        System.out.println(a1);
        System.out.println(a1.replaceAll("[0-9]", ""));
        System.out.println(a1.replaceAll("[^0-9]", "").length());

        //You have a String a=”Is it saturday? Is it raining?
        //Do we have a Java Class today?”
        // How would you find out how many sentences are in that String
        System.out.println("==========Task3=========");
        String name1 = "Is it Saturday? Is it raining? Do we have a Java Class?";
        System.out.println(name1);
        System.out.println(name1.replaceAll("[\\sA-Za-z0-9]",""));
        System.out.println(name1.replaceAll("[\\sA-Za-z0-9]","").length());

    }
}
