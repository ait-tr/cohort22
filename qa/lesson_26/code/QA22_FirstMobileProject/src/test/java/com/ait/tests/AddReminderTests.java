package com.ait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddReminderTests extends TestBase{

    @Test
    public void sddReminderWithRandomSwipeTest() {
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
        Assert.assertEquals(quantityAfter,quantityBefore + 1);
    }
}
