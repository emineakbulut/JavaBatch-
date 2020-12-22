package com.syntax.newClass32;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    //remove duplicates from the list

    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();//this is my arrayList we do not need to write a logic for removing we have collection framework !
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String> removeDuplicate = new LinkedHashSet<>(aList);//sets do not contain duplicates


        aList=new ArrayList<>(removeDuplicate);

        System.out.println(aList);
    }
}
