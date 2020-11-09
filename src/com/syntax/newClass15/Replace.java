package com.syntax.newClass15;

public class Replace {
    public static void main(String[] args) {

        String mix = "3213Hello 89 World354545 *&***^&*^&*";
        System.out.println(mix.replaceAll("[0-9]", ""));//0-9 is a range.if you write 0-8,9 will be ignored
        System.out.println(mix.replaceAll("[a-z]", ""));
        System.out.println(mix.replaceAll("[a-z A-Z]", ""));
        System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));
        System.out.println(mix.replaceAll("\\s+", ""));//for removing spaces
    }
    }


