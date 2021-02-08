package com.hazirlik.interviewQ;

public class RemoveDuplicates {

    /*
    write a method that can remove the duplicated values from String
    Ex: removeDup("AAABBBCCC")==> ABC
     */
    public static void main(String[] args) {
        System.out.println(removeDup("AABBCC"));

    }
    //removing with for loop
    static String removeDup(String sentence){
        String result="";
        while ( sentence.length()>0) {
            String subStr=sentence.substring(0,1);
            if(!result.contains(subStr)){

                result+= subStr;
                sentence= sentence.replaceAll(subStr,"");
            }
        }
        return result;
    }



}
