package com.syntax.replhw;

import java.util.Scanner;

public class Task44 {

	public static void main(String[] args) {
//		Scanner scan;
//	    String make;
//	    String carOrigin;
//	    
//	    scan=new Scanner(System.in);
//	    System.out.println("Please enter your favourite car make");
//	    make=scan.nextLine();
//	    
//	    switch (make) {
//	      case "BMV":
//	        carOrigin="german car";
//	        break;
//	      case "Toyota":
//	        carOrigin="japanese car";
//	        break;
//	      case "Maserati":
//	        carOrigin="italian car";
//	        break;
//	      default:
//	        carOrigin="unknown";
//	    }
//	    System.out.println("Your favourite car is "+carOrigin);

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String carOrigin = scan.nextLine();
		String message;
		switch (carOrigin) {
		case "BMW":
			message = "german car";
			break;
		case "Toyota":
			message = " japanese car";
			break;
		case "Maserati":
			message = "italian car";
			break;
		default:
			message = "unknown";
		}
		System.out.println("Your favorite car is " + message);

	}

}
