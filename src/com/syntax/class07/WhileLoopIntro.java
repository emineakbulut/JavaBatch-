package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		/*
		 * The important point to note when using while loop is that
		 * we need to use increment or decrement statement inside while loop
		 * so that the loop variable gets changed on each iteration,
		 * and at some point condition returns false.
		 * This way we can end the execution of while loop
		 * otherwise the loop would execute indefinitely.
		 * 
		 * do while loop is similar to while loop with only difference that
		 * it checks for condition after executing the statements
		 */


		//only odd numbers from 100 to 1
		
		int e=100;
		while(e>1) {
			if(e%2==1) {
					System.out.print(e+",");
			}e--;
			
			System.out.println("Another way");
			
			int f=100;
			while(f>0) {
				if ((f%2) !=0) {
					System.out.print(f+" ");
				}
				f--;
			}
		}
	}

}
