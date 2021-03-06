package StepDefinition;

import PageObjects.BasicTables;
import PageObjects.CommonPage;
import PageObjects.Tables;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

import java.util.List;

import java.util.List;

public class BasicTablesStepDef extends CommonPage {
    BasicTables basicTables = new BasicTables();
    Tables tables = new Tables();

    @When("BasicTables. Navigate to Basic Tables")
    public void basictablesNavigateToBasicTables() {
        basicTables.navigateToBasicTables();
    }

    @And("BasicTables. Verify content of the table")
    public void verifyContentOfTheTable( DataTable dataTable) {
        basicTables.verifyContentOfTheTable();
    }

}
