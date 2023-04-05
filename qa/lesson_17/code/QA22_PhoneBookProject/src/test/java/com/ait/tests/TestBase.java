package com.ait.tests;

import com.ait.phonebook.fw.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    protected static ApplicationManager app = new ApplicationManager();

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeSuite
    public void setUp() {
        app.init();
    }

    @AfterSuite(enabled = true)
    public void tearDown() {
        app.stop();
    }

    @BeforeMethod
    public void startTest() {
        logger.info("Start test");
    }

    @AfterMethod
    public void stopTest() {
        logger.info("Stop test");
    }

}
