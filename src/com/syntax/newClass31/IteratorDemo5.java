package com.syntax.newClass31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo5 {

    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("milk");
        drinks.add("soda");
        drinks.add("scotch");
        drinks.add("vodka");
        drinks.add("turkish Raki");
        System.out.println(drinks);
        Iterator<String> iterator = drinks.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("scotch")|| next.equals("vodka")
                    || next.equals("turkish Raki")){
                iterator.remove();
            }
        }

        System.out.println(drinks);
//break till 01PM

    }
}
