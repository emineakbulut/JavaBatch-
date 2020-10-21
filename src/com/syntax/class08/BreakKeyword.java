package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		//break
		
		for (int i=1; i<4; i++) {
			System.out.println("Hello");
			break;
		}
		//we want to print nums from 1 to10 when its 5 we want to break
		
		for (int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}

	}

}
