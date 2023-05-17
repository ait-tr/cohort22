package com.ait.fw;

import com.ait.model.Reminder;
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

    public void selectDate(int index) {
        List<WebElement> dates = driver.findElements(By.className("android.view.View"));
        dates.get(index).click();
    }

    public void tapOnOk() {
        tap(By.id("ok"));
    }
    // date_picker_month
    public void swipeToMonth(String period, int number, String month) {
        pause(500);

        if(!getSelectedMonth().equals(month)) {
            for (int i = 0; i < number; i++) {
                if (period.equals("future")) {
                    swipe(0.7, 0.4);
                } else if (period.equals("past")) {
                    swipe(0.5, 0.8);
                }
            }
        }
    }

    private String getSelectedMonth() {
        return driver.findElement(By.id("date_picker_month")).getText();
    }

    public void tapOnYear() {
        tap(By.id("date_picker_year"));
    }

    public void swipeToYear(String period, String year) {
        pause(500);
        if (!getSelectedYear().equals(year)) {
            if (period.equals("future")) {
                swipeUntilNeededYear(year,0.6,0.5);
            } else if (period.equals("past")) {
                swipeUntilNeededYear(year,0.5,0.6);
            }
        }
        tap(By.id("month_text_view"));
    }

    public String getSelectedYear() {
        return driver.findElement(By.id("date_picker_year")).getText();
    }
    private void swipeUntilNeededYear(String year,double startPoint, double stopPoint) {
        while(!selectedYear().equals(year)) {
            moveInElement(By.className("android.widget.ListView"),startPoint,stopPoint);
        }
        selectedYear();
    }

    private String selectedYear() {
        return driver.findElement(By.id("month_text_view")).getText();
    }


    public void tapOnTimeField() {
        tap(By.id("time"));
    }

    public void selectTime(String timeOfDay,int xHour,int yHour,int xMin,int yMin) {
        pause(500);

        if (timeOfDay.equals("am")) {
            tapWithCoordinates(275,1324);
        } else if (timeOfDay.equals("pm")) {
            tapWithCoordinates(789,1324);
        }
        tapWithCoordinates(xHour,yHour);
        tapWithCoordinates(xMin,yMin);

    }

    public void defineRepetition(String repeat) {
        tap(By.id("RepeatNo"));
        pause(500);
        text(By.className("android.widget.EditText"),repeat);
        tap(By.xpath("//*[@text='OK']"));
    }

    public void selectTypeOfRepetition(String typeRep) {
        tap(By.id("RepeatType"));
        tap(By.xpath("//*[@text='" + typeRep + "']"));
    }

    public void enterAllData(Reminder reminder) {

        enterReminderTitle(reminder.getTitle());
        tapOnDateField();
        swipeToMonth(reminder.getPeriod(), reminder.getNumber(), reminder.getMonth());
        selectDate(reminder.getIndex());
        tapOnYear();
        swipeToYear(reminder.getPeriod2(), reminder.getYear());
        tapOnOk();
        tapOnTimeField();
        selectTime(reminder.getTimeOfDay(), reminder.getXHour(), reminder.getYHour(),
                reminder.getXMin(), reminder.getYMin());
        tapOnOk();
        defineRepetition(reminder.getRepeat());
        swipe(reminder.getStart(), reminder.getStop());
        selectTypeOfRepetition(reminder.getTypeRep());
    }
}
