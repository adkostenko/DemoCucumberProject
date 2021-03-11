package PageObjects;

import PageObjects.CommonPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Navigation extends CommonPage {

    public void pressOnAlertsMenuItem() {
        pressOnUIElementsMenuItem();
        getClickableElement( By.cssSelector( "[title='Alerts & Notifications']" ) ).click();
    }

    protected void pressOnUIElementsMenuItem() {
        getClickableElement( By.cssSelector( "[title='UI Elements']" ) ).click();
    }

    public void pressOnButtonsItem(){
        pressOnUIElementsMenuItem();
        getClickableElement( By.cssSelector( "[title='Buttons']" ) ).click();
    }
    public void pressOnModalsPopupsItem(){
        pressOnUIElementsMenuItem();
        getClickableElement( By.cssSelector( "[title='Modals & Popups']" )).click();
    }

    public void pressOnSlidersAndProgressItem(){
        pressOnUIElementsMenuItem();
        getClickableElement( By.cssSelector( "[title='Sliders & Progress']" )).click();
    }

    private void pressOnFormsItem() {
        getClickableElement( By.cssSelector( "[title='Forms']" ) ).click();
    }

    public void pressOnValidationItem(){
        pressOnFormsItem();
        getClickableElement( By.cssSelector("[title='Validation']"  ) ).click();
    }
    public void pressOnMasksItem() {
        pressOnFormsItem();
        getClickableElement( By.cssSelector("[title='Mask']"  ) ).click();
    }

    public void pressOnComponentsItem() {
        pressOnFormsItem();
        getClickableElement( By.cssSelector("[title='Components']"  ) ).click();
    }

    public void pressOnWizardItem() {
        pressOnFormsItem();
        getClickableElement( By.cssSelector( "[title='Wizard']" ) ).click();
    }

    public void pressOnDragDropItem() {
        pressOnFormsItem();
        getClickableElement( By.cssSelector( "[title='Multiple File Upload']" ) ).click();
    }

    public void pressOnTablesItem(){
        getClickableElement( By.cssSelector( "[title='Tables']" ) ).click();
    }

    public void pressOnDataTablesItem() {
        pressOnTablesItem();
        getClickableElement( By.cssSelector( "[title='Data Tables']" ) ).click();
    }
}


