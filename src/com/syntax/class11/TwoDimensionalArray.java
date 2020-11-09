package com.syntax.class11;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 * In Java, multidimensional arrays are actually arrays of arrays.
		 * It can have multiple rows and multiple columns
		 * (also known as matrix form)unlike single dimensional array,
		 * which can have only one full row or one full column.
		 * 
		 * Syntax:
		 * Data_Type[][] Array_Name = new int[Row_Size][Column_Size];
		 * 
		 * To access all the items in a multidimensional array the technique is
		 * to use one loop inside of another.
		 * 
		 */
		
		// new char [how many rows] [how many colums]
		char[] [] _array=new char [3] [4];
		
		//add values to first row
		
		_array[0][0]='A';
		_array[0][1]='B';
		_array[0][2]='C';
		_array[0][3]='D';
		
		//2.row
		
		_array[1][0]='W';
		_array[1][1]='X';
		_array[1][2]='Y';
		_array[1][3]='Z';
		
		//3.row
		
		_array[2][0]='Q';
		_array[2][1]='W';
		_array[2][2]='B';
		_array[2][3]='R';
		
		System.out.println(_array[1][3]);//Z
		
		System.out.println("-------Another way to create a 2D-------");
		
		int[][] array={{10,20,20},
				       {200,300,400},
				       {1,2,3}
				       };
		
		System.out.println(array [2][1]);//200
		System.out.println(array[0][0]);//10
		
		System.out.println("--------------------------");
		
		System.out.println("The size of array of integers = "+array.length);
		//inside of my big array i have 3 small arrays
	}

}

