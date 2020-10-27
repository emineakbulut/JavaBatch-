package com.syntax.class10;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] grades=new int[5];
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		
		int average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		System.out.println("Average score of my students ="+average);
		
		double[] array;
		
		array=new double[3];
		array[0]=12.99;
		array[1]=10.89;
		
		System.out.println("Value of last element is "+array[2]);
		
		array[2]=5.99;
		System.out.println();
		
		System.out.println("Value of last element is "+array[2]);
		
		String[] liquid=new String[4];//arrays are fixed in size
		liquid[2]="Water";
		liquid[1]="Tea";
		
		System.out.println(liquid[0]);
		
		/*
		 * To print all values from an array we can use for loop using following syntax
		 * 
		 * String[] names= {"Anna", "John", "Sasha", "Alex"};
		 * for (String name: names){
		 * System.out.println(name);
		 * }
		 */
		
		

	}

}
