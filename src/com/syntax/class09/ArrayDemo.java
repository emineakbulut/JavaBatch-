package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		a=20;
		
		int student1=90;
		int student2=56;
		int student4=76;
		int student3=88;
		int student5=74;
		
		int[] num = new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		//to acces an element from an array
		System.out.println("Accesing 3rd element "+num[2]);
		
		System.out.println(num[1]+num[4]);
		
		//I would like to change 50 to 100;
		num[4]=100;
		
		System.out.println("Value of 5th element after change "+num[4]);
		
		String[] array=new String[4];  
		

	}

}
