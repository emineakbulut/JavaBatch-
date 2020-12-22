package com.syntax.newClass30;
import java.util.ArrayList;

public class ArrayListClearAll {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Danilo");
        stringArrayList.add("Asghar");
        stringArrayList.add("Burju");
        stringArrayList.add("Eduard");
        stringArrayList.add("Daria");
        System.out.println(stringArrayList);
        stringArrayList.clear();
        System.out.println(stringArrayList);
    }
}
