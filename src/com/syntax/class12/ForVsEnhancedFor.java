package com.syntax.class12;

public class ForVsEnhancedFor {
	
	public static void main(String[] args) {
		
		int [] num= {10,20,30,1};
		
		for(int i=num.length-1; i>=0; i--) { //num.length=4
			System.out.print(num[i]+" ");
		}
		//we cannot loop backwar using enhanced for loop
		//it starts from the begginig of the loop and stpos at the and
	}

}
