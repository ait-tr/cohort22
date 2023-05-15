package com.ait.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreenHelper extends BaseHelper{

    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public boolean isNoReminderTextPresent() {
        //return isElementPresent(By.id("no_reminder_text"));
        return isElementPresent(By.xpath("//*[@resource-id='com.blanyal.remindly:id/no_reminder_text']"));
    }
}
