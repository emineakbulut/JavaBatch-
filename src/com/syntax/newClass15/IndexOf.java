package com.syntax.newClass15;

public class IndexOf {
    public static void main(String[] args) {

        String name="Muhammed";//M is capital so ignored
        System.out.println(name.indexOf('m'));//on which index 'm' is present--> 4
        System.out.println(name.indexOf('d'));
        System.out.println(name.indexOf('z'));//z is not in the word so it will give -1

    }
}
