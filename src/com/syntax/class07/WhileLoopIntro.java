package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


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
