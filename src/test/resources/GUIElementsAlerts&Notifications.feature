Feature: I'm demonstrating ow I'm working with WebElements
  Background: Navigate to the Alerts & Notification page
    Given GUIElements Alerts&Notif. I navigate to alerts and notifications
    Then GUIElements Alerts&Notif. Verify that I`m on the correct Page

  Scenario: Add/Read notification
    And GUIElements Alerts&Notif. Fill out new notification message: "First message"
    And GUIElements Alerts&Notif. Click on Add notification button
    And GUIElements Alerts&Notif. Read the notification message: "First message"

  Scenario Outline: Add/Read notification Examples
    And GUIElements Alerts&Notif. Fill out new notification message: "<Message>"
    And GUIElements Alerts&Notif. Click on Add notification button
    And GUIElements Alerts&Notif. Read the notification message: "<Message>"
    Examples:
      |Message        |
      |First message  |
      |Second message |
      |Third message  |
      |Fourth message |

  Scenario: Add/Read notification Tables
    Then GUIElements Alerts&Notif. Fill out and check notification message
     |First message  |
     |Second message |
     |Third message  |
     |Fourth message |
