package pages.bookStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class BookStorePage extends BasePage {

    public BookStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "searchBox")
    WebElement searchBox;

    public BookStorePage typeInSearchField(String text) {
        type(searchBox,text);
        return this;
    }

    @FindBy(xpath = "//span[@class='mr-2']/a")
    WebElement nameOfBook;

    public BookStorePage assertNameOfBook(String text) {
        Assert.assertTrue(nameOfBook.getText().contains(text));
        return this;
    }

    public BookStorePage clickByFirstBook() {
        click(nameOfBook);
        return this;
    }

    @FindBy(css = ".text-right.fullButton")
    WebElement addToCollectionButton;

    public BookStorePage addToYourCollection() {
        clickWithJSExecutor(addToCollectionButton, 0, 400);
        pause(2000);
        driver.switchTo().alert().accept();
        return this;
    }
}
