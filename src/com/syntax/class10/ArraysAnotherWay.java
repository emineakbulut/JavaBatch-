package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		
		
		String[] names= {"Mike","Jack","Danilo","Burcu","Bryan","Evgenia"};
		
//		String[] name;
//		name= {"Sabeen"}:we can not do it in 2 steps this way
		
		System.out.println(names[3]);
		
		//how do i know how many elements i have in array
		int size=names.length;
		System.out.println("Size of my array is "+size);
		
		System.out.println(names[names.length-2]);
		System.out.println("--------------------------");
		
		int a=2;
		System.out.println(names[a]);
		a+=2;
		System.out.println(names[a]);
		System.out.println("--------------------------");
		
		for(int i=0; i<names.length; i++) {
			
			System.out.println(names[i]);
		}
		System.out.println("--------------------------");
		
//        for(int i=0; i<names.length-1; i++) { we will get an exception because 
//		   length will be 6 and highest index we have 5
//			
//			System.out.println(names[i]);
//		}
	}
}
