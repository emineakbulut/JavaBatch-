package Review.class20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\Review\\class20\\Test.properties";
        FileInputStream fileInputStream = new FileInputStream(path);

        Properties properties=new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("Username"));
        System.out.println(properties.getProperty("Pass"));
        properties.setProperty("Pass","pas123");
        fileInputStream.close();
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream,"changed the password");


        }
    }



