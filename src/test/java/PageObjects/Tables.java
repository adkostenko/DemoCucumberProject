package PageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tables extends CommonPage{
    String header = "Data Tables";
    String[] headerContents = {"Name", "Position", "Office", "Age", "Start date", "Salary"};
    Navigation navigation = new Navigation();

    public void navigateToDataTables() {
        navigate();
        navigation.pressOnDataTablesItem();
    }

    public void checkIfItsCorrectPage() {
        Assert.assertEquals( getElement( By.xpath( "//li[contains(text(),'Data Tables')]" ) ).getText(), "Data Tables", "Wrong page");
    }

    public void CheckTheListOfTheElementsInTheHeader() {
        By locator = By.cssSelector("[role = 'row'] > th");
        List<String> actualData = new ArrayList<>();
        for (int i = 0; i < getElements(locator).size(); i++) {
            actualData.add(getElements(locator).get(i).getText());
        }
        List<String> testData = Arrays.asList(headerContents);
        Assert.assertEquals(actualData, testData);
    }

    public void pickPaginationOptions( String numberOfElements ) {
        By locator = By.cssSelector( "select[name='example_length']" );
        Select selector = new Select( getElement( locator ) );
        selector.selectByValue( numberOfElements );
        waitForPageLoad();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getTheTotalAmountOfElements() {
        By locator = By.cssSelector("[class='dataTables_info']");
        String text = getClickableElement(locator).getText();
        return Integer.parseInt(text.substring(19, 21));
    }


    public int getNumberOfElementsOnTheTable() {
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        return getElements(tableLocator).size();
    }

    public void searchForPerson( String arg0 ) {
        By locator = By.cssSelector( "input[type='search']" );
        WebElement element = getClickableElement( locator );
        element.clear();
        element.sendKeys( arg0 );
    }

    public List<String> getAllTheRecordsFromTable() {
        By Locator = By.cssSelector("[id='example'] >tbody >tr >td");
        List<WebElement> cells = getElements(Locator);
        List<String> textFromCells = new ArrayList<>();
        for (WebElement element : cells){
            textFromCells.add(element.getText());
        }
        return textFromCells;
    }

    public void printTheTable() {
        pickPaginationOptions("100");
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        waitForPageLoad();
        List<WebElement> rows = getElements(tableLocator);
        List<String> tableContent = new ArrayList<>();
        for (WebElement element : rows) {
            tableContent.add(element.getText());
        }

        System.out.println(tableContent);
        try {
            FileUtils.writeLines(new File("src/test/resources/output.txt"), tableContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<String> readTestData() {
        List<String> lines = new ArrayList<>();
        Charset cs= StandardCharsets.UTF_8;
        try {
            lines = FileUtils.readLines(new File("src/test/resources/output.txt"), cs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public List<String> getTestData() {
        pickPaginationOptions("100");
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        waitForPageLoad();
        List<WebElement> rows = getElements(tableLocator);
        List<String> tableContent = new ArrayList<>();
        for (WebElement element : rows) {
            tableContent.add(element.getText());
        }
        return tableContent;
    }
}

