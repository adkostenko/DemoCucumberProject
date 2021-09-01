package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BasicTables extends CommonPage {
  Navigation navigation = new Navigation();

    public void navigateToBasicTables() {
        navigate();
        navigation.pressOnBasicTablesItem();
    }

    public List<String> verifyContentOfTheTable() {
        By Locator = By.xpath("//body//section[@id='main-wrapper']//div[contains(@class,'ng-scope')]//div[contains(@class,'ng-scope')]//div[1]//div[1]//div[1]//div[2]//table[1] >tbody >tr >td");
        List<WebElement> cells = getElements(Locator);
        List<String> textFromCells = new ArrayList<>();
        for (WebElement element : cells){
            textFromCells.add(element.getText());
            System.out.println(textFromCells);
        }
        return textFromCells;
    }
}
