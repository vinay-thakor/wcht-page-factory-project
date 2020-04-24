package com.wcht.loadproperty;/*
 *Vinay Creation
 *Date of Creation
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Loadproperty {
    //Project path
    String projectPath = System.getProperty("user.dir");
    //Creating object
    static Properties prop;
    static FileInputStream input;
    // parameter given as "sting Key " to assign value of key from
    public String getProperty(String key) {
        //initializze the object
         prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "/src/test/java/com/wcht/resources/properties/config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
