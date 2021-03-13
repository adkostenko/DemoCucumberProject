package StepDefinition;

import PageObjects.BasicTables;
import PageObjects.CommonPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BasicTablesStepDef extends CommonPage {
    BasicTables basicTables = new BasicTables();

    @When("BasicTables. Navigate to Basic Tables")
    public void basictablesNavigateToBasicTables() {
        basicTables.navigateToBasicTables();
    }

    @And("BasicTables. Check if the data in the Table as expected")
    public void checkIfTheDataInTheTableAsExpected( DataTable tables ) {
        Assert.assertEquals(basicTables.checkTheDataInTheTable(), tables.asList());
    }
}