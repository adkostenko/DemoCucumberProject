Feature: This is a demonstration of my work with Basic Tables

  Background: I navigate to Basi tables page
    When BasicTables. Navigate to Basic Tables

  Scenario: Check the data in Borderless Table as expected
  And BasicTables. Check if the data in the Table as expected
    |1 |Mark	|Otto	    |@mdo|
    |2 |Jacob	|Thornton	|@fat|
    |3 |Larry	|the Bird	|@twitter|

    #Not working^^