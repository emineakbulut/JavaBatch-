package com.syntax.class11;

public class TaskCars {

	public static void main(String[] args) {
		// Create 2D array of cars :
		//american, german, korean, italian. And print all values from a 2D array

		String[][] cars= {
				{"Jeep", "Ford", "Dodge"},
				{"Audi", "Porsche", "BMW"},
				{"Kia", "Hyundai", "Hyundai sonata"},
				{"Ferrari", "Maserati", "Lamborghini"},
				
				
		};
		for (int i=0; i<cars.length; i++) {//4 
			
			for(int j=0; j<cars[i].length; j++) {
				
				String car=cars[i][j];
				
				System.out.print(car+"   ");
			}
			System.out.println();
			
			
			for(String[] carArray:cars) {
				
				for(String car:carArray) {
					
					System.out.println(car+"  ");
				}
				System.out.println();
			}
		}
	}

}
