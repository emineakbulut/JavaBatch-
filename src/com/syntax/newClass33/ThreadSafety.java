package com.syntax.newClass33;
public class ThreadSafety {

    public static void main(String[] args) {

       /* downloadFile();
        downloadFile2();  sequential
        System.out.println("Task completed");*/

        Thread thread1=new Thread(new DownloadFile1());  //3sec
        Thread thread2=new Thread(new DownloadFile2());  //5sec
        thread1.start();
        thread2.start();
        System.out.println("Task completed");


    }
    public static void downloadFile(){
        try {
            System.out.println("starting the download...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download successfully");
    }

    public static void downloadFile2(){
        try {
            System.out.println("starting the download...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download successfully");
    }
}