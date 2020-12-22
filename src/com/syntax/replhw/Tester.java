package com.syntax.replhw;

public class Tester {
    public static void main(String[] args) {

        Task149 obj=new Task149();
        obj.print();
        Task149 obj1=new Task149("Joe","Smith",12345,"01/01/1970",35000);
        obj1.print();

        System.out.println("=======================================================");

        Task148 dog=new Task148("Tarzan",50);
        dog.print();
        Task148 dog1=new Task148("Lucy",10);
        dog1.print();

        System.out.println("=======================================================");

        Task147 product=new Task147("Eggs",3,"Produce",true,10);
        product.display();
        Task147 product1=new Task147("Paper Towels",2,24);
        product1.display();
        Task147 product2=new Task147("Paper Towels",2);
        product2.display();

        System.out.println("=======================================================");

        Task146Car car=new Task146Car("Toyota","Prius",4,120,30000.0);
        car.print();
        Task146Car car1=new Task146Car("Toyota","Prius",120,30000.0);
        car1.print();
        Task146Car car2=new Task146Car(4,120,30000.0);
        car2.print();
        Task146Car car3=new Task146Car("Toyota","Prius",4);
        car3.print();
    }
    }




