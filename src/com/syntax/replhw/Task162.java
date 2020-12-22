package com.syntax.replhw;
/*
Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
In main method execute all 3 methods to match the output:
Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
 */

public class Task162 {

    void numbers(int a,int b,int c,int d){
        int result=a-b-c-d;
        System.out.println(result);
    }
    void numbers(int a,int b,int c){
        int result=a-b-c;
        System.out.println(result);
    }
    void numbers(int a,int b){
        int result=a-b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Task162 s=new Task162();
        s.numbers(100,20,10,30);
        s.numbers(100,20,50);
        s.numbers(50,30);

    }
}
