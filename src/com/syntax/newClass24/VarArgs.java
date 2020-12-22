package com.syntax.newClass24;

public class VarArgs {

    void print(int ...array){ //similar to arrays, if you don't know how many Parameters
//VarArgs allow you to pass as many parameters as you can,gives flexibility to the user

        for ( int numberInArray:array
        ) {
            System.out.println(numberInArray);
        }
    }

    public static void main(String[] args) {
        VarArgs varArgs=new VarArgs();
        varArgs.print(1);
        varArgs.print(1,2);
        varArgs.print(1,50,98);
    }
}
