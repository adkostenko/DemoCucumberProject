package StepDefinition;

import PageObjects.CommonPage;
import PageObjects.Cookies;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sun.jvm.hotspot.opto.Compile;

public class CookiesStepDef {

    Cookies cookies = new Cookies();

    @Given("Cookies. I navigate to :{string}")
    public void cookiesINavigateTo(String arg0) {
        cookies.navigateToCNN(arg0);
    }


    @Then("I get Cookies")
    public void iGetCookies() {
        cookies.getSomeCookies();
    }
}