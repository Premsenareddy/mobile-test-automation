package com.appium.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class JsonUtil {

    private static Map<String, String> BAC_DATA = new HashMap<>();

    static {

        String environment = System.getProperty("environment");
        if (environment == null) {
            environment = "dev";
        }

        String filePath = System.getProperty("user.dir") + "/src/test/resources/testData/bacTestData_" + environment.toLowerCase() + ".json";

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {

            BAC_DATA = new ObjectMapper().readValue(fileInputStream, HashMap.class);

        } catch (IOException e) {
            e.printStackTrace();
            //System.exit(0);
        }
    }

    public static String getBacData(String key) {
        return BAC_DATA.get(key);
    }

    public static void setBacData(String key, String value) {
        BAC_DATA.put(key, value);
    }

}