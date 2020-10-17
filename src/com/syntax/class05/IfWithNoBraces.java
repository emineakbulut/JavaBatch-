package com.syntax.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isSaturday=false;
		
		if (isSaturday)
			System.out.println("Today is java class");// java will assume that first sout will work for if is true only one block
		System.out.println("And tomorrow I will have java class");// this code does not belong to the if statement because no braces
		

		System.out.println("I am a code outside of if statement");
	}

}
