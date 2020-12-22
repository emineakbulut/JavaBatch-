package com.syntax.newClass32;

public abstract class CreditCard {
    String creditCardType;
    CreditCard(String creditCardType){
        this.creditCardType=creditCardType;
    }
    abstract void colorOfCard();
    abstract void typeOfCard();
    public void welcome(){
        System.out.println("Welcome to "+creditCardType);
    }
}
class ABCBank extends CreditCard{
    int cardLimit;
    ABCBank(String creditCardType, int cardLimit){
        super(creditCardType);
        this.cardLimit=cardLimit;
    }
    @Override
    void colorOfCard() {
        System.out.println("The color of the ABCBank credit card is green");
    }
    @Override
    void typeOfCard() {
        System.out.println("The type of the ABCBank credit card is "+creditCardType);
    }
    void limit(){
        System.out.println("The limit on the ABCBank card is "+cardLimit);
    }
}
class XYZBank extends CreditCard {
    String expiration;
    XYZBank(String creditCardType, String expiration){
        super(creditCardType);
        this.expiration=expiration;
    }
    @Override
    void colorOfCard() {
        System.out.println("The color of the XYZ credit card is blue");
    }
    @Override
    void typeOfCard() {
        System.out.println("The type of the XYZ credit card is "+creditCardType);
    }
    void expirationDate(){
        System.out.println("Expiration date of the XYZ card is "+expiration);
    }
}
class JPBank extends CreditCard {
    String sizeOfTheCard;
    JPBank(String creditCardType, String sizeOfTheCard){
        super(creditCardType);
        this.sizeOfTheCard=sizeOfTheCard;
    }
    @Override
    void colorOfCard() {
        System.out.println("The color of the JPB credit card is yellow");
    }
    @Override
    void typeOfCard() {
        System.out.println("The type of the JPB credit card is "+creditCardType);
    }
    void size(){
        System.out.println("The size of the JPB credit card is "+sizeOfTheCard);
    }
}
