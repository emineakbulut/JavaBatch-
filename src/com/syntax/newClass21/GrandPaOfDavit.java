package com.syntax.newClass21;

public class GrandPaOfDavit {
    int money;
    GrandPaOfDavit(){
        System.out.println("Constructor from GrandParents");
    }

    GrandPaOfDavit(int money){
        this.money=money;
        System.out.println("Constructor from GrandParents to initialize money");

    }
    void print(){
        System.out.println("i have this money "+money);
    }
}
