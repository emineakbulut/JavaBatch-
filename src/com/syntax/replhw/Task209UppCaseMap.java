package com.syntax.replhw;
/*
Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
Expected Output:
265
22180
PATRICK ST
UNITED STATE
VIENNA
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task209UppCaseMap {
    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put("Street","Patrick ST");
        map.put("Suit","265");
        map.put("City","Vienna");
        map.put("Zip","22180");
        map.put("Country","United State");

        Set<Map.Entry<String,String>> set=map.entrySet();
        Iterator<Map.Entry<String,String>> iterator= set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry= iterator.next();
            System.out.println(entry.getValue().toUpperCase());
        }


    }
}
