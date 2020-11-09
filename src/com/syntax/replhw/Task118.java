package com.syntax.replhw;

public class Task118 {
    String censorLetter(String str, char b){
        String newString= str.replace(String.valueOf(b),"*");
        return newString;
    }
    public static void main(String[] args) {
        Task118 main=new Task118();
        String main1=main.censorLetter("computer science",'e');
        System.out.println(main1);
        String main2=main.censorLetter("trick or treat",'t');
        System.out.println(main2);

    }
}
