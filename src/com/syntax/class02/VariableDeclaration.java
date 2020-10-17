package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
	    // 1 way to create a variable
		
		// create variable=assigning value
		//declare a variabe=initializing
		
		double $num=12.99;
		
		//2. way to create a variable
		
		int myBox; // declared the variable
		myBox=23;  //initializing -- assigning the value
		
		//we declare variable only once
		
		myBox=55;  //reassigning value
		
		System.out.println(myBox);
		
		//3 way,if the variable is of the same type we can declare all in oneline
		
		int num1,num2,num3;
		num1=10;
		num2=20;
		num3=30;
		
		char char1='C';
		char char2='d';
		char char3=char1;
		
		System.out.println(char3);

	}

}
