package com.syntax.class11;

public class GroupTask05 {

	public static void main(String[] args) {
		
		
		int largest=0;
		int secondLargest=0;
		int[] arr= {0, 10, 20, 8, -1, 77, 56,};
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>largest) {
			largest=arr[i];
				
			} else if(arr[i]>secondLargest) {
				secondLargest=arr[i];
				
			}
		}
		System.out.println("The second largest number is "+secondLargest);
		

	}

}
