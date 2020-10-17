package com.syntax.class02;

public class ArithmaticTask {

	public static void main(String[] args) {
		
		// Write a Java program to add, subtract, multiply and divide 2 decimal values.
		//Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”

    double num1=28.43;
    double num2=7.89;
    
    double add=num1+num2;
    double subt=num1-num2;
    
    double mult=num1*num2; 
    double divide=num1/num2; 
    
    System.out.println("The adding of 2 numbers "+num1+" and "+num2+" is equal to "+add); 
    System.out.println("The subtracting of 2 numbers "+num1+" and "+num2+" is equal to "+subt); 
    System.out.println("The multiplying of 2 numbers "+num1+" and "+num2+" is equal to "+mult); 
    System.out.println("The dividing of 2 numbers "+num1+" and "+num2+" is equal to "+divide);
   
    //Write a program to find the square of the number 3.9. You program should say
    //“The square of the ____ is ____ ”
    
    double num=3.9;
    double square=3.9*3.9;	
    
    System.out.println("The square of the "+num+" is " +square);
    
    //Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say. 
    //“The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
    
    int x=5;
    int y=8;
    
    int area=x*y;
    int perimeter=(2*x)+(2*y);
    
    System.out.println("The perimeter of a rectangle width "+x+" and height "+y+" is equal to "+perimeter+" and the area is "+area);
    
 
   
    
    
    
    
	}

}
