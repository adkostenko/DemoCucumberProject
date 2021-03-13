Feature: This is a demonstration of my work with Validation Forms and error messages

Background: I navigate to Validation page
  Given FormsValidation. Navigate to validation page

  Scenario Outline: check validation notifications
    And FormsValidation. Fill out name field: "<Name>"
    And FormsValidation. Fill out Username field: "<Username>"
    And FormsValidation. Fill out email field: "<Email>"
    And FormValidation. Press on Submit button
    And FormsValidation. Read a notification message "<NotificationForName>", "<NotificationForUsername>", "<NotificationForEmail>"

    Examples:
    |Name  |Username  | Email         | NotificationForName | NotificationForUsername   | NotificationForEmail|
    | fg   |gh        |al             |You name is required.|   Username is too short.  | Enter a valid email.|
    | al   | alonakost| alona@test.com|You name is required.|   Username is too long.   |                     |
    |      | dfdf     | Email@g.cf    |                     |                           |                     |

# Ask about the second loop