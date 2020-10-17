package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		
		String day="Saturday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have java class");
		}
		System.out.println("The end");
		
		/*if day is 1-5 Iam off from Syntaxx
		 *if 2-3 GIT classes
		 *if day 4 Rewiev class
		 *if 6-7 java class	
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter days using numbber");
		int today=scan.nextInt();
		
		if(today==1 || today==5) {
			System.out.println("I am off from Syntax");
			
		}else if(today==2 || today==3) {
			System.out.println("I have GIT class");
		}else if(today==4) {
			System.out.println("I have review class");			
		}else if (today==6 || today==7) {
			System.out.println("I hava java class");
		}else {
			System.out.println("Enter a valid day");
		}
	}

}
