package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num1, num2;
		double result = 0;
		char operator;
		System.out.println("Please, enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(
				"Please, enter any arithmetic operation by using operators you want to perform with two numbers above");
		operator = scan.next().charAt(0);
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		default:
			System.out.println("Your number is invalid");
		}
		System.out.println("The result of yout arithmetic operation is " + result);
	}

}
