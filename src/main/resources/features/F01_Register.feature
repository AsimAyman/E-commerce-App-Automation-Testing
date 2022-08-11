@smoke
Feature: Registration | user could register with new accounts
 Scenario:  guest user could register with valid data successfully
   Given navigate to registration page
   When  user select gender type
   And user enter first name automation and last name tester
   And user enter date of birth
#   we will generat a  email to use for Regester and save it in properties then we can use it with the login
   And user enter email field
   And user fills Password fields password@ password@
   And user clicks on register button
   Then success message is displayed
