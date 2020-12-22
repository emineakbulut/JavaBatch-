package com.syntax.replhw;

public class Task142Letters {
    /*    Purpose:
Return a string that is composed of each letter as long as
the letter is later on in the alphabet
than its previous one.You can assume actual parameters are lowercase.
See below examples.Additional Info:
You can use < and > to compare characters (not Strings),
where characters later on in the alphabet are "greater".  Examples:
'a' < 'b' ==> True
'a' < 'a' ==> False
'a' > 'b' ==> False
Examples:
alphabetical("hello") ==> "hlo"
alphabetical("software") ==> "stwr"
alphabetical("language") ==> "lnug"
Expected Output:
hlo
stwr
lnug
     */
    public static String alphabetical(String str) {
        char previous = str.charAt(0);
        char current;
        String newString = "" + previous;
        for (int i = 1; i < str.length(); i++) {
            current = str.charAt(i);
            if (current > previous) {
                newString += str.charAt(i);
            }
            previous = current;
        }
        return newString;
    }

    //==========================================================================
//        StringBuilder strBldr= new StringBuilder(str);
//        for (int i = 0; i <(strBldr.length()-1) ; i++) {
//            if( (strBldr.charAt(i))< (strBldr.charAt(i+1))){
//                strBldr= strBldr.deleteCharAt(i);
//            }
//            else{
//                strBldr= strBldr.deleteCharAt(i+1);
//            }
//        }
//        return strBldr.toString();
//
//=======================================================================
//            String alphabetical = str.replaceAll("(.).", "$1");
//            return alphabetical;
//        }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}
