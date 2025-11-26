Feature: User wants to view transaction limits for AHB , Domestic , International and Payments

 
 #An End-to End Scenario to test payments functionalities:-
 #1. Login with registered customer 
 #2. Go to payments tab 
 #3. Go to bill payments
  
  
  Background: 
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
  
 
  
  @limits @allspendPay @ios
  Scenario: To verify that the transaction limits option is there in the payment home screen
  And Already registered customer
  When I click on payments tab 
  Then I see the transaction limit section on the payment home screen
  
  @limits @allspendPay @ios
  Scenario: To verify that the transaction limits are correct for all types of transfers
  And Already registered customer
  When I click on payments tab 
  And I click on transaction limits
  Then I see transfers and payments tab
  And I see the limits for alhilal, domestic and international transfer is correct
  
  
  @limits @allspendPay @ios
  Scenario: To verify that the transaction limits are correct for all types of payments
  And Already registered customer
  When I click on payments tab 
  And I click on transaction limits
  And I see transfers and payments tab
  And I click on payment tab
  Then I see the limits for utility payments is correct
 