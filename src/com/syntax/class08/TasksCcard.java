package com.syntax.class08;

import java.util.Scanner;

public class TasksCcard {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 * 
		 * 
		 * Create a program that will keep asking user to apply for a credit card.
		 *  As soon you get “yes” from a user program should stop asking. 
		 */

		for (int a=1; a<=50; a++) {
			
			if(a%3==0) {
				continue;
			}
			System.out.println(a+" ");
		}
		System.out.println("------------------Task 2---------------------");
		
		Scanner scan;
		boolean ccard;
		
		scan=new Scanner (System.in);
		System.out.println("Do you have credit card");
		
		ccard=scan.nextBoolean();
		
		while(!ccard) {
			System.out.println("Apply for credit card");
		
			if(ccard) {
				continue;
			}
		}
	}

}
