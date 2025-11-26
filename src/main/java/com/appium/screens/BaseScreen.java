package com.appium.screens;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseScreen {

	public AppiumDriver<MobileElement> appDriver;
	   
    public BaseScreen(AppiumDriver<MobileElement> appDriver) {
        this.appDriver = appDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appDriver), this);
    }
    
    
}
