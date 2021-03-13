Feature: This is a demonstration of my work with Settings
  Background: I navigate to the web page
    Given Settings. Navigate to the webpage

  Scenario: Settings. Change the color of the webPage
    And Settings. Click on Settings Icon
    And Settings. Select a grey page color
    And Settings. Check if the Header changed to grey color
    #last step does not work as expected