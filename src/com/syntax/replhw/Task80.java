package com.syntax.replhw;

import java.util.Scanner;

public class Task80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan=new Scanner (System.in);
		    int[] num=new int[5];
		    for( int i=0; i<=4; i++) {
		      num[i]=scan.nextInt();
		    }
		    
		    for(int i=4; i>=0; i--)
		    System.out.println(num[i]);
		    
		    

	}

}
