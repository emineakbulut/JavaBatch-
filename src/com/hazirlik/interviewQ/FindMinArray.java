package com.hazirlik.interviewQ;

public class FindMinArray {

    /*
write a method that can find the min number from an int array
*/
    public int findSmallestNumber(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        FindMinArray f = new FindMinArray();
        int[] array = {289, 78, 98, 34, 489, 67};
        System.out.println(f.findSmallestNumber(array));
    }

}
