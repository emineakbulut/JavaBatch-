package com.syntax.class06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		/*We are thinking of going shopping:
		 * first we check if store has sale:
		 * 	if no sale --> no shopping
		 * 	if sale --> we go for shopping
		 * 			ask for the price:
		 * 
		 * 			if price from 10 to 50 --> we give 10% discount
		 * 			if price is between 50 - 100 --> 20% discount
		 * 			if price is between 100 - 500 --> 40% discount
		 * 			if price is more than 500 --> 50% discount
		 * 
		 * your program should calculate final price that you will have after discount!
		 * 
		 * boolean sale=true;
		int price=200;
		double discount,fprice;
		
		if (sale) {
			System.out.println("I am going shopping");
			
			if(price>10 || price<=50) {
				System.out.println("You get 10% discount");
			}else if (price>50 || price<=100) {
				System.out.println();
			}
		}else {
			System.out.println("No sales today");
		}
		*/
		
		Scanner scan=new Scanner (System.in);
		
		boolean sale;
		int price;
		int dis;
		int finalPrice;
		System.out.println("Please tell me if we have sale today");
		sale=scan.nextBoolean();
		if (!sale) {
			System.out.println("I will not go shopping");
		}else {
			System.out.println("I will go shopping");
		
		
		System.out.println("What is the price of the item?");
		price=scan.nextInt();
		
		if (price>10 && price<50) {
			dis=(price*10)/100;
		}else if (price>50 && price<100) {
			dis=(price*20)/100;
		}else if (price>100 && price<500) {
			dis=(price*40)/100;
		}else if(price>=500){
			dis=(price*50)/100;
		}else {
			dis=0;
		}
		
		finalPrice=price-dis;
		System.out.println("Your product price is "+price+" and you get $ "+dis+" discount and you pay only "+finalPrice);
		

	}
	}
}
