Feature: Save Scenarios Execution file

  @chequebook @local
  Scenario: Validate Address selection screen and confirm office address
    Given Select Request Cheque Book "android"
    When Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    Then Navigate to eligibility success screen and clicks Next Button
    Then User clicks on work address and fills address fields "Test area" "android"

    # UAE PASS feature is toggled off. Once its ON comment will be removed for the below scenario

#  @chequebook
#  Scenario: Validate isSignature as false for requesting a cheque book with a signature
#    Given Select Request Cheque Book "android"
#    When Validate the redirection to Request Cheque Book Tab
#    And select check box and click continue "android"
#    And User enters Debit PIN details "4", "3", "2", "1"
#    And Navigate to eligibility success screen and clicks Next Button
#    And select Home address
#    And confirm uploaded signature
#    And Navigate to signature consent screen to confirm signature "android"
#    Then finally redirected to order review screen to confirm and order the cheque book "android"


  @chequebook @local
  Scenario: Validate issue as false to verify 24hrs restriction for an additional cheque book
    Given Select Request Cheque Book "android"
    When Validate the redirection to Request Cheque Book Tab
    And select check box and click continue "android"
    And User enters Debit PIN details "4", "3", "2", "1"
    Then Navigate to eligibility success screen and clicks Next Button
    And select Home address to navigates to oder review screen "android"
    Then validates for the unsuccessful request message for cheque book





