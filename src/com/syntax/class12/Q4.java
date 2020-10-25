package com.syntax.class12;

public class Q4 {

	public static void main(String[] args) {
		
		
		int[] myArray = { 9, 66,-1, 45,65,32,876,0,-900 };
		
		int max = myArray[0];
		int min = myArray[0];
		
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
			if (myArray[i]<min  ) {
				min = myArray[i];
			}
		}
		System.out.println("the largest number in array is :" + max);
		System.out.println("the smallest number in array is :" + min);
	}

}
