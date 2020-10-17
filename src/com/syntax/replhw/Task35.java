package com.syntax.replhw;

import java.util.Scanner;

public class Task35 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean loan = scan.nextBoolean();

		String answer;

		if (loan) {
			System.out.println("What is your credit score?");
			int score = scan.nextInt();
			if (score < 600) {
				answer = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				answer = "Maybe eligible";
			} else if (score >= 701 && score <= 800) {
				answer = "Eligible";
			} else {
				answer = "Definitly eligible";
			}
			
		} else {
			answer="Unknown";
		}
		System.out.println("The eligibility is " + answer);
	}

}
