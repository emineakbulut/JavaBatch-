package com.syntax.replhw;

public class Task135 {
    /*
    Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
The method should static and it should return a new 2D array object
Print values from new array in the format below
Expected Output:
-9 -8 -7 -6
-6 -5 -4 -3
-9 -7 -5 -3
     */
    public static int[][] reduce10(int[][] b) {
        int row=b.length;
        int col=b.length-1;
        int [][] obj=new int[row][col];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                 obj[i][j] = (b[i][j] - 10);
                System.out.print(obj[i][j]);
            }
            System.out.println();
        }
        return b;
    }
    public static void main(String[] args) {
        int[][] a = {
                {1,4},
                {4,5},
                {1,9}
        };
        reduce10(a);
    }
}



