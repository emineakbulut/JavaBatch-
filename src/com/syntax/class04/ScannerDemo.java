package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		int num=80;
		String str="Iam a string";
		
		Scanner scan=new Scanner(System.in);//enable input
		String value=scan.nextLine();//waits for input hit enter
		
		System.out.println("I captured value "+value);
	}

}
