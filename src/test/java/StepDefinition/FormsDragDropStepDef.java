package StepDefinition;

import PageObjects.CommonPage;
import PageObjects.FormsDragDrop;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class FormsDragDropStepDef extends CommonPage {

    FormsDragDrop dragDrop = new FormsDragDrop();

    @Given("FormsDragDrop. Navigate to Multiple File Upload")
    public void NavigateToMultipleFileUpload() {
        dragDrop.navigateToDragDrop();
    }

    @And("FormsDragDrop. Upload file from OS")
    public void uploadFileFromOS() {
        dragDrop.uploadFileFromOS();

    }
}
