package PageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Settings extends CommonPage{


    public void clickOnSettingsIcon() {
        getClickableElement( By.cssSelector( "i[class='icon-settings']" ) ).click();
    }

    public void selectGreyPageColor() {
        getClickableElement( By.xpath( "//div[@class='row']//div[1]//ul[1]//li[6]//div[1]//span[1]" ) ).click();
    }


    public void checkHeaderColor() {
        By locator = By.xpath( "//section[@id='main-wrapper']" );
        Assert.assertEquals(getElement( locator ).getClass(), "theme-grey-full", "wrong color"  );

    }
}
