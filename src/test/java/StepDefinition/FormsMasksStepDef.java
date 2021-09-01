package StepDefinition;

import PageObjects.FormsMasks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class FormsMasksStepDef {
    FormsMasks masks = new FormsMasks();

    @Given("FormsMasks. Navigate to masks")
    public void formsMasksNavigateToMasks() {
        masks.navigateToMasks();
    }


    @And("FormsMasks. Fill out valid data in date field: {string}")
    public void FillOutValidDataInDateField( String arg0 ) {
        masks.fillOutDateFieldWithValidData(arg0);
    }

    @And("FormsMasks. Verified the text is as entered: {string}")
    public void VerifiedTheTextIsAsEntered( String value ) {
        Assert.assertEquals( masks.getDate(), value );
    }

    @And("FormsMasks. Fill out valid data in phone field: {string}")
    public void FillOutValidDataInPhoneField( String arg0 ) {
        masks.fillOutPhoneNumberField(arg0);

    }

    @And("FormsMasks. Verified the phone number is as entered: {string}")
    public void VerifiedThePhoneNumberIsAsEntered( String value ) {
        Assert.assertEquals( masks.getPhoneNumber(), value );
    }

}
