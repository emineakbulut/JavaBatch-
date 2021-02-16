package com.hazirlik.interviewQ;

/*print all numbers from 1 to x.
if num is divisible by 2 print "codility" instead of the number,
 if num is divisible by 3 print "test" instead of the number,
if num is divisible by 5 print "coders" instead of the number,
if not divisible by neither 2-3-5 print number. */

public class CheckDivisibility {

    public static void checkDivisibility(int x) {

     for (int i = 0; i <= x; i++) {

         if (i % 5 == 0) {

             System.out.println(i + "coders");

         } else if (i % 3 == 0) {

             System.out.println(i + "test");

         } else if (i % 2 == 0) {

             System.out.println(i + "Codility");

         } else {

                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        checkDivisibility(25);
    }
}
