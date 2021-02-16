package com.hazirlik.interviewQ;

public class DivisionWithoutDivider {

     /*
divide 2 numbers without using a division operator
*/

   public void divideNumbers(int num1, int num2) {

       int result = 0;

       //ruling out /0
       if (num2 == 0) {
           throw new ArithmeticException("Cannot divide by zero");
       }

        // defining the positivity and negativity of the number
        int sign = 1;
        if (num1 * num2 < 0) {
            sign = sign * (-1);
        }
        if (num1 < 0) {
            num1 = num1 * (-1);
        }
        if (num2 < 0) {
            num2 = num2 * (-1);
        }

      //dividing the numbers
      while (num1 >= num2) {
          num1 = num1 - num2;
          result++;

      }


        System.out.println("Remainder is: " + num1);
        System.out.println("Result is: " + (sign * result));
    }


    public static void main(String[] args) {
        DivisionWithoutDivider d = new DivisionWithoutDivider();
        //calling the method
        d.divideNumbers(-30, 6);


    }

}
