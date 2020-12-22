package com.syntax.newClass32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {

    public static void main(String[] args) {
        Person jasoorObj=new Person("Jasoor",111,20);
        Person kimObj=new Person("Kin",222,22);
        Person qasimObj=new Person("Qasim",333,26);
        Person aigerhimObj=new Person("Aigerhim",444,16);
        Person burjuObj=new Person("Burju",555,50);

        Map<Integer,Person> peopleInUSA=new HashMap<>();//map is an interface

        peopleInUSA.put(111,jasoorObj);
        peopleInUSA.put(222,kimObj);
        peopleInUSA.put(333,qasimObj);
        peopleInUSA.put(444,aigerhimObj);
        peopleInUSA.put(555,burjuObj);

//value can be duplicated but keys can not be duplicated
        System.out.println(peopleInUSA.get(555).name);
        System.out.println(peopleInUSA);


        ArrayList<Person> personArrayList=new ArrayList<>();
        personArrayList.add(jasoorObj);
        personArrayList.add(kimObj);
        System.out.println(personArrayList);

    }
}
