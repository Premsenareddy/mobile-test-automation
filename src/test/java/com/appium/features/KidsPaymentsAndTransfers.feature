Feature: To verify all payments and transfer features for kids

 
 #An End-to End Scenario to test payments functionalities:-
 #1. Login with registered customer 
 #2. Go to payments tab 
 #3. Go to bill payments
  
  
  Background: 
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard



  @allspendPay @kids @paymentHomeScreen
  Scenario: To verify that all elements are present on the kids payment home screen
    And Already registered customer
    When I click on payments tab
    Then I see that the payment tab is properly displayed for kids with all components

  @allspendPay @kids @paymentHomeScreen
  Scenario: To verify that all section headings are present on kids home screen
    And Already registered customer
    When I click on payments tab
    Then I see that all the section headings are displayed correctly on the kids payment home screen

  @allspendPay @kids @paymentHomeScreen
  Scenario: To verify that payment tab header title for kids is Your payments
    And Already registered customer
    When I click on payments tab
    Then I see that the header title is Your Payments

  @allspendPay @kids @paymentHomeScreen
  Scenario: To verify that kid is able to see only GSM and Wasel Recharge option for Etisalat Payments
    And Already registered customer
    When I click on payments tab
    And I click on Etisalat option
    Then I can see that only GSM and Wasel Recharge option are there for kids

  @allspendPay @kids @billPaymentsKids
  Scenario Outline: To verify that kid is able to make payment request for Etisalat Payments for both GSM and Wasel
    And Already registered customer
    When I click on payments tab
    And I click on Etisalat option
    And I click on the "<EtisalatType>" and enter "<Phone Number>"
    And I uncheck the Add to your list of bills checkbox
    And I click on Proceed to Payment button
    And I add "<Amount>" for "<EtisalatType>"
    Then I see the kids review details screen
    And I click on pay this bill
    And I authenticates using passcode
    Then I should see the bill payment request success screen

    Examples:
      |EtisalatType|Phone Number|Amount|
      |Wasel|506930503|50|
      |Mobile(GSM)|504471025|250|


  @allspendPay @kids @billPaymentsKids
  Scenario: To verify that kid is able to see postpaid and prepaid only for DU
    And Already registered customer
    When I click on payments tab
    And I click on DU option
    Then I should see only prepaid and postpaid option for DU

  @allspendPay @kids @billPaymentsKids
  Scenario Outline: To verify that kid is able to make payment request for DU Payments for postpaid
    And Already registered customer
    When I click on payments tab
    And I click on DU option
    And I click on the Postpaid and enter "<Phone Number>"
    And I uncheck the Add to your list of bills checkbox
    And I click on Continue button
    And I add "<Amount>" for DU and press Continue button
    Then I see the kids review details screen
    And I click on pay this bill
    And I authenticates using passcode
    Then I should see the bill payment request success screen

    Examples:
      |Phone Number|Amount|
      |521836425|2000|


  @allspendPay @manageBeneficiaryKids @kids
  Scenario: To verify that kid land on bank friends screen on clicking on arrow against adding bank friend section
    And Already registered customer
    When I click on payments tab
    And I click on arrow against bank friend section
    Then I land on the bank friends screen


  @allspendPay @manageBeneficiaryKids @kids
  Scenario: To verify that kid can click on three dot option against the father to see the option to send money
    And Already registered customer
    When I click on payments tab
    And I click on arrow against bank friend section
    And I land on the bank friends screen
    And I click on three dots options against the parent
    Then I see the option to send money to father

  @allspendPay @manageBeneficiaryKids @kids
  Scenario: To verify that kid can send money to his parent
    And Already registered customer
    When I click on payments tab
    And I click on arrow against bank friend section
    And I click on three dots options against the parent
    And I click the option to send money to parent
    And I click on continue button on the account selection screen
    And I enter the amount as "1000" on transfer screen
    And I select the reason of transfer
    And I enter the remarks and click on Check all details button
    And I validate the check all details screen
    And I click on send money button
    Then I can see the transfer getting success and transactionID getting displayed on success screen

  @allspendPay @manageBeneficiaryKids @kids
  Scenario: To verify that kid does not see remove option against his parent in the beneficiary list
    And Already registered customer
    When I click on payments tab
    And I click on arrow against bank friend section
    And I click on three dots options against the parent
    Then I see that remove option is not there against the parent beneficiary

  @allspendPay @manageBeneficiaryKids @kids
  Scenario: To verify that kid is able to add a AHB beneficiary by searching by phone number
    And Already registered customer
    When I click on payments tab
    And I click on arrow against bank friend section
    And I click on add beneficiary option
    And I click on Al Hilal Bank Digital
    And I enter "581362286" in phone number field
    And I click on find details button
    And I enter the nickname for beneficiary
    And I click Confirm Details button
    And I authenticates using passcode
    Then I validate the beneficiary creation success screen
    And I click on done button to land on the beneficiary list screen


  @allspendPay @manageBeneficiaryKids @kids
  Scenario: To verify that kid is able to add a AHB beneficiary by searching by account number
    And Already registered customer
    When I click on payments tab
    And I click on arrow against bank friend section
    And I click on add beneficiary option
    And I click on Al Hilal Bank Digital
    And I enter "018891016001" in account number field
    And I click on find details button
    And I enter the nickname for beneficiary
    And I click Confirm Details button
    And I authenticates using passcode
    Then I validate the beneficiary creation success screen
    And I click on done button to land on the beneficiary list screen

  @allspendPay @manageBeneficiaryKids @kids
  Scenario Outline: To add a AHB Legacy bank account via iBAN number for making transfers
    And Already registered customer
    When I click on payments tab
    And I click on arrow against bank friend section
    And I click on add beneficiary option
    And I click on Another Bank in UAE option
    And I click on Domestic Bank for kids
    And I click on iBAN field for kids and enter "<iBAN>"
    And I click on find details button
    And I enter the nickname of beneficiary
    And I enter the Account Holder Name for "domestic"
    And I click Confirm Details button
    And I authenticates using passcode
    Then I validate the beneficiary creation success screen
    And I click on done button to land on the beneficiary list screen
    Examples:
      |iBAN		|
      |420530000023019467023|


  @allspendPay @manageBeneficiaryKids @kids
  Scenario Outline: To add a domestic bank account via iBAN number for making transfers
    And Already registered customer
    When I click on payments tab
    And I click on arrow against bank friend section
    And I click on add beneficiary option
    And I click on Another Bank in UAE option
    And I click on Domestic Bank for kids
    And I click on iBAN field for kids and enter "<iBAN>"
    And I click on find details button
    And I enter the nickname of beneficiary
    And I enter the Account Holder Name for "domestic"
    And I click Confirm Details button
    And I authenticates using passcode
    Then I validate the beneficiary creation success screen
    And I click on done button to land on the beneficiary list screen
    Examples:
      |iBAN		|
      |070331234567890123456|


  @allspendPay @manageBeneficiaryKids @kids
  Scenario: To validate that the kid is able to delete all beneficiaries except parent account
    And Already registered customer
    When I click on payments tab
    And I click on arrow against bank friend section
    Then I am able to delete all beneficiaries except parent account



