package com.cydeo.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //declare Properties object at class level so it can be accessible in static method

    public static Properties properties = new Properties();

    // we want to only load file once, so we can use static block

    static {

        try {
            FileInputStream in = new FileInputStream("Config.Properties");
            properties.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    /**
     * Get the value of key according to the key provided
     * @param key the key you want to get the value from
     * @return the value of the key
     */
    public static String read(String  key){
        return properties.getProperty(key) ;
    }
}
