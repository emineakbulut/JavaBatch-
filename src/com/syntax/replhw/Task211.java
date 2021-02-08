package com.syntax.replhw;
/*
 Create Hash Map.
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using EntrySet print the key and values pairs using iterator only
replace with below key THREE--> ASEL and key FIVE-->SUMAIR
Using EntrySet print the key and values pairs using iterator only
OUTPUT
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task211 {

    public static void main(String[] args) {

        HashMap<String,String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println("HashMap Before Replace :");
            System.out.println(map);
            break;
        }
        map.put("THREE","ASEL");
        map.put("FIVE","SUMAIR");
        System.out.println("HashMap After Replace :");
        System.out.println(map);
    }
}
