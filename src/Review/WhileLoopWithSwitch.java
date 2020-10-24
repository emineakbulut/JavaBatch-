package Review;

import java.util.Scanner;

public class WhileLoopWithSwitch {

	public static void main(String[] args) {


		double num1;
		double num2;
		char operation;
		double result;
		String end;
		
		while(true) {
		System.out.println("Please enter the numbers");
		Scanner scan=new Scanner (System.in);
		
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		
		System.out.println("Please enter the operation +,-,*,/");
		operation=scan.next().charAt(0);
		
		if(!(operation=='+' || operation=='-' || operation=='*' || operation=='/')) {
			System.out.println("Operation is not supported");
			continue;
		}
		
		switch (operation) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:	
			result=0;
		}

         System.out.println(result);
         System.out.println("Enter yes to perform more operation/No to terminate the program");
         end = scan.next();
         
         if("No".equals(end)) {
        	break;
         }
		}    
	}

}
