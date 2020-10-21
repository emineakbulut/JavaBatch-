package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int r=1; r<=4; r++) { //outer loop control rows
			
			for (int c=1; c<=6; c++) { //inner loop control cols
				
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("------------BIG SQUARE--------------");
		
for (int r=1; r<=4; r++) { //outer loop control rows
			
			for (int c=1; c<=6; c++) { //inner loop control cols
				
				System.out.print("*");
			}
			System.out.println();

	}
        System.out.println("------------SQUARE OF NUMBERS--------------");
//        11111111
//        22222222
//        33333333
//        44444444
        for (int r=1; r<=4; r++) {
        	
        	for (int c=3; c<=10; c++) {
        		
        		System.out.print(r);
        	}
        	System.out.println();
        }
        System.out.println("------------SQUARE OF NUMBERS--------------");
//        7777777
//        6666666
//        5555555
//        4444444
//        3333333
//        2222222
//        1111111      
         for (int r=7; r>=1; r--) {
        	
        	for (int c=0; c<=6; c++) {
        		
        		System.out.print(r);
        	}
        	System.out.println();
         }
         System.out.println("------------SQUARE OF NUMBERS--------------");
//         7654321
//         7654321
//         7654321
//         7654321
//         7654321
         for (int r=5; r>=1; r--) { //we dont care about what is the value of r,as log as it gives 5 row
         	
         	for (int c=7; c>=1; c--) {
         		
         		System.out.print(c);
         	}
         	System.out.println();
         }
	}
}
