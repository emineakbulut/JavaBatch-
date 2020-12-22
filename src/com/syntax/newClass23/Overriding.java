package com.syntax.newClass23;

class Bank {
    double bankBalance;
    public Bank(double bankBalance) {
        this.bankBalance = bankBalance;
    }
    void printTransferFee(){
        System.out.println("Transfer fee "+bankBalance*0.1);
    }
}
class BOA extends Bank{

    public BOA(double bankBalance) {
        super(bankBalance);
    }
}

class Chase extends Bank {

    public Chase(double bankBalance) {
        super(bankBalance);
    }

    void printTransferFee() {
        System.out.println("Transfer fee " + bankBalance * 0.01);
    }
}

public class Overriding {
    public static void main(String[] args) {
        Chase chase=new Chase(1000);
        chase.printTransferFee();
        BOA boa=new BOA(1000);
        boa.printTransferFee();
    }


}
