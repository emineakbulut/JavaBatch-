package com.syntax.replhw;

import java.util.ArrayList;
/*
Create an array list to type String.
Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array
print remained values one by one in one line
Expected Output:
yo yolo
 */
public class Task189 {
    public static void main (String [] args){

        ArrayList<String> arr=new ArrayList<>();
        arr.add("hi");
        arr.add("yo");
        arr.add("sup");
        arr.add("yolo");
        arr.add("boop");
        arr.remove(0);
        arr.remove(1);
        arr.remove(2);
        System.out.print(arr.get(0)+" "+arr.get(1));


    }
}
