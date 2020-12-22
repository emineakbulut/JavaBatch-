package com.syntax.replhw;

import java.util.Iterator;
import java.util.LinkedList;

public class Task191 {
    /*
    Create a Linked List that will store Integer Objects from 50-100.
Once Linked List is created remove all numbers that are not divisible by 3.
Print Linked List
Expected Output
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
     */
    public static void main(String[] args) {
        LinkedList<Integer> number=new LinkedList<>();
        int i=50;
        while (i<=100){
            number.add(i++);
        }
        System.out.println(number);

       Iterator<Integer> num=number.iterator();
        while (num.hasNext()){
            if(!( num.next()%3==0)) {
                num.remove();
              }
        }
        System.out.println(number);
    }

}
