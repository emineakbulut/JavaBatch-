package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		
		//Lets ask user how many names he would like to store and then store those names
		
		Scanner scan;
		String[] names;
		int size;
		
		scan=new Scanner(System.in);
		System.out.println("How many names would you like to store?");
		size=scan.nextInt();
		
	    names=new String[size];
	    //we are storing values into an array
		for(int i=0; i<size; i++) {
			System.out.println("Please enter any name");
			names[i]=scan.next();
		}
		//we are retrieving values from an array
		for (int i=0; i<names.length; i++) {
			System.out.print((names[i]+" "));
		}
	}

}
