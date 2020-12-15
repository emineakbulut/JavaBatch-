package com.syntax.newClass33;

public class DownloadFile2 implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("starting the download2...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download successfully2");
    }
}
