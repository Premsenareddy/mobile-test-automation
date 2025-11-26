Feature: Kids Documents feature

  @bac @bac-kycUpdate
  Scenario: [SC01] Verify if Emirates ID details and update option is present in Profile details screen for a user whose EID status is Valid
    When I login to the application with mobile number as "kycUpdate.SC01.mobileNumber" and passcode as "kycUpdate.SC01.passcode" and debit pin as "kycUpdate.SC01.debitPin"
    And I tap on profile icon
    Then I should see the Emirates ID details and update option

  @bac @bac-kycUpdate
  Scenario: [SC02] Verify if the user is redirected to EID scan screen by tapping on Update Emirates ID option from Profile details screen
    When I login to the application with mobile number as "kycUpdate.SC02.mobileNumber" and passcode as "kycUpdate.SC02.passcode" and debit pin as "kycUpdate.SC02.debitPin"
    And I tap on profile icon
    And I tap on Update Emirates ID option
    Then I should see Scan Emirates ID screen
    When I tap on Scan original ID button
    Then I should redirect to scan ID screen

  @bac @bac-kycUpdate
  Scenario: [SC03] Verify if the Expiry banner is displayed for user whose Emirates ID is expiring and tapping on the banner will take the user to Scan EID screen
    When I login to the application with mobile number as "kycUpdate.SC03.mobileNumber" and passcode as "kycUpdate.SC03.passcode" and debit pin as "kycUpdate.SC03.debitPin"
    Then I should see the expiry banner as my EID is expiring
    When I tap on the EID expiry banner
    Then I should see Scan Emirates ID screen
    When I tap on Scan original ID button
    Then I should redirect to scan ID screen

  @bac @bac-kycUpdate
  Scenario: [SC04] Verify if the Expiry banner is displayed for user whose Emirates ID is expired and tapping on the banner will take the user to Scan EID screen
    When I login to the application with mobile number as "kycUpdate.SC04.mobileNumber" and passcode as "kycUpdate.SC04.passcode" and debit pin as "kycUpdate.SC04.debitPin"
    Then I should see the expiry banner as my EID is expired
    When I tap on the EID expiry banner
    Then I should see Scan Emirates ID screen
    When I tap on Scan original ID button
    Then I should redirect to scan ID screen

  @bac @bac-kycUpdate
  Scenario: [SC05] Verify if expiry banner is displayed in family tab for a child whose EID is expiring and tapping on the banner will take the user to Scan EID screen
    When I login to the application with mobile number as "kycUpdate.SC05.mobileNumber" and passcode as "kycUpdate.SC05.passcode" and debit pin as "kycUpdate.SC05.debitPin"
    And I tap on Family tab
    Then I should see EID expiry banner for my child "kycUpdate.SC05.childName" whose Emirates ID is expiring
    When I tap on the EID expiry banner for my child "kycUpdate.SC05.childName"
    Then I should see Scan Emirates ID screen for my child
    When I tap on Scan original ID button
    Then I should redirect to scan ID screen

  @bac @bac-kycUpdate
  Scenario: [SC06] Verify if expiry banner is displayed in family tab for a child whose EID is expired and tapping on the banner will take the user to Scan EID screen
    When I login to the application with mobile number as "kycUpdate.SC06.mobileNumber" and passcode as "kycUpdate.SC06.passcode" and debit pin as "kycUpdate.SC06.debitPin"
    And I tap on Family tab
    Then I should see EID expiry banner for my child "kycUpdate.SC06.childName" whose Emirates ID is expired
    When I tap on the EID expiry banner for my child "kycUpdate.SC06.childName"
    Then I should see Scan Emirates ID screen for my child
    When I tap on Scan original ID button
    Then I should redirect to scan ID screen

  @bac @bac-kycUpdate
  Scenario: [SC07] Verify if Emirates ID details and update option is present in settings screen for a child whose EID status is Valid
    When I login to the application with mobile number as "kycUpdate.SC07.mobileNumber" and passcode as "kycUpdate.SC07.passcode" and debit pin as "kycUpdate.SC07.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account for my child "kycUpdate.SC07.childName"
    Then I should see the Emirates ID details and update option for my child "kycUpdate.SC07.childName"
    When I tap on Update Emirates ID for my child
    Then I should see Scan Emirates ID screen for my child
    When I tap on Scan original ID button
    Then I should redirect to scan ID screen

  @bac @bac-kycUpdate
  Scenario: [SC08] Verify if Emirates ID details and update option is not present in settings screen for a child whose EID status is not Valid
    When I login to the application with mobile number as "kycUpdate.SC08.mobileNumber" and passcode as "kycUpdate.SC08.passcode" and debit pin as "kycUpdate.SC08.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account for my child "kycUpdate.SC08.childName"
    Then I should not see the Emirates ID details and update option for my child

  @bac @bac-kycUpdate
  Scenario: [SC09] Verify if Emirates ID details and update option is not present in Profile details screen for a user whose EID status is not Valid
    When I login to the application with mobile number as "kycUpdate.SC09.mobileNumber" and passcode as "kycUpdate.SC09.passcode"
    And I tap on profile icon
    Then I should not see the Emirates ID details and update option
