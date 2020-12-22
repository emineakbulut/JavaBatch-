package com.syntax.newClass28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Work\\Desktop\\New folder\\chromedriver.exe");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("http://www.google.com");
    }

}
