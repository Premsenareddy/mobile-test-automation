package com.appium.driver;

import com.appium.utils.PropertyUtil;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.util.Map;

import static com.appium.driver.DriverManager.*;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public final class Driver {

    private Driver() {
    }

    public static void initDriver(Map<String, String> map) throws MalformedURLException {
        if (isNull(getDriver())) {
            String infraValue = PropertyUtil.getValue("infra");
            AppiumDriver driver = DriverFactory.get(Infra.valueOf(infraValue.toUpperCase()), map);
            setDriver(driver);
        }
    }

    public static void quitDriver() {
        String platform = PropertyUtil.getValue("platform").toUpperCase();
        if (nonNull(getDriver())) {
            if (platform.equals("IOS")) {
                String bundleId = PropertyUtil.getValue("iosBundleId");
                getDriver().terminateApp(bundleId);
            }
            getDriver().quit();
            unload();
        }

    }

}
