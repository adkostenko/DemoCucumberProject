Feature: This is a demonstration of my work with modals and pop-ups

  Background: I navigate to Modals and Popups page
    Given GUIElements ModalsPopups. I navigate to Modals and Popups
    Then GUIElements ModalsPopups. Verify that I`m on Modals and Popups page

  Scenario: Open Default Modal
    And GUIElements ModalsPopups. Click on Launch default modal button
    And GUIElements ModalsPopups. Click on Save Changes button

  Scenario: Open and fill out Form Modal
    And GUIElements ModalsPopups. Click on Launch form modal button
    And GUIElements ModalsPopups. Fill out email field: "alona@test.com"
    And GUIElements ModalsPopups. Fill out password field: "test123"
    And GUIElements ModalsPopups. Click on Sign In button


  Scenario: Open and scroll Scrolling Modal
    And GUIElements ModalsPopups. Click on Launch Scrolling Modal
    And GUIElements ModalsPopups. Scroll down
    And GUIElements ModalsPopups. Close Scrolling Modal


 Scenario: Read Popovers
    And GUIElements ModalsPopups. Click on Popover On Left button and read
    And GUIElements ModalsPopups. Click on Popover On Bottom button and read


  Scenario: Read tooltips
    And GUIElements ModalsPopups. Hold mouse over Tooltip on Top
    And GUIElements ModalsPopups. Read the Tooltip on Top message

#need to add assertion. but i don`t know how to do that^^
  #Also, need to ask why It runs every test seperatly, but not all together. It does not reopen a browser again