package com.syntax.replhw;
/*
For you to do:
Create class A
declare variable int i=10;
Create class B  extends A
declare variable int i=20;
create a method to display value of variable i from both classes
In Main Class create an object of subclass and call method display
Expected Output:
20
10
 */

public class Task159 {

        int i=10;
    static class B extends Task159{
        int i=20;
        void print() {

            this.i=i;
            System.out.println(i);
            System.out.println(super.i);
        }
    }

    public static void main(String[] args) {
        B b=new B();
        b.print();

    }
}
