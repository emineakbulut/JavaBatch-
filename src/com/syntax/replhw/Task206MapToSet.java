package com.syntax.replhw;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*
Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi
Extract all keys and it values and print them in the format below:
Expected Output:
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
 */

public class Task206MapToSet {
    public static void main(String[] args) {

        Map<String,String> value=new TreeMap<>();
        value.put("1 item","apple");
        value.put("2 item","banana");
        value.put("3 item","pear");
        value.put("4 item","tomato");
        value.put("5 item","mango");
        value.put("6 item","kiwi");

        Set<Map.Entry<String,String>> set=value.entrySet();
        Iterator<Map.Entry<String,String>> iterator= set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry= iterator.next();
            System.out.println("Key is "+entry.getKey()+" and values is "+entry.getValue());
        }

      //  System.out.println("Key is "+value.keySet().toArray()[0]+" and values is "+value.get("1 item"));
        //  bu da ayni sonucu verdi
    }

    }

