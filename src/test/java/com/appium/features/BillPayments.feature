Feature: User wants to pay bills for Etisalat and DU
 
 #An End-to End Scenario to test payments functionalities:-
 #1. Login with registered customer 
 #2. Go to payments tab 
 #3. Go to bill payments
  
  
  Background: 
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard

  @allspendPay @billPayments
  Scenario: To verify that the Pay bills option is there in the payment home screen
  And Already registered customer
  When I click on payments tab
  Then I see the pay bills option on the payment home screen

  @allspendPay @billPayments
  Scenario: To verify that all billers are displayed on clicking pay bills menu option
  And Already registered customer
  When I click on payments tab
  Then I see the pay bills option on the payment home screen
  And I click pay bills option
  And I see list of all billers

  @allspendPay @billPayments
  Scenario: To verify that all the etisalat payment options are displayed on clicking on Etisalat biller on the biller list screen
  And Already registered customer
  When I click on payments tab
  And I see the pay bills option on the payment home screen
  And I click pay bills option
  And I see list of all billers
  And I click on Etisalat option
  Then I see all the payment types of etisalat

  Scenario Outline: To verify that I can do bill payment for <EtisalatType>
  And Already registered customer
  When I click on payments tab 
  And I click pay bills option
  And I click on Etisalat option
  And I click on "<EtisalatType>" and enter "<Account/Phone Number>"
  And I uncheck the saved payee checkbox
  And I click on Proceed to Payment button
  And I enter the "<Amount>" for "<EtisalatType>"
  Then I see the review screen
  And User selects Confirm and pay
  And I authenticates using passcode
  Then I should see the payment success screen
    @sanity
  Examples:
  |EtisalatType | Account/Phone Number| Amount  |
  |Wasel        | 506930503           | 50      |

    @allspendPay  @billPayments
    Examples:
      |EtisalatType | Account/Phone Number|Amount |
      |Wasel        | 506930503           |50     |
      |Elife        | 37210480            |1000   |
      |Evision      | 800000040001        |450    |
      |AlShamil     | 490100005           |400    |
      |DialUp       | 31300239            |120    |
      |Mobile(GSM)  | 504471025           |250    |

  @allspendPay @billPayments @sanity
  Scenario: To verify that I can do bill payment for Salik
  And Already registered customer
  When I click on payments tab 
  And I click pay bills option
  And I click on Salik icon
  And I uncheck the saved payee checkbox
  And I enter the account number as "32100001"
  And I enter the pin as "6843"
  And I click on Proceed to Payment button
  And I enter the amount as "5000"
  And User selects confirm amount
  Then I see the review screen
  And User selects Confirm and pay
  And I authenticates using passcode
  Then I should see the payment success screen

  @allspendPay @billPayments @sanity
  Scenario Outline: To perform a Utility payment without saving the payee with touchpoints
    And Already registered customer
    When I click on payments tab
    And I click pay bills option
    And I click on DEWA
    And user selects the touchpoint option
    And User enters premise Number as "<AccountNo>"
    And I uncheck the saved payee checkbox
    And I click on Proceed to Payment button
    And I enter the amount as "<Amount>"
    And User selects confirm amount
    And I click on confirm and transfer button
    And I authenticates using passcode
    Then I should see the payment success screen
    Examples:
      |AccountNo  |Amount |
      |265007704  |1000	  |

  @allspendPay @billPayments @sanity
  Scenario Outline: To perform a Utility payment without saving the payee
    And Already registered customer
    When I click on payments tab
    And I click pay bills option
    And I click on DEWA
    And User enters premise Number as "<AccountNo>"
    And I uncheck the saved payee checkbox
    And I click on Proceed to Payment button
    And I enter the amount as "<Amount>"
    And User selects confirm amount
    Then I see the review screen
    And I click on confirm and transfer button
    And I authenticates using passcode
    Then I should see the payment success screen
    Examples:
      |AccountNo  | Amount  |
      |265007704  | 1000	|