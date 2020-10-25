package com.syntax.class12;

public class Q3 {

	public static void main(String[] args) {
		
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
				// Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
				// Each number is the sum of the two preceding ones 
				// Sequence start from 0
		
		
				int num1=0;
				int num2=1;
				
				for (int x=1; x<=10; x++) {
					System.out.println(num1+" ");	
					int sum =(num1+num2);
					System.out.println();
					
					num1=num2;
					num2=sum;
				}

	}

}
