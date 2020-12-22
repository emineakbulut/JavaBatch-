package com.syntax.newClass21;

public class ParentOfDavit extends GrandPaOfDavit {
    ParentOfDavit(){
        System.out.println("Constructor from Parent");

    }

    ParentOfDavit(int money){
        super(money);
    }

}
