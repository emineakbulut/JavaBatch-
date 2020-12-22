package com.syntax.replhw;

import java.util.ArrayList;

public class Task186 {

    public static void main (String[] args){

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(111);
        arr.add(222);
        arr.add(333);
        arr.add(444);
        arr.add(555);
        arr.add(666);

       // System.out.println(arr.get(0));
     // arr.removeAll(arr);
        arr.remove(0);
        arr.remove(1);
        arr.get(0);
       System.out.println(arr);
        //System.out.println(arr.indexOf(2));
      //  System.out.println(arr.indexOf(4));
    }

}
