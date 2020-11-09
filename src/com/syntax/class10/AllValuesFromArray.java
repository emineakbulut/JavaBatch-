package com.syntax.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
System.out.println("------Getting values from array using enhanced for loop-------");
		/*
		 * After for i will specify semicolon for(:)
		 * On the right side of the semicolon you need to tell the array
		 * from which array would you like to retrieve the values.
		 * for(: cars)
		 * On the left side i need to specify what type of values i have inside my array
		 * for(String : cars)
		 * for each element i will be taking from array i will be storing it in a variable
		 * for(String variable : cars)
		 * 
		 * It starts from the beginning
		 * 
		 */
		boolean[] arrayOfBoolean= {true,false,true,true,false};
		
		for(boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}

		int [] numbers= {10,99,22,56,1,0};
		
		for(int num:numbers) {
			System.out.print(num+" ");
		}
	}

}
