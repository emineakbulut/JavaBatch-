package com.syntax.replhw;

public class Task114 {

    public int mult(int a, int b) {
        int result = a * b;
        return result;
    }

    public int add(int a, int b) {
        int result = a + b;
        return result;

    }
    public int subt(int a,int b) {
        int result = a - b;
        return result;
    }

    public static void main(String[] args) {
        Task114 task=new Task114();
        int result=task.mult(15,15);
        System.out.println(result);
    }
}