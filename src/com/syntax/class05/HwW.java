package com.syntax.class05;

import java.util.Scanner;

public class HwW {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 * 
		 * 
		 * Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */
		 
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter 3 distinct number");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double num3=scan.nextDouble();
		double largestnum=0;
		
		if(num1>num2 && num1>num3) {
			 largestnum=num1;
		}else if(num2>num1 && num2>num3) {
		    largestnum=num2;
		}else if(num3>num1 && num3>num2) {
			largestnum=num3;
		}
		System.out.println("The largest number is "+largestnum);
		/*
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter 3 distinct number");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double num3=scan.nextDouble();
		double largestnum=0;
		
		if(num1>num2) {
			if(num1>num3) {
				largestnum=num1;
			}
		}if(num2>num1) {
			if(num2>num3) {
				largestnum=num2;
			}
		}if(num3>num1) {
			if(num3>num2) {
				largestnum=num3;
			}
		}
		System.out.println("The largest number is "+largestnum);*/
	}

}
