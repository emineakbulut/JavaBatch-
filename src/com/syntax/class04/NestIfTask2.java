package com.syntax.class04;

public class NestIfTask2 {

	public static void main(String[] args) {
		
		
		double mrate=3;
        int mprice=250000;
        		
        if	(mrate>4.5)	{
        	System.out.println("You will not buy a house");
        	
        	
        }else {
        	System.out.println("You will consider buying");
        	
        	if(mprice>200000) {
        		System.out.println("You will take a loan");
        	}else {
        		System.out.println("You will pay cash");
        	}
        }
	}

}
