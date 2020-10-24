package com.syntax.class08;

import java.util.Scanner;

public class Hazirlik {

	public static void main(String[] args) {
		
		
		// Faktoriyel hesaplama
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num=scan.nextInt();
		
		int fact=1;
		for(int i=num; i>0; i--) {
			System.out.println("i= "+i);
			fact*=i;
		}
        System.out.println("Factorial of "+num+" is "+fact);
        
        System.out.println("-----------------------------------");
        
        
        //Market accounting
        
        int amount=0;
        
        while(true) {
        	
        	String begining="What would you like to do?\n1-Shopping\n2-Amount of Price";
        	System.out.println(begining);
        	
        	int choise=scan.nextInt();
        	
			if (choise == 1) {
				String item = "Pick your item\n41-Book 9$\n2-Coffee 5$\n3-Chocolate 3$";
				System.out.println(item);

				int input = scan.nextInt();
				if (input == 1) {
					amount += 9;
				} else if (input == 2) {
					amount += 5;
				} else if (input == 3) {
					amount += 3;
				} else {
					System.out.println("Invalid");
				}

			} else {
				break;
			}
		}
		System.out.println("Amount is " + amount);
	}

}
