package com.syntax.replhw;

import java.util.LinkedList;

public class Task192Fibonacci {
    /*
    Create Linked List that will store first 10 numbers of fibonacci series
Print number from Linked List 1 by 1 all in 1 line
Expected Output:
0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {
        LinkedList fibonacci=new LinkedList();
        fibonacci.add(0);
        fibonacci.add(1);
//
//        System.out.println(fibonacci);
//
//        for(int i=2;i<10;i++){
//
//         int ai=fibonacci.get(i-2)+fibonacci.get(i-1);
//
//        }
//        System.out.println(fibonacci);

        int count = 7, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
