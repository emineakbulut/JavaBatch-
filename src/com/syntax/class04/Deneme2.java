package com.syntax.class04;

import java.util.Scanner;

public class Deneme2 {
	public static void main(String[] args){
	    Scanner emn=new Scanner(System.in);
	    System.out.println("Please enter 3 distinct numbers");
	    int num1=emn.nextInt();
	    int num2=emn.nextInt();
	    int num3=emn.nextInt();
	    
	    if(num1>num2){
	      if(num1>num3){
	        System.out.println("The largest number is "+num1);
	      }
	    }else if(num2>num1){
	      if(num2>num3){
	        System.out.println("The largest number is "+num2);
	      }
	    }else if(num3>num1){
	        if(num3>num2){
	          System.out.println("The largest number is "+num3);
	        }
	    }
	      
	      
	    }
	  }
