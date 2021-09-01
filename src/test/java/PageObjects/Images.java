package PageObjects;

public class Images extends CommonPage{
    public void runCheck(){
        testImages();
    }

    public void navigateToDemoqa( String arg0 ) {
        driver.navigate().to(arg0);
        waitForPageLoad();
    }
}
