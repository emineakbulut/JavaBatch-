package com.hazirlik.interviewQ;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerRepeats {

/*
Given an array of integers, write logic to display the number of times each integer repeats.
 Also come up with all the possible test cases?
We are mainly looking for logical thinking around the best way the solution
 can be obtained.  Test cases do not have to be coded, just listed?

  public static void main(String[] args) {
        System.out.println("Repeated numbers: " + duplicateCounter(new int[]{2, 2, 2, 3}));
        System.out.println("Repeated numbers: " + duplicateCounter(new int[]{2, 9,1,2,8,6,6}));
        System.out.println("Repeated numbers: " + duplicateCounter(new int[]{3, 2, 3, 3, 3, 4, 1, 5, 5, 8, 8}));
        System.out.println("Repeated numbers: " + duplicateCounter(new int[]{1,0,0,0,0,0,0,1}));
        System.out.println("Repeated numbers: " + duplicateCounter(new int[]{-2, -15, 0, 0, 25, 19, 2}));
        System.out.println("Repeated numbers: " + duplicateCounter(new int[]{0}));
        System.out.println("Repeated numbers: " + duplicateCounter(new int[]{0,0}));
        System.out.println("Repeated numbers: " + duplicateCounter(new int[]{1,-2,-4,-5,-1}));
    }
    public static Map<Integer, Integer> duplicateCounter(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    counter++;
                }
                map.put(array[i], counter);
            }
        }
        return map;
    }
}
//
 public static void main(String[] args) {
        int[] array = {1, 2, 2, 3,3,3,4,4,4,5,5,5};
        frequencyOfElements(array);
    }
​
        static void frequencyOfElements(int[] arr){
        Map<Integer, Integer> map= new TreeMap();
        int count=1;
​
            for (int i = 0; i < arr.length ; i++) {
                if(!(map.containsKey(arr[i]))){
                    map.put(arr[i], 1);
                    count=1;
                }
                else {
                    count+=+1;
                    map.replace(arr[i],count);
                }
            }
​
            Iterator<Map.Entry<Integer, Integer>> iterator= map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<Integer, Integer> next = iterator.next();
                System.out.print(next.getKey()+" "+ next.getValue());
                System.out.println();
            }
​
​
        }
​

 */

    public static void main(String[] args) {
        int[] tc01 = {0, 0, 0, 1, 2, 2, 5};
        int[] tc02 = {};
        int[] tc03 = {2,2,2,2,2,2,2,2};
        int[] tc04 = {-2,-1,0,1,2};

        printNumCountPairs(numCountPairs(tc01));
    }

    private static Map numCountPairs(int[] arr) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 0);
            }
        }
        return map;
    }

    private static void printNumCountPairs(Map<Integer, Integer> mapToPrint) {

        if (mapToPrint.isEmpty()) {
            System.out.println("Passed array is empty nothing to count");
            return;
        }
        for (Integer key : mapToPrint.keySet()) {
            System.out.println("Number " + key + " repeats: " + mapToPrint.get(key) + " times");
        }
    }
}


