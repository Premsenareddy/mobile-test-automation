Feature: User wants to pay bills for Etisalat and DU
 
 #An End-to End Scenario to test payments functionalities:-
 #1. Login with registered customer 
 #2. Go to payments tab 
 #3. Go to bill payments
  
  
  Background: 
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    And Already registered customer
    When I click on payments tab
    And I click pay bills option
    
  @allspendPay @CreditCardPayments @cc1
    # Tests AHBDB-23150
    #Tests AHBDB-23623
  Scenario: To validate that the credit card bill tab is present on clicking pay a bill option
  Then I see credit Card bill tab

  @allspendPay @CreditCardPayments @cc1
    # Tests AHBDB-23151
  Scenario: To validate that the credit card bill tab home screen is as per design when there are digital and legacy
  cards already present
    And I see credit Card bill tab
    When I click on credit card bill tab
    Then I see Credit card bill payment home screen with legacy and digital cards saved

  @allspendPay @CreditCardPayments
    # Tests AHBDB-23151
  Scenario: To validate that the credit card bill tab home screen is as per design when there are no cards
    And I see credit Card bill tab
    When I click on credit card bill tab
    Then I see Credit card bill payment home screen with no card saved

  @allspendPay @CreditCardPayments
  Scenario Outline: To validate that the user is able to pay bill for his digital credit card and see a success screen
    And I see credit Card bill tab
    When I click on credit card bill tab
    And I click on my saved AHB digital card
    And User enter the amount as "<amount>" in Other field
    And user clicks on Confirm amount
    And User enters Remarks as "<ReviewComments>"
    And User selects Confirm and Review
    And User selects Confirm and pay
    And I authenticates using passcode
    Then I should see the payment success screen
    And I click on done button on the success screen
    Examples:
      |ReviewComments   | amount  |
      |Credit card test | 10      |

  @allspendPay @CreditCardPayments
  Scenario Outline: To validate that the user is able to pay bill for his al hilal legacy credit card and see a
  success screen
    And I see credit Card bill tab
    When I click on credit card bill tab
    And I click on my saved AHB legacy card
    And User enter the amount as "<amount>" in Other field
    And user clicks on Confirm amount
    And User enters Remarks as "<ReviewComments>"
    And User selects Confirm and Review
    And User selects Confirm and pay
    And I authenticates using passcode
    Then I should see the payment success screen
    And I click on done button on the success screen
    Examples:
      |ReviewComments   | amount  |
      |Credit card test | 10      |

  @allspendPay @CreditCardPayments @test
  Scenario Outline: Validate that review button would be enabled after changing the account to be paid from
  account to be paid from
  and see a success screen
    And I see credit Card bill tab
    When I click on credit card bill tab
    And I click on my saved AHB legacy card
    And User enter the amount as "<amount>" in Other field
    When user click on more account option
    Then user is able to navigate to My Accounts screen
    When user selects another account
    Then user is able to navigate to payment amount screen
    And user clicks on Confirm amount
    And User enters Remarks as "<ReviewComments>"
    And User selects Confirm and Review
    And User selects Confirm and pay
    And I authenticates using passcode
    Then I should see the payment success screen
    And I click on done button on the success screen
    Examples:
      |ReviewComments   | amount  |
      |Credit card test | 10      |

  @allspendPay @CreditCardPayments
  Scenario Outline: Validate back button functionality
  account to be paid from
  and see a success screen
    And I see credit Card bill tab
    When I click on credit card bill tab
    And I click on my saved AHB legacy card
    And User enter the amount as "<amount>" in Other field
    When user click on more account option
    Then user is able to navigate to My Accounts screen
    When user selects another account
    Then user is able to navigate to payment amount screen
    And user clicks on Confirm amount
    And User enters Remarks as "<ReviewComments>"
    And User selects Confirm and Review
    And User selects Confirm and pay
    And I authenticates using passcode
    When user click on back button
    Then User is able to navigate to Review details screen
    When user click on back button
    Then user is able to navigate to Payment details screen
    When user click on back button
    Then user is able to navigate to payment amount screen
    When user click on back button
    Then user is able to navigate to Pay a bill screen
    When user click on back button
    And I click pay bills option
    Examples:
      |ReviewComments   | amount  |
      |Credit card test | 10      |

#  Below flow is out of scope for the current release. Will uncomment the flow again once it is in-scope
#  @allspendPay @CreditCardPayments
#  Scenario: To validate that the user see option to enter the credit card number and card holder name on manual enter
#  flow
#    And I see credit Card bill tab
#    When I click on credit card bill tab
#    Then I click on enter card details option

#  Below flow is out of scope for the current release. Will uncomment the flow again once it is in-scope
#  @allspendPay @CreditCardPayments
#  Scenario: To validate that the user see option to enter the credit card number and card holder name on manual enter flow
#    And I see credit Card bill tab
#    When I click on credit card bill tab
#    And I click on enter card details option
#    Then I see option to enter credit card number and card holder name on the screen

#  Below flow is out of scope for the current release. Will uncomment the flow again once it is in-scope
#  @allspendPay @CreditCardPayments
#  Scenario Outline: To validate that the user is able to enter the credit card number and card holder name and click
#  on add card to search the validity of card
#    And I see credit Card bill tab
#    When I click on credit card bill tab
#    And I click on enter card details option
#    And I enter credit card number as "<CreditCardNumber> "and card holder name as "<CardHoldername>"
#    And I click on Add card button
#    Then I should be able to see the card details
#    Examples:
#    |CreditCardNumber|CardHoldername|
#    |4000000000000002|Mashreqbank   |

#  Below flow is out of scope for the current release. Will uncomment the flow again once it is in-scope
#  @allspendPay @CreditCardPayments
#  Scenario Outline: To validate that the user is able to pay bill for his credit card and see a success screen
#  without saving card
#    And I see credit Card bill tab
#    When I click on credit card bill tab
#    And I click on enter card details option
#    And I enter credit card number as "<CreditCardNumber> "and card holder name as "<CardHoldername>"
#    And I click on Add card button
#    And I click the next button on screen
#    And I enter the amount as "5000"
#    And I enters Remarks for CC payments as "<Review Comments>"
#    And User selects Confirm and Review
#    And User selects Confirm and pay
#    And I authenticates using passcode
#    Then I should see the payment success screen
#    And I click on done button on the success screen
#    Examples:
#      |CreditCardNumber|CardHoldername| Review Comments|
#      |4000000000000002|Mashreqbank   | CC payment     |

#  Below flow is out of scope for the current release. Will uncomment the flow again once it is in-scope
#  @allspendPay @CreditCardPayments
#  Scenario Outline: To validate that the user is able to pay bill for his credit card and see a success screen
#  with saving card
#    And I see credit Card bill tab
#    When I click on credit card bill tab
#    And I click on enter card details option
#    And I enter credit card number as "<CreditCardNumber> "and card holder name as "<CardHoldername>"
#    And I click on Add card button
#    And I check the save card checkbox
#    And I click the next button on screen
#    And I enter the amount as "5000"
#    And I enters Remarks for CC payments as "<Review Comments>"
#    And User selects Confirm and Review
#    And User selects Confirm and pay
#    And I authenticates using passcode
#    Then I should see the payment success screen
#    And I click on done button on the success screen
#    Examples:
#      |CreditCardNumber|CardHoldername| Review Comments|
#      |4000000000000003|Mashreqbank   | CC payment     |

#  Below flow is out of scope for the current release. Will uncomment the flow again once it is in-scope
#  @allspendPay @CreditCardPayments
#  Scenario Outline: To validate that the user is able to see error message on entering incorrect cc number
#    And I see credit Card bill tab
#    When I click on credit card bill tab
#    And I click on enter card details option
#    And I enter credit card number as "<CreditCardNumber> "and card holder name as "<CardHoldername>"
#    And I click on Add card button
#   Then I see credit card not found error message
#    Examples:
#      |CreditCardNumber|CardHoldername|
#      |4000000000000002|Mashreqbank   |

#  Below flow is out of scope for the current release. Will uncomment the flow again once it is in-scope
#  @allspendPay @CreditCardPayments
#  Scenario Outline: To validate that the user is able to see inline error message if the card holder name as numeric
#  characters
#    And I see credit Card bill tab
#    When I click on credit card bill tab
#    And I click on enter card details option
#    And I enter credit card number as "<CreditCardNumber> "and card holder name as "<CardHoldername>"
#    Then I should see inline error message on the account holder field
#    Examples:
#      |CreditCardNumber|CardHoldername|
#      |4000000000000002|Mashreqbank11  |

#  Below flow is out of scope for the current release. Will uncomment the flow again once it is in-scope
#  @allspendPay @CreditCardPayments
#  Scenario Outline: To validate that the user is able to see inline error message in cc number field if the length is
#  less than 14
#    And I see credit Card bill tab
#    When I click on credit card bill tab
#    And I click on enter card details option
#    And I enter credit card number as "<CreditCardNumber>"
#    Then I should see inline error message on the credit card number field
#    Examples:
#      |CreditCardNumber|CardHoldername|
#      |400000000000|Mashreqbank11  |








