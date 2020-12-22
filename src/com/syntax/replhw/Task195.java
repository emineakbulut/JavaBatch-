package com.syntax.replhw;

import java.util.LinkedList;

public class Task195 {
    public static void main(String[] args) {
        LinkedList<Integer> num= new LinkedList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);

        int sum=num.get(0)+num.get(1)+ num.get(2)+num.get(3)+num.get(4)+num.get(5);
        System.out.println("Result of sum is "+sum);

    }
}
