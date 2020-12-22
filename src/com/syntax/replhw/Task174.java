package com.syntax.replhw;

public abstract class  Task174 {
    abstract void m1();
    abstract void m1(String a);
}
class Ain extends Task174{

    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(String a) {
        System.out.println("m1 method with parameter");
    }

    public static void main(String[] args) {
        Ain ain=new Ain();
        ain.m1();
        ain.m1(" ");
    }
}
