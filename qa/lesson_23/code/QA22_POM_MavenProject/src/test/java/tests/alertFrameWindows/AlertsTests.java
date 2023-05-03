package tests.alertFrameWindows;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SidePanel;
import pages.alertFrameWindows.AlertsPage;
import tests.TestBase;

public class AlertsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertFrameWindows();
        new SidePanel(driver).selectAlerts();
    }

    @Test
    public void alertWaitTest() {
        new AlertsPage(driver).clickByAlertWithTimer();
    }

    @Test
    public void alertWithSelectTest() {

        new AlertsPage(driver).selectConfirm("Cancel").assertResult("Cancel");
    }

    @Test
    public void sendTextToAlert() {
        new AlertsPage(driver).sendMessageToAlert("Hello World!").assertMessage("Hello World!");
    }
}
