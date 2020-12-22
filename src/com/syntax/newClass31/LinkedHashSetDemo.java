package com.syntax.newClass31;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
//no duplicate but maintains order of insertion
    public static void main(String[] args) {

        Set<String> LinkedHashSet=new LinkedHashSet<>();
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("Mango");
        LinkedHashSet.add("Kiwi");
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("strawberry");
        LinkedHashSet.add("avocado");
        LinkedHashSet.add("olives");


        System.out.println(LinkedHashSet);
    }
}
