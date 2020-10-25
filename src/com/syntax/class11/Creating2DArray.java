package com.syntax.class11;

public class Creating2DArray {

	public static void main(String[] args) {
		
		
		//create a 2D array of food:
		//american-italian-asian-afganian-indianS

		String[][] food= {
				{"steak","hotdog","cheeseburger"},
				{"pizza","pasta","canoli"},
				{"sushi","Ramen","rice","dumblings"},
				{"kebab","manto"},
				{"beriyani","masal","curry","cicken masala"}					
				};
		
		for (String[] dishes:food) {
			
			for(String dish:dishes) {
				
				System.out.println(dish+"  ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		for(int i=0; i<food.length;i++) {
			for(int j=0; j<food[i].length; j++) {
				
				System.out.println(food[i][j]+"  ");
			}
			System.out.println();
		}
		}
				
	}


