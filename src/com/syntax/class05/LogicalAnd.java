package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input;
		int number;
		
		input=new Scanner(System.in);
		System.out.println("PLease enter any number");
		number=input.nextInt();
		
		if(number>0 &&number<=10) {
			System.out.println("You entered small number");
		}else if(number>10 &&number<=100){
			System.out.println("You entered medium number");
		}else if(number>100 &&number<=1000){
			System.out.println("You entered large number");
		
		}
	}}
		
		
		
		
		
		
		
		
		
		
		
		
			

	


