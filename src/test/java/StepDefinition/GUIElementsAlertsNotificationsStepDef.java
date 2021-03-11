package StepDefinition;

import PageObjects.AlertsNotifications;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.Messages;
import org.testng.Assert;

import java.util.List;

public class GUIElementsAlertsNotificationsStepDef {

    AlertsNotifications alerts = new AlertsNotifications();

    @Given("GUIElements Alerts&Notif. I navigate to alerts and notifications")
    public void INavigateToAlertsAndNotifications() {
        alerts.navigateToAlertsAndNotificationsPage();

    }

    @Then("GUIElements Alerts&Notif. Verify that I`m on the correct Page")
    public void iAmOnTheAlertAndNotificationsPage() {
        Assert.assertEquals( alerts.getHeader(), "Alerts & Notifications", "Wrong Page" );
    }


    @And("GUIElements Alerts&Notif. Fill out new notification message: {string}")
    public void FillOutNewNotificationMessage( String messageText ) {
        alerts.fillOutNewNotifMessage(messageText);
    }

    @And("GUIElements Alerts&Notif. Click on Add notification button")
    public void ClickOnAddNotifButton() {
        alerts.clickOnAddNotifButton();
    }

    @And("GUIElements Alerts&Notif. Read the notification message: {string}")
    public void ReadTheNotifMessage( String messageText ) {
        String txt = alerts.readNewNotif(messageText);
        Assert.assertEquals( txt, messageText, "Wrong message on the notification" );
    }


    @Then("GUIElements Alerts&Notif. Fill out and check notification message")
    public void FillOutAndCheckNotifMessage( DataTable dataTable ) {
        List<String> rows = dataTable.asList(String.class);
        for (String messageText: rows){
            alerts.fillOutNewNotifMessage( messageText );
            alerts.clickOnAddNotifButton();
            Assert.assertEquals( alerts.readNewNotif( messageText ), messageText, "Wrong message on the notification" );
        }
    }
}
