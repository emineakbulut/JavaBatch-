package com.syntax.newClass34;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task5 {
    /*
    Create a Map from array of cities that will sort keys in alphabetical order.
     As a key store the name of the city and as a value store the length of the city
     (Example: Paris=5, Moscow =6, Washington DC=13 etc..).
    If any city name is more than 7 characters remove that city .
     */
    public static void main(String[] args) {
        String[] citiesArray = {"Paris", "Moscow", "Washington DC", "Helsinki",
                "Oslo", "Berlin", "Ottawa"};

        Map<String, Integer> citiesMap = new TreeMap<>();

//        for (int i=0;i<citiesArray.length;i++){                    //with for loop
//            citiesMap.put(citiesArray[i],citiesArray[i].length() );
//        }

        for (String s : citiesArray) {
            citiesMap.put(s, s.length());
        }

        System.out.println(citiesMap);
        System.out.println("===============================");
        Iterator<Map.Entry<String,Integer>> iterator = citiesMap.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> element = iterator.next();
            if(element.getValue() > 7) {
                iterator.remove();
            }
        }
        System.out.println(citiesMap);
    }
}
