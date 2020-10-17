package Review;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		char opr;
		int result = 0;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Enter the operation +,-,/,*");
		opr=scan.next().charAt(0);
		
		if(opr=='+') {
			result=num1+num2;
		}else if(opr=='-') {
			result=num1-num2;
		}else if(opr=='*') {
			result=num1*num2;
		}else if(opr=='/') {
			result=num1/num2;
		}else {
			System.out.println("Invalid");
		}
		System.out.println(result);

		switch(opr) {
		case '-':
			result=num1-num2;
			break;
		case '+':
			result=num1+num2;
			break;
		case '*':
			result=num1*num2;
			break;	
		case '/':
			result=num1/num2;
			break;	
		default:
			System.out.println("Invalid");
		}


	}

}
