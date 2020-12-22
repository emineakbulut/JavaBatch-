package com.syntax.newClass29;

public class Person {
    private String name;
    private String ssn;
    private int age;
    private double taxPaid;

    public Person(String name, String ssn, int age, double taxPaid) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
        this.taxPaid = taxPaid;
    }

    public void setTaxPaid(String ssn, double taxPaid) {
        if (this.ssn.equals(ssn)) {
            if (taxPaid > 0) {
                this.taxPaid = taxPaid;
            } else {
                System.out.println("Cannot be Negative");
            }

        } else {
            System.out.println("Wrong ssn");
        }

    }

    double getTaxPaid(String ssn){
        if(this.ssn.equals(ssn)){
            return taxPaid;
        }else {
            return   -1;
        }

    }

}
