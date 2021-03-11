package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FormsComponents extends CommonPage{
    Navigation navigation = new Navigation();


    public void navigateToComponents() {
        navigate();
        navigation.pressOnComponentsItem();
    }


    public void FillOutEmailField( String arg0 ) {
        By locator = By.cssSelector( "#exampleInputEmail1" );
        getClickableElement( locator ).sendKeys( arg0 );
    }

    public void FillOutPasswordField( String arg0 ) {
        By locator = By.cssSelector( "#exampleInputPassword1" );
        getClickableElement( locator ).sendKeys( arg0 );
    }

    public void attachFile() {
        By locator = By.cssSelector( "#exampleInputFile" );
        getClickableElement( locator ).sendKeys("/Users/alonakostenko/Downloads/March2_1.pdf");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fillOutInputWithSuccessIcon( String value ) {
        By locator = By.cssSelector( "#inputSuccess2" );
        getClickableElement(locator).sendKeys( value );
    }

    public void fillOutInputWithWarningIcon( String value ) {
        By locator = By.cssSelector( "#inputWarning2" );
        getClickableElement(locator).sendKeys( value );
    }

    public void fillOutInputWithErrorIcon( String value ) {
        By locator = By.cssSelector( "#inputError2" );
        getClickableElement(locator).sendKeys( value );
    }

    public void makeSelectionFromSelects(String arg0, String arg1, String arg2, String arg3, String arg4) {
        Select select = new Select( getClickableElement( By.xpath( "//div[4]//select[1]" ) ) );
        if (select.isMultiple()){
            select.selectByValue( arg0 );
            select.selectByValue( arg1 );
            select.selectByValue( arg2 );
            select.selectByValue( arg3 );
            select.selectByValue( arg4 );
        }
    }

    public void selectAndOptionFromRadio() {
        By locator = By.cssSelector( "div.radio:nth-child(2) > div.iradio_flat-grey:nth-child(1) > ins" );
        getElement( locator ).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkOutOptionFromCheckbox() {
        By locator = By.cssSelector( "div.radio:nth-child(2) > div.icheckbox_flat-grey:nth-child(1) > ins" );
        getElement( locator ).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void uncheckOutOptionFromCheckbox() {
        By locator = By.cssSelector( "div[class='radio'] div[class='icheckbox_flat-grey checked'] ins[class='iCheck-helper']" );
        getElement( locator ).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


