Feature: Verify Transactions parent transfer to kids

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    And Already registered customer

  @parenttokids
  Scenario: Verify Family Tab Kids Card UI
    Then I land on the Family Tab
    And Verify Kid Card UI

  @parenttokids
  Scenario: Verify Family Tab Kids Card Settings UI
    Then I land on Family Tab
    And Verify Kid Card Settings UI

  @parenttokidaed
  Scenario Outline: Verify and add AED tasks for tomorrow's date
    Then I land on Family Tab
    And Verify Family Tab UI
    And I Click on All Tasks Button
    And I click on Assign new task
    And I enter and assign "<taskname>" and click on continue
    And I click on radio button
    And I click on AED radio button
    And I enter "<AED amount>" and click on continue button
    And I should see the success message once task is added
    Examples:
      |taskname  |AED amount|
      |taskone   |3         |

  @parenttokidtp
  Scenario Outline: Verify and add TP tasks for tomorrow's date
    Then I land on Family Tab
    And Verify Family Tab UI
    And I Click on All Tasks Button
    And I click on Assign new task
    And I enter and assign "<taskname>" and click on continue
    And I click on radio button
    And I click on AED radio button
    And I click on touchpoint radio button
    And I enter "<Touchpoints>" and click continue button
    And I should see the success message once task is added
    Examples:
      |taskname  |Touchpoints|
      |taskone   |3         |

  @parenttokids
  Scenario Outline: To perform a transaction to AHB digital bank in Payments tab via account number
    When I click on payments tab
    And User navigate to Transfer money screen
    And User selects Al Hilal Bank Digital option to Transfer money
    And User selects a new account option to Transfer money
    And User enters a new account number to Transfer money as "014856961001"
    And User uncheck the checkbox for saving beneficiaries
    And User selects confirm details button
    And User selects confirm details button again
    And User enters "<amount>" to be transferred
    And User selects confirm amount
    And User selects purpose from dropdown
    And User selects Confirm and Review
    And User selects Confirm and Send
    And User enters the pin
    Then The money gets tranferred from Current account to digital bank account
    And user clicks on payment Done button to return back to payments tab
    Examples:
      |amount  |
      |50.50     |
      |100.50    |
      |50.50     |
      |100.50    |
      |50.50     |
      |100.50    |
      |50.50     |
      |100.50    |
      |50.50     |
      |100.50    |
      |50.50     |
      |100.50    |











