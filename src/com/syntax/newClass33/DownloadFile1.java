package com.syntax.newClass33;
public class DownloadFile1 implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("starting the download...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download successfully");
    }
}
