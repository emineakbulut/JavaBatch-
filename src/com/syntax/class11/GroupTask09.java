package com.syntax.class11;

public class GroupTask09 {

	public static void main(String[] args) {
		
		// Countries by continent
		
				String[][] countries= {
						{"S.America","Argentina","Brazil"},
						{"N.America","Cuba","Mexico","Jamaica"},
						{"Africa","Algeria","Benin","Chad","congo"},
						{"Asia","Afghanistan","India","PAkistan"},
						{"Europe","Albania","Cyprus","Germany"}
						
				};
						
						for(String[] CountryArray:countries)
						{
							
							for(String count:CountryArray)
							{
								
								System.out.print(count+"   ");
								
							}
							System.out.println();
							System.out.println();
						}
						System.out.println("Regular Loop---------------");
				for(int i=0;i<countries.length; i++)
						{
							
							for(int j=0;j<countries[i].length;j++) {
								
								System.out.print(countries[i][j]+" ");
							}
							System.out.println();
							System.out.println();
						}
				System.out.println("There are  "+countries.length);
				

	}

}
