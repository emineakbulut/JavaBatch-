package com.syntax.replhw;

import java.util.*;
/*
Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values
null
Sohil
Diego
Alijon
Asel
Sumair
Print values 1 by 1 using loop and Iterator
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
 */

public class Task201 {
    public static void main(String[] args) {
        Set<String> coll=new LinkedHashSet<>();
        coll.add(null);
        coll.add("Sohil");
        coll.add("Diego");
        coll.add("Alijon");
        coll.add("Asel");
        coll.add("Sumair");

        List<String> list=new LinkedList<>(coll);
        for (int i = 0; i <= list.size()-1; i++) {

            System.out.println(list.get(i));
        }
        Iterator<String> collection= coll.iterator();
        while (collection.hasNext()){
            System.out.println(collection.next());
                    }
    }

}
