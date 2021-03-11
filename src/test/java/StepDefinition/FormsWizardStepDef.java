package StepDefinition;

import PageObjects.CommonPage;
import PageObjects.FormsWizard;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class FormsWizardStepDef extends CommonPage {

    FormsWizard wizard = new FormsWizard();

    @Given("FormsWizard. Navigate to Wizard page")
    public void navigateToWizardPage() {
        wizard.navigateToWizardPage();
    }

    @And("FormsWizard. Fill out the first page with: {string} and {string}")
    public void FillOutTheFirstPage( String arg0, String arg1 ) {
        wizard.filloutTheFirstPage(arg0, arg1);
    }

    @And("FormsWizard. Press Next Button")
    public void PressNextButton() {
        wizard.pressNextButton();
    }

    @And("FormsWizard. Fillout the second Page with: {string}, {string}, {string}, {string}")
    public void FilloutTheSecondPage( String arg0, String arg1, String arg2, String arg3 ) {
        wizard.fillOutStreet( arg0 );
        wizard.fillOutCity( arg1 );
        wizard.fillOutState( arg2 );
        wizard.fillOutZip( arg3 );
    }

    @And("FormsWizard. Press Submit button")
    public void PressSubmitButton() {
        wizard.pressSubmitButton();
    }

    @And("FormsWizard. Check Alert message: {string}")
    public void CheckAlertMessage( String message ) {
        Assert.assertEquals(wizard.checkAlertText(), message, "Getting the wrong message on alert");
    }

    @And("FormsWizard. Accept the alert")
    public void AcceptTheAlert() {
        wizard.acceptTheAlert();
    }

    @And("FormsWizard. Check data on last step: {string}, {string}, {string}, {string},{string}, {string}")
    public void CheckDataOnLastStep( String fName, String lName, String streetAddress, String city, String state, String zip ) {
        wizard.checkFirstName(fName);
        wizard.checkLastName(lName);
        wizard.checkAddress(streetAddress,city,state,zip);

    }
}
