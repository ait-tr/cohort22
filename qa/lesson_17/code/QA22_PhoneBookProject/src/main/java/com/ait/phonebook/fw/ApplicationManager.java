package com.ait.phonebook.fw;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ApplicationManager {

    static WebDriver driver;

    UserHelper user;
    ContactHelper contact;
    HeaderHelper header;
    HomePageHelper home;

    public UserHelper getUser() {
        return user;
    }

    public ContactHelper getContact() {
        return contact;
    }

    public HeaderHelper getHeader() {
        return header;
    }

    public HomePageHelper getHome() {
        return home;
    }

    public void init() {
        System.err.close();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://telranedu.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        contact = new ContactHelper(driver);
        header = new HeaderHelper(driver);
        home = new HomePageHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

}
