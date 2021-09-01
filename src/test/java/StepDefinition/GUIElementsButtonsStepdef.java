package StepDefinition;

import PageObjects.GUIElementsButtons;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GUIElementsButtonsStepdef  {
    GUIElementsButtons buttons = new GUIElementsButtons();

    @Given("GUIElements Buttons. I navigate to Buttons")
    public void iNavigateToButtons() {
        buttons.navigateToGUIElementsButtons();
    }

    @Then("GUIElements Buttons. Verify that I`m on the Buttons page")
    public void verifyThatIMOnTheButtonsPage() {
        buttons.verifyThatIMOnTheButtonsPage();
    }

    @And("GUIElements Buttons. Click on each button from the transparent buttons")
    public void clickOnButtonFromTheTransparentButtons() {
        buttons.clickOnButtonFromTheTransparentButtons();
    }

    @Then("GUIElements Buttons. Find Button Dropdowns menu")
    public void findButtonDropdowns() {
        buttons.findButtonDropdowns();
    }

    @And("GUIElements Buttons. Click on a button from Single button dropdowns")
    public void clickOnAButtonFromSingleButtonDropdowns() {
        buttons.clickOnAButtonFromSingleButtonDropdowns();
    }


    @And("GUIElements Buttons. Select {string} from the dropdown menu")
    public void selectFromTheDropdownMenu( String arg0 ) {
        buttons.selectFromTheDropdownMenu();
    }


    @And("GUIElements Buttons. Click on a button from DropUp variation")
    public void clickOnAButtonFromDropupVariation() {
        buttons.clickOnAButtonFromDropupVariation();
    }

    @And("GUIElements Buttons. Select {string} from the dropdUp menu")
    public void selectFromTheDropdUpMenu( String arg0 ) {
        buttons.selectFromTheDropUpMenu();
    }
}
