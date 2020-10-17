package Review;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pass;
		double balance=1000;
		Scanner scan=new Scanner(System.in);
		double trAmount;
		System.out.println("Welcome to Syntax Enter your password");
		pass=scan.nextLine();
		
		if("pass123".equals(pass) || pass.equals("pass123")) {//both are the same
			System.out.println("Enter the amount you want to tranfer");
			trAmount=scan.nextDouble();
			if(trAmount>balance) {
				System.out.println("Not enough funds");
			}else {
				System.out.println("Transfered remaining balance "+(balance-trAmount));
			}
		}else {
			System.out.println("Invalid credentials");
		}
	}

}
