package org.example.stepDefs;

import java.io.*;

import java.util.Properties;

public class configReader {
    public static void set(String key,String value) throws IOException {
        FileInputStream fis = new FileInputStream("config.properties");
        Properties properties =new Properties();
        properties.load(fis);
        properties.setProperty(key,value);
        fis.close();
        FileOutputStream fos = new FileOutputStream("config.properties");
        properties.store(fos,"here");

    }
    public static String get (String key) throws IOException {
        FileInputStream fis = new FileInputStream("config.properties");
        Properties properties =new Properties();
        properties.load(fis);
        fis.close();
        return properties.getProperty(key);

    }
}
