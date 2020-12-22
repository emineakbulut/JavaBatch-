package com.syntax.newClass32;

import java.util.LinkedList;

public class CreditCardTester {
    public static void main(String[] args) {
        ABCBank abcBank=new ABCBank("credit", 12000);
        XYZBank xyzBank=new XYZBank("debit", "2022/10");
        JPBank jpBank=new JPBank("debit", "small");

        LinkedList<CreditCard> list=new LinkedList<>();
        list.add(abcBank);
        list.add(xyzBank);
        list.add(jpBank);

        for (CreditCard element:list){
            element.colorOfCard();
            element.typeOfCard();

        }
        abcBank.limit();
        xyzBank.expirationDate();
        jpBank.size();
    }
}
