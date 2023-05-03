package pages.bookStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName-value")
    WebElement user;

    public ProfilePage assertAccount(String uName) {
        Assert.assertTrue(shouldHaveText(user,uName,15));
        return this;
    }

    @FindBy(xpath = "//*[@id='delete-record-undefined']")
    List<WebElement> booksList;

    @FindBy(id = "closeSmallModal-ok")
    WebElement okBtn;

    public ProfilePage clickOnTrashToDeleteBook() {
        pause(500);
        booksList.get(0).click();
        pause(500);
        click(okBtn);
        pause(500);
        driver.switchTo().alert().accept();
        return this;
    }
}
