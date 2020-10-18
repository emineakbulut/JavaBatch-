package com.syntax.class08;

import java.util.Scanner;

public class Recap {

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
		money=scan.nextInt();
		
		while(money!=price) {
			if(money>price) {
				System.out.println("Less money please");
				//money=scan.nextInt();
			}else {
				System.out.println("More money please");
				//money=scan.nextInt();
			}
			money=scan.nextInt();
		}
		System.out.println("Enjoy your water");
		
	}

}
