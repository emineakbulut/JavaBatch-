package com.hazirlik.interviewQ;

public class LongestWord {

    /*
Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
If there are two or more words that are the same length, return the first word from the string with that length.
 Ignore punctuation and assume sen will not be empty.
 Input: "fun&!! time"
Output: time
Input: "I love dogs"
Output: love
 */
    public String returnLongestWord(String str){
        String [] eachWord=str.split(" ");
        String largestWord="";
        for(int i=0;i<eachWord.length;i++){
            if(eachWord[i].length()>largestWord.length()){
                largestWord=eachWord[i];
            }
        }

        return largestWord;
    }

    public static void main(String[] args) {
        LongestWord l=new LongestWord();
        System.out.println(l.returnLongestWord("Hello Happiest People"));  ;
    }
}
/*
// keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
//        String s="I love%!& dogs";
​
    }
​
​
    public static String LongestWord(String sen) {
        // code goes here
        int count=0;
        String longest="";
        //divide the sentence
        String[] splitSen= sen.split("\\s+");
​
        //trim -get rid of the extra charachters using regex
        // find the longest word
​
        for (int i = 0; i < splitSen.length; i++) {
            splitSen [i] = splitSen [i].replaceAll("[^\\w]", "");
            if(splitSen[i].length()>count){
                count= splitSen[i].length();
                longest= splitSen[i];
            }
        }
​
​
​
        return longest;
    }
​
​
    //input.split("[\\s@&.?$+-]+");

 */
