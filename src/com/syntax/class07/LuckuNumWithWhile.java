package com.syntax.class07;

import java.util.Scanner;

public class LuckuNumWithWhile {

	public static void main(String[] args) {
		// // play a lotterry where we need to enter number from 1 to 20
		//lucku number is 11
		//keep asking a user to enter a number untill entered number is same as lucky number
       
		Scanner scan;
		int numFromUser;
		int luckyNum=7;
		
		scan=new Scanner(System.in);
		System.out.println("Enter any number");
		numFromUser=scan.nextInt();
		
		while(numFromUser!=luckyNum) {
			System.out.println("Enter any number");
			numFromUser=scan.nextInt();
			
		}

	}

}
