package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ModalsAndPopups extends CommonPage {
    Navigation navigation = new Navigation();
    Actions action = new Actions(driver);

    public void navigateToModalsAndPopups() {
        navigate();
        navigation.pressOnModalsPopupsItem();
    }

    public void verifyThatIMOnModalsAndPopupsPage() {
        By locator = By.cssSelector("div[class='col-md-12'] h3[class='panel-title']");
        Assert.assertEquals(getElement( locator ).getText(),"MODALS");
    }

    public void clickOnLaunchDefaultModalButton() {
        By locator = By.cssSelector( "div.col-md-4:nth-child(1) > button" );
        getElement( locator ).click();
    }

    public void clickOnSaveChangesButton() {
        By locator = By.cssSelector( "button[class='btn btn-primary']" );
        getElement( locator ).click();
    }

    public void clickOnLaunchFormModalButton() {
        By locator = By.cssSelector( "div.col-md-4:nth-child(2) > button" );
        getElement( locator ).click();
    }

    public void fillOutEmailField(String arg0) {
        By locator = By.id( "inputEmail3" );
        getElement( locator ).sendKeys( arg0 );
    }

    public void fillOutPasswordField( String arg0 ) {
        By locator = By.id( "inputPassword3" );
        getElement( locator ).sendKeys( arg0 );
    }

    public void clickOnSignInButton() {
        By locator = By.cssSelector( "button[class='btn btn-primary']" );
        getElement( locator ).click();
    }

    public void clickOnLaunchScrollingModal() {
        By locator = By.cssSelector( "div.col-md-4:nth-child(3) > button" );
        getElement( locator ).click();
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)");
    }


    public void closeScrollingModal() {
        By locator = By.cssSelector( "div[class='modal-footer ng-scope'] button:nth-child(1)" );
        getElement( locator ).click();
    }


    public void clickOnPopoverOnLeftButton() {
        By locator = By.cssSelector( "button[popover-placement='left']" );
        By text = By.xpath( "//div[contains(text(),'Popover on left')]" );
        getElement( locator ).click();
        Assert.assertEquals( getElement(text).getText(),"Popover on left");
    }

    public void clickOnPopoverOnBottomButton() {
        By locator = By.cssSelector( "button[popover-placement='bottom']" );
        By text = By.xpath( "//div[contains(text(),'Popover on bottom')]" );
        getElement( locator ).click();
        Assert.assertEquals( getElement(text).getText(),"Popover on bottom");
    }

    public void holdMouseOverTooltipOnTopAndReadTheMessage() {
        By locator = By.cssSelector( "button[tooltip-placement='top']" );
        action.moveToElement(getElement(locator)).perform();
    }

    public String  getTooltipOnTop() {
        By locator = By.cssSelector( "[class='tooltip top in fade" );
        return getClickableElement ( locator ).getAttribute( "" );
    }
}
