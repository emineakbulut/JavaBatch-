package com.syntax.replhw;
/*
Create a method hello() in parent class that will print "method in Parent class" then override  that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"

In Main Class create 3 object of the child classes and store in into an array and call method hello():

Expected Output:
method in Child1 class
method in Child2 class
method in Child3 class
 */

public class Task168 {
    public static void main(String[] args) {

        Ch1 c1 =new Ch1();
        Ch2 c2=new Ch2();
        Ch3 c3=new Ch3();
        Task168 [] arr={c1,c2,c3};



    }
    void hello(){
        System.out.println("method in Parent class");
    }
}
class Ch1 extends Task168{
    void hello(){
        System.out.println("method in Child1 class");
    }

}
class Ch2 extends Task168{
    void hello(){
        System.out.println("method in Child2 class");
    }
}
class Ch3 extends Task168{
    void hello(){
        System.out.println("method in Child3 class");
    }
}


