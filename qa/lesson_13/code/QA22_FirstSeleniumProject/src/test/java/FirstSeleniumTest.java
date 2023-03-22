import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;

    //before - setUp(){}
    @BeforeMethod
    public void setUp() {
        // driver = new FirefoxDriver();

        driver.get("https://www.google.com");
    }

    //test
    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!!!");
    }

    //after - tearDown(){}
}
