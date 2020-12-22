package com.syntax.newClass30;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemo2 {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(105);
        arrayList.add(102);


        System.out.println(arrayList);
        System.out.println( arrayList.size());
        arrayList.remove(3);
        System.out.println(arrayList);
        System.out.println( arrayList.size());
        Integer integer = 100;

        System.out.println(arrayList.contains(integer));

        System.out.println(arrayList.indexOf(integer));
        arrayList.remove(integer);
        System.out.println(arrayList);
        System.out.println( arrayList.size());

        arrayList.clear();
        System.out.println(arrayList);



    }
}
