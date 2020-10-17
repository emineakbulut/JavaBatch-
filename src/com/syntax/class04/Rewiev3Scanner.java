package com.syntax.class04;

import java.util.Scanner;

public class Rewiev3Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=scan.nextLine();
		System.out.println("Hi "+name);
		
		System.out.println("Enter yor age");
		int age=scan.nextInt();
		if (age<=18) {
			System.out.println("You are learning");
		}else {
			System.out.println("You should work");
		}

	}

}
