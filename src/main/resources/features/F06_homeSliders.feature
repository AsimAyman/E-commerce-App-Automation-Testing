@smoke
Feature: Home Sliders
Scenario:  first slider is clickable on home page
  When click so user could navigate successfully
  Then user could navigate to Nokia url successfully
  Scenario:  second slider is clickable on home page
    Given user wait the second slider is displayed
    When  click so user could navigate successfully
    Then user could navigate to Iphone url successfully
