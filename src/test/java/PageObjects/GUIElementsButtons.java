package PageObjects;

import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class GUIElementsButtons extends CommonPage {
    Navigation navigation = new Navigation();

    public void navigateToGUIElementsButtons() {
        navigate();
        navigation.pressOnButtonsItem();
    }

    public void verifyThatIMOnTheButtonsPage() {
        By locator = By.xpath( "//h1[normalize-space()='Buttons']" );
        Assert.assertEquals(getElement( locator ).getText(),"Buttons" );
    }

    public void clickOnButtonFromTheTransparentButtons() {
        By buttonsLocator = By.xpath( "//*[@class='panel-title'][contains(text(),'Transparent Buttons')]//..//../div/button" );
        List<WebElement> listOfButtons = getElements( buttonsLocator );
            for(WebElement element: listOfButtons){
                element.click();
            }


    }

    public void findButtonDropdowns() {
        By locator = By.cssSelector( "div[class='col-md-12'] h3[class='panel-title']" );
        Assert.assertEquals(getElement( locator ).getText(),"BUTTON DROPDOWNS" );
    }

    public void clickOnAButtonFromSingleButtonDropdowns() {
        By locator = By.xpath( "//button[@class='btn btn-default dropdown-toggle'][normalize-space()='Action']" );
        getElement( locator ).click();
    }

    public void selectFromTheDropdownMenu() {
        By locator = By.cssSelector( "div[class='btn-group open'] li:nth-child(5) a:nth-child(1)" );
        getElement( locator ).click();
    }

    public void clickOnAButtonFromDropupVariation() {
        By locator = By.xpath( "//button[@aria-expanded='false']" );
        getElement( locator ).click();
    }

    public void selectFromTheDropUpMenu() {
        By locator = By.cssSelector( "div[class='btn-group dropup open'] li:nth-child(3)" );
        getElement( locator ).click();
    }

    @After
    public void close(){
        navigation.quit();
    }
}
