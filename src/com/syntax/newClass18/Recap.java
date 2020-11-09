package com.syntax.newClass18;

public class Recap {

    public String str(){
        return "test";
    }

    public static void main(String[] args) {

      Recap re= new Recap();
        String s = re.str().toUpperCase();
        System.out.println(s);

    }

}
