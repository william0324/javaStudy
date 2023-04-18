package com.iteator.map;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("a","b");
        properties.setProperty("1","2");
        properties.setProperty("3","5");
        properties.setProperty("4","6");
        System.out.println(properties.getProperty("a"));
    }
}
