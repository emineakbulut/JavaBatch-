package com.syntax.class04;

public class NestIfTask {

	public static void main(String[] args) {
		
		
		
        boolean diploma=false;
        double gpa=3.3;
        		
        		if (diploma) {
        			System.out.println("Congratulations");
        		}else {
        			System.out.println("You should get a degree");
        		if(gpa>=3.5) {
        			System.out.println("You are eligible for scholarship");
        		}else {
        			System.out.println("You should studyied harder");
        		}
        			
        		}
        
	}

}
