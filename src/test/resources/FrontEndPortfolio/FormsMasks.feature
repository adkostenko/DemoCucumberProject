Feature: This is a demonstration of my work with Masks

Background: I navigate to Masks page
  Given FormsMasks. Navigate to masks

  Scenario: Fill out Date field in Form Mask
    And FormsMasks. Fill out valid data in date field: "12122021"
    And FormsMasks. Verified the text is as entered: "12/12/2021"


  Scenario: Fill out Phone field in Form Mask
    And FormsMasks. Fill out valid data in phone field: "8880039283"
    And FormsMasks. Verified the phone number is as entered: "(888) 003-9283"
    #ask about it^ what`s the difference bettween 1 and 2?