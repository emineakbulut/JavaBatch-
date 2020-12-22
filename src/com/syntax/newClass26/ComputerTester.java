package com.syntax.newClass26;

public class   ComputerTester {

    public static void main(String[] args) {
        Computer[] allComputersInSingleVar= {new Apple("Apple")
                ,new Lenovo("Lenovo"),
                new HP("Brand")};
        for ( Computer computer:allComputersInSingleVar
        ) {
            computer.run();
            computer.storage();
            computer.transfer();

        }

        Lenovo lenovo=new Lenovo("Lenovo");
        lenovo.tabletMode();

    }
}
