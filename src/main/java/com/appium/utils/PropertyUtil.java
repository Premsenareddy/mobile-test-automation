package com.appium.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PropertyUtil {

    private static final Properties properties = new Properties();
    private static Map<String, String> PROPERTIES = new HashMap<>();

    static {

        String environment = System.getProperty("environment");
        if (environment == null) {
            environment= "dev";
        }

        String platform = System.getProperty("platform");
        if (platform == null) {
            platform= "Android";
        }

        String filePath = System.getProperty("user.dir") + "/src/test/resources/properties/config_" + environment.toLowerCase() +".properties";

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {

            properties.load(fileInputStream);
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                String key = String.valueOf(entry.getKey());
                String value = String.valueOf(entry.getValue());
                PROPERTIES.put(key, value);
            }

            PROPERTIES.put("platform", platform);

            PROPERTIES.put("environment", environment);

        }

        catch (IOException e) {
            e.printStackTrace();
            //System.exit(0);
        }
    }

    public static String getValue(String key) {
        return PROPERTIES.get(key);
    }

}