package PageObjects;

import org.openqa.selenium.By;

public class FormsDragDrop extends CommonPage {
    Navigation navigation = new Navigation();

    public void navigateToDragDrop() {
        navigate();
        navigation.pressOnDragDropItem();
    }

    public void uploadFileFromOS() {
        By locator = By.cssSelector( "#file-dropzone" );
        getClickableElement( locator ).sendKeys("//Users/alonakostenko/Downloads/March2_1.pdf");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}