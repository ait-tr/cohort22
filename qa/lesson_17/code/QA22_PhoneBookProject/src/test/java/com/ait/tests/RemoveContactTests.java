package com.ait.tests;

import com.ait.phonebook.model.Contact;
import com.ait.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnSignOutButton();
        } else {
            app.getHeader().clickOnLoginLink();

            app.getUser().fillLoginRegForm(new User()
                    .setEmail("manuel+5@gmail.com")
                    .setPassword("Manuel12345$"));
            app.getUser().clickOnLoginButton();

            app.getHeader().clickOnAddLink();
            app.getContact().addContact(new Contact().setName("Karl")
                    .setSurName("Adam")
                    .setPhone("1234567890")
                    .setEmail("adam@gm.co")
                    .setAddress("Koblenz")
                    .setDesc("torwart"));
            app.getContact().clickOnSaveButton();
        }
    }

    @Test
    public void removeContactTest() {
        int sizeBefore = app.getContact().sizeOfContacts();

        app.getContact().removeContact();
        app.getContact().pause(1000);
        int sizeAfter = app.getContact().sizeOfContacts();

        Assert.assertEquals(sizeBefore-sizeAfter,1);
    }

}
