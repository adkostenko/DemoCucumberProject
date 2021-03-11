package PageObjects;

import org.openqa.selenium.By;

public class FormsMasks extends CommonPage{
    Navigation navigation = new Navigation();


    public void navigateToMasks() {
        navigate();
        navigation.pressOnMasksItem();
    }

    public void fillOutDateFieldWithValidData( String value ) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/form/div[1]/div/input");
        getElement(locator).click();
        getElement(locator).sendKeys(value);
    }

    public String getDate() {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[2]/form/div[1]/div/input");
        return getElement(locator).getAttribute("value");
    }

    public void fillOutPhoneNumberField( String arg0 ) {
        By locator = By.xpath( "/html[1]/body[1]/section[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]" );
        getElement(locator).click();
        getElement(locator).sendKeys(arg0);
    }

    public String getPhoneNumber() {
        By locator = By.xpath( "/html[1]/body[1]/section[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]" );
        return getElement( locator ).getAttribute( "arg0" );
    }
}


