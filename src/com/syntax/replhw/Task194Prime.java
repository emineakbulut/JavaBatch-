package com.syntax.replhw;

import java.util.LinkedList;

public class Task194Prime {
    /*
    Create an Linked List that will store all prime numbers from 1 to 100
Step 1. Create a method that will identify wether number is prime or not
Step 2. Add all prime numbers into Linked List
Print Linked List:
Expected Output:
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
     */
    public static void main(String[] args) {
        LinkedList<Integer> prime=new LinkedList<>();
//        for (int i = 1; i <=100; i++) {
//            prime.add(i);
//        }
       // System.out.println(prime);
        //Iterator<Integer> pr= prime.iterator();
        for (int i = 2; i <=100 ; i++) {
            for (int j = 2; j <=i; j--) {
                if ((i%j==0)){
                    prime.add(i);
                }

            }
            System.out.println(prime);
        }



        //Empty String

//        for (int i = 1; i <= 100; i++)
//        {
//            int counter=0;
//            for(int j =i; j>=1; j--)
//            {
//                if(i%j==0)
//                {
//                    counter = counter + 1;
//                }
//            }
//            if (counter ==2)
//            {
//                //Appended the Prime number to the String
//                prime.add(i);
//            }
//        }
//        //System.out.println("Prime numbers from 1 to 100 are :");
//        System.out.println(prime);
    }
    }

