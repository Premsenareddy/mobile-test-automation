Feature: Save Scenarios Execution file


  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard


  @allSave @iosAndroid
  Scenario Outline: Complete Account creation to schedule card delivery
  And Already registered customer
  And I click on Account verification button "<Platform>"
  And Select card color and Schedule debit card delivery "<Platform>"
  And Select card delivery address and time slot
  Then user navigates to Tracking card screen "<Platform>"

      Examples:
        |Platform|
        |android|


  @allSave @iosAndroid
  Scenario Outline: Validate card activation
    And Already registered customer
    And User clicks on the Account
    And Select cards
    Then capture Tracking ID "<Platform>"

    Examples:
      |Platform|
      |android|

  @allSave @iosAndroid
  Scenario Outline: Validate card activation
  And Already registered customer
  And User clicks on the Account
  And Select cards
  And Click on Card Activate "<Platform>"
  Then Activate card by setting pin and confirm

    Examples:
      |Platform|
      |android|

  @allSave @iosAutomated
  Scenario Outline: To verify the removal of topup banner from banking tab after topup account
  And Already registered customer
  And User clicks on the Account
  When I view top up banner
  When User top up user account
  Then User topup account using debit card
  Then user navigates to transfer details screen <Amount> , <Card> , <Name> , <Expiry Date> , <CVV>
  Then validate topup banner removal

  Examples:
	|Amount|Card|Name|Expiry Date|CVV|
	|65000|4000000000000002|Priya Bade|0929|123|


