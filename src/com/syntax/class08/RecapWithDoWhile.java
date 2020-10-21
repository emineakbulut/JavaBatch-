package com.syntax.class08;

import java.util.Scanner;

public class RecapWithDoWhile {

	public static void main(String[] args) {
		/*ask user to pay for a water
		 * water price is 5 
		 * once user enters money then we need to tell if we need more money or less
		 * when exact 5 "Enjoy your water
		 */

		Scanner scan;
		int money;
		int price=5;
		
		scan=new Scanner(System.in);
		System.out.println("Please pay for your water");
		
		
		do {
			
			money=scan.nextInt();
			  
			if(money>price) {
				System.out.println("Less money please");
				
			}else if(money<price){
				System.out.println("More money please");
				
			}
			
		}while(money!=price);
		System.out.println("Enjoy your water");

	}

}
