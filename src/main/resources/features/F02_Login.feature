@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Background:
    Given user go to login page
  Scenario: user could login with valid email and password
  When user could login with valid email and password;
  And  user press on login button
  Then user login to the system successfully


  Scenario: user could not login with invalid email and password
    When user could not login with invalid invalid@gmail and P@ssw0rd
    And  user press on login button
    Then user login fails