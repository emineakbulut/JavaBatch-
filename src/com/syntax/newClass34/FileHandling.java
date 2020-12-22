package com.syntax.newClass34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileHandling {

    public static void main(String[] args) throws IOException {

       //Storing the path of the file in a String variable
        String path="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass34\\Credentials.properties";
        String path2="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass34\\Credentials1.properties";

        //creating a connection to file
        FileInputStream fileInputStream=new FileInputStream(path);
        FileOutputStream fileOutputStream=new FileOutputStream(path2);

        Properties properties=new Properties();
        //Loading the data from file to java program
        properties.load(fileInputStream);

        //getting the values
        String username= properties.getProperty("username");
        String pass=  properties.getProperty("password");
        int number=Integer.parseInt(properties.getProperty("phoneNumber"));
        System.out.println(number);

        properties.setProperty("phoneNumber","111111");
        properties.store(fileOutputStream,"Change number");


        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver( );
        driver.get ( "https://www.facebook.com/" );
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(pass);



    }
}
