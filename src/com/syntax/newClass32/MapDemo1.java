package com.syntax.newClass32;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {//maps can hold two things "key and value"
    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(111,"Jack");
        map.put(222,"Vladimir");
        map.put(333,"Maria");
        map.put(444,"Danis");
        map.put(555,"Daria");
        map.put(666,"Jassor");

        System.out.println(map.get(666));
    }
}

