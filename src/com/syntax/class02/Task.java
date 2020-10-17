package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		
		/* Create a Java program and name it Variables
           In your program create different type of variables to store student’s information and then print value of those variables:
           name
           lastName   these are identifiers
           grade
           city
           state
           phoneNumber
           b)   Change student’s city, state, phone number and grade. And print those updated values.*/

      
		String name = "Zeynep";
		String lastname = "Akb";
	    int grade = 5;
		String city = "SanJ";
        String state = "CA";
        long Phonenum =12349887657545l;
        
        
       System.out.println(name);
       System.out.println(lastname);
       System.out.println(grade);
       System.out.println(city);
       System.out.println(state);
       System.out.println(Phonenum);
       System.out.println();
       
        Phonenum = 4321;
        city = "Cupertino";
        state = "AB";
       
        System.out.println(Phonenum);
        System.out.println(city);
        System.out.println(state);
        
       
	}

}
