package com.ait.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(.,'Sign Out')]")
    WebElement signOutButton;

    public ProfilePage isSignOutButtonDisplayed() {
        isElementDisplayed(signOutButton);
        return this;
    }
}
