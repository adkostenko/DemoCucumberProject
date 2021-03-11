Feature:

  Scenario Outline: Fill Out Wizard Form
    Given FormsWizard. Navigate to Wizard page
    And FormsWizard. Fill out the first page with: "<First Name>" and "<Last Name>"
    And FormsWizard. Press Next Button
    And FormsWizard. Fillout the second Page with: "<Street Address>", "<City>", "<State>", "<Zip>"
    And FormsWizard. Press Next Button
    And FormsWizard. Press Submit button
    And FormsWizard. Check Alert message: "information completed"
    And FormsWizard. Accept the alert
    And FormsWizard. Check data on last step: "<First Name>", "<Last Name>", "<Street Address>", "<City>","<State>", "<Zip>"
    Examples:
      |First Name  | Last Name | Street Address| City|State|Zip  |
      |First Name  | Last Name | Street Address| City|State|Zip  |
      |Tom         | Ford      | 28374 West st | NYC | NY  |10928|

