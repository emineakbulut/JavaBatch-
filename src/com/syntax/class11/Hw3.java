package com.syntax.class11;

public class Hw3 {

	public static void main(String[] args) {
		
		/*Create an array of countries. While retrieving all values from an array
		 *  print capital for each country.
		 (use 2 different loops).
		 */
			String[] countries= { "USA", "Italy", "France", "Greece", "Turkey", "Bulgaria"};
			countries[0]="Washington, D.C";
			countries[1]="Rome";
			countries[2]="Paris";
			countries[3]="Athens";
			countries[4]="Ankara";
			countries[5]="Sofia";
			System.out.println("\n---------------PRINTING WITH FOR --------------------------------------------------");
			for (int i = 0; i < countries.length; i++) {
				System.out.print(countries[i]+ " ");
			}
			System.out.println("\n---------------PRINTING WITH FOREACH -----------------------------------------------");
			
			for(String capital: countries) {
				System.out.print(capital+ " ");
			}
			
			System.out.println("-----------------");
			
			
			
			}
	
	for(country:countries) {
		switch(country) {
		case "USA":
			capital="DC"
		}

	


