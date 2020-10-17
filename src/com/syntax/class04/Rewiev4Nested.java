package com.syntax.class04;

public class Rewiev4Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Emine";
		String pass="pass123";
		double balance=10.25;
		double trns=8;
		boolean allowed=true;
		
		if(pass.equals("pass123")) {
			System.out.println("Welcome to syntax "+name);
			if(allowed) {
				System.out.println("Initiating tranfer");
				if(trns>balance) {
					System.out.println("Insufficent balance");
				}else {
					System.out.println("Tranfer complete");
				}
			}else {
				System.out.println("Not allowed to transfer");
			}
		}
	else {
			System.out.println("Invalid credentials");
		

	}

	}}
