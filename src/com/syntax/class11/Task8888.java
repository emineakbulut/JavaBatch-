package com.syntax.class11;

public class Task8888 {

	public static void main(String[] args) {
		//  Create a 2D array to store numbers and
		//calculate sum of all odd numbers.
		
		int sum = 0;

		int[][] a = {
                {1,2,3,4,5},
                {11,22,33,44,55},
                
        };
        sum=0;
        for (int i=0;i<a.length;i++){ 
            for (int j=0;j<a[i].length;j++)
            	
            	if(a[i][j] %2==1){
            		sum+=a[i][j];
                }
        }
        System.out.println("The sum of odd numbers is = "+sum);
	}

}
