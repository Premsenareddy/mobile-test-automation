Feature: User wants to validate differnet scenarios for Utility payments
#User Wants to perform money transfer and bill payments under payments section
 #
 #An End-to End Scenario to test payments functionalities:-
 #1. Login with registered customer 
 #2. Go to payments tab 
 #3. Go to bill payments
  #
  #
  Background: 
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    
# Payeee should not be added earlier
#@regression @payments @valid
#  Scenario Outline: To perform a utility payment with Save the payee
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Pay bills screen
#  And Select Biller as "<Biller>"
# 	#And Select new Payee if payee Saved
#  And User enters premise Number as "<AccountNo>"
#  And User select Save Payeed checkbox as "<AddPayeeCheckbox>"
#  And User enters nic name payee as "<Nick Name>"
#  And User clicks on proceed to payment
#  And User enters amount as "<Amount>" to be transferred on Payment
#  And User selects confirm amount
#  And User selects Confirm and Send
#  And User enters the pin
#  And user clicks on payment Done button to return back to payments tab
#
#  Examples:
#  |Biller |AccountNo		|AddPayeeCheckbox	|Amount|Nick Name|
#  |DEWA   |265007704		|Checked        |10			|Test Nic|
#
#
#  Need to run after First Testcase for utility payee already added
#  @regression @payments @invalid
#  Scenario Outline: To perform a utility payment with same payee that is Saved
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Pay bills screen
#  And Select Biller as "<Biller>"
# 	And Select new Payee if payee Saved
#  And User enters premise Number as "<AccountNo>"
#  And User select Save Payeed checkbox as "<AddPayeeCheckbox>"
#  And User enters nic name payee as "<Nick Name>"
#  And User clicks on proceed to payment
#  Then User will get Error Popup as "Payee already saved" and verify Error message
#  And Click OK on alert message
#  Examples:
#  |Biller |AccountNo		|AddPayeeCheckbox	|Amount|Nick Name|
#   |DEWA   |265007704		|checked        |10			|Test Nic|
#
##  #Delete button Need to fix
##   #@regression2
##  Scenario Outline: To perform a utility payment with same payee that is Saved
##  And Already registered customer
##  When I click on payments tab
##  And User navigate to Pay bills screen
##  And Select Biller as "<Biller>"
## 	And Select new Payee if payee Saved
##  And User enters premise Number as "<AccountNo>"
##  And User select Save Payeed checkbox as "<AddPayeeCheckbox>"
##  And User enters nic name payee as "<Nick Name>"
##  And User clicks on proceed to payment
##  And User will get Error Popup as "Payee already saved" and verify Error message
##  And Click OK on alert message
##  And Click on Saved Payee
##  And User Select Saved Payee
##  And Click Delete button to delete saved Payee
##  And User enters premise Number as "<AccountNo>"
##  And User enters amount as "<Amount>" to be transferred on Payment
##  And User selects confirm amount
##  And User selects Confirm and Send
##  And User enters the pin
##  And user clicks on payment Done button to return back to payments tab
##
##  Examples:
##  |Biller |AccountNo		|AddPayeeCheckbox	|Amount|Nick Name|
##   |DEWA   |265007704		|checked        |10			|Test Nic|
##
#
# #@regression @payments @valid
#  #Scenario Outline: To perform a Utility payment without saving the payee
#  #And Already registered customer
#  #When I click on payments tab
#  #And User navigate to Pay bills screen
#  #And Select Biller as "<Biller>"
# #	And Select new Payee if payee Saved
#  #And User enters premise Number as "<AccountNo>"
#  #And Verify Add Payee checbox should be checked by default
#  #And User select Save Payeed checkbox as "<AddPayeeCheckbox>"
#  #And User clicks on proceed to payment
#  #And User enters amount as "<Amount>" to be transferred on Payment
#  #And User selects confirm amount
#  #And User selects Confirm and Send
#  #And User enters the pin
#  #And user clicks on payment Done button to return back to payments tab
#  #
#  #Examples:
#  #|Biller |AccountNo		|AddPayeeCheckbox	|Amount|Nick Name|
#  #|DEWA   |265007704		|Unchecked        |10			|Test Nic|
#  #
#  #Can not rerun with same TestData as test data is consumed
#  #
# #@regression @payments @valid
#  #Scenario Outline: To perform a Utility payment without saving the payee
#  #And Already registered customer
#  #When I click on payments tab
#  #And User navigate to Pay bills screen
#  #And Select Biller as "<Biller>"
# #	And Select new Payee if payee Saved
#  #And User enters Account Number as "<AccountNo>"
#  #And Verify Add Payee checbox should be checked by default
#  #And User select Save Payeed checkbox as "<AddPayeeCheckbox>"
#  #And User clicks on proceed to payment
#  #And User selects confirm amount
#  #And User selects Confirm and Send
#  #And User enters the pin
#  #And user clicks on payment Done button to return back to payments tab
#  #
#  #Examples:
#  #|Biller |AccountNo		|AddPayeeCheckbox	|Amount|Nick Name|
#   #|ADDC   |3000477157		|UnChecked        |10			|Test Nic|
