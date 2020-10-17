package com.syntax.class02;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		String name = "Olga";
		// I would like to say : my name is olga
		
		System.out.println("My name is "+name);
		
		String lastname="Sorrels";
		//id like to print olga sorrells
		
		System.out.println(name+" "+lastname);
		
		String city="Miami"; // Olga lives in miami
				
		System.out.println(name+" lives in "+city);
		
		char grade='B' ;//OLga is a b studdeny
				
		System.out.println(name+" is "+grade+" student ");		
		
		int age=21;
		System.out.println(name+" is "+age+" years old");
		
		/*to attach/concatenate any value (char,int string double)
		 * to string we use +( String....*/
		
		int date =27;
		String month= "September";
		System.out.println(date+" "+month);
		
		String state="   DC";
		String otherState="DC ";
		//Strings are not equal because osecond string has space	
				
		System.out.println(otherState);	
		System.out.println(state);
				
		
	}

}
