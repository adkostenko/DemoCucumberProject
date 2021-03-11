import PageObjects.Images;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImagesStepDef {
    Images images = new Images();
    @When("Images. I navigate to:{string}")
    public void imagesINavigateTo(String arg0) {
        images.navigate(arg0);
    }

    @Then("Images. I check if all the images in place.")
    public void imagesICheckIfAllTheImagesInPlace() {
        images.runCheck();
    }
}
