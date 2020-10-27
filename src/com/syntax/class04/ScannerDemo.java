package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		/*The Scanner class is used to get user input, and it is found in the java.util package.
		 * ●To read strings, we use nextLine() or next()
		 * ●To read number values, we use nextInt()
		 * ●To read decimal values, we use nextDouble()
		 * ●To read a single character, we use next().charAt(0
		 */
		
		int num=80;
		String str="Iam a string";
		
		Scanner scan=new Scanner(System.in);//enable input
		String value=scan.nextLine();//waits for input hit enter
		
		System.out.println("I captured value "+value);
	}

}
