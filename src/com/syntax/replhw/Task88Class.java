package com.syntax.replhw;

public class Task88Class {

    static class Main {
        String breed;
        String name;
        String color;

        void bark(){
            System.out.println(breed+" can bark");
        }
        void run(){
            System.out.println(breed+" can run");
        }
        void play(){
            System.out.println(breed+" can play");
        }
        public static void main(String[] args){
            Main obj1=new Main();
            Main obj2=new Main();
            Main obj3=new Main();

            obj1.breed="Husky";
            obj1.name="Fluffy";
            obj1.color="White";

            obj2.breed="Bulldog";
            obj2.name="Fluffy";
            obj2.color="White";

            obj3.breed="Labrador";
            obj3.name="Fluffy";
            obj3.color="White";

            obj1.bark();
            obj1.run();
            obj1.play();

            obj2.bark();
            obj2.run();
            obj2.play();

            obj3.bark();
            obj3.run();
            obj3.play();

        }

    }
}
