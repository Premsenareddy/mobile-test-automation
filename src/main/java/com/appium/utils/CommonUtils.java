package com.appium.utils;

import com.appium.base.AppiumServer;
import com.appium.base.BaseClass;
//import com.appium.utils.requestUtil.BodyBuilder;
import com.appium.utils.requestUtil.HeaderUtil;
import com.appium.utils.requestUtil.QueryParamUtil;
import com.appium.utils.requestUtil.RestUtil;
import com.mifmif.common.regex.Generex;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import lombok.SneakyThrows;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class CommonUtils {

    public static final String IOS_APP = "ae.ahbdigital.{0}";
    protected RestUtil restUtil = new RestUtil();
    protected HeaderUtil headerUtil = new HeaderUtil();
    //    protected BodyBuilder bodyBuilder = new BodyBuilder();
    protected QueryParamUtil queryParamUtil = new QueryParamUtil();
    SoftAssert softAssert = new SoftAssert();
    public static AppiumDriver<MobileElement> appDriver;
    static public String platform;
    static private String platform_version;
    static private String mobile;
    static private String env;

    DesiredCapabilities capabilities = new DesiredCapabilities();

    private void getDeviceDetails() {
        //**** Below variables to be used when Runtime variables are implemented ****/
        CommonUtils.platform = System.getProperty("platform");
        if (platform == null)
            platform = "Android";


        CommonUtils.platform_version = System.getProperty("platformVersion");
        if (platform_version == null) {
            if (platform.equalsIgnoreCase("android"))
                platform_version = "12";
            else
                platform_version = "15.2";
        }

        CommonUtils.mobile = System.getProperty("mobileName");
        if (mobile == null && platform.equalsIgnoreCase("ios"))
            mobile = "iPhone 12 Pro Max";

        CommonUtils.env = System.getProperty("environment");
        if (env == null)
            env = "sit";
    }

    /**
     * Setting the Desired Capabilities for Requesting the automation server
     *
     * @throws MalformedURLException
     */
    public void setCapabilitiesAndLaunchDriver() throws MalformedURLException {

        getDeviceDetails();
        switch (CommonUtils.platform.toLowerCase()) {

            case "android":
                if (mobile != null)
                    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, mobile);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
                capabilities.setCapability("noReset", BaseClass.prop.getProperty("noReset"));
                //capabilities.setCapability(MobileCapabilityType.APP, BaseClass.prop.getProperty("app"));
                capabilities.setCapability("appPackage", BaseClass.prop.getProperty("appPackage"));
                capabilities.setCapability("appActivity", BaseClass.prop.getProperty("appActivity"));
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
                capabilities.setCapability("autoGrantPermissions", true);
                capabilities.setCapability("autoAcceptAlerts", "true");

                appDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
                break;

            case "ios":
                String path = "src/test/resources/iOS/" + env;
                File appDir = new File(path);
                File appName = new File(appDir, BaseClass.prop.getProperty("ipaFileName"));

                //Build should be present in Resource folder of the directory
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, mobile);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
                capabilities.setCapability(MobileCapabilityType.APP, appName.getAbsolutePath());
                capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10000);
                capabilities.setCapability(MobileCapabilityType.UDID, BaseClass.prop.getProperty("udid"));
                capabilities.setCapability(MobileCapabilityType.NO_RESET, BaseClass.prop.getProperty("noReset"));
                appDriver = new IOSDriver(AppiumServer.getAppiumUrl(), capabilities);
                break;
        }
        appDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // ---------------Closing the driver----------------
    public static void closeDriver() {
        //appDriver.removeApp(BaseClass.prop.getProperty("appPackage"));
        appDriver.quit();
    }

    // --------------Back Button----------------
    public static void backButton() {
        appDriver.navigate().back();
    }

    // Swipe Functionality using dimensions
    public static void verticalSwipeByPercentage(double startPercentage, double endPercentage,
                                                 double anchorPercentage) {
        Dimension size = appDriver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startpoint = (int) (size.height * startPercentage);
        int endpoint = (int) (size.height * endPercentage);

        new TouchAction(appDriver).press(point(anchor, startpoint)).waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endpoint)).release().perform();
    }

    // Another method to swipe
    public static void swipe() {
        MobileElement element = (MobileElement) appDriver.findElement(
                MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()"
                        + ".scrollIntoView(new UiSelector().text(\"exact_text\"))"));
    }

    public static void sss(MobileElement element1, MobileElement element2) {
        TouchAction touchAction = new TouchAction(appDriver);
        touchAction.press(ElementOption.element(element1))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(ElementOption.element(element2))
                .release().perform();
    }

    // Left-Right Swipe Functionality
    public void SwipeLeftRight(int start, int end, int anchor) {
        TouchAction action = new TouchAction(appDriver);
        action.longPress(point(start, anchor)).moveTo(PointOption.point(end, anchor)).release().perform();
    }

    //Up-Down Swipe Functionality
    public void SwipeUpDown(int start, int end, int anchor) {
        TouchAction action = new TouchAction(appDriver);
        action.longPress(point(anchor, start)).moveTo(PointOption.point(anchor, end)).release().perform();
    }

    public void findElementByTextonPage(String text) {
        //appDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(android.widget.EditText)).scrollIntoView(new UiSelector().textMatches(\"Account number\").instance(0))"));
        appDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(android.widget.EditText)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))"));

    }

    public void scrollTo(String text) {
        try {
            ((FindsByAndroidUIAutomator) appDriver)
                    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +
                            ".instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void scrollToElement(String text) {
        ((FindsByAndroidUIAutomator) appDriver)
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +
                        ".setMaxSearchSwipes(10)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\")" +
                        ".instance(0))");
    }


    public void validateAndAcceptAlert(AppiumDriver<MobileElement> appDriver) {
        try {
            Alert alert = appDriver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            throw new RuntimeException("alert is either not displayed or it is not an alert");
        }
    }

    public static void validateAndDismissAlert() {
        try {
            Alert alert = appDriver.switchTo().alert();
            alert.dismiss();
        } catch (Exception e) {
            throw new RuntimeException("alert is either not displayed or it is not an alert");
        }
    }

    public void validateAndSendKeys(MobileElement element, String value) {
        if (element.isDisplayed() && element.isEnabled()) {
            element.sendKeys(value);
        } else {
            System.out.println("Either element is not displayed or not enabled.");
        }
    }

    public void validateAndClick(MobileElement element) {
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        } else throw new RuntimeException("element is either not displayed or enabled");
    }

    public String validateAndGetText(MobileElement element) {
        if (element.isDisplayed() && element.isEnabled()) {
            return element.getText();
        } else throw new RuntimeException("element is either not displayed or enabled");
    }

    public static String validateAndGetAttribute(MobileElement element, String attribute) {
        if (element.isDisplayed() && element.isEnabled()) {
            return element.getAttribute(attribute);
        } else throw new RuntimeException("element is either not displayed or enabled");
    }


    public void waitUntilVisible(MobileElement element, int timeOutInSec) {
        try {
            FluentWait<AppiumDriver> fWait = new FluentWait<AppiumDriver>(appDriver)
                    .withTimeout(Duration.ofSeconds(timeOutInSec))
                    .pollingEvery(Duration.ofMillis(50))
                    .ignoring(NoSuchElementException.class)
                    .ignoring(StaleElementReferenceException.class);
            fWait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            throw new RuntimeException("element is either not displayed or enabled");
        }
    }

    public static void waitUntilClickable(WebElement element, int timeOutInSec) {
        try {
            FluentWait<AppiumDriver> fWait = new FluentWait<AppiumDriver>(appDriver)
                    .withTimeout(Duration.ofSeconds(timeOutInSec))
                    .pollingEvery(Duration.ofMillis(50))
                    .ignoring(NoSuchElementException.class)
                    .ignoring(StaleElementReferenceException.class);
            fWait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            throw new RuntimeException("element is either not displayed or enabled");
        }
    }

    public static void waitForNotVisible(WebElement element, int timeOutInSec) {
        try {
            FluentWait<AppiumDriver> fWait = new FluentWait<AppiumDriver>(appDriver)
                    .withTimeout(Duration.ofSeconds(timeOutInSec))
                    .pollingEvery(Duration.ofMillis(50));
            fWait.until(ExpectedConditions.invisibilityOf(element));
        } catch (org.openqa.selenium.NoSuchElementException ignored) {
        } catch (org.openqa.selenium.TimeoutException e) {
            throw new RuntimeException("element is either not displayed or enabled");
        }
    }

    public String generateNickname() {
        Random r = new Random();
        String id = String.format("%04d", r.nextInt(10000));
        String nickname = "Hasneet" + id;
        return nickname;
    }

    public WebElement scrollToAnElementByText(String text) {
        return appDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
                ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
    }

    public void clearText(MobileElement element) {
        while (element.getText().length() > 0)
            element.sendKeys(Keys.DELETE);
    }

    public void hideKeyboard() {
        appDriver.hideKeyboard();
    }

    public void transactionDetails(Map<String, String> mapObj, List<MobileElement> pageObjectKeys,
                                   List<MobileElement> PageObjectKeyValues) {
        int count = pageObjectKeys.size();

        for (int i = 0; i < count - 1; i++) {
            String text = pageObjectKeys.get(i).getText();
            String value = PageObjectKeyValues.get(i).getText();
            mapObj.put(text, value);
        }
    }

    public boolean checkRequestParams(Map<String, String> request, List<String> keys) {
        return isEqualCollection(request.keySet(), keys) && !containsAnyNull(request.values());
    }

    private boolean isEqualCollection(Collection<?> a, Collection<?> b) {
        return a.size() == b.size() && a.containsAll(b) && b.containsAll(a);
    }

    private boolean containsAnyNull(Collection<?> collection) {
        return collection.contains(null);
    }

    public void selectFromDropdown(MobileElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void closeApp() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "ios":
                appDriver.terminateApp(MessageFormat.format(IOS_APP, System.getProperty("environment").toLowerCase()));
                appDriver.quit();
                break;
            case "android":
                appDriver.quit();
                break;
        }
    }

    public void scrollAndClick(String visibleText) {
        ((FindsByAndroidUIAutomator) appDriver).findElementByAndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                                ".scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))")
                .click();

    }

    public void iOSScroll(String direction) {
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", direction);
        appDriver.executeScript("mobile:scroll", scrollObject);
    }

    public void scrollToTextInDirection(String direction, String attribute, String value) {
        HashMap<String, Object> scrollToEle = new HashMap<>();
        scrollToEle.put("direction", direction);
        scrollToEle.put(attribute, value);
        appDriver.executeScript("mobile:scroll", scrollToEle);
    }


    public void swipyleftrightbytext(String text) {
        try {
            ((FindsByAndroidUIAutomator) appDriver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static boolean eleIsDisplayed(WebElement ele) {
        try {
            if (ele.isDisplayed())
                return true;
        } catch (Exception e) {
            return false;
        }
        return false;

    }

    public boolean click(WebElement ele) {
        try {
            @SuppressWarnings("deprecation")
            WebDriverWait wait = new WebDriverWait(appDriver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(ele));
            ele.click();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean enterValue(WebElement ele, String data) {
        @SuppressWarnings("deprecation")
        WebDriverWait wait = new WebDriverWait(appDriver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        clearText(ele);
        ele.sendKeys(data);
        return true;
    }

    public boolean verifyAttribute(WebElement ele, String attribute, String value) {
        @SuppressWarnings("deprecation")
        WebDriverWait wait = new WebDriverWait(appDriver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(ele));

        return ele.getAttribute(attribute).equalsIgnoreCase(value);
    }

    public void clearText(WebElement ele) {
        try {
            ele.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollFromDownToUpInAppUsingPointerInput() {
        Dimension size = appDriver.manage().window().getSize();
        int x1 = (int) (size.getWidth() * 0.5);
        int y1 = (int) (size.getHeight() * 0.8);
        int x0 = (int) (size.getWidth() * 0.5);
        int y0 = (int) (size.getHeight() * 0.4);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1);
        sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x1, y1));
        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        sequence.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), x0, y0));
        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
        appDriver.perform(Arrays.asList(sequence));
    }

    public boolean scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(WebElement ele, int scrollCount) {
        int i = 0;
        while (!eleIsDisplayed(ele) && i < scrollCount) {
            scrollFromDownToUpInAppUsingPointerInput();
            i++;
        }
        return true;
    }

    /**
     * This method will scroll to an element
     *
     * @param by          A By which locates elements by the value of the locator attribute.
     * @param scrollCount maximum scroll count.
     * @return status - returns true or false based on the presence of the element
     */
    public boolean scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(By by, int scrollCount) {
        int i = 0;
        while (appDriver.findElements(by).isEmpty() && i < scrollCount) {
            scrollFromDownToUpInAppUsingPointerInput();
            i++;
        }
        return true;
    }

    public String getXpath(String xpath, String value) {
        return String.format(xpath, value);
    }

    public Boolean scrollAndClick(By by, int scrollCount) {
        int i = 0;
        while (appDriver.findElements(by).isEmpty() && i < scrollCount) //==0
        {
            scrollFromDownToUpInAppUsingPointerInput();
            i++;
        }

        if (!appDriver.findElements(by).isEmpty()) {
            appDriver.findElement(by).click();
        } else {
            return false;
        }

        return true;
    }

    public boolean eleIsDisplayed(By by) {
        try {
            if (appDriver.findElement(by).isDisplayed())
                return true;
        } catch (Exception e) {
            return false;
        }
        return false;

    }

    public MobileElement getElement(By by) {
        return appDriver.findElement(by);
    }

    public void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
        }
    }

    public String getBacData(String key) {

        String data = JsonUtil.getBacData(key);

        if (data == null || data.isEmpty()) {
            return key;
        }
        return data;

    }

    public String generateUAEMobileNumber() {

        Generex generex = new Generex("(\\+971)(50|52|54|55|56|58)\\d{7}");
        return generex.random();

    }

    /**
     * Enter the keyboard
     *
     * @param driver - the current driver
     */
    public static void enterKeyboard(AppiumDriver driver) {
        driver.getKeyboard().sendKeys(Keys.ENTER);
    }

    /**
     * When ios click on done button else press enter button on keyboard
     *
     * @param done done button in ios keyboard
     */
    public void acceptInput(MobileElement done) {
        if (platform.equalsIgnoreCase("ios")) {
            validateAndClick(done);
        } else {
            enterKeyboard(appDriver);
            hideKeyboard();
        }
    }

}