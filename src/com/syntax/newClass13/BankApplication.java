package com.syntax.newClass13;

public class BankApplication {
    public static void main(String[] args) {

        Account burjusAccount=new Account();
        burjusAccount.accountId="123";
        burjusAccount.userName="Burju";
        burjusAccount.password="pass123";
        burjusAccount.balance=1000000;
        burjusAccount.typeOfAccount="checking";
        burjusAccount.limit=125;

        boolean isLoggedIn=burjusAccount.login("abc123","abfjad");
        System.out.println(isLoggedIn);
        Account eliassAcount=new Account();
        eliassAcount.accountId="125";
        eliassAcount.userName="Elias";
        eliassAcount.password="pass123";
        eliassAcount.balance=15000;
        eliassAcount.typeOfAccount="saving";
        eliassAcount.limit=100;



    }
}
