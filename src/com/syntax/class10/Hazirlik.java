package com.syntax.class10;

public class Hazirlik {

	public static void main(String[] args) {
		
		
		// Creating array table
		
		System.out.println("Index\tValue");//create a header
		
		int emn[]= {11,22,33,44,55};// create an array-initializer
		
		for(int counter=0; counter<emn.length; counter++) {
			System.out.println(counter+ "\t"+ emn[counter]);
		}
		System.out.println("---------------------------------");
		//Summing elements of arrays
		
		int i[]= {12,23,34,45,56};
		int sum=0;
		
		for(int counter=0; counter<i.length; counter++) {
			sum+=i[counter];
		}
		System.out.println("The sum of these numbers is "+sum);
		
		//Array elements for counter
		

	}

}
