package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SmartBearUtils {
    public static Properties properties=new Properties();

    static {
        //We need open the file in java memory:FileInputStream
        try {
            FileInputStream file=new FileInputStream("com/cydeo/utilities/SmartBearUtils.java");
            //Load the properties object using FileInputStream object
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
/*
Mini-Task: CREATE A CLASS à SmartBearUtils
• Create a method called loginToSmartBear
• This method simply logs in to SmartBear when you call it.
• Accepts WebDriver type as parameter
 */