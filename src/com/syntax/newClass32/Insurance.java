package com.syntax.newClass32;

public abstract class Insurance {

    /*Create a class Insurance that will have an attribute as
    insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health.
    Car class has it's own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class. */

    String insuranceName;

    Insurance(String insuranceName) {
        this.insuranceName=insuranceName;
    }

    abstract void getQuote();
    abstract void cancelInsurance();
}
class Pet extends Insurance {
    String petType;
    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }
    @Override
    void getQuote() {
        System.out.println("Congrats! Your " + petType + " has now " + insuranceName + " insurance!");
    }
    @Override
    void cancelInsurance() {
        System.out.println("Your " + insuranceName + " insurance for " + petType + " is canceled");
    }
}
class Car extends Insurance {
    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }
    @Override
    void getQuote() {
        System.out.println(insuranceName + " for " + carModel + " is approved!!");
    }
    @Override
    void cancelInsurance() {
        System.out.println("Your " + insuranceName + " insurance for " + carModel + " is canceled");
    }
}
class Health extends Insurance {
    Health(String insuranceName) {
        super(insuranceName);
    }
    @Override
    void getQuote() {
        System.out.println(insuranceName + " can offer you follow health insurance. Health insurance depends of your annual income");
    }
    @Override
    void cancelInsurance() {
        System.out.println("You can cancel your insurance any time");
    }
}