package com.syntax.newClass30;

public class BoxingUnboxing {
    public static void main(String[] args) {

        Integer nonPrimitive=10;//AutoBoxing

        int primitiveInt=nonPrimitive; //AutoUnboxing

        Integer integer=new Integer(10);//Boxing

        int number=integer.intValue();   //unboxing
        String string=new String("Bekir");
        String string2="Bekir";




    }
}
