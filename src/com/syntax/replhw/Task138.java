package com.syntax.replhw;

public class Task138 {
    /*
    Write a method with the following specs:
Returns:
a String
Name:
surround
Parameters:
a String called s
a String called search_term
Then complete the method by programming the following behavior
Return a new String built from s that has every instance of the search term surrounded by parentheses
See below examples.
Examples:
surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
surround("technology",'o') ==> "techn(o)l(o)gy"
     */
//    static String surround(String s,char search_term){
//        StringBuilder stringBuilder=new StringBuilder(s);
//        for(int i=0; i<s.length();i++){
//           if (s.charAt(i)==search_term){
//
//                stringBuilder.insert(s.indexOf(search_term),'(');
//                s=stringBuilder.insert(s.indexOf(search_term)+2,')').toString();
//                System.out.println(stringBuilder.toString());
//                break;
//            }
//    }
//        return surround(s,search_term);
    //}


    static String surround (String s, String search_term){

        return s.replace(search_term, "("+search_term+")");
    }

//     YA DA
//    private static String surround(String s, String search_term)
//    {
//        String replaceItem= ("(" + search_term + ")");
//
//        String newS= s.replaceAll(search_term, replaceItem);
//
//        return newS;
    //test case below (dont change):
        public static void main(String[] args){
            System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
            System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
        }
}
