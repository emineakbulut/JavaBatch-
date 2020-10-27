package com.syntax.class06;

import java.util.Scanner;

public class HwTask {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 * 
		 * 
		 * HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		
         Scanner scan=new Scanner(System.in);
         System.out.println("Please enter your country");
         String country=scan.nextLine();
         String lang;
         
         switch (country) {
         case ("United States"):
        	 lang="English";
         break;
         case("Turkey"):
        	 lang="Turkish";
         break;
         case("Mexico"):
        	 lang="Spanish";
         break;
         case("Germany"):
        	 lang="Germany";
         break;
         default:
        	 lang="Not listed";      	        
         }
         System.out.println("Your language is "+lang); */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		double num1=scan.nextDouble();
		
		System.out.println("Use operators");
		char operator=scan.next().charAt(0);
		
		System.out.println("Please enter second number");
		double num2=scan.nextDouble();
		double result=0;
		
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case'/':
			result=num1/num2;
			break;
		default:
			System.out.println("Please enter valid number");
		}
		System.out.println("Calculation equals to "+result);
	}

}
