Feature: Create an Advertisement Functionality

  As a user, I should be able to create an Advert, so that end-customer can search for my advertisement

  Scenario: Create an Advertisement functionality verification
    Given user is already logged in
    Given user is already on his-her own market
    When  user clicks on Post Ad button
    And   user enters  email "qweertt7@gmail.com" and password "288023"
    And   user selects first main category "Elektronik"
    And   user selects first sub-category "Beyaz Esya"
    And   user selects last sub-category "Camasir Makineleri"
    And   user clicks on Continue after selection completed
    Then  user should be on the Listing Details step
    When  user clicks on Contact Information
    And   user types title "Bosch 9 kg Camasir makinesi"
    And   user types price 250 and standard price 350
    And   user adds description about product
    And   user uploads product photo
    And   user clicks on publish button
    And   user clicks on continue button on Preview Page
    And   user doesn't buy any doping on the Doping Page
    Then  the advertisement should be shown on the page after searching for it








