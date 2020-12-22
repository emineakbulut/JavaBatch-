package com.syntax.replhw;

public class Task164 {
    private void m1(){
        System.out.println("private m1 method");
    }
    private void m1(int num){

        System.out.println("private m1 method with int parameter");
    }

        public static void main(String[] args) {
Task164 c=new Task164();
c.m1();
c.m1(10);
        }
    }

