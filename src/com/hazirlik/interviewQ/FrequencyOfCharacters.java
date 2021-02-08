package com.hazirlik.interviewQ;

public class FrequencyOfCharacters {

    /* write a method that can find the frequency of charachters
  ex: FrequencyOfChars("AABBBCCCC")= A2B3C4
   */
    static final int SIZE= 26;

    public static void findFrequency(String s) {

        int[] frequency = new int[SIZE];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 0) {
                continue;

            }else{
                System.out.print(s.charAt(i) + "" + frequency[s.charAt(i) - 'a']);
                frequency[s.charAt(i) - 'a'] = 0;
            }
        }
    }

    public static void main(String[] args) {

        findFrequency("syntaxtechnologies");

    }

}
/*
String sentence="RuchanKaya";
        String frequency= frequencyOfChars(sentence);
        System.out.println(frequency);
​
    }
    static String frequencyOfChars(String sentence){
        String result="";
        int counter=0;
​
        for (int i = 0; i <sentence.length() ; i++) {
            String letter= ""+sentence.charAt(i);
​
            while( sentence.contains(letter)){
                sentence= sentence.replaceFirst(letter, "");
                counter++;
            }
            result+= letter+counter;
            counter=0;
        }
​
        return result;
    }
​

 */
