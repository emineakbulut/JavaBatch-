package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		/*A switch works with the byte, short, char, int and String
		 * 
		 *The break statement is used inside the switch to terminate a statement sequence.
		 *  
		 * The default statement is optional,
		 * and can appear anywhere inside the switch block.  
		 * 
		 * The default section handles all values that
		 * are not explicitly handled by one of the case sections.
		 * 
		 * The switch can only check for equality
		 * Logical operators cannot be used with switch statement. 
		 */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day number");
        int day = scan.nextInt();
        String myDay;
        if (day == 1) {
            myDay = "Monday";
        } else if (day == 2) {
            myDay = "Tuesday";
        } else if (day == 3) {
            myDay = "Wednesday";
        } else if (day == 4) {
            myDay = "Thursday";
        } else if (day == 5) {
            myDay = "Friday";
        } else if (day == 6) {
            myDay = "Saturday";
        } else if (day == 7) {
            myDay = "Sunday";
        } else {
            myDay = "Invalid Day";
        }
        System.out.println("Today is "+myDay);
        
        System.out.println("---- SAME EXAMPLE USING SWITCH CASE ----");
        String today;
        switch (day) {// datatype of variable must match with datatype of cases
        case 1:
            today = "Monday";
            break;
        case 2:
            today = "Tuesday";
            break;
        case 3:
            today = "Wednesday";
            break;
        case 4:
            today = "Thursday";
            break;
        case 5:
            today = "Friday";
            break;
        case 6:
            today = "Saturday";
            break;
        case 7:
            today = "Sunday";
            break;
        default:
            today = "Invalid Day";
            break;
        }
        System.out.println("Today is "+today);
	}

}
