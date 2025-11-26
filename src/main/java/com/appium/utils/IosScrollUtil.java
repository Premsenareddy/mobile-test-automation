package com.appium.utils;

import io.appium.java_client.AppiumDriver;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;

/**
 * @author abhishekkumarjain
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IosScrollUtil {

    /**
     * Performs scroll action based on the case needed
     * This function will swipe or scroll given the scrollable component
     * @param driver - the current driver
     * @param direction - the direction of the action
     * @param parent - the component element which the action will be performed on
     */
    public static WebElement scrollElementToText(AppiumDriver driver, DirectionType direction, RemoteWebElement parent,
                                                 String elementLabel) {
        JavascriptExecutor js = driver;
        WebElement element = null;
        //identifying the parent Table
        String parentID = parent.getId();
        HashMap<String, String> scrollObject = new HashMap<>();
        scrollObject.put("element", parentID);
        scrollObject.put("direction", direction.getDirection());
        // Use the predicate that provides the value of the label attribute
        // Work needed to move label to enum and reuse it here so that scroll can happen for any property of child
        scrollObject.put("predicateString", "label == '"+elementLabel+"'");
        try {
            element = driver.findElement(By.xpath("//*[@label='"+ elementLabel +"']"));
            if(!CommonUtils.eleIsDisplayed(element)) {
                js.executeScript("mobile:scroll", scrollObject);  // scroll to the target element
            }
        } catch (Exception e) {
            scrollElementToText(driver,  direction,  parent, elementLabel);
        }
        return element;
    }
}
