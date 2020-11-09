package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {
		
		
		/*
		 *  I would like to find largest number from the array
		 *  We will initialize it from array "0",first number in an array
		 *  Assuming first number is the largest number
		 *  We will start comparing every element against the first number
		 *  Then as soon as i find the larger i change the element
		 *  in for loop i should start with "1". Because i have already took the [0];
		 *  comparing with if
		 */
		
		int[] array= {10,0,20,8,-1,77,56};
		
		int max=array[0];//assuming
		
		for(int i = 1; i < array.length;i++) {
			
			if(array[i]>max) {
				
				max=array[i];// reassigning the value is
			}
			
		}
		
		System.out.println("The Largest Number is:" + max);
	}

}
