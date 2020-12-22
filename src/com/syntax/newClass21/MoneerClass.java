package com.syntax.newClass21;

public class MoneerClass extends ParentClass {

    int money;

    MoneerClass(int money) {
        super(money);

    }


    void marry() {
        super.marry();
        System.out.println("i will marry katrina ok go mary her here is the money " + super.money);
    }


    public static void main(String[] args) {
        MoneerClass moneerClass = new MoneerClass(1000);
        moneerClass.marry();
    }
}
