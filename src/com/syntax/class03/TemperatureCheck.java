package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		/*Create variable to store temperature. 
		Your program should check if temperature is below 32 then it should print 
		“Water will freeze with temperature __“, otherwise 
		“Water will NOT freeze with temperature __“.*/
         
		int temp=33;
		
		if(temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
		}else {
			System.out.println("Water will not freeze with temperature "+temp);
		}
	}

}
