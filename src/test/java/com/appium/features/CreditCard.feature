Feature: Credit Card Scenarios Execution file

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard

  @allCredit
  Scenario: Validate credit card show and hide details feature
    And Already registered customer
    And User clicks on the Account
    And Select "Credit" card from Banking tab
    And User waits for Card screen to populate proper
    And User Clicks on back button on banking tab
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    Then Validate card details are hidden
    And Click on Show Details text
    Then Validate card details are not hidden

  @allCredit
  Scenario Outline: Validate credit card freeze and unfreeze feature
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    And User waits for Card screen to populate proper
    And Freeze the card
    Then User validate the description <freezeContent> on screen
    And validate the text and freeze the card
    Then User views notification upon card Freeze
    Then User should see change pin is disabled
    And UnFreeze the card
    Then User validate the description <unFreezeContent> on screen
    Then User validate the information "<unFreezeTitle>" "<unFreezeSubDetail>" on screen
    And validate the text and Unfreeze the card
    Then User views notification upon card Unfreeze
    Then User should see change pin is enabled

    Examples:
      |freezeContent|unFreezeContent|unFreezeTitle|unFreezeSubDetail|
      |You're about to freeze this credit card, this means that no one, including you, can use it until you unfreeze it|If you unfreeze this card, you will be able to use it for payments and purchases|Card settings|All card settings will be enabled after you unfreeze the card, so make sure you review them again|

  @allCredit
  Scenario Outline: Validate card Pin change flow with valid Pin Number
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    And User waits for Card screen to populate proper
    And Scroll to Change pin buton
    And Click change pin
    And Enter pin ann confirm <passcode> <debit card Pin> <Confirm PIN>
    Then User views notification upon pin change

    Examples:
      |passcode|debit card Pin|Confirm PIN|
      |1234|4321|4321|

  @allCredit
  Scenario Outline: Validate card Pin change flow with invalid Pin Number
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    And User waits for Card screen to populate proper
    And Scroll to Change pin buton
    And Click change pin
    And Enter pin ann confirm <passcode> <debit card Pin> <Confirm PIN>
    Then User verify the validation text "The PIN codes don't match, please try again" on screen

    Examples:
      |passcode|debit card Pin|Confirm PIN|
      |1234|4321|1234|

  @allCredit
  Scenario: Validate the availability of limit section on credit card screen
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    And User waits for Card screen to populate proper
    Then User can see "Total credit limit" label, linked amount "9000.0" and currency "AED"
    Then User can see progress bar
    Then User can see "Outstanding balance" label, linked amount "1132.0" and currency "AED"
    Then User can see "Available limit" label, linked amount "7868.0" and currency "AED"

  @onboardCreditCard
  Scenario: Validate the information for onboarding Infinite credit card
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    Then User navigates to onboard "Credit Cards" screen and verify header
    Then User verify Card layout with card count as 2 and name is "Etihad Guest Infinite" and detail is "Make the most of your spending by earning Etihad Miles and get ready to achieve your travel goals!"
    Then User verify "Minimum requirements" section for age is "21 years and above", and monthly income "15,000 AED" and employment type is "Salaried"

  @onboardCreditCard
  Scenario: Validate the information for onboarding Signature credit card
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    And User selects "" from credit card screen
    Then User navigates to onboard "Credit Cards" screen and verify header
    Then User verify Card layout with card count as 2 and name is "Etihad Guest Signature" and detail is "Make the most of your spending by earning Etihad Miles and get ready to achieve your travel goals!"
    Then User verify "Minimum requirements" section for age is "21 years and above", and monthly income "8,000 AED" and employment type is "Salaried"

  @onboardCreditCard
  Scenario: Validate the features and benefits and reference number screen for onboarding Infinite credit card
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    And User clicks on Apply Now button on CC screen
    Then User validates Apply Now Screen and its content "Hello%You’re only a few steps away! Share the IBAN number of the account where your salary is credited, and a Customer Support representative will contact you if we need more information%The account where your salary has been credited for the last 3 months%I agree, accept and consent to the following:%Credit card declaration%Key Facts Statement%Master Murabaha agreement%I consent to the one-time release of my account statement from UAEFTS for the bank to assess my eligibility for the product"
    And Scroll to "I accept" button
    And User Clicks on back button on apply now screen
    And User clicks on View Features
    Then User navigates to feature "Etihad Guest Infinite credit card" screen and verify layout
    And User clicks on Apply Now button on CC screen
    Then User validates Apply Now Screen and its content "Hello%You’re only a few steps away! Share the IBAN number of the account where your salary is credited, and a Customer Support representative will contact you if we need more information%The account where your salary has been credited for the last 3 months%I agree, accept and consent to the following:%Credit card declaration%Key Facts Statement%Master Murabaha agreement%I consent to the one-time release of my account statement from UAEFTS for the bank to assess my eligibility for the product"
    And Scroll to "I accept" button

  @onboardCreditCard
  Scenario: Validate the features and benefits screen and reference number screen for onboarding Signature credit card
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    And User selects "" from credit card screen
    And User clicks on Apply Now button on CC screen
    Then User validates Apply Now Screen and its content "Hello%You’re only a few steps away! Share the IBAN number of the account where your salary is credited, and a Customer Support representative will contact you if we need more information%The account where your salary has been credited for the last 3 months%I agree, accept and consent to the following:%Credit card declaration%Key Facts Statement%Master Murabaha agreement%I consent to the one-time release of my account statement from UAEFTS for the bank to assess my eligibility for the product"
    And Scroll to "I accept" button
    And User Clicks on back button on apply now screen
    And User clicks on View Features
    Then User navigates to feature "Etihad Guest Signature credit card" screen and verify layout
    And User clicks on Apply Now button on CC screen
    Then User validates Apply Now Screen and its content "Hello%You’re only a few steps away! Share the IBAN number of the account where your salary is credited, and a Customer Support representative will contact you if we need more information%The account where your salary has been credited for the last 3 months%I agree, accept and consent to the following:%Credit card declaration%Key Facts Statement%Master Murabaha agreement%I consent to the one-time release of my account statement from UAEFTS for the bank to assess my eligibility for the product"
    And Scroll to "I accept" button

  @appliedCreditCard
  Scenario: Validate the application reference number screen when user has applied for CC
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    And User is navigated to "Thank you for applying!" screen, having label as "Your credit card application has been received"
    And User clicks on back to homepage button
    And User selects Credit Cards from dashboard
    And User is navigated to "Thank you for applying!" screen, having label as "Your credit card application has been received"
    And User clicks on back to homepage button
    And User selects Credit Cards from dashboard

  @activateCreditCard
  Scenario: Validate user is redirected to activate CC
    And Already registered customer
    And User should see "Your credit card application was approved!%Activate your virtual card" banner on dashboard
    And User clicks on banner from dashboard
    Then User should see status as "Status: Inactive", label as "Congratulations, your credit card application is approved!" and button with "Activate your card" for inactive details
    And User clicks on Activate your card button on credit card screen
    Then User should see "Set credit card PIN" screen with title as "Set a PIN for your credit card" and components
    And User clicks on next button on set credit card Pin
    Then User should see "Confirm PIN" screen with title as "Let's double check that one more time" and components

  @CCStatements
  Scenario: Validate user is able to see credit card statements
    And Already registered customer
    And Scroll to set quick actions on dashboard
    And User selects Credit Cards from dashboard
    And User waits for Card screen to populate proper
    And User clicks on Past Statements
    Then User validates "Past statements" screen

  @CCStatementSummary
  Scenario: Validate user is able to see statement summary on credit card tab
    And Already registered customer
    And User clicks on the Account
    And Select "Credit" card from Banking tab
    And User waits for Card screen to populate proper
    Then User should see statement summary details on credit card tab
    And User clicks on PayNow button
    Then User navigates to "Payment amount" screen
    And User Clicks on back button on payment method screen
    And User waits for Card screen to populate proper
