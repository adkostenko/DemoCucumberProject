Feature: This is a demonstration of my work with fields and check boxes

  Background: I navigate to Forms Components page
    Given FormsComponents. Navigate to Forms Components

  Scenario: Fill out basic form
    And FormsComponents. Fill out email field: "email@test.com"
    And FormsComponents. Fill out password field: "Password"
    And Attach file

  Scenario: Fill out Form Elements
    And FormsComponents. Fill out Input with success icon: "Success"
    And FormsComponents. Fill out Input with warning icon: "Warning"
    And FormsComponents. Fill out Input with error icon: "Error"

  Scenario: Select items in selectors
    And FormsComponents. Select from the Selects: "1", "2", "3", "4", "5"

  Scenario: Check and Uncheck Custom Checkboxes and Radios
    And FormsComponents. Select an option2 from Radio
    And FormsComponents. Check out option2 from Checkbox
    And FormsComponents. Uncheck out option1 from Checkbox