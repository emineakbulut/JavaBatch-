package com.syntax.replhw;

public class Task121 {
    public String spaceOut(String s){

        String newS=s.replace(""," ");
        return newS;
    }

    public static void main(String[] args) {
        Task121 mini=new Task121();
        System.out.println(mini.spaceOut("hello"));
    }

}
