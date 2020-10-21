package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// ask user his name 5 times then hello+name
		
		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		
		int num=1;
		
		while(num<=5) {
		System.out.println("Your name please");
		name=scan.nextLine();
		System.out.println("Nice to meet you");
		System.out.println("----------------");
		num++;		
		}
		
		System.out.println("------------------------------------------------------------");
	}

}
