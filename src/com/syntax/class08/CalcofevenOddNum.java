package com.syntax.class08;

import java.util.Scanner;

public class CalcofevenOddNum {

	public static void main(String[] args) {
		// Calculate sum of even and odd numbers from range 1 to 50
		
		int sumEven=0;
		int sumOdd=0;
		for (int i = 1; i < 51; i++) {
		    if (i%2 == 0) {
		        sumEven += i;
		    }
		    if (i%2 == 1) {
		        sumOdd += i ;
		    }
		}
		System.out.println("The sum of even number from 50 to 1 is " + sumEven);
		System.out.println("The sum of even number from 50 to 1 is " + sumOdd);
		
		//I want to create a multiplication table 
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		
		int num1=scan.nextInt();
		int mult;
		
		for(int i=1; i<=10; i++) {
			mult=num1*i;
			System.out.println(num1+"X"+i+"="+mult);
		}
		
	}

}
