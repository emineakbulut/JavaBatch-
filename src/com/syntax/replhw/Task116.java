package com.syntax.replhw;

public class Task116 {

    boolean num (int a, int b){

        if(a%2==0 && b%2==0){
           return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Task116 main=new Task116();
        boolean b=main.num(22,31);
        System.out.println(b);
    }

}
