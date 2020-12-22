package com.syntax.newClass29;

public class PersonTester {
    public static void main(String[] args) {
        Person davitObj=new Person("Davit","123456789",25,30000);
        Person mikeObj=new Person("Mike","4556455645",30,750);
        Person daniloObj=new Person("Danilo","458695665",30,2000);

        /*System.out.println(davitObj.taxPaid);
        davitObj.taxPaid=0;  //CE cannot access and modify data
        System.out.println(davitObj.taxPaid);*/
        davitObj.setTaxPaid("45641351",-1);
        davitObj.setTaxPaid("123456789",-1);
        System.out.println(davitObj.getTaxPaid("45641351"));
        System.out.println(davitObj.getTaxPaid("123456789"));

        //Mike

        System.out.println(mikeObj.getTaxPaid("123456789"));


        System.out.println(daniloObj.getTaxPaid("123456789"));





    }
}
