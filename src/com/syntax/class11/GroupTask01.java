package com.syntax.class11;

public class GroupTask01 {

	public static void main(String[] args) {
		/*
		 *  Write a program to swap 2 numbers without a temporary variable?
		 *  Swap  2 strings without a temporary variable?
		 */

		
		
		int num1 = 50;
		int num2 = 15;
		
		System.out.println("Before swapping first number is " + num1 + " and  second number is " + num2);
		
		num1 = num1 + num2;// 50+15=65
		num2 = num1 - num2; // 65-15=50
		num1 = num1 - num2;// 65-50=15
		
		System.out.println("After swapping first number is " + num1 + " and second number is " + num2);
		
		
		//swap 2 strings without a temporary variable? */
		
				String word1="Java";
				String word2="Coding";
				System.out.println("Before swapping the value of word1 is "+word1);
				System.out.println("Before swapping the value of word2 is "+word2);
				word1=word1+word2;// Concatenate word1 and word2: word1=JavaCoding
				
				
				 // use substring method
				
				 word2=word1.substring(0,word1.length()-word2.length());  // JavaCoding-Coding; word2 has become "Java"
				 word1=word1.substring(word2.length());// word1 has become "Coding'
				 
				 System.out.println("______________________________________________________");
				 System.out.println("After swapping the value of word1 is "+word1);
				 System.out.println("After swapping the value of word2 is "+word2);
	}

}
