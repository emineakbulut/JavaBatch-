package com.hazirlik.interviewQ;

import java.util.LinkedHashSet;

public class DuplicateString {

    /*
write a method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC")==> ABC
*/
    public static void removeDuplicates(String str){
        LinkedHashSet <Character>ls=new LinkedHashSet();
        for(int i=0;i<str.length();i++){
            ls.add(str.charAt(i));
        }
        for (Character c:ls) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        removeDuplicates("Hello Mello");
    }

}
