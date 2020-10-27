package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] grade= {'A','B','C','D','E','F'};
		char secondValue=grade[1];
		
		String[] names= {"Mike","Jack","Danilo","Burcu","Bryan","Evgenia"};
		String secondVal=names[1];
		
		//get all values from grade array
		
		for(int i=0; i<grade.length; i++) {
			
			 char valueFromArray=grade[i];
			 System.out.println(valueFromArray);
			 
		}

	}

}
