package com.appium.stepDefinitions;

import com.appium.base.AppiumServer;
import com.appium.base.BaseClass;
import com.appium.utils.CommonUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;
import java.net.MalformedURLException;

public class Hooks {

    // -----------------------Start the Appium----------------------------
    @Before(order = 1)
    public void startAppium() {
        AppiumServer.start();
    }

    // ----------------SetUp the Driver--------------------------------
    @Before(order = 2)
    public void setUp() throws MalformedURLException {
        CommonUtils utilObject = new CommonUtils();
        utilObject.setCapabilitiesAndLaunchDriver();
        BaseClass.getImplicitlyWait();
    }

    // ----------------------- Stop The Appium Server------------------------
    @After(order = 1)
    public void stopAppium() {
        AppiumServer.stop();
    }

    // -----------------------Closing the Driver--------------------------
    @After(order = 2)
    public void close() {
        CommonUtils.closeApp();
    }

    @After
    public static void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {

            String screenshotName = scenario.getName().replaceAll(" ", "_");

            byte[] screenshot = ((TakesScreenshot) CommonUtils.appDriver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", screenshotName);
        }
    }
}
