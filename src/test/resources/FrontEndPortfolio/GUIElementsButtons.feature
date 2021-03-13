Feature:  This is a demonstration of my work with buttons

  Background: I navigate to Buttons page
  Given GUIElements Buttons. I navigate to Buttons
  Then GUIElements Buttons. Verify that I`m on the Buttons page

  Scenario: Press on  the transparent buttons
    And GUIElements Buttons. Click on each button from the transparent buttons


  Scenario: Press on DropDown
    Then GUIElements Buttons. Find Button Dropdowns menu
    And GUIElements Buttons. Click on a button from Single button dropdowns
    And GUIElements Buttons. Select "Separated Link" from the dropdown menu

  Scenario: Press on DropUp
    Then GUIElements Buttons. Find Button Dropdowns menu
    And GUIElements Buttons. Click on a button from Dropup variation
    # I need help with this step ^. Locator is not correct
    And GUIElements Buttons. Select "Another Action" from the dropdUp menu

