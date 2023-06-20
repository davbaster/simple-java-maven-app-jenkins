Feature: Message Testing
  Scenario: Test App Constructor
    Given two app instances
    Then they should have the same message

  Scenario: Test App Message
    Given an app instance
    Then it should return the message "Hello World!"
