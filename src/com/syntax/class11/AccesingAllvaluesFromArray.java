package com.syntax.class11;

public class AccesingAllvaluesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new char [how many rows] [how many colums]
		char[][] _array = new char[3][4];

		// add values to first row

		_array[0][0] = 'A';
		_array[0][1] = 'B';
		_array[0][2] = 'C';
		_array[0][3] = 'D';

		// 2.row

		_array[1][0] = 'W';
		_array[1][1] = 'X';
		_array[1][2] = 'Y';
		_array[1][3] = 'Z';

		// 3.row

		_array[2][0] = 'Q';
		_array[2][1] = 'W';
		_array[2][2] = 'B';
		_array[2][3] = 'R';

		System.out.println(_array.length);//one row for each array,array.length gives how many rows you have
		
		for (int row=0; row<_array.length; row++ ) {//loops through rows, iterates rows , outer loop
			
			for (int col=0; col<_array[row].length; col++) {//loops truogh coloums
				
				System.out.print(_array[row][col]+" ");//row first
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		
		int[][] array={{10,20,20},
			       {200,300,400},
			       {1,2,3}
			       };
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
