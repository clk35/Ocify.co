Feature: Search for the created Advertisement and verify if the information is correct

  As an user, i should be able to search for a product so that i see information about the product

  @wip @adInformation
  Scenario: Search and find the created Advertisement functionality verification
    Given user is already logged in
    Given user is already on his-her own market
    When  user types into search box "Bosch Camasir makinesi"
    And   user clicks on the created advertisement
    Then  the advertisement should be under this chain
      |Elektronik|
      |Beyaz Esya|
      |Camasir Makineleri|
    Then  the advertisement title should be "Bosch 9 kg Camasir makinesi"
    Then  the price should be given price "$250,00"