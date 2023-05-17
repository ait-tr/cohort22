package com.ait.tests;

import com.ait.model.Reminder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AddReminderTests extends TestBase {

    @Test
    public void addReminderWithRandomSwipeTest() {
        int quantityBefore;
        int quantityAfter;
        quantityBefore = app.getReminder().getTotalReminders();
        //tap on add reminder
        app.getReminder().tapOnAddReminder();
        //enter title
        app.getReminder().enterReminderTitle("Test");
        //tap on date field
        app.getReminder().tapOnDateField();
        //swipe to next month
        app.getReminder().swipeToNextMonth("future");
        //select date
        app.getReminder().selectDate(14);
        //tap on OK
        app.getReminder().tapOnOk();
        //save reminder
        app.getReminder().saveReminder();
        quantityAfter = app.getReminder().getTotalReminders();
        //assert adding reminder
        Assert.assertEquals(quantityAfter, quantityBefore + 1);
    }

    @Test
    public void addReminderPositiveTest() {
        //tap on add reminder
        app.getReminder().tapOnAddReminder();
        //enter title
        app.getReminder().enterReminderTitle("Holiday");
        //tap on date field
        app.getReminder().tapOnDateField();
        //swipe to certain month
        app.getReminder().swipeToMonth("future", 2, "JUL");
        //select date
        app.getReminder().selectDate(14);
        //tap on year
        app.getReminder().tapOnYear();
        //select year
        app.getReminder().swipeToYear("future", "2025");
        //tap on OK
        app.getReminder().tapOnOk();
        //tap on time field
        app.getReminder().tapOnTimeField();
        //select time
        app.getReminder().selectTime("am", 538, 1188, 538, 653);
        //tap on ok
        app.getReminder().tapOnOk();
        //define repetition
        app.getReminder().defineRepetition("2");
        //swipe up
        app.getReminder().swipe(0.8, 0.5);
        //select type of repetition
        app.getReminder().selectTypeOfRepetition("Month");
        //save reminder
        app.getReminder().saveReminder();
        //assert by title
        Assert.assertTrue(app.getMainScreen().isReminderTitlePresent().contains("Holiday"));
    }

    @Test
    public void addReminderAllDataAtOnceTest() {
        app.getReminder().tapOnAddReminder();
        app.getReminder().enterAllData(Reminder.builder()
                .title("Holiday").period("future").month("JUL").number(2)
                .index(10).period2("past").year("2020").timeOfDay("pm")
                .xHour(538).yHour(1188).xMin(538).yMin(635).repeat("2")
                .start(0.8).stop(0.5).typeRep("Month").build());
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderTitlePresent().contains("Holiday"));
    }

    @AfterMethod
    public void removeReminder() {
        app.getMainScreen().removeReminder();
    }

}
