package com.syntax.newClass15;

public class SubString {
    public static void main(String[] args) {

        //substring method it will just ignore before the index given,including spaces
        String name = "Can u write the second m too?";
        System.out.println(name.substring(10));//firs 10 characters will be ignored
        System.out.println(name.substring(0));//redundant-gereksiz
        //System.out.println(name.substring(-1));//error

        System.out.println(name.substring(5,10));// if you specify the range --> can u will be ignored/
        // after 10th it will be ignored-->writ(before 5 and after 10 will be ignored)
        System.out.println(name.substring(6,11)+name.substring(15,22));

    }

}






