package com.hazirlik;
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 85, 45};
        System.out.println(findLeastDifference(arr, 100));
    }

    public static int findLeastDifference(int[] arrayList, int number) {
        int closetNumber = arrayList[0];
        int difference = abs(arrayList[0] - number);
        for (int num : arrayList
        ) {
            if (abs(num - number) < difference) {
                closetNumber = num;
                difference = abs(num - number);
            }
        }
        return closetNumber;
    }

    static int abs(int number) {
        if (number < 0) {
            return number * -1;
        } else {
            return number;
        }
    }


    }
