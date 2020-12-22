package com.syntax.newClass30;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        // we have 8 primitive types and for each primitive type we have a wrapper class
        byte byteNumbers = 127; //can store max -128 to 127
        short shortNumbers = 1000; //can store numbers from 32768 up to 32767
        int number = 101512;  // can store up to 2 billion
        long longNumbers = 1324531215345313l;
        float floatNumbers = 1520.2125f;
        double numberWithDecimalPoints = 10.5;
        char characters = 'A';
        boolean flags = true;

        String stringNumber = "10";
        //  System.out.println(stringNumber*2);-->I get an error bc its String
        int convertedNumber = Integer.parseInt(stringNumber);//parse--cozumle:Java guys created non primitive classes for all primitive types
        System.out.println(convertedNumber * 2);
        Byte nonPrimitiveByteNumbers = 127; //by Uppercase !!
        nonPrimitiveByteNumbers.byteValue();//we can call so many methods
        Short nonPrimitiveShortNumbers = 1000; //by Uppercase !!
        Integer nonPrimitiveNumber = 101512;  // by Uppercase !!
        Integer.parseInt("10");
        Long nonPrimitiveLongNumbers = 1324531215345313l;
        Float nonPrimitiveFloatNumbers = 1520.2125f;
        Double nonPrimitiveNumberWithDecimalPoints = 10.5;
        Character nonPrimitiveCharacters = 'A';
        Boolean nonPrimitiveFlags = true;

        int primitiveInt=10;
        Integer nonPrimitiveInteger=primitiveInt;
        primitiveInt=nonPrimitiveInteger;
        System.out.println(nonPrimitiveInteger.doubleValue());//output 10.0


        ArrayList<Integer> integerArrayList=new ArrayList<>();
    }
}
//Primitives are very good when it comes to performance and storage
//Every time we hav e to create an object,a copy of all the methods and all the fields created in the memory
//We can not use collection frame work with primitive data types so we only use this wrapper class
//collection frame works with objects