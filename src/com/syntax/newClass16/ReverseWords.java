package com.syntax.newClass16;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {

        String sentence="What did you use the most";
        String[] stringArray=sentence.split(" ");//splitting words into  String arrays
        System.out.println(Arrays.toString(stringArray));//if you don't put Arrays.tostring you will get hashes
        // or you need to make a loop 1 by 1 for each element

        for (int i=0; i<stringArray.length; i++){

            StringBuilder stringBuilder=new StringBuilder(stringArray[i]);
            stringArray[i]=stringBuilder.reverse().toString();//toString converts it to a string
        }
        System.out.println(Arrays.toString(stringArray));
    }
}
