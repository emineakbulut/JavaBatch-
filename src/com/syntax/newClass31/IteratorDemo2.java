package com.syntax.newClass31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {

        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);

        Iterator<Double> iterator = doubleArrayList.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        // System.out.println(iterator.next()); CE because we are at the last index and there are no more element left
    }
}
