package com.syntax.newClass30;

import java.util.ArrayList;
import java.util.Iterator;

public class  ArraysListIterator {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(100);
        arrayList.add(200);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            for (int i = 0; i < 4; i++) {
                System.out.println(next);
            }



        }


    }
}


