package com.syntax.replhw;

import java.util.ArrayList;
import java.util.Iterator;

public class tASK193 {
    public static void main(String[] args) {
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(0,true);
        listA.add(1,false);
        listA.add(2,false);

        Iterator<Boolean> ListB=listA.iterator();
        while (ListB.hasNext()){
            System.out.println(ListB.next());
        }
    }
}
