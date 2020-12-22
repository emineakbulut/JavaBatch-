package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;// you cannot add  2 variables inside 1 variabla
		a=20; //you can reassign only
		
		
		/*It is a collection of similar data types.
		 * It is fixed in size that means you can't increase the size of array at run time.
		 * It stores the value on the basis of index value.
		 * The first element of an array starts with zero 
		 * 
		 * Declaring and Initializing an Array
		 * dataType[] arrayVar = new dataType[arraySize];                  preferred way
		 * 
		 * int[] arr = new int[10]; The size of array is 10. 
		 * or int[] arr = {10,20,30,40,50};
		 * 
		 * To find the length of an array, 
		 * we can use the following syntax:arrayName.length(); 
		 * 
		 * To print all values from an array we can use for loop using following syntax for 
		 * ( int i=0; i < array.length; i++ ) {System.out.println( array[i] );}
		 */
		
		int student1=90;
		int student2=56;
		int student4=76;
		int student3=88;
		int student5=74;
		
		int[] num = new int[5];//number of element
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		//to acces an element from an array
		System.out.println("Accessing 3rd element "+num[2]);//number of index
		
		System.out.println(num[1]+num[4]);
		
		//I would like to change 50 to 100;
		num[4]=100;
		
		System.out.println("Value of 5th element after change "+num[4]);
		
		String[] array=new String[4];  
		array[0]="Hello";
		array[1]="Yay";
		array[2]="Hi";
		array[3]="Bye";
		
		System.out.println(array[3]);
		
		

	}

}
