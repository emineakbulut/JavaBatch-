package com.syntax.replhw;

public abstract class Task173Abst {
    abstract void m1();
    void m2(){
        System.out.println("Parent class providing implementation");
    }
}
class Abc extends Task173Abst{

    @Override
    public void m1() {
        System.out.println("Child class providing implementation");
    }

    public static void main(String[] args) {
        Abc main=new Abc();
        main.m1();
        main.m2();
    }
}