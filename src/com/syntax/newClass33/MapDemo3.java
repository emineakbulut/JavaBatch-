package com.syntax.newClass33;
import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Jack"    ,111);
        hashMap.put("Vladimir",222 );
        hashMap.put("Maria"   ,333 );
        hashMap.put("Danis"   ,444);
        hashMap.put("Daria"   ,555);
        hashMap.put("Jassor"  ,666);
        System.out.println(hashMap);
        hashMap.remove("Danis");
        System.out.println(hashMap);
        hashMap.put("Danis"   ,444);

        System.out.println(hashMap.get("Maria"));
        System.out.println(hashMap.containsKey("Jack"));
        System.out.println(hashMap.containsKey("Sabeen"));
        System.out.println(hashMap.containsValue(444));
        System.out.println(hashMap.containsValue(100));
        System.out.println(hashMap.isEmpty());
        hashMap.clear();
        System.out.println(hashMap);
        System.out.println(hashMap.isEmpty());

    }
}