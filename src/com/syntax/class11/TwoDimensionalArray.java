package com.syntax.class11;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
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
	}

}

