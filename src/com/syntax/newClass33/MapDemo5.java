package com.syntax.newClass33;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("Jack", 111);
        hasMap.put("Vladimir", 222);
        hasMap.put("Maria", 333);
        hasMap.put("Danis", 444);
        hasMap.put("Daria", 555);
        hasMap.put("Jassor", 666);

        Set<String> keySet= hasMap.keySet();
        for (String key:keySet
        ) {
            System.out.println(key);
            System.out.println(hasMap.get(key));
        }



    }
}
