Feature: App Testing

  Scenario: Test App messages are the same
    Given an app instance
    Then the message should be "Hello World!"

  Scenario: Test if message is long
    Given an app instance
    Then the message should be long

  Scenario: Test message with prefix
    Given an app instance
    When I add the prefix "Prefix: " to the message
    Then the message should start with "Prefix: "

  Scenario: Test count of character in message
    Given an app instance
    When I count the character "o" in the message
    Then the count should be 2

  Scenario: Test replace in message
    Given an app instance
    When I replace 'Hello' with 'Hi' in the message
    Then the message should be 'Hi World!'
