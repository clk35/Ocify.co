Feature: Create an Advertisement Functionality

  As a user, I should be able to create an Advert, so that end-customer can search for my advertisement
@wip
  Scenario: Select Category functionality verification
    Given user is already logged in
    Given user is already on his-her own market
    When  user clicks on Post Ad button
    And   user enters  email "qweertt7@gmail.com" and password "288023"
    And   user selects first main category "Elektronik"
    And   user selects first sub-category "Beyaz Esya"
    And   user selects last sub-category "Camasir Makineleri"
    And   user clicks on Continue after selection completed
    Then  user should be on the Listing Details step

