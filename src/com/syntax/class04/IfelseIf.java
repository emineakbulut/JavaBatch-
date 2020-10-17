package com.syntax.class04;

public class IfelseIf {

	public static void main(String[] args) {
		// wEneed to compare two numbers bigger smaller or equal
		
		int num1=19;
		int num2=99;
		
		if (num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
			
		}else if (num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
			
		}else {
			System.out.println(num1+" is equal to "+num2);
			
			System.out.println("--------------------------------------------------------------");
			
			/*Based on the day of the week we will print class schedule
			 * 
			 */
			
			int day=7;
			
			if(day==1) {
				System.out.println("Today is monday no class");
			}else if(day==2) {
				System.out.println("Today is Tuesday Manual class");
			}else if (day==3) {
				System.out.println("Today is wed. Manual class");
			}else if (day==4) {
				System.out.println("Today is thursday Review class ");
			}else if(day==5) {
				System.out.println("Today is Friday i will prepare");
			}else if(day==6) {
				System.out.println("Today is Saturday I have java class");
			}else if(day==7) {
				System.out.println("Today is Sunday I did alot of coding");
			}else {
				System.out.println("Invalid day of week");
			}
		}

	}

}
