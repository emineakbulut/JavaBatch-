package com.syntax.replhw;
/*
Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"
"FOUR"
Using entry set print key and values pairs using loop
Expected Output:
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
 */

import java.util.HashMap;
import java.util.Map;

public class Task210Remove {
    public static void main(String[] args) {

        HashMap<String,String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Remove :");

        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());

                   }
        map.remove("ONE");
        map.remove("FOUR");

        System.out.println("-------------------------------------");

        System.out.println("HashMap After Remove :");

        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());

        }


//        System.out.println("==================================================");

//        Set<Map.Entry<String,String>> set=map.entrySet();
//        Iterator<Map.Entry<String,String>> iterator= set.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String,String> entry= iterator.next();
//            System.out.println(entry);
//        }

    }
}
