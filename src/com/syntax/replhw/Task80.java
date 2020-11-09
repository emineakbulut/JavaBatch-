package com.syntax.replhw;

import java.util.Scanner;

public class Task80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
	    String [] names= new String[7];
	    for(int i=0; i<names.length; i++) {
	     
	      scan=new Scanner (System.in);
	      System.out.println("Please enter day "+(i+1)+" of the week");
	      names[i]=scan.next();
	    }
	    for(int i=0; i<names.length; i++) {
	      System.out.println(names[i]);
	    
	    }
	    
	 // created a blank one dimensional array with 7 iput spaces:
	    String[] array= new String[7];
	    //create a scanner to use
	    Scanner input= new Scanner(System.in);
	    //ask user to enter days of the week. But we need to place the question int
	    // a for loop. Because: the question will be asked 7 times& we want to change one part
	    //of the question at every instance:
	    for(int i=0; i<7; i++){
	    System.out.println("Please enter the day" + (i+1) + "of the week");
	    array[i]= input.next(); // we filled the array with user's inputs.
	    }
	    //printing the array elements using for loop.
	    for(int y=0; y<7; y++){
	      System.out.println(array[y]);
	    }
	}
	
}
