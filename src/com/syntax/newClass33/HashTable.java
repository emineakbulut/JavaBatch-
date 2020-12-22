package com.syntax.newClass33;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Map<String,Integer> hasMap=new Hashtable<>(); //thread safe and will not allow null values
        // hasMap.put(null    ,111);
        // hasMap.put("Vladimir",null );  // Null not allowed will get NullPointer exception
        hasMap.put("Maria"   ,333 );
        hasMap.put("Danis"   ,444);
        hasMap.put("Daria"   ,555);
        hasMap.put("Jassor"  ,666);
    }
}
