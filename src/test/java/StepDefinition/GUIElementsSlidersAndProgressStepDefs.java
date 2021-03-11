package StepDefinition;

import PageObjects.SlidersAndProgress;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GUIElementsSlidersAndProgressStepDefs {
    SlidersAndProgress sliders = new SlidersAndProgress();

    @Given("GUIElements SlidersAndProgress. Navigate to Sliders and Progress")
    public void navigateToSlidersAndProgress() {
        sliders.navigateToSlidersAndProgress();

    }

    @And("GUIElements SlidersAndProgress. Move grey horizontal Slider from {string} to {string}")
    public void MoveGreyHorizontalSliderFromTo( String arg0, String arg1 ) {
        sliders.moveGreyHorizontalSlider(arg0, arg1);
    }

    @And("GUIElements SlidersAndProgress. Move red horizontal Slider from {string} to {string}")
    public void guielementsSlidersAndProgressMoveRedHorizontalSliderFromTo( String arg0, String arg1 ) {
        sliders.moveRedHorizontalSlider(arg0, arg1);
    }

    @And("GUIElements SlidersAndProgress. Move grey vertical sliders from {string} to {string}")
    public void moveGreyVerticalSlidersFromTo( String arg0, String arg1 ){
            sliders.moveGreyVerticalSlidersFromTo(arg0,arg1);
    }

    @And("GUIElements SlidersAndProgress. Move red vertical sliders from {string} to {string}")
    public void moveRedVerticalSlidersFromTo( String arg0, String arg1 ) {
        sliders.moveRedVerticalSlidersFromTo(arg0,arg1);
    }

    @And("GUIElements SlidersAndProgress. Change Grey slider range: buttom from {string} to {string} and top from {string} to {string}")
    public void ChangeGreySliderRangeButtomFromToAndTopFromTo( String arg0, String arg1, String arg2, String arg3 ) {
        sliders.changeGraySliderRange(arg0, arg1, arg2, arg3);
    }
}
