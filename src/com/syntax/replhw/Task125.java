package com.syntax.replhw;

public class Task125 {

    String country;
    String capital;
    int popSize;

     void values(String country1, String capital1,float popSize1){
         country1=country;
         capital1=capital;
         popSize1=popSize;

    }

    public static void main(String[] args) {
        Task125 main1=new Task125();
        Task125 main2=new Task125();

        main1.country="USA";
        main1.capital="Washington DC";
        main1.popSize=330000000;

        main2.country="Kazakhstan";
        main2.capital="Astana";
        main2.popSize=18500000;

        System.out.println("The capital of "+main1.country+" is "+main1.capital+" and population is "+main1.popSize);
        



    }
}
