package com.syntax.class06;

import java.util.Scanner;

public class ______LargestNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double x,y,z,max;
		scan.close();
		
		x=scan.nextDouble();
		y=scan.nextDouble();
		z=scan.nextDouble();
		//1,way
		
		if(x!=y && y!=z) {
			
			if(x>y && x>z) {
				max=x;
			}else if(y>z) {
				max=y;
			}else {
				max=z;
			}
			System.out.println(max);
			
		}else {
			System.out.println("Numbers are equal");
		}
		
		
		double biggest = 0;
		System.out.println("----------------Comparing 2 numbers using nested if----------------------");
       //2 way
		
		if(x>y) { //if x larger than y
			if(x>z) {
				biggest=x;
			}else {
				max=z;
			}
		}else { //number2 is larger than number 1
			if(y>z) {
				biggest=y;
			}else {
				biggest=z;
			}
		}
		System.out.println("The largest number is "+biggest);
	}
}

