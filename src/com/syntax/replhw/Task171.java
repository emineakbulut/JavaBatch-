package com.syntax.replhw;

public class Task171 {
    static boolean isTrue;
    static String value;
    final void method(boolean isTrue){
        isTrue=true;
        System.out.println("Final method with boolean parameter");
    }
    final void method(String value){
        Task171.value =value;
        System.out.println("Final method with String parameter");
    }


    public static void main(String[] args) {
    Task171 task=new Task171();
    task.method(isTrue);
    task.method("value");


    }
}
