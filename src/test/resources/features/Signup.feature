Feature: Create an account on the page

  As an user, I should be able to sign up, so that I can log in
@wip
  Scenario: Sign up on the page
    Given user is already home page
    When  user clicks on Sign Up button
    And   user enters an username "deneme35"
    And   user enters  email address "mcelikft@gmail.com"
    And   user enters  password "12345678"
    And   user clicks on agreement and conditions button
