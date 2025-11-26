Feature: User wants to donate to charities
 
 #An End-to End Scenario to test payments functionalities:-
 #1. Login with registered customer 
 #2. Go to payments tab 
 #3. Go to bill payments
  
  
  Background: 
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
  
 
  # Tests AHBDB -23922
  @allspendPay @charityPayments
  Scenario: To verify that the Donate option is present on the payment home screen for adults
  And Already registered customer
  When I click on payments tab
  Then I see that Donate option is present on the payment home screen

  # Tests AHBDB -23922
  @allspendPay @charityPayments
  Scenario: To verify that the all charities are displayed on clicking donate section
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    Then I see all charities options displayed on the screen

  # Tests AHBDB -23922
  @allspendPay @charityPayments
  Scenario: To verify that the screen heading is Make a donation
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    Then I see that the screen heading is correct

  # Tests AHBDB -23922
  # Tests AHBDB-23765
  @allspendPay @charityPayments
  Scenario: To verify that the user lands on amount screen on clicking General donation charity option
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on general donation option
    Then I land on amount screen

  # Tests AHBDB -23922
  # Tests AHBDB-23765
  @allspendPay @charityPayments
  Scenario: To verify that the user lands on amount screen on clicking build a mosque charity option
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on build a mosque donation option
    Then I land on amount screen

  # Tests AHBDB -23922
  # Tests AHBDB-23765
  @allspendPay @charityPayments
  Scenario: To verify that the user lands on amount screen on clicking Zakat charity option
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on Zakat donation option
    Then I land on amount screen


  @allspendPay @charityPayments @test
  Scenario Outline: To verify that the user can pay for zakat donation
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on Zakat donation option
    And I enter the amount as "<amount>"
    And I press the next button on the screen
    And I validate the charity review screen
    And I click on confirm and transfer button for charity
    And User enters the pin
    Then The success screen gets displayed with transaction ID
    And user clicks on payment Done button to return back to payments tab
    Examples:
    |amount|
    |2000  |


  @allspendPay @charityPayments
  Scenario Outline: To verify that the user can pay for build a mosque donation
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on build a mosque donation option
    And I enter the amount as "<amount>"
    And I press the next button on the screen
    And I validate the charity review screen
    And I click on confirm and transfer button for charity
    And User enters the pin
    Then The success screen gets displayed with transaction ID
    And user clicks on payment Done button to return back to payments tab
    Examples:
      |amount|
      |2000  |

  @allspendPay @charityPayments
  Scenario Outline: To verify that the user can pay for general donation
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on general donation option
    And I enter the amount as "<amount>"
    And I press the next button on the screen
    And I validate the charity review screen
    And I click on confirm and transfer button for charity
    And User enters the pin
    Then The success screen gets displayed with transaction ID
    And user clicks on payment Done button to return back to payments tab
    Examples:
      |amount|
      |2000  |


  @allspendPay @charityPayments @share
  Scenario Outline: To verify that share confirmation button is there on the success screen
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on general donation option
    And I enter the amount as "<amount>"
    And I press the next button on the screen
    And I validate the charity review screen
    And I click on confirm and transfer button for charity
    And User enters the pin
    Then The success screen gets displayed with transaction ID
    And I see that share confirmation option is there on the success screen
    Examples:
      |amount|
      |2000  |


  @allspendPay @charityPayments
  Scenario Outline: To verify that user can not transfer more than 10000 AED to charity
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on general donation option
    And I enter the amount as "<amount>"
    Then I validate that the next button is not enabled and user can not move ahead
    Examples:
      |amount|
      |1100000 |


  @allspendPay @charityPayments
  Scenario: To verify that user see the information for max charity amount allowed
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on general donation option
    Then I see the information on the max allowed transfer

  @allspendPay @charityPayments @zakat
  Scenario Outline: To verify that the user can pay for Zakat Al Fitr donation via money
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And I click on Zakat Al Fitr donation option
    And I press the confirm amount button on the screen
    And I validate the charity review screen
    And I click on confirm and transfer button for charity
    And User enters the pin
    Then The success screen gets displayed with transaction ID
    And user clicks on payment Done button to return back to payments tab
    Examples:
      |amount|
      |2000  |


  @allspendPay @charityPayments
  Scenario Outline: To verify that the user can pay for zakat donation via touchpoints
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And user selects the touchpoint option
    And I click on Zakat donation option
    And I enter the amount as "<amount>"
    And I press the next button on the screen
    And I validate the charity review screen
    And I click on confirm and transfer button for charity
    And User enters the pin
    Then The success screen gets displayed with transaction ID
    And user clicks on payment Done button to return back to payments tab
    Examples:
      |amount|
      |2000  |

  @allspendPay @charityPayments
  Scenario Outline: To verify that the user can pay for general donation via touchpoints
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And user selects the touchpoint option
    And I click on general donation option
    And I enter the amount as "<amount>"
    And I press the next button on the screen
    And I validate the charity review screen
    And I click on confirm and transfer button for charity
    And User enters the pin
    Then The success screen gets displayed with transaction ID
    And user clicks on payment Done button to return back to payments tab
    Examples:
      |amount|
      |2000  |

  @allspendPay @charityPayments
  Scenario Outline: To verify that the user can pay for build a mosque donation via touchpoints
    And Already registered customer
    When I click on payments tab
    And I click on Donate Section
    And user selects the touchpoint option
    And I click on build a mosque donation option
    And I enter the amount as "<amount>"
    And I press the next button on the screen
    And I validate the charity review screen
    And I click on confirm and transfer button for charity
    And User enters the pin
    Then The success screen gets displayed with transaction ID
    And user clicks on payment Done button to return back to payments tab
    Examples:
      |amount|
      |2000  |



