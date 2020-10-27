package com.syntax.class08;

public class ForLoopDemo {

	public static void main(String[] args) {
		/*
		 * The Java for loop is used to iterate a part of the program several times.
		 * If the number of iteration is fixed, it is recommended to use for loop.
		 */
		
		for (int i=1; i<=5; i++) {
			
			System.out.println("Good morning");			
			
		}
		//I want to print 1-100
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println("----------I want to print number 10 to 0---------------");

		for(int i=10; i>=0; i--) {
			System.out.print(i+" ");
		}
	}

}
