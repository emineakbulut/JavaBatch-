package com.syntax.class12;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers={
				
				{ 1, 2, 3, 4},
				{5, 6, 7, 8},
				{9,10, 11, 12}
		};
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				if (numbers[i][j]%2==0) {
					System.out.print(numbers[i][j]+" ");
				}
				
			}
		}
		System.out.println();
		System.out.println("------Second Way------");
		
		for (int[] nums:numbers) {
			
			for (int num:nums) {
				
				if (num%2==0) {
					
			System.out.print(num+" ");
		}
	}
}
	}

}
