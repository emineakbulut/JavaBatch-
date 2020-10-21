package com.syntax.class08;

import java.util.Scanner;

public class HwEvenOddSum {

	public static void main(String[] args) {
		
		/*  Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range prints the sum of the even and odd integers.
		 */

		
		int i;
		int startP = 0;
		int endP = 0;
		int sumOdd = 0,sumEven = 0;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a start point");
		startP=scan.nextInt();
		
		System.out.println("Plaese enter an end point");
		endP = scan.nextInt();
		for (i = startP; i < endP; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}

		}
		System.out.println("The sum of even numbers " + sumEven);
		System.out.println("The sum of odd numbers " + sumOdd);

	}

}
