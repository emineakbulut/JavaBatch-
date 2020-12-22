package com.syntax.replhw;

import java.util.ArrayList;
import java.util.Scanner;
/*
Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
Numbers in:
4
62
8
5
4
Expected Output:
4 62 8 5 4
 */
public class Task190 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        num.add(scan.nextInt());
        num.add(scan.nextInt());
        num.add(scan.nextInt());
        num.add(scan.nextInt());
        num.add(scan.nextInt());
        System.out.println(num);

//        for(int i=0;i<6;i++){
//            scan.nextInt(i);
//
//        }
//        System.out.println();
//        while (scan.hasNextInt()){
//            num.add(scan.nextInt());
//        }



    }

}
