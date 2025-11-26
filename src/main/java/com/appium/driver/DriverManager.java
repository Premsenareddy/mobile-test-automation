package com.appium.driver;

import io.appium.java_client.AppiumDriver;

public final class DriverManager {

    private DriverManager() {
    }

    private static ThreadLocal<AppiumDriver> threadLocalDriver = new ThreadLocal<>();

    public static AppiumDriver getDriver() {
        return threadLocalDriver.get();
    }

    public static void setDriver(AppiumDriver driver) {
        threadLocalDriver.set(driver);
    }

    public static void unload() {
        threadLocalDriver.remove();
    }

}
