package com.ait.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReminderHelper extends BaseHelper{

    public ReminderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public void enterReminderTitle(String title) {
        text(By.id("reminder_title"),title);
    }

    public void saveReminder() {
        tap(By.id("save_reminder"));
    }

    public int getTotalReminders() {
        return driver.findElements(By.id("thumbnail_image")).size();
    }

    public void tapOnDateField() {
        tap(By.id("date"));
    }

    public void swipeToNextMonth(String period) {
        pause(500);
        if (period.equals("future")) {
            swipe(0.7,0.4);
        } else if (period.equals("past")) {
            swipe(0.5,0.8);
        }
    }

    public void swipe(double start, double stop) {

        TouchAction action = new TouchAction(driver);

        Dimension size = driver.manage().window().getSize();

        int x = size.width / 2;

        int startY = (int) (size.height * start);
        int stopY = (int) (size.height * stop);

        action.longPress(PointOption.point(x,startY))
                .moveTo(PointOption.point(x,stopY))
                .release().perform();
    }

    public void selectDate(int index) {
        List<WebElement> dates = driver.findElements(By.className("android.view.View"));
        dates.get(index).click();
    }

    public void tapOnOk() {
        tap(By.id("ok"));
    }
}
