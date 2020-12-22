package com.syntax.newClass32;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {

    public static void main(String[] args) {
        Person jasoorObj=new Person("Jasoor",111,20);
        Person kimObj=new Person("Kin",222,22);
        Person qasimObj=new Person("Qasim",333,26);
        Person aigerhimObj=new Person("Aigerhim",444,16);
        Person burjuObj=new Person("Burju",555,50);

        Map<Integer,Person> peopleInUSA=new HashMap<>();
        Map<Integer,Person> peopleInPAK=new HashMap<>();

        peopleInUSA.put(111,jasoorObj);
        peopleInUSA.put(222,kimObj);
        peopleInUSA.put(333,qasimObj);
        peopleInUSA.put(444,aigerhimObj);
        peopleInUSA.put(555,burjuObj);

        peopleInPAK.put(777,new Person("Sabeen",777,20));
        peopleInPAK.put(888,new Person("Asghar",888,26));

        Map<Integer,Person> peopleInWorld=new HashMap<>();

        peopleInWorld.putAll(peopleInPAK);
        peopleInWorld.putAll(peopleInUSA);
        System.out.println(peopleInWorld);







    }
}