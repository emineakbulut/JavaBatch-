package com.syntax.replhw;

public class Task169 {
    public static void main(String[] args) {
        Cat cat=new Cat("Cat");
        cat.eat();
        cat.sleep();
        kitten1 k1=new kitten1("kitten1");
        kitten2 k2=new kitten2("kitten2");
        kitten3 k3=new kitten3("kitten3");
        Cat[] arr={k1,k2,k3};
        arr[0].eat();
        arr[0].sleep();
        arr[1].eat();
        arr[1].sleep();
        arr[2].eat();
        arr[2].sleep();

    }
}
class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
    void eat(){
        System.out.println("Animals eat");
    }
    void sleep(){
        System.out.println("Animals sleep");
    }
}
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    void eat(){
        System.out.println(name+" eats");
    }
    void sleep(){
        System.out.println(name+" sleeps a lot");
    }

}
class kitten1 extends Cat{
    kitten1(String name) {
        super(name);
    }

    void eat(){
        System.out.println(name+" eats milk");
    }
    void sleep(){
        System.out.println(name+" sleeps a lot");
    }
}
class kitten2 extends Cat{

    kitten2(String name) {
        super(name);
    }
    void eat(){
        System.out.println(name+" eats snack");
    }
    void sleep(){
        System.out.println(name+" sleeps a lot");
    }
}
class kitten3 extends Cat{

    kitten3(String name) {
        super(name);
    }
    void eat(){
        System.out.println(name+" eats everything");
    }
    void sleep(){
        System.out.println(name+" sleeps a lot");
    }

}