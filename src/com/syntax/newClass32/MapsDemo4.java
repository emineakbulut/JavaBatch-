package com.syntax.newClass32;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo4 {
    public static void main(String[] args) {
        Map<Integer,String> stringMap=new HashMap<>();

        stringMap.put(111,"Sabeen loves PTI");
        stringMap.put(222,"PTI Destroyed Pakistans Economy");
        System.out.println(stringMap.containsKey(222));
        System.out.println(stringMap.containsValue("PTI Destroyed Pakistans Economy"));


    }
}