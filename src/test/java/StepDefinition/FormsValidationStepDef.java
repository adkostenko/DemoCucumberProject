package StepDefinition;

import PageObjects.FormsValidation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class FormsValidationStepDef {
    FormsValidation validation = new FormsValidation();

    @Given("FormsValidation. Navigate to validation page")
    public void formsValidationNavigateToValidationPage() {
        validation.navigateToValidationPage();
    }

    @And("FormsValidation. Fill out name field: {string}")
    public void formsValidationFillOutNameField( String arg0 ) {
        validation.fillOutNameField( arg0 );
    }

    @And("FormsValidation. Fill out Username field: {string}")
    public void formsValidationFillOutUsernameField( String arg0 ) {
        validation.fillOutUsernameField(arg0);
    }

    @And("FormsValidation. Fill out email field: {string}")
    public void formsValidationFillOutEmailField( String arg0 ) {
        validation.fillOutEmailField(arg0);
    }

    @And("FormsValidation. Read a notification message {string}, {string}, {string}")
    public void formsValidationReadANotificationMessage( String arg0, String arg1, String arg2 ) {
        validation.readNotificationMessage(arg0, arg1, arg2);
    }

    @And("FormValidation. Press on Submit button")
    public void formValidationPressOnSubmitButton() {
        validation.pressOnSubmitButton();
    }
}
