package tests.bookStorePage;

import data.BookData;
import data.UserData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.bookStore.BookStorePage;
import pages.bookStore.LoginPage;
import pages.bookStore.ProfilePage;
import tests.TestBase;

public class AddBookTest extends TestBase {

    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getBookStore();
        new LoginPage(driver).getLogin();
        new LoginPage(driver).login(UserData.USER_NAME, UserData.USER_PASSWORD);
    }

    @Test
    public void addBookToCollectionPositiveTest() {
        new BookStorePage(driver).typeInSearchField(BookData.BOOK_NAME)
                .clickByFirstBook()
                .addToYourCollection();
        new SidePanel(driver).selectProfile();
        new BookStorePage(driver).assertNameOfBook("Git Pocket Guide");

    }

    @AfterMethod
    public void postConditions() {
        new ProfilePage(driver).clickOnTrashToDeleteBook();
    }
}
