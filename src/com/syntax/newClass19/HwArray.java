package com.syntax.newClass19;

public class HwArray {
    /*
    Create a method that will accept an array as parameters and
    will return a sum of all elements from that array.
    Method should be visibly only within same package and
    accessible by the creating an instance of the class.
     */

    /*double sumArray(double [] array){
        double sum=0;
        for (double v : array) {//enhanced by intellij
            sum = sum + v;
        }
        return sum;
    }*/
    double sumArray(double[] array){// before intellj enhanced the for loop
        double sum=0;
        for (int i=0; i<array.length-1; i++){
            sum=sum+array[i];
        }
        return sum;
    }


}
