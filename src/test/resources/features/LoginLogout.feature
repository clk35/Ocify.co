@login
Feature: Login and Logout Functionality

  As an user, i should be able to login and logout successfully


  Scenario: User logins on the home page
    Given user is already home page
    When  user clicks on login button
    When  user enters  email address "qweertt7@gmail.com"
    And   user enters  password "12345678"
    Then  user should be logged in

  @logout
  Scenario:User logs out from the page
    Given user is already logged in
    When  user clicks on profile avatar
    And   user clicks  on logout button
    Then  user should be logged out