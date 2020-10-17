package com.syntax.class07;

public class Task1WorkDay {

	public static void main(String[] args) {
		
		boolean workDay= true;
		int day=1;
		
		while(workDay) {
			
			if(day<6) {
			System.out.println("I need aday off");
			}else {
			System.out.println("I do not need a day off any more");
			workDay=false;
			}
			day++;
		}

	}

}
