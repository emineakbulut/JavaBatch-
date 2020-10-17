package com.syntax.class04;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Emine";
		String lastName = "Akb";
		String result = lastName + 5;
		System.out.println(result);
		result = lastName + 5.0;    
		System.out.println(result);
		result = lastName + true;       
		System.out.println(result);
		result = lastName + 'C';
		System.out.println(result);
		
		int charvar=(int)'A'; 
		System.out.println(charvar);
		System.out.println('A'+5+ "name" + 'C' + 45);
		System.out.println(5 + 5 + "name" + 'C' + 45);                                                                         
		System.out.println(5.0 + 5 + "name" + 'C' + 45);
		System.out.println(5 + 5 + "name" + 'C' + true);
		int smiley=9786;                                      
		System.out.println((char)smiley);
	}

}
