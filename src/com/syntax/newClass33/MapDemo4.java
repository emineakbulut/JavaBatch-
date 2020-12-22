package com.syntax.newClass33;

import java.util.*;

public class MapDemo4 {
    public static void main(String[] args) {

        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("Jack", 111);
        hasMap.put("Vladimir", 222);
        hasMap.put("Maria", 333);
        hasMap.put("Danis", 444);
        hasMap.put("Daria", 555);
        hasMap.put("Jassor", 666);

      /*  Set<String> set = new HashSet<>();
        Iterator<String> sets = set.iterator();*/


        Set<Map.Entry<String, Integer>> set1 = hasMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set1.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> element=iterator.next();
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

    }
}
