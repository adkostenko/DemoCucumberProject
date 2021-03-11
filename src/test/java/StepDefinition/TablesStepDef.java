package StepDefinition;

import PageObjects.CommonPage;
import PageObjects.Tables;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class TablesStepDef extends CommonPage {

    Tables dataTables = new Tables();

    @Given("DataTables. Navigate to data tables")
    public void datatablesNavigateToDataTables() {
        dataTables.navigateToDataTables();
    }

    @Then("DataTables. I check if I'm on the tables page")
    public void datatablesICheckIfIMOnTheTablesPage() {
        dataTables.checkIfItsCorrectPage();
    }

    @And("DataTables. I check the list of the elements in the Header")
    public void datatablesICheckTheListOfTheElementsInTheHeader() {
        dataTables.CheckTheListOfTheElementsInTheHeader();
    }


    @And("DataTables. I pick {string} elements in records per page controller")
    public void datatablesIPickElementsInRecordsPerPageController( String numberOfElements ) {
        dataTables.pickPaginationOptions(numberOfElements);

    }


    @And("DataTables. I will see {string} records on the page")
    public void datatablesIWillSeeRecordsOnThePage( String number ) {
        int numberOfElements = Integer.parseInt(number);
        int totalAmountOfElements = dataTables.getTheTotalAmountOfElements();
        if (numberOfElements > totalAmountOfElements) numberOfElements = totalAmountOfElements;

        dataTables.getNumberOfElementsOnTheTable();
        Assert.assertEquals(dataTables.getNumberOfElementsOnTheTable(), numberOfElements, "Numbers of the elements on the table and in selector don't match");
    }

    @And("DataTables. Search for: {string}")
    public void datatablesSearchFor( String arg0 ) {
        dataTables.searchForPerson(arg0);
    }

    @And("DataTables. Check if I see the expected result")
    public void datatablesCheckIfISeeTheExpectedResult( DataTable tables) {
        Assert.assertEquals(dataTables.getAllTheRecordsFromTable(), tables.asList(), "no match");
    }

    @And("DataTables. Check if data in webapp is matching the test data in the file")
    public void datatablesCheckIfDataInWebappIsMatchingTheTestDataInTheFile() {
        //tables.printTheTable();
        List<String> testData = dataTables.readTestData();
        Assert.assertEquals(dataTables.getTestData(), testData, "Actual data doesn't match the test data");
    }

}
