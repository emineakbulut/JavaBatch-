package com.syntax;

public class Task117 {
    int sumEvenToX(int x){
        int sumEven=0;
        for(int i=1; i<=x; i++){
            if(i%2==0){
                sumEven+=i;
            }
        }
        return sumEven;
    }

    public static void main(String[] args) {
        Task117 main=new Task117();
        int result=main.sumEvenToX(8);
        System.out.println(result);
    }
}
