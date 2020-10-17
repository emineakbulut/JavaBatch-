package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// variable for allergy -yes or no
	
//if the day is friday watch movie if date is 13 scary movie if not comedy if no friday i study
	boolean isFriday=false;
	int date=4;
	boolean monday=true;		
			if(isFriday) {
				
				if(date==13) {
					System.out.println("Watch scary movie");
				}else {
					System.out.println("I will wacth PK movie");
				}
				
			}else {
				if (monday) {
					System.out.println("I am doing homework");
				}else {
				System.out.println("Today is not friday,I am studying");
			}
	}		
	}			
			}
