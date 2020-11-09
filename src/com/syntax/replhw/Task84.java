package com.syntax.replhw;

public class Task84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		
	int max=a[0][0];
		
	
	for (int i=0; i<a.length; i++) {
		
	  for(int j=0; j<a.length; j++){
		  
		  if(a[i][j]>max) {
		    max=a[i][j] ;
		  }
		  
		 		}
	  
      	} 
	System.out.println("The largest number is "+max);
	}
}


