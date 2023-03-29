import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[contains(.,'LOGIN')]"))) {
            driver.findElement(By.xpath("//button[contains(.,'Sign Out')]")).click();
        }
    }

    @Test
    public void newUserRegistrationPositiveTest() {
        //click on Login link
        click(By.xpath("//a[contains(.,'LOGIN')]"));
        //verify Registration form is displayed
        Assert.assertTrue(isElementPresent(By.className("login_login__3EHKB")));
        //fill registration form
        type(By.cssSelector("[placeholder='Email']"), "manuel+5@gmail.com");
        type(By.cssSelector("[placeholder='Password']"), "Manuel12345$");
        //click on Registration button
        driver.findElement(By.xpath("//button[contains(.,'Registration')]")).click();
        //verify Log out button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[contains(.,'Sign Out')]")));
    }

    public void type(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
