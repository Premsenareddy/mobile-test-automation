package com.appium.driver;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.util.Map;

public interface IDriver {

    public AppiumDriver getDriver(Map<String, String> map) throws MalformedURLException;

}
