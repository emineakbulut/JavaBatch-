package com.syntax.replhw;

public class Task151 {
    /*
    In ShoppingStore class:
Create variables as below.
item,
price,
quantity
Create a constructor to initialize instance variables.
Create a method with name itemTotalPrice.
write a logic to to calculate the total values of items in stock. and print the result.
return the total value.
In Main Class.
Create two Object of ShoppingStore and pass the parameters to Constructor.
then using each object call the method itemTotalPrice.
Store the returned value of each object.
Calculate sum of both object and print the result.
Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
     */
     String item;
     double price;
     int quantity;

    Task151(String item,double price,int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }

     double itemTotalPrice(){
        double total=0;
        total= price*quantity;
     //   System.out.println(item+" Total Value "+total);
        return total;
    }

    public static void main(String[] args) {

        Task151 item1=new Task151("Blanket",99.98,1);
        double item1Total = item1.itemTotalPrice();
        Task151 item2=new Task151("Mattress",439.18,1);
        double item2Total=item2.itemTotalPrice();

        System.out.println(item1.item+" Total Value "+item1Total);
        System.out.println(item2.item+" Total Value "+item2Total);
        System.out.println("You purchased "+(item1Total+item2Total)+" Today");

    }
    }
