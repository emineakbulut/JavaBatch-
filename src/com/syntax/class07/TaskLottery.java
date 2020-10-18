package com.syntax.class07;

import java.util.Scanner;

public class TaskLottery {

	public static void main(String[] args) {
		// play a lotterry where we need to enter number from 1 to 20
		//lucku number is 11
		//keep asking a user to enter a number untill entered number is same as lucky number
       
		Scanner scan;
		int numFromUser;
		int luckyNum=11;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number");
			numFromUser = scan.nextInt();
		}while(numFromUser!=luckyNum);
		System.out.println("You got it !");
	}

}
