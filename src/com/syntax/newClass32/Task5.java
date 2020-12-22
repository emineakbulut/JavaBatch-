package com.syntax.newClass32;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task5 {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with "A";*/
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("Paris");
        cities.add("Rome");
        cities.add("Abu Dhabi");
        cities.add("Helsinki");
        cities.add("Athens");
        cities.add("London");
        cities.add("Ankara");
        cities.add("Antananarivo");
        System.out.println(cities);
        Iterator<String> itr = cities.iterator();
        while (itr.hasNext()) {
            if (itr.next().startsWith("A")) {
                itr.remove();
            }
        }
        System.out.println(cities);

    }
}
