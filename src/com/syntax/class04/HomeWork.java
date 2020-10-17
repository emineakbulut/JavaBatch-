package com.syntax.class04;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*Create a Java program that will ask user to input city and temperature.
		 * Your program should convert Fahrenheit into celsius and print 
		 * “The temperature is the city __ is __”
		 */
		  
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter Your city");
		  String city=scan.nextLine();
		  
		  System.out.println("Enter temperature");
		  int temp=scan.nextInt();	
		  
 System.out.println("The temperature is the city "+city+" is "+(temp-32)/1.8);
		  
		 
	      	
		  

	}

}
