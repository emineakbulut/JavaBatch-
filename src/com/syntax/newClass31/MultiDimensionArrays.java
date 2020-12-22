package com.syntax.newClass31;

import java.util.ArrayList;

public class MultiDimensionArrays {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> outerArrayLists=new ArrayList<>();
        ArrayList<Integer> innerArrayList=new ArrayList<>();
        innerArrayList.add(10);
        innerArrayList.add(20);
        innerArrayList.add(30);
        innerArrayList.add(40);
        ArrayList<Integer> innerArrayList1=new ArrayList<>();
        innerArrayList.add(10);
        innerArrayList.add(20);
        innerArrayList.add(30);
        innerArrayList.add(40);
        outerArrayLists.add(innerArrayList);
        outerArrayLists.add(innerArrayList1);
    }
}
