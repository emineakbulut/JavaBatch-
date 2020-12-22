package com.syntax.newClass31;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
//no duplicate and no insertion order
        public static void main(String[] args) {
            Set<String> hashSet = new HashSet<>();
            hashSet.add("Apple");
            hashSet.add("Mango");
            hashSet.add("Kiwi");
            hashSet.add("Apple");
            hashSet.add("strawberry");
            hashSet.add("avocado");
            hashSet.add("olives");
            System.out.println(hashSet);
            hashSet.clear();
            System.out.println(hashSet);
            System.out.println(hashSet.size());
        }
    }

