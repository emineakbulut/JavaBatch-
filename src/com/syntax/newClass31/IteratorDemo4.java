package com.syntax.newClass31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo4 {

    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("Monrovia");
        cities.add("Brooklyn");
        cities.add("New York");
        cities.add("San Diego");
        System.out.println(cities);
        Iterator<String> iterator = cities.iterator();

        //  cities.removeIf(s -> s.endsWith("a")); lamda expressions
        while (iterator.hasNext()){
            if(iterator.next().endsWith("a")){
                iterator.remove();
            }
        }

        System.out.println(cities);


    }
}
