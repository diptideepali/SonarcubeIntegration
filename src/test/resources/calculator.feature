Feature: Calculator Operations
  As a user
  I want to perform basic arithmetic operations
  In order to use the calculator

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 7
    Then the result should be 12

  Scenario: Multiply two numbers
    Given I have a calculator
    When I multiply 3 and 4
    Then the result should be 12

  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 24 and 12
    Then the result should be 12
