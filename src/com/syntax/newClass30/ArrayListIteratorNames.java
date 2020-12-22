package com.syntax.newClass30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorNames {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Danilo");
        stringArrayList.add("Asghar");
        stringArrayList.add("Burju");
        stringArrayList.add("Eduard");
        stringArrayList.add("Daria");

        System.out.println("Using Enhanced forloop");
        for (String name:stringArrayList
        ) {
            System.out.println(name);
        }
        System.out.println("===================");
        System.out.println("Using Normal forloop");
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
        System.out.println("===================");
        System.out.println("Using While ");
        int index=0;
        while (index<stringArrayList.size()){
            System.out.println(stringArrayList.get(index));
            index++;
        }
        System.out.println("===================");
        System.out.println("Using iterator ");

        Iterator<String> iterator = stringArrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
