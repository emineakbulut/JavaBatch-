package com.syntax.replhw;

import java.util.Scanner;

public class Task79Arrays {

	public static void main(String[] args) {
		
		    
		    Scanner scan;
	
		    String [] names= new String[7];
		    
		    for(int i=0; i<names.length+1; i++) {
		    	
		    	 if(i==7) {
		    		 continue;
		    	 }
			      
		      scan=new Scanner (System.in);
		      System.out.println("Please enter day "+(i+1)+" of the week");
		      names[i]=scan.next();
		      
		     
		    }
		    
		    for(int i=0; i<names.length; i++) {
		    	System.out.print(names[i]+ " ");
		    }

	}

}
