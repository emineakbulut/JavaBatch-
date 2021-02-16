package com.hazirlik.interviewQ;

public class FINRA {

    /*
write a method with prints out the numbers from 1 to 30 but for numbers which are multiple of 3 print "FIN",
instead of the number and for numbers which are multiple of 5 print "RA" instead of the number.
for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
*/
    public static void printFinra(int x) {
        for (int i = 0; i <= x; i++) {
            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printFinra(30);
    }
}

