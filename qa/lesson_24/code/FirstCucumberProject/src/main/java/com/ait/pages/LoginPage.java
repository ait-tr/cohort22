package com.ait.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[placeholder='Email']")
    WebElement emailField;

    @FindBy(css = "[placeholder='Password']")
    WebElement passwordField;

    public LoginPage enterData(String email, String password) {
        type(emailField,email);
        type(passwordField,password);
        return this;
    }

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement loginButton;

    public ProfilePage clickOnLoginButton() {
        click(loginButton);
        return new ProfilePage(driver);
    }

    public LoginPage enterWrongPassword(DataTable table) {

        List<Map<String,String>> dataTable = table.asMaps();
        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");

        enterData(email,password);
        return this;
    }
}
