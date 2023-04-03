import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{
    //precondition: 1. User is logged out, 2. log in
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()) {
            clickOnSignOutButton();
        } else {
            clickOnLoginLink();

            fillLoginRegForm("manuel+5@gmail.com", "Manuel12345$");
            clickOnLoginButton();
        }
    }

    @Test
    public void addContactPositiveTests() {
        //click on Add link
        clickOnAddLink();
        //fill add contact form
        addContact("Karl", "Adam", "1234567890", "adam@gm.co", "Koblenz", "torwart");

        //click on Save button
        clickOnSaveButton();

        //verify new contact is added
        Assert.assertTrue(isContactCreated("Karl"));
    }
}
