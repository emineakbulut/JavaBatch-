package com.syntax.newClass32;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DifferenceBetweenListAndSet {

    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("strawberry");
        hashSet.add("avacado");
        hashSet.add("olives");
//in hashset if we want to acces an element we use for each loop
        for (String element:hashSet
        ) {
            System.out.println(element);
        }


//in List if we want to acces an element we use for get index method
        List<String> arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Mango");
        arrayList.add("Kiwi");
        arrayList.add("Apple");
        arrayList.add("strawberry");
        arrayList.add("avacado");
        arrayList.add("olives");
        System.out.println(arrayList.get(3));


    }
}
