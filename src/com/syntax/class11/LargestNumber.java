package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {
		
		
		// I would like to find largest number from the array
		
		int[] array= {10,0,20,8,-1,77,56};
		
		int max=array[0];//assuming
		
		for(int i = 1; i < array.length;i++) {
			
			if(array[i]>max) {
				
				max=array[i];
			}
			
		}
		
		System.out.println("The Largest Number is:" + max);
	}

}
