package com.syntax.class05;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 * 
		 * 
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =”Summer”. At the end of the program we should see output as “You were born
		 * ______”.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		double quiz, midterm, fscores, avg;

		System.out.println("Enter your quiz score");
		quiz = scan.nextInt();

		System.out.println("Enter your mid score");
		midterm = scan.nextInt();

		System.out.println("Enter your quiz score");
		fscores = scan.nextInt();

		avg = (quiz + midterm + fscores) / 3;
		System.out.println(avg);

		if (avg >= 90) {
			System.out.println("Grade A");
			System.out.println("You are good student");
		} else if (avg >= 70 && avg < 90) {
			System.out.println("Grade B");
			System.out.println("You are good student");
		} else if (avg >= 50 && avg < 70) {
			System.out.println("Grade C");
			System.out.println("Study more");
		} else if (avg >= 40 && avg < 50) {
			System.out.println("Grade D");
			System.out.println("Study more");
		} else {
			System.out.println("Grade F");
			System.out.println("Study more");
		}
		// if you are A or B you are good student but alot of repetativ typing i must improve it
	}
}
