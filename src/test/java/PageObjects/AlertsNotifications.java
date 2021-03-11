package PageObjects;

import org.openqa.selenium.By;

public class AlertsNotifications extends CommonPage {

        Navigation navigation = new Navigation();

        public void navigateToAlertsAndNotificationsPage() {
            navigate();
            navigation.pressOnAlertsMenuItem();
        }

    public String getHeader() {
            waitForPageLoad();
        return getElement( By.xpath( "//li[contains(text(),'Alerts & Notifications')]" )).getText();
    }

    public void fillOutNewNotifMessage( String messageText ) {
            By locator = By.cssSelector( "[ng-model='newNotification']" );
            getElement( locator ).clear();
            getElement(locator).sendKeys( messageText );
    }

    public void clickOnAddNotifButton() {
            By locator = By.cssSelector( "button[class='btn btn-success']" );
            getClickableElement( locator).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String readNewNotif(String messageText) {
        return getElement( By.xpath("//*[@class='ng-scope ng-binding'][contains(text(),'" + messageText + "')]")).getText();
    }
}
