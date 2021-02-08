package com.hazirlik.interviewQ;

public class QuestionMarks {
    /*Have the function QuestionsMarks(str) take the str string parameter,
    which will contain single digit numbers, letters, and question marks,
    and check if there are exactly 3 question marks between every pair of two numbers that add up to 10.
    If so, then your program should return the string true, otherwise it should return the string false.
    If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
    For example: if str is "arrb6???4xxbl5???eee5" then your program should return true
    because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.

       public static boolean QuestionsMarks(String str){
    str = str.replaceAll("[a-zA-Z]","");
    String [] arr = str.split("[?][?][?]");
    int num1 = 0;
    int num2 = 0;
    for (int i = 0; i < arr.length-1; i++){
        String temp1 = String.valueOf(arr[i].charAt(arr[i].length()-1));
        String temp2 = String.valueOf(arr[i+1].charAt(0));
        try{
            num1 = Integer.parseInt(temp1);
            num2 = Integer.parseInt(temp2);
            if(num1+num2 == 10)
                return true;
        } catch (Exception e){ continue; }
    }
return false;
}
//
private static boolean questionMarks(String str) {
        StringBuilder builder = new StringBuilder(str.replaceAll("([^1-9?])", ""));
        int setOne;
        boolean flag = true;
        int counter = 0;
        while (flag) {
            flag = false;
            setOne = builder.indexOf("?");
            if (builder.charAt(setOne + 1) == '?' &&
                    builder.charAt(setOne + 2) == '?'
                    && setOne > 0 && builder.charAt(setOne + 3) != '?') {
                int count = (((Integer.parseInt(String.valueOf(builder.charAt(setOne - 1)))) +
                        (Integer.parseInt(String.valueOf(builder.charAt(setOne + 3))))) == 10) ? counter++ : counter;
                builder.replace(0, setOne + 2, "");
            } else {
                try {
                    builder.deleteCharAt(setOne);
                } catch (StringIndexOutOfBoundsException ignored) {
                    break;
                }
            }
            flag = true;
        }
        return counter > 0 && counter % 2 == 0;
    }


    public static void main(String[] args) {
        System.out.println(questionMarks("arrb6???4x?xbl5???eee5")); // true
        System.out.println(questionMarks("5gasd?rrf5"));  //false
        System.out.println(questionMarks("acc?7??sss?3r???r7??????5")); //true
        System.out.println(questionMarks("9???1???9??1???9")); //false
        System.out.println(questionMarks("4?5?4?aamm9")); //false
        System.out.println(questionMarks("5??aaaaaaaaaaaaaaaaaaa?5?5")); //false


    }
}            */

    public static boolean questionMarks(String str) {

        String noQuestionMarks = str.replaceAll("\\?\\?\\?", " ");
        String[] splitStr = noQuestionMarks.split(" ");
        boolean equalsTen = false;
        int[] numbersInString = new int[splitStr.length];
        int sum = 0;

        //figure out how to have sum for only i + (i + 1)


        for (int i = 0; i < numbersInString.length; i++) {
            String stringNoLetters = splitStr[i].replaceAll("\\D+", "");
            numbersInString[i] = Integer.parseInt(stringNoLetters);
            System.out.println(stringNoLetters);

            if (!stringNoLetters.contains("?")) {
                sum += numbersInString[i];

                if (sum == 10) {
                    equalsTen = true;
                }
            }

        }

        return equalsTen;
    }

    public static void main(String[] args) {

        System.out.println(questionMarks("asdf4???5gasd???rrf5"));

    }
}

