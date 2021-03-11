package StepDefinition;

import PageObjects.FormsComponents;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class FormsComponentsStepDef {

    FormsComponents components = new FormsComponents();

    @Given("FormsComponents. Navigate to Forms Components")
    public void NavigateToFormsComponents() {
        components.navigateToComponents();
    }

    @And("FormsComponents. Fill out email field: {string}")
    public void FillOutEmailField( String arg0 ) {
        components.FillOutEmailField(arg0);
    }

    @And("FormsComponents. Fill out password field: {string}")
    public void FillOutPasswordField( String arg0 ) {
        components.FillOutPasswordField( arg0 );
    }

    @And("Attach file")
    public void attachFile() {
        components.attachFile();
    }

    @And("FormsComponents. Fill out Input with success icon: {string}")
    public void FillOutInputWithSuccessIcon( String value ) {
        components.fillOutInputWithSuccessIcon(value);
    }

    @And("FormsComponents. Fill out Input with warning icon: {string}")
    public void FillOutInputWithWarningIcon( String value ) {
        components.fillOutInputWithWarningIcon( value );
    }

    @And("FormsComponents. Fill out Input with error icon: {string}")
    public void FillOutInputWithErrorIcon( String value ) {
        components.fillOutInputWithErrorIcon(value);
    }

    @And("FormsComponents. Select from the Selects: {string}, {string}, {string}, {string}, {string}")
    public void SelectFromTheSelects( String arg0, String arg1, String arg2, String arg3, String arg4 ) {
        components.makeSelectionFromSelects(arg0, arg1, arg2, arg3, arg4);
    }

    @And("FormsComponents. Select an option2 from Radio")
    public void SelectAndOptionFromRadio() {
        components.selectAndOptionFromRadio();
    }

    @And("FormsComponents. Check out option2 from Checkbox")
    public void CheckOutOptionFromCheckbox( ) {
        components.checkOutOptionFromCheckbox();
    }

    @And("FormsComponents. Uncheck out option1 from Checkbox")
    public void UncheckOutOptionFromCheckbox() {
        components.uncheckOutOptionFromCheckbox();
    }
}
