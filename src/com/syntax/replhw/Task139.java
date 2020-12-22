package com.syntax.replhw;

public class Task139 {
    /*
    For you to do:
Please create methods with different access modifiers (one for each access modifier)
and call them properly in main method one by one
In each method write the logic accordingly like for private method
write the logic in the println Statement as
"This is Private Method" accordingly for rest of the methods that have different
access modifiers should be a total of 4 outputs,
please make sure they are in the same order that is printed below.

Expected Output:
This is Private Method
This is Default Method
This is Protected Method
This is Public Method
     */

    private void method(){
        System.out.println("This is Private Method");
    }
    void method1(){
        System.out.println("This is Default Method");
    }
    void method2(){
        System.out.println("This is Protected Method");
    }
    public void method3(){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        Task139 main=new Task139();
        main.method();
        main.method1();
        main.method2();
        main.method3();
    }
}
