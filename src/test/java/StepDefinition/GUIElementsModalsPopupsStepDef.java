package StepDefinition;

import PageObjects.CommonPage;
import PageObjects.ModalsAndPopups;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GUIElementsModalsPopupsStepDef extends CommonPage {
 ModalsAndPopups modalsAndPopups = new ModalsAndPopups();

    @Given("GUIElements ModalsPopups. I navigate to Modals and Popups")
    public void iNavigateToModalsAndPopups() {
        modalsAndPopups.navigateToModalsAndPopups();
    }

    @Then("GUIElements ModalsPopups. Verify that I`m on Modals and Popups page")
    public void verifyThatIMOnModalsAndPopupsPage() {
        modalsAndPopups.verifyThatIMOnModalsAndPopupsPage();
    }

    @And("GUIElements ModalsPopups. Click on Launch default modal button")
    public void clickOnLaunchDefaultModalButton() {
        modalsAndPopups.clickOnLaunchDefaultModalButton();
    }

    @And("GUIElements ModalsPopups. Click on Save Changes button")
    public void clickOnSaveChangesButton() {
        modalsAndPopups.clickOnSaveChangesButton();
    }

    @And("GUIElements ModalsPopups. Click on Launch form modal button")
    public void clickOnLaunchFormModalButton() {
        modalsAndPopups.clickOnLaunchFormModalButton();
    }

    @And("GUIElements ModalsPopups. Fill out email field: {string}")
    public void fillOutEmailField( String arg0 ) {
        modalsAndPopups.fillOutEmailField(arg0);
    }

    @And("GUIElements ModalsPopups. Fill out password field: {string}")
    public void fillOutPasswordField( String arg0 ) {
        modalsAndPopups.fillOutPasswordField(arg0);
    }

    @And("GUIElements ModalsPopups. Click on Sign In button")
    public void clickOnSignInButton() {
        modalsAndPopups.clickOnSignInButton();
    }

    @And("GUIElements ModalsPopups. Click on Launch Scrolling Modal")
    public void clickOnLaunchScrollingModal() {
        modalsAndPopups.clickOnLaunchScrollingModal();
    }

    @And("GUIElements ModalsPopups. Scroll down")
    public void scrollDown() {
        modalsAndPopups.scrollDown();
    }

    @And("GUIElements ModalsPopups. Close Scrolling Modal")
    public void closeScrollingModal() {
        modalsAndPopups.closeScrollingModal();
    }


    @And("GUIElements ModalsPopups. Click on Popover On Left button and read")
    public void clickOnPopoverOnLeftButton() {
        modalsAndPopups.clickOnPopoverOnLeftButton();
    }

    @And("GUIElements ModalsPopups. Click on Popover On Bottom button and read")
    public void clickOnPopoverOnBottomButton() {
        modalsAndPopups.clickOnPopoverOnBottomButton();
    }

    @And("GUIElements ModalsPopups. Hold mouse over Tooltip on Top")
    public void holdMouseOverTooltipOnTopAndReadTheMessage() {
        modalsAndPopups.holdMouseOverTooltipOnTopAndReadTheMessage();
    }

    @And("GUIElements ModalsPopups. Read the Tooltip on Top message")
    public void readTheTooltipOnTopMessage() {
        modalsAndPopups.getTooltipOnTop();
    }
}
