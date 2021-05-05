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

    public List<List<String>> verifyContentOfTheTable() {
        List<List<String>> actualData = new ArrayList<>();
        By rowLocator = By.cssSelector("div.row:nth-child(1) > div.col-md-6:nth-child(1) > div.panel.panel-default:nth-child(1) > div.panel-body:nth-child(2) > table.table:nth-child(1) > tbody > tr");
        List<WebElement> rowElement = getElements(rowLocator);
        List<String> dataFromRow = new ArrayList<>();
        List<WebElement> listOfCells;
        for (int i=0; i<rowElement.size(); i++){
            By genericLocator = By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr["+(i+1)+"]/td");
            listOfCells = getElements(genericLocator);
            for (int j =0; j<listOfCells.size();j++){
                dataFromRow.add(listOfCells.get(j).getText());
            }
            actualData.add(new ArrayList<>(dataFromRow));
            dataFromRow.clear();
        }
        return actualData;

    }

}
