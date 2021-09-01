package StepDefinition;

import PageObjects.CommonPage;
import PageObjects.Navigation;
import PageObjects.Settings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.eo.Se;
import org.testng.Assert;

public class SettingsStepDef extends CommonPage {
    Settings settings = new Settings();
    Navigation navigation = new Navigation();

    @Given("Settings. Navigate to the webpage")
    public void settingsNavigateToTheWebpage() {
        navigate();
    }

    @And("Settings. Click on Settings Icon")
    public void clickOnSettingsIcon() {
        settings.clickOnSettingsIcon();
    }

    @And("Settings. Select a grey page color")
    public void settingsSelectADifferentPageColor() {
        settings.selectGreyPageColor();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
