package com.syntax.newClass37;

public class ExceptionDemo {
    public static void main(String[] args) {

        int[] arr = {0};
        try {
            System.out.println("important code ");
            System.out.println(10/0);
            doCalculations(arr);
            System.out.println("more Important");
        }
        catch (NullPointerException npe) {
            System.out.println("Please don't provide null array");
        } catch (ArithmeticException ae) {
            System.out.println("Please do not try to divide by zero");
        } catch (ArrayIndexOutOfBoundsException aib){
            System.out.println("Please use the proper index");
        } catch (Exception e) {//this is the parent class. if you dont know the specific exception type you can write
            System.out.println("Something went wrong");
        }
    }
    public static void doCalculations(int[] arr) {
        System.out.println(arr[2] / arr[3]);
        int[] arry = new int[-1];
    }
}
