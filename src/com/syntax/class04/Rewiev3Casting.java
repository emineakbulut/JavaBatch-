package com.syntax.class04;

public class Rewiev3Casting {

	public static void main(String[] args) {
		
		byte byteVar = 10;
		short shortVar = 1000;
		char charVar='A';
		int intVar = 1000;
		long longVar = 100000;
		float floatVar = 100000;
		double doubleVar = 1000;
		shortVar=byteVar;
		System.out.println(shortVar);
		
		intVar=charVar;
		System.out.println(intVar);
		System.out.println(doubleVar);
		
		floatVar=(float) doubleVar;
		System.out.println(floatVar);
		byteVar= (byte) shortVar;
		System.out.println(byteVar);
		byte newVar=100;
		short newShortVar= (short) (newVar+10);
		int newIntVar=100;
		System.out.println(newIntVar);
		long newLongVar=2147483648L;
		float floatVAr=145.02F;    

	}

}
