package com.syntax.replhw;

import java.util.Scanner;

public class Task37 {

	public static void main(String[] args) {
		
		Scanner scan;
	    boolean isThirsty;
	    boolean isSleepy;
	    String drink;
	    
	    scan=new Scanner(System.in);
	    System.out.println("Are you thirsty?");
	    isThirsty=scan.nextBoolean();
	    System.out.println("Are you sleepy?");
	    isSleepy=scan.nextBoolean();
	    
	    if(isThirsty && !isSleepy){
	      drink="Water";
	    }else if(isThirsty && isSleepy ){
	      drink="Coffee";
	    }else if(!isThirsty && isSleepy){
	      drink="Tea";
	    }else{
	      drink="Nothing";
	    }
	    System.out.println("Looks like you need to drink "+drink);
	  }

	}

	


