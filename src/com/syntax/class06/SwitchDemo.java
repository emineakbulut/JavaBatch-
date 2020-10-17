package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * lets ask a tester on which browser they would like to use
         * 
         * 
         */
        Scanner scan;
        String browser;
        String message;
        scan = new Scanner(System.in);
        System.out.println("Please enter a browser");
        browser = scan.nextLine();
        switch (browser.toLowerCase()) {
        case "safari":
            message = "You code will be executed on Safari browser";
            break;
            
        case "chrome":
            message = "You code will be executed on Chrome browser";
            break;
        case "firefox":
            message = "You code will be executed on Firefox browser";
            break;
        default:
            message = "Entered browser is not supported";
        }
        System.out.println(message);
        
        //switch case cannot use relational or logical operators
        //switch cannot work with double, float, long
        
        float f=10.99f;
        double d=19.90;
        long l=19099;
        boolean b=true;
        
//      switch(l) { CE:Cannot switch on a value of type long.
//      }

	}

}
