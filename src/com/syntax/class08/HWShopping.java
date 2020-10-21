package com.syntax.class08;

import java.util.Scanner;

public class HWShopping {

	public static void main(String[] args) {
		
		/* Write a program to ask a user to enter item they want to buy and the price of that item.
		 * Every time user enters money accumulate the amount and tell the user how much is left to pay off.
		 * If user give more money program should return a change.
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		Scanner scan;
		String item;
		int price;
		int pay;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter the item you want to buy");
		item=scan.nextLine();
		
		System.out.println("Please enter the price");
		price=scan.nextInt();
		System.out.println("The price is "+price);
		
		System.out.println("Please make the payment");
		pay=scan.nextInt();
		
		while(price!=pay) { 
			if(price>pay) {
				System.out.println("You need to pay off $ "+(price-pay));
				pay=scan.nextInt();
				break;
			}else if(pay>price) {
				System.out.println("Returning change is $ "+(pay-price));
				break;
			}	
		}
		System.out.println("Thank you for shopping");
	}

}
