package com.syntax.class10;

public class TaskCars {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Print all values from the array.
		
		String[] cars= {"Bmw","Toyota","Volvo","Mercedes","Ford","Mazda"};
		
		for(int a=0; a<cars.length; a++) {
			System.out.print(cars[a]+" ");
		}
		System.out.println();
		
		System.out.println("------Enhanced Loop-------- ");
		
		for (String car:cars) {
			System.out.print(car+" ");
		}
		
	}

}
