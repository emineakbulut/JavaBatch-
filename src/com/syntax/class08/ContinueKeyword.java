package com.syntax.class08;

public class ContinueKeyword {
	
	public static void main(String[] args) {
		
		
		//continue keyword It causes the loop to immediately jump to the next iteration of the loop.
		//print numbers 1-5 except number 3
		
		for (int i = 1; i <= 5; i++) {

			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("End of the loop");
		
		//print numbers 1-10 except number 3&7
		
		for (int i = 1; i <= 10; i++) {
			if (i == 3 || i==7) {
				continue;
			}
			System.out.println(i);
			
		}

	}

}
