package PageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class FormsWizard extends CommonPage{
    Navigation navigation = new Navigation();

    public void navigateToWizardPage() {
        navigate();
        navigation.pressOnWizardItem();
    }

    public void filloutTheFirstPage( String arg0, String arg1 ) {
        By fName = By.cssSelector("input[name='firstName']");
        By lName = By.cssSelector( "input[name='lastName']" );
        getClickableElement( fName ).sendKeys( arg0 );
        getClickableElement( lName ).sendKeys( arg1 );
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pressNextButton() {
        By locator = By.cssSelector( "a[class='btn btn-primary ng-scope']" );
        getClickableElement( locator ).click();
    }

    public void fillOutStreet( String arg0 ) {
        By street = By.cssSelector( "input[name='streetAddress']" );
        getClickableElement( street ).clear();
        getClickableElement( street ).sendKeys( arg0 );
    }

    public void fillOutCity( String arg1 ) {
        By city = By.cssSelector( "input[name='city']" );
        getClickableElement( city ).clear();
        getClickableElement( city ).sendKeys( arg1 );
    }

    public void fillOutState( String arg2 ) {
        By state = By.cssSelector( "input[name='state']" );
        getClickableElement( state ).clear();
        getClickableElement( state ).sendKeys( arg2 );
    }

    public void fillOutZip( String arg3 ) {
        By zip = By.cssSelector( "input[name='postalCode']" );
        getClickableElement( zip ).clear();
        getClickableElement( zip ).sendKeys( arg3 );
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pressSubmitButton() {
        By locator = By.cssSelector( "button[class='btn btn-primary ng-scope']" );
        getClickableElement( locator ).click();
    }

    public void checkAlertMessage( String arg0 ) {
        By locator = By.cssSelector( "button[class='btn btn-primary ng-scope']" );
        getClickableElement( locator ).click();
    }

    public String checkAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void acceptTheAlert() {
        driver.switchTo().alert().accept();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkFirstName( String arg0 ) {
        By locator = By.xpath( "//*[normalize-space()='First Name:']/../p" );
        try {
            Assert.assertEquals( getClickableElement( locator ).getText(), arg0, "First name doesn't match: " + " getting " +
                    " this: " + getElement( locator ).getText() + " instead of " + arg0 );
        } catch (AssertionError assertionError) {
            getScreenShot();
            Assert.fail( assertionError.getMessage() );
        }
    }

    public void checkLastName(String arg0) {
            By locator = By.xpath("//*[normalize-space()='Last Name:']/../p");
            Assert.assertEquals(getClickableElement(locator).getText(), arg0, "Last name doesn't match: " + " getting " +
                    " this: " + getElement(locator).getText() + " instead of " + arg0);
        }
    public void checkAddress(String streetAddress,String city,String state,String zip) {
        By locator = By.xpath("//*[normalize-space()='Address:']/../p");
        Assert.assertEquals(getClickableElement(locator).getText(), streetAddress+ "\n" +
                city + ", " + state + " " + zip, "Address doesn't match: " + " getting " +
                " this: " + getElement(locator).getText() + " instead of " + streetAddress);
    }

}

