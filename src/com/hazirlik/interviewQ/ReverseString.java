package com.hazirlik.interviewQ;

import java.util.Scanner;

public class ReverseString {

    /*write a method that can reverse a string
ex: "ABCD"--> "DCBA"
 */
        public String reversed(String s){
            String reverse="";
            for(int i=s.length()-1;i>=0;i--){
                reverse=reverse+s.charAt(i);
            }
            return reverse;
        }

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            ReverseString reverseString=new ReverseString();
            System.out.println("Enter the word");
            String string= reverseString.reversed(scan.nextLine());
            System.out.println(string);

        }
    }
    /*
    String a= "ABCD";
        String b= reverse(a);
        System.out.println(b);
    }
​
   static String reverse(String a){
        String a_new="";
        for (int i=a.length()-1; i>=0; i--){
            a_new+= a.charAt(i);
        }
        System.out.println(a_new);
        return a_new;
    }

     */
