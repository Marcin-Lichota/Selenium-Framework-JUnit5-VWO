package org.me.utilities;

import java.io.IOException;
import java.io.FileReader;
import java.util.Properties;



public class PropertyReader {
    public static Properties properties;
    public static String readItem(String propertyName) {
        try {
            FileReader reader = new FileReader("C:\\Users\\Ja\\IdeaProjects\\Selenium-JUnit5-VWO\\src\\main\\resources\\prod.config.properties");
            properties = new Properties();
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(propertyName);
    }

    }


