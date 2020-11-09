package com.syntax.newClass14;

public class ConcatMethod {

    public static void main(String[] args) {
        String firstName="Ebrar";
        String lastName=" Gur";
        String name=" Burju Kaya";
        String name2=null;
        System.out.println(firstName+lastName+name2);
        String completeName=firstName.concat(name2);
        System.out.println(completeName);


    }

}
