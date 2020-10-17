package com.syntax.replhw;

import java.util.Scanner;

public class Task36 {

	public static void main(String[] args) {
		
		    Scanner scan =new Scanner(System.in);
		    int int1,int2;
		    String word1;
		    String word2;
		    String output;
		    
		    System.out.println("Please enter first string");
		    word1=scan.next();
		    System.out.println("Please enter second string");
		    word2=scan.next();
		    
		    System.out.println("Please enter first number");
		    int1=scan.nextInt();
		    System.out.println("Please enter second number");
		    int2=scan.nextInt();
		    
		    if(int1==int2 && word1.equals(word2)){
		      output="AND";
		    }else if(int1==int2 || word1==word2){
		       output="OR";
		    }else if(int1!=int2 && word1!=word2){
		      output="NONE";
		    }else {
		      output="0"	;
		    }
		    System.out.println(output);
		  }

		

}


