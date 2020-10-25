package com.syntax.class12;

public class Q2 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

		int num = 13
				;
        boolean flag = false;
        
        if(num>1) {
        
        for(int i = 2; i <= num; i++)
        {
            // condition for composite number
            if(num % i == 0) {
         
                flag = true;
                break;
            }
        }
        } else {
        	flag=true;
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
	}
	
	}


