package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 *
		 */
          Scanner scan=new Scanner (System.in);
          System.out.println("Enter a day with numbers");
          int day=scan.nextInt();
          
          if(day>=1 && day<=5) {
        	  System.out.println("It is a weekday");
          }else if(day>=6 || day==7 ){
        	  System.out.println("It is a weekend");
          }else {
        	  System.out.println("Enter a valid day number");
          }
          
         
          
          
	}

}
