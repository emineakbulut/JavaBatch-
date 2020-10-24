package com.syntax.class10;

public class LoopsRecap {

	public static void main(String[] args) {
		
		boolean condition=true;
		
		while (condition) {
			System.out.println("I am while loop");
			
			for (int i=1; i<8; i++) {
				System.out.println("I am for loop");
			
			}
			break;
			}
		
		
		System.out.println("-------------------------------------");
		
		for (int i=1; i<=5; i++) {
		      
		      for (int j=i; j<=20; j++){
		        
		        for(int k=2; k<=20; k+=2) {
		          
		        	 System.out.print(j+" ");
		        }
		        System.out.println();
		       
		      }
		    
		    
		    }
		    
		

	}

}
