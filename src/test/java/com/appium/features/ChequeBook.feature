Feature: Save Scenarios Execution file

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard

  @chequebook @sanity
  Scenario: Validate Eligibility
    Given Already registered customer
    When User clicks on the Account
    And Scroll till Request chequebook quick link in current account
    And Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    Then Navigate to eligibility success screen and clicks Next Button

  @chequebook @negativeChequeBook @sanity
  Scenario: Validate error pop up for incorrect PIN details
    Given Already registered customer
    When User clicks on the Account
    And Scroll till Request chequebook quick link in current account
    And Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "1", "2", "3", "4"
    Then Validate error pop up
    Then Clicks on OK button

  @chequebook  @local
  Scenario: Validate cheque book option in savings account of Banking Tab
    And Already registered customer
    And User clicks on the Account to navigate to banking tab
    And Scroll till Request chequebook quick link in current account
    And Navigates to Savings account and validates for the absence of cheque book link

  @chequebook @sanity
  Scenario: Validate chat icon
    Given Already registered customer
    When User clicks on the Account
    And Scroll till Request chequebook quick link in current account
    And Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    Then Navigate to eligibility success screen and clicks Next Button
    Then User clicks on Chat button and wait untill screen loads

  @chequebook @local
  Scenario: Validate cheque book option in savings account of Explore Tab
    And Already registered customer
    Then Navigates to Savings account and validates for the presence of cheque book link

  @chequebook @sanity
  Scenario: Validate back icon
    Given Already registered customer
    When User clicks on the Account
    And Scroll till Request chequebook quick link in current account
    And Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    Then Navigate to eligibility success screen and clicks Next Button
    Then User clicks on back button and wait untill screen loads

  @chequebook
  Scenario: Validate Address selection screen
    Given Already registered customer
    When User clicks on the Account
    And Scroll till Request chequebook quick link in current account
    And Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    Then Navigate to eligibility success screen and clicks Next Button

  @chequebook @sanity
  Scenario: Validate Address selection screen and proceed with home address
    Given Already registered customer
    When User clicks on the Account
    And Scroll till Request chequebook quick link in current account
    And Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    Then Navigate to eligibility success screen and clicks Next Button
    Then select Home address

  @chequebook @local
  Scenario: Validate issue as false to verify order review screen after a successful cheque book request flow
    Given Already registered customer
    When User clicks on the Account
    And Scroll till Request chequebook quick link in current account
    And Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    Then Navigate to eligibility success screen and clicks Next Button
    And select Home address to navigates to oder review screen "android"
    Then validates for the successful request message for cheque book


    # UAE PASS feature is toggled off. Once its ON comment will be removed for the below scenario

#  @chequebook
#  Scenario: Validate issue as false from banking Tab
#    And Already registered customer
#    And User clicks on the Account
#    And Scroll till Request chequebook quick link in current account
#    And Validate the redirection to Request Cheque Book Tab
#    And select check box and click continue "android"
#    And User enters Debit PIN details "4", "3", "2", "1"
#    Then Navigate to eligibility success screen and clicks Next Button
#    And select Home address to navigates to oder review screen "android"
#    Then validates for the successful request message for cheque book
#   Then finally redirected to order review screen to confirm and order the cheque book "android"

  @chequebook @local
  Scenario: Validate issue as false from banking Tab selecting office address
    And Already registered customer
    And User clicks on the Account
    And Scroll till Request chequebook quick link in current account
    And Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    Then Navigate to eligibility success screen and clicks Next Button
    Then select office address to navigates to oder review screen "android"

  @chequebook @local
  Scenario: Validate issue as false from banking Tab selecting office address
    And Already registered customer
    And User clicks on the Account
    And Scroll till Request chequebook quick link in current account
    And Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    And Navigate to eligibility success screen and clicks Next Button
    And select office address to navigates to oder review screen "android"
    Then validates for the unsuccessful request message for cheque book