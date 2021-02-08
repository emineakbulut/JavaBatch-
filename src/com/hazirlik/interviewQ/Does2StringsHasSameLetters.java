package com.hazirlik.interviewQ;

public class Does2StringsHasSameLetters {

    /*
    Write a return method that check if a string is build out of the same letters as another string
    Ex: same( "abc", "cab");--true, same("abc", "abb"); -->false;

     */
    public static void main(String[] args) {
        String s1="bca";
        String s2= "bda";

        System.out.println(isSame(s1, s2));


    }

    static boolean isSame(String a, String b){
        boolean isSame= false;
        if(a.length()!=b.length()){
            isSame=false;
        }
        else {

            while(a.length()>0 || b.length()>0){
                String a_subStr= a.substring(0,1);
                if( b.contains(a_subStr)){
                    isSame=true;
                    b= b.replaceAll(a_subStr, "");
                    a= a.replaceAll(a_subStr, "");

                }
                else {
                    isSame=false;
                    break;
                }
            }}

        return isSame;
    }

}
