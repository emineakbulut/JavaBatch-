package com.syntax.newClass30;
import java.util.ArrayList;

public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Danilo");
        stringArrayList.add("Asghar");
        stringArrayList.add("Burju");
        stringArrayList.add("Eduard");
        stringArrayList.add("Daria");

        ArrayList<String> stringArrayList2=new ArrayList<>(15);
        stringArrayList2.add("Davit");
        stringArrayList2.add("Ali");
        stringArrayList2.add("Mike");
        stringArrayList2.add("Vlad");
        stringArrayList2.add("Anastasiia");

        // stringArrayList2.addAll(stringArrayList);
        stringArrayList2.addAll(3,stringArrayList);
        //Collections.sort(stringArrayList2);
        System.out.println(stringArrayList2);




    }
}
