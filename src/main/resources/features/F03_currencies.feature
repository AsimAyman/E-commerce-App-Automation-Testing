@smoke
Feature: Select currency
  Scenario: Select Euro currency
    When Select Euro currency from the dropdown
    Then verify that the variable contains €