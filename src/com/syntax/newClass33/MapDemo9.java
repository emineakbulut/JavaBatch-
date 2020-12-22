package com.syntax.newClass33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo9 {

    public static void main(String[] args) {

        HashMap<String, Double> storeItemsDay1 = new HashMap<>();
        storeItemsDay1.put("Milk", 3.2);
        storeItemsDay1.put("Bread", 0.6);
        storeItemsDay1.put("Cake", 40.0);
        storeItemsDay1.put("Diaper", 39.99);
        storeItemsDay1.put("Eggs", 4.99);

      /*  Set<Map.Entry<String, Double>> entries = storeItemsDay1.entrySet();
        for( Map.Entry<String,Double> item:entries){
            storeItemsDay1.remove( item.getKey());     //Exception
        }
*/
        Iterator<Map.Entry<String, Double>> iterator = storeItemsDay1.entrySet().iterator();
        System.out.println(storeItemsDay1);
        while (iterator.hasNext()){
            Map.Entry<String, Double> next = iterator.next();
            if(next.getValue()>10){
                iterator.remove();
            }
        }

        System.out.println(storeItemsDay1);

    }
}
