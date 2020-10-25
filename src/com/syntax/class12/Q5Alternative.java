package com.syntax.class12;

public class Q5Alternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = { 2, 5, 7, 89, 452 };
        int max = array[0];
        for (int d = 1; d < array.length; d++) {
            if (array[d] > max) {
                max = array[d];
            }
        }
        int max2 = array[0];
        for (int q = 0; q < array.length; q++) {
            if (array[q] == max) {
                continue;
            } else if (array[q] > max2) {
                max2 = array[q];
            }
        }
        System.out.println("second largest number is " + max2);

	}

}
