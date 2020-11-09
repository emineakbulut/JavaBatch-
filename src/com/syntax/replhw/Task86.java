package com.syntax.replhw;

public class Task86 {

	public static void main(String[] args) {
		 int [][] array = { // 2 boyutlu array
	                {1,1,2},
	                {3,1,2},
	                {3,5,3},
	                {0,1,2}
	        };

	        int i;
	        int sum = 0;
	        int [] b = new int[4];  // 4 elemanli array tanimliyoruz. Yeni cikan sayilari bunun icine atacagiz

	        for ( i=0; i<array.length; i++){
	            for (int j=0; j < array[i].length; j++){  
	                sum = sum+array[i][j];

	            } b[i]=sum;  // array lerde eleman ekleme islemi bu sekilde atama yoluyla yapiliyor

	            sum = 0;  // sum sifirlanmasi lazim. 
	        }

	        for (i=0; i<b.length; i++)
	            System.out.println(b[i]);

	    }

	}


