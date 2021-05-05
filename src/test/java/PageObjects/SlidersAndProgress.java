package PageObjects;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SlidersAndProgress extends CommonPage{
    Navigation navigation = new Navigation();

    public void navigateToSlidersAndProgress() {
        navigate();
        navigation.pressOnSlidersAndProgressItem();
    }


    public void moveGreyHorizontalSlider(String arg0, String arg1) {

        By locator = By.xpath( "//body//section[@id='main-wrapper']//div[@class='row']//div[@class='row']//div[@class='row']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]" );
        By handle = By.xpath( "//body//section[@id='main-wrapper']//div[@class='row']//div[@class='row']//div[@class='row']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]" );
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement elementSlider = getClickableElement( locator );
        WebElement elementHandle = getClickableElement( handle );
        String initialPercent = elementSlider.getAttribute( "style" );
        System.out.println( "initialPercent:" + initialPercent );

        double dArg0 = Double.parseDouble(arg0);
        double dArg1 = Double.parseDouble(arg1);
        double step = 0.5;

        for (double i=dArg0; i<dArg1 ; i= i + step){
            dArg0 = dArg0 + step;
            js.executeScript("arguments[0].setAttribute('style', 'width: " + dArg0 + "%')", elementSlider);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].setAttribute('style', 'width: " + dArg0 + "%')", elementHandle);
            System.out.println(dArg0);
        }
    }

    public void moveRedHorizontalSlider( String arg0, String arg1 ) {

        By locator = By.xpath( "//body//section[@id='main-wrapper']//div[@class='row']//div[@class='row']//div[@class='row']//div[1]//div[5]//div[1]//div[1]//div[1]//div[1]//div[1]" );
        By handle = By.xpath( "//body//section[@id='main-wrapper']//div[@class='row']//div[@class='row']//div[@class='row']//div[1]//div[5]//div[1]//div[1]//div[1]//div[1]//div[2]" );
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement elementSlider = getClickableElement( locator );
        WebElement elementHandle = getClickableElement( handle );
        String initialPercent = elementSlider.getAttribute( "style" );
        System.out.println( "initialPercent:" + initialPercent );

        double dArg0 = Double.parseDouble(arg0);
        double dArg1 = Double.parseDouble(arg1);
        double step = 0.5;

        for (double i=dArg0; i>dArg1 ; i= i - step){
            dArg0 = dArg0 - step;
            js.executeScript("arguments[0].setAttribute('style', 'width: " + dArg0 + "%')", elementSlider);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].setAttribute('style', 'width: " + dArg0 + "%')", elementHandle);
            System.out.println(dArg0);
        }
    }

    public void moveGreyVerticalSlidersFromTo(String arg0, String arg1) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String init = "17.5";

        By locator = By.xpath("//div[@class='slider slider-default']//div[@class='slider slider-vertical']//div[@class='slider-selection']");
        By handle = By.xpath("//div[@class='slider slider-default']//div[@class='slider slider-vertical']//div[@class='slider-handle round']");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement elementSlider = getClickableElement(locator);
        WebElement elementHandle = getClickableElement(handle);
        String initialPercent = elementSlider.getAttribute("style");
        System.out.println("initialPercent:" + initialPercent);
        double dInit = Double.parseDouble(init);
        double dArg0 = Double.parseDouble(arg0);
        double dArg1 = Double.parseDouble(arg1);
        double step = 0.5;

        for (double i=dArg0; i<dArg1 ; i= i + step){
            dArg0 = dArg0 + step;
            js.executeScript("arguments[0].setAttribute('style', 'top: " + dArg0 + "%')", elementSlider);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].setAttribute('style', 'top: " + dArg0 + "%')", elementHandle);
            System.out.println(dArg0);
        }

    }

    public void moveRedVerticalSlidersFromTo( String arg0, String arg1 ) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By locator = By.xpath("//div[@class='slider slider-danger']//div[@class='slider slider-vertical']//div[@class='slider-selection']");
        By handle = By.xpath("//div[@class='slider slider-danger']//div[@class='slider slider-vertical']//div[@class='slider-handle round']");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement elementSlider = getClickableElement(locator);
        WebElement elementHandle = getClickableElement(handle);
        String argumentsValue = elementSlider.getAttribute("style");

        String initValue = StringUtils.substringBefore(argumentsValue.substring(argumentsValue.indexOf("width: ") + 6), "%;");

        double dArg0 = Double.parseDouble(arg0);
        double dArg1 = Double.parseDouble(arg1);
        double step = 10;
        for(double i=dArg0; i>dArg1 ; i=i-step){
            dArg0 = dArg0 - step;
            js.executeScript("arguments[0].setAttribute('style', 'top: " + dArg0 + "%')", elementSlider);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript("arguments[0].setAttribute('style', 'top: " + dArg0 + "%')", elementHandle);
            System.out.println(dArg0);
        }
    }


    public void changeGraySliderRange( String arg0, String arg1, String arg2, String arg3 ) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By bottomSlider = By.xpath("//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]");
        By bottomHandler = By.xpath("//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]");
        By topSlider = By.xpath("//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]");
        By topHandler = By.xpath("//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement elementBottomSlider = getClickableElement(bottomSlider);
        WebElement elementBottomHandler = getClickableElement(bottomHandler);
        WebElement elementTopSlider = getClickableElement(topSlider);
        WebElement elementTopHandler = getClickableElement(topHandler);

        String argumentsValue = elementBottomSlider.getAttribute("style");
        String argumentsValue1 = elementTopSlider.getAttribute("style");

        String initValue = StringUtils.substringBefore(argumentsValue.substring(argumentsValue.indexOf("width: ") + 6), "%;");
        double dArg0 = Double.parseDouble(arg0);
        double dArg1 = Double.parseDouble(arg1);
        double dArg2 = Double.parseDouble(arg2);
        double dArg3 = Double.parseDouble(arg3);
        double step = 5;
        for(double i=dArg0; i>dArg1 ; i=i-step) {
            dArg0 = dArg0 - step;
            js.executeScript( "arguments[0].setAttribute('style', 'width: " + dArg0 + "%')", elementBottomSlider );
            try {
                Thread.sleep( 50 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            js.executeScript( "arguments[0].setAttribute('style', 'width: " + dArg0 + "%')", elementBottomHandler );
            System.out.println( dArg0 );
        }
            for(double i=dArg2; i<dArg3 ; i=i+step){
                dArg2 = dArg2 + step;
                js.executeScript("arguments[0].setAttribute('style', 'width: " + dArg2 + "%')", elementTopSlider);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                js.executeScript("arguments[0].setAttribute('style', 'width: " + dArg2 + "%')", elementTopHandler);
                System.out.println(dArg0);
        }

    }
}


