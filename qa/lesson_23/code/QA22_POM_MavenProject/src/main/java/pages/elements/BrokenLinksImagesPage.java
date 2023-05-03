package pages.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksImagesPage extends BasePage {

    public BrokenLinksImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "a")
    List<WebElement> allLinks;

    public BrokenLinksImagesPage checkBrokenLinks() {

        for (int i = 0; i < allLinks.size(); i++) {
            WebElement element = allLinks.get(i);
            String url = element.getAttribute("href");
            verifyLinks(url);
        }
        return this;
    }
    @FindBy(tagName = "img")
    List<WebElement> images;

    public BrokenLinksImagesPage checkBrokenImages() {

        System.out.println("We have " + images.size() + " images");

        for (int i = 0; i < images.size(); i++) {
            WebElement element = images.get(i);
            String imageURL = element.getAttribute("src");
            System.out.println("URL of Image " + (i + 1) + " is: " + imageURL);
            verifyLinks(imageURL);
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver)
                        .executeScript("return (typeof arguments[0].naturalWidth!=undefined && arguments[0].naturalWidth>0);", element);

                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                    System.out.println("**************************************");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("****************************************");
                }
            } catch (Exception e) {
                System.out.println("Error occurred");
            }
        }
        return this;
    }
}
