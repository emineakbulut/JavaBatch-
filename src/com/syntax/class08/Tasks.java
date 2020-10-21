package com.syntax.class08;

public class Tasks {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 100 in 1 line with space
		 *
		 * Print numbers from 100 to 1
		 *
		 * Print even numbers from 20 to 1 (2 ways)
		 * 
		 * Print odd numbers between 20 and 50 (2 ways) 
		 */

		for (int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		
		for (int a=100; a>=1; a--) {
			System.out.print(a);
		}
		for (int a=20; a>=0; a-=2) {
			System.out.print(a+" ");
		}
		for(int a=21; a<=50; a+=2) {
			System.out.print(a+" ");
		}
		
		for (int a=20; a>=0; a-=2) {
			if(a % 2== 0) {
				System.out.print((a+" "));
			}
		}
		System.out.println("--------------What will be the output----------");
		int sum=0;
		for(int a=1; a<6; a++) {
			sum=sum+1;
		}
		System.out.println(sum);
		
			
	}

}
