package com.appium.driver;

import com.appium.exception.ThrowException;
import com.appium.utils.PropertyUtil;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static AppiumDriver get(Infra infra, Map<String, String> map) throws MalformedURLException {
        AppiumDriver driver;

        if (infra.equals(Infra.LOCAL)) {
            driver = new LocalDriverImplementation().getDriver(map);
        } else if (infra.equals(Infra.PCLOUDY)) {
            driver = new PcloudyImplementation().getDriver(map);
        } else {
            throw new ThrowException("No device farm found with the provider value specified in the configuration");
        }

        driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropertyUtil.getValue("implicitWait")), TimeUnit.SECONDS);

        return driver;
    }
}
