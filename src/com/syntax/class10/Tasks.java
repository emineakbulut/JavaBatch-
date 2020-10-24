package com.syntax.class10;

public class Tasks {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 *
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 * 
		 * Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		char[] grades= {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]);
		System.out.println("----------------------------");
		
		String[] names= {"Zeynep","Zehra","Emine"};
		System.out.println(names[2]);
		
		String[] name=new String[2];
		name[0]="Zeynep";
		name[1]="Zehra";
		name[2]="Emine";
		
		System.out.println(name[0]);
		System.out.println("----------------------------");
		
		String[] words= {"Java ","Saturday ","day.","coding ","is "};
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
			
		
    }

}
