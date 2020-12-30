package com.syntax.newClass37;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

    public static void main(String[] args)  {

        Exception exception =new Exception();//exceptions are objects,and objects are defined using classes
        String path="C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaBatch8\\src\\com\\syntax\\class37\\Book1.xlsx";
        File file=new File(path);
        if(file.exists()){

            try {
                FileInputStream fileInputStream=new FileInputStream(path);// it is not in our control even
                // if we write hundreds of if condition we are not sure java will force you to write try catch
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }else {
            System.out.println("File not found");
        }

        System.out.println("code after ");

        String name=null;
        if(name!=null){
            name.length();
        }

        int[] arr=new int[-1];//non-checked exceptions bc if we write the code in proper way we can avoid this
                             //java doesnt force us to use try catch block bc it is up to the coder
        int index=12;
        if(index>=0 && index<arr.length){
            System.out.println(arr[index]);
        }else {
            System.out.println("Please provide correct index");
        }



    }
}
