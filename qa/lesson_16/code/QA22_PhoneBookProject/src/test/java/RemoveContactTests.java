import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{
    //precondition: 1. Verify User is log out, 2. log in, 3. add contact
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()) {
            clickOnSignOutButton();
        } else {
            clickOnLoginLink();

            fillLoginRegForm("manuel+5@gmail.com", "Manuel12345$");
            clickOnLoginButton();

            clickOnAddLink();
            addContact("Karl", "Adam", "1234567890", "adam@gm.co", "Koblenz", "torwart");
            clickOnSaveButton();
        }
    }

    @Test
    public void removeContactTest() {
        int sizeBefore = sizeOfContacts();

        //click on Card
        removeContact();
        pause(1000);
        int sizeAfter = sizeOfContacts();

        //verify Contact is removed
        Assert.assertEquals(sizeBefore-sizeAfter,1);
    }

}
