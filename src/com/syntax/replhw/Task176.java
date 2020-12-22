package com.syntax.replhw;

public interface Task176 {
    void method1();
    void method2();
}
class Ccc implements Task176{

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    public static void main(String[] args) {
        Ccc ccc=new Ccc();
        ccc.method1();
        ccc.method2();
    }
}