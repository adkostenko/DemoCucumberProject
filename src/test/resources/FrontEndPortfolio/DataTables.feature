Feature: This is a demonstration of my work with Data Tables

  Background: I navigate to Data Tables page
    Given DataTables. Navigate to data tables
    Then DataTables. I check if I'm on the tables page

  Scenario Outline: Check pagination
    And DataTables. I check the list of the elements in the Header
    And DataTables. I pick "<Rows>" elements in records per page controller
    And DataTables. I will see "<Rows>" records on the page
    Examples:
      |Rows|
      |10  |
      |25  |
      |50  |
      |100 |

  Scenario: Check search
    And DataTables. Search for: "Yuri Berry"
    And DataTables. Check if I see the expected result
     |Yuri Berry|Chief Marketing Officer (CMO)|New York|40|2009/06/25|$675,000|

  Scenario: read search queries from the file
    And DataTables. Check if data in webapp is matching the test data in the file
