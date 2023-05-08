package com.ait.stepDefinitions;

import com.ait.pages.LoginPage;
import com.ait.pages.ProfilePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ait.pages.BasePage.driver;

public class LoginPageSteps {
    @And("User enters valid data")
    public void enter_valid_data() {
        new LoginPage(driver).enterData("manuel+5@gmail.com","Manuel12345$");
    }

    @And("User click on Login button")
    public void click_Login_button() {
        new LoginPage(driver).clickOnLoginButton();
    }

    @Then("User verifies SignOut button is displayed")
    public void verify_SignOut_button_displayed() {
        new ProfilePage(driver).isSignOutButtonDisplayed();
    }

    @And("User enters valid email and wrong password")
    public void enters_wrong_password(DataTable table) {
        new LoginPage(driver).enterWrongPassword(table);
    }

    @Then("User verifies alert is appeared")
    public void verifies_alert_appeared() {
        new LoginPage(driver).isAlertPresent();
    }
}
