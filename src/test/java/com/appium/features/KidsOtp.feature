Feature: Kids OTP feature

  @bac @bac-kidsOtp
  Scenario: [SC01] Verify if the parent has the option to set the mobile number for a child whose EID status is VALID
    When I login to the application with mobile number as "kidsOtp.SC.mobileNumber" and passcode as "kidsOtp.SC.passcode" and debit pin as "kidsOtp.SC.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account
    Then I should see the option to enable OTP reception by my child while doing online transaction
    And the enable Otp option should be toggled "OFF"
    And my child mobile number should not be displayed
    And mobile number edit option should not be present

  @bac @bac-kidsOtp
  Scenario: [SC02] Verify the elements from Receive OTP Overlay screen
    When I login to the application with mobile number as "kidsOtp.SC.mobileNumber" and passcode as "kidsOtp.SC.passcode" and debit pin as "kidsOtp.SC.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account
    And I should see the option to enable OTP reception by my child while doing online transaction
    And I toggle "ON" the option to receive Otp in my child mobile number
    Then I should see the Receive Otp overlay screen
    And I close the Receive Otp overlay screen

  @bac @bac-kidsOtp
  Scenario: [SC03] Verify if error message is displayed by entering invalid mobile number in Receive OTP Overlay screen
    When I login to the application with mobile number as "kidsOtp.SC.mobileNumber" and passcode as "kidsOtp.SC.passcode" and debit pin as "kidsOtp.SC.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account
    Then I should see the option to enable OTP reception by my child while doing online transaction
    And I toggle "ON" the option to receive Otp in my child mobile number
    When I enter mobile number as "511810917" in Receive Otp screen
    Then I should see the mobile number field error
    When I enter mobile number as "50181091" in Receive Otp screen
    Then I should see the mobile number field error

  @bac @bac-kidsOtp
  Scenario: [SC04] Verify if the mobile number duplication error is displayed by entering an existing number for the child
    When I login to the application with mobile number as "kidsOtp.SC.mobileNumber" and passcode as "kidsOtp.SC.passcode" and debit pin as "kidsOtp.SC.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account
    Then I should see the option to enable OTP reception by my child while doing online transaction
    And I toggle "ON" the option to receive Otp in my child mobile number
    And I enter mobile number as "kidsOtp.SC.mobileNumber" in Receive Otp screen
    When I tap on Verify mobile button
    Then I should see the mobile duplication error
    And I tap on Ok button from alert popup

  @bac @bac-kidsOtp
  Scenario: [SC05] Verify the elements on Confirm OTP Overlay screen
    When I login to the application with mobile number as "kidsOtp.SC.mobileNumber" and passcode as "kidsOtp.SC.passcode" and debit pin as "kidsOtp.SC.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account
    Then I should see the option to enable OTP reception by my child while doing online transaction
    And I toggle "ON" the option to receive Otp in my child mobile number
    And I enter mobile number as "Generate" in Receive Otp screen
    When I tap on Verify mobile button
    Then I should see the Confirm Otp overlay screen
    Then I close the Confirm Otp overlay screen

  @bac @bac-kidsOtp
  Scenario: [SC06] Verify if the parent is able to set the mobile number for a child whose EID status is VALID
    When I login to the application with mobile number as "kidsOtp.SC06.mobileNumber" and passcode as "kidsOtp.SC06.passcode" and debit pin as "kidsOtp.SC06.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account
    Then I should see the option to enable OTP reception by my child while doing online transaction
    And I toggle "ON" the option to receive Otp in my child mobile number
    And I enter mobile number as "Generate" in Receive Otp screen
    When I tap on Verify mobile button
    Then I should see the Confirm Otp overlay screen
    And I enter the otp received in child mobile number
    When I tap on Verify mobile button
    Then the mobile number should be set for the child
    And the enable Otp option should be toggled "ON"

  @bac @bac-kidsOtp
  Scenario: [SC07] Verify if the parent does not have option to set the mobile number for a child whose EID status is not VALID
    When I login to the application with mobile number as "kidsOtp.SC07.mobileNumber" and passcode as "kidsOtp.SC07.passcode" and debit pin as "kidsOtp.SC07.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account
    Then I should not see the option to enable OTP reception by my child while doing online transaction

  @bac @bac-kidsOtp
  Scenario: [SC08] Verify if the parent is able to edit the mobile number for a child whose EID status is VALID
    When I login to the application with mobile number as "kidsOtp.SC08.mobileNumber" and passcode as "kidsOtp.SC08.passcode" and debit pin as "kidsOtp.SC08.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account
    Then I should see the option to enable OTP reception by my child while doing online transaction
    And my child mobile number should be displayed
    When I toggle "OFF" the option to receive Otp in my child mobile number
    Then mobile number edit option should not be present
    Then my child mobile number should be displayed
    When I toggle "ON" the option to receive Otp in my child mobile number
    And I tap on edit number option
    Then I should see the Receive Otp overlay screen
    And I enter my child's existing mobile number in Receive Otp screen
    And I tap on Verify mobile button
    Then I should see the mobile duplication error
    And I tap on Ok button from alert popup
    When I close the Receive Otp overlay screen
    Then my child's number should be same as before
    And the enable Otp option should be toggled "ON"
    When I tap on edit number option
    And I enter mobile number as "Generate" in Receive Otp screen
    And I tap on Verify mobile button
    And I enter the otp received in child mobile number
    When I tap on Verify mobile button
    Then the mobile number should be set for the child
    And the enable Otp option should be toggled "ON"
