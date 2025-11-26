Feature: User wants to add beneficiaries for AHB bank, Domestic and International Bank

 
 #An End-to End Scenario to test payments functionalities:-
 #1. Login with registered customer 
 #2. Go to payments tab 
 #3. Go to bill payments
  
  
  Background: 
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
  
 
  
  @allspendPay @manageBeneficiary @sanity
  Scenario: To add a AHB bank account via phone number for making transfers
  And Already registered customer
  When I click on payments tab
  And I click on Manage Beneficiary section
  And I click on add a beneficiary link
  And I click on Al Hilal Bank Digital
  And I click on phone number field and enter "581362286"
  And I click on fetch details button
  And I enter the nickname for "ahb"
  And I click Confirm Details button
  And I authenticates using passcode
  Then I see the beneficiary creation success screen
  And I click on done button to land on the beneficiary list screen

   @allspendPay @manageBeneficiary
  Scenario: To verify that the user see a pop up message that beneficiary already exists if he is trying to add the same beneficiary again
  And Already registered customer
  When I click on payments tab
  And I click on Manage Beneficiary section
  And I click on add a beneficiary link and skip already added Beneficiary
  And I click on Al Hilal Bank Digital
  And I click on phone number field and enter "581362286"
  And I click on fetch details button
  Then I see the pop up saying beneficiary already exists
  And I click on OK to close the pop up

  @allspendPay @manageBeneficiary @sanity
  Scenario: To add a AHB bank account via account number for making transfers
  And Already registered customer
  When I click on payments tab
  And I click on Manage Beneficiary section
  And I click on add a beneficiary plus button
  And I click on Al Hilal Bank Digital
  And I click on account number field and enter "018891016001"
  And I click on fetch details button
  And I enter the nickname for "ahb"
  And I click Confirm Details button
  And I authenticates using passcode
  Then I see the beneficiary creation success screen
   And I click on done button to land on the beneficiary list screen


  @allspendPay @manageBeneficiary @sanity
  Scenario Outline: To add a Domestic bank account via iBAN number for making transfers
  And Already registered customer
  When I click on payments tab
  And I click on Manage Beneficiary section
  And I click on add a beneficiary plus button
  And I click on Another Bank
  And I click on Domestic Bank
  And I click on iBAN field and enter "<iBAN>"
  And I click on fetch details button
  And I enter the Account Holder Name for "domestic"
  And I enter the nickname of beneficiary
  And I click Confirm Details button
  And I authenticates using passcode
  Then I see the beneficiary creation success screen
   And I click on done button to land on the beneficiary list screen
  Examples:
  |iBAN		|
  |070331234567890123456|

 @allspendPay @manageBeneficiary
  Scenario Outline: To add a AHB Legacy bank account via iBAN number for making transfers
  And Already registered customer
  When I click on payments tab
  And I click on Manage Beneficiary section
  And I click on add a beneficiary plus button
  And I click on Another Bank
  And I click on Domestic Bank
  And I click on iBAN field and enter "<iBAN>"
  And I click on fetch details button
   And I enter the Account Holder Name for "domestic"
   And I enter the nickname of beneficiary
  And I click Confirm Details button
  And I authenticates using passcode
  Then I see the beneficiary creation success screen
  And I click on done button to land on the beneficiary list screen
  Examples:
  |iBAN		|
  |420530000023019467023|


  Scenario Outline: To add a international bank account beneficiary for <country> with SWIFT code
  And Already registered customer
  When I click on payments tab
  And I click on Manage Beneficiary section
  And I click on add a beneficiary link
  And I click on Another Bank
  And I click on International Bank
  And I select "<country>" from the country list
  And I enter details like "<swift>" and "<account number>"
  And I enter "<routing code>" for "<country>"
  And I click on fetch details button
  And I enter the "<address line1>", "<address line2>","<city>" and "<beneficiary country>"
    And I enter the Account Holder Name for "international"
  And I enter the nickname for "international"
  And I click Confirm Details button
  And I authenticates using passcode
  Then I see the beneficiary creation success screen
  And I click on done button to land on the beneficiary list screen

    @allspendPay @manageBeneficiary
  Examples:
  |country  | swift|account number|routing code|address line1|address line2|city|beneficiary country|
  |India    |PSIBINBB|123456789|PSIB0000758|test|test|Chandigarh|India|
  |Australia|ABOCAU2S|641846184|123123|test|test|sydney|Australia|
  |Canada   |ROYCCAT2XXX|12133141|123123123|test|test|toronto|Canada|
  |USA      |CITIUS33|12345678|123123123|test|Chicago|test|USA|

    @sanity
    Examples:
      |country| swift   |account number |routing code |address line1|address line2|city|beneficiary country|
      |India  |PSIBINBB |123456788      |PSIB0000758  |test|test|Chandigarh|India|



  @allspendPay @manageBeneficiary
  Scenario: To verify that inline error message is displayed when invalid phone number is entered
    And Already registered customer
    When I click on payments tab
    And I click on Manage Beneficiary section
    And I click on add a beneficiary link
    And I click on Al Hilal Bank Digital
    And I click on phone number field and enter invalid phone number as "5555555"
    Then I should see inline error message on the mobile number field as "Please enter a valid mobile number"


  @allspendPay @manageBeneficiary
  Scenario: To verify that inline error message is displayed when invalid account number is entered
    And Already registered customer
    When I click on payments tab
    And I click on Manage Beneficiary section
    And I click on add a beneficiary plus button
    And I click on Al Hilal Bank Digital
    And I click on account number field and enter invalid account number as "1214314"
    Then I should see inline error message on the account number field as "Please enter a valid account number"

  @allspendPay @iosBeneficiary @manageBeneficiary @sanity
  Scenario: To delete all beneficiaries from the list
  And Already registered customer
  When I click on payments tab
  And I click on Manage Beneficiary section
  And I click on three dots icon against all the beneficiaries and delete
  Then I should see empty beneficiary list

