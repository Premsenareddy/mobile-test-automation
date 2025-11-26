package com.appium.driver;

import com.appium.exception.ThrowException;
import com.appium.utils.PropertyUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class PcloudyImplementation implements IDriver {

    @Override
    public AppiumDriver getDriver(Map<String, String> map) throws MalformedURLException {
        String platform = PropertyUtil.getValue("platform").toUpperCase();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        map.forEach(capabilities::setCapability); //it reads all the key value from map and store it in capabilities

        capabilities.setCapability("pCloudy_Username", PropertyUtil.getValue("pCloudyUsername"));
        capabilities.setCapability("pCloudy_ApiKey", PropertyUtil.getValue("pCloudyApiKey"));
        capabilities.setCapability("pCloudy_ApplicationName", PropertyUtil.getValue("pCloudyApplicationName"));

        switch (platform) {

            case "ANDROID":
                capabilities.setCapability(MobileCapabilityType.APP, PropertyUtil.getValue("androidApp"));
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PropertyUtil.getValue("appPackage"));
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, PropertyUtil.getValue("appActivity"));
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PropertyUtil.getValue("androidPlatformVersion"));
                capabilities.setCapability("autoGrantPermissions", true);
                //capabilities.setCapability("unlockType","pattern");
                //capabilities.setCapability("unlockKey","74123");
                return new AndroidDriver<AndroidElement>(new URL(PropertyUtil.getValue("pCloudyUrl")), capabilities);

            case "IOS":
                capabilities.setCapability(MobileCapabilityType.APP, PropertyUtil.getValue("iosApp"));
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PropertyUtil.getValue("iosPlatformVersion"));
                capabilities.setCapability(MobileCapabilityType.UDID, PropertyUtil.getValue("udid"));
                capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10000);
                return new IOSDriver<IOSElement>(new URL(PropertyUtil.getValue("pCloudyUrl")), capabilities);

            default:
                throw new ThrowException("Invalid platform! This framework works with Android and iOS");

        }

    }
}
