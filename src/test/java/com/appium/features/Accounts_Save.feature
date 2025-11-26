Feature: Save Scenarios Execution file


  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard



  @allSave
  Scenario Outline: Validate transactions filters by date picker
    And Already registered customer
    And User clicks on the Account
    When User scrolls to filter icon
    Then user redirects to accounts tab and validate transactions by date range <From Month> <To Month> <date>
    Then user redirects to accounts tab and validate transactions by filter
    When User scrolls to filter icon

    Examples:
      |From Month|To Month|date|
      |December|March|10|

  @allSave @iosAutomated
  Scenario: Validate transactions filters by month
    And Already registered customer
    And User clicks on the Account
    When User scrolls to filter icon
    When User clicks on filter icon and select filter by month
    Then user redirects to accounts tab and validate transactions by month

  @allSave @iosAutomated
  Scenario: Validate transactions filters by credit filter
    And Already registered customer
    And User clicks on the Account
    When User scrolls to filter icon
    Then user selects Transaction type as credit
    Then user redirects to accounts tab and validate transactions by filter credit

  @allSave @iosAutomated
  Scenario Outline: Validate transactions filters by amount filter
    And Already registered customer
    And User clicks on the Account
    When User scrolls to filter icon
    Then user navigate to select date range <Min> <Max>
    Then user redirects to accounts tab and validate transactions by filter

    Examples:
      |Min|Max|
      |10|10000|

  @allSave1 @sanity @iosAutomated
  Scenario: Validate Transactions dropdown for spent
    And Already registered customer
    And User clicks on the Account
    When User scrolls to all transactions arrow
    Then User selects Spent Transactions
    Then user redirects to accounts tab and validate transactions by Spent

  @allSave1 @iosAutomated
  Scenario: Validate Transactions dropdown for received
    And Already registered customer
    And User clicks on the Account
    When User scrolls to all transactions arrow
    Then User selects received Transactions
    Then user redirects to accounts tab and validate transactions by received

  @allSave @iosAutomated
  Scenario: Topup Banner is removed
  And Already registered customer
  And User clicks on the Account
  When User notices missing of topup banner

  @iosAndroid @allSave @sanity
  Scenario: Validate cards tab and change of card linked account
    And Already registered customer
    And User clicks on the Account
    And Select cards
    And Validate card details are hidden "sit" "android"
    And Click on Show Details text
    Then User changes the linking of the cards account from current to savings "android"

  @allSave @iosAutomated @sanity
  Scenario: Validate card freeze flow
  And Already registered customer
  And User clicks on the Account
  And Select cards
  And Freeze the card
  And validate the text and freeze the card
  Then User views notification upon card Freeze

  @allSave @iosAutomated @sanity
  Scenario: Validate card unfreeze flow
  And Already registered customer
  And User clicks on the Account
  And Select cards
  And UnFreeze the card
  And validate the text and Unfreeze the card
  Then User views notification upon card Unfreeze

  @allSave @sanity
  Scenario Outline: Validate card Pin change flow
  And Already registered customer
  And User clicks on the Account
  And Select cards
  And Scroll to Change pin buton
  And Click change pin
  And Enter pin ann confirm <passcode> <debit card Pin> <Confirm PIN>
  Then User views notification upon pin change

  Examples:
	|passcode|debit card Pin|Confirm PIN|
	|1234|4321|4321|

  @allSave @sanity
  Scenario: Validate online payment
  And Already registered customer
  And User clicks on the Account
  And Select cards
  And Scroll to Online payments
  And Toggle off Online Payments
  And validate the notification upon switching off online payment toggle
  Then toggle on Online Payments and view for the notification upon toggling

  @allSave @sanity
  Scenario: Validate International payments
  And Already registered customer
  And User clicks on the Account
  And Select cards
  And Scroll to International payments
  And Toggle off International Payments
  And validate the notification upon switching off International payment toggle
  Then toggle on International Payments and view for the notification upon toggling

  @allSave @sanity @iosAutomated
  Scenario: Validate card management flow for POC limit
  And Already registered customer
  And User clicks on the Account
  And Select cards
  And Scroll to set debit card limits
  And Click on set debit card limits
  And Verify and Select POC limit
  And navigate to limit change screen to enter poc limit and save
  Then User returns back and validates notification upon successful POC limit change

  @allSave @iosAutomated
  Scenario: Validate card management flow for online payment limit
  And Already registered customer
  And User clicks on the Account
  And Select cards
  And Scroll to set debit card limits
  And Click on set debit card limits
  And Verify and Select Online Payments limit
  And navigate to limit change screen to enter op limit and save
  Then User returns back and validates notification upon successful OP limit change

  @allSave @sanity @iosAutomated
  Scenario: Validate card management flow for ATM limit
  And Already registered customer
  And User clicks on the Account
  And Select cards
  And Scroll to set debit card limits
  And Click on set debit card limits
  And Verify and Select ATM Payments limit
  And navigate to limit change screen to enter atm limit and save
  Then User returns back and validates notification upon successful ATM limit change

  @iosAndroid @allSave
  Scenario Outline: Validate Quick action links navigations from Explore tab
    And Already registered customer
    And User verifies Quick actions link "Transfer money" , "Account details" , "My card"
    Then user navigates to related quick action link section from Explore Tab "<Quick Actions Link>"
    Then validate title of the related quick action link Screen "<Screen Title>" "<Platform>"

  Examples:
  |Quick Actions Link|Screen Title|Platform|
  |Transfer money|Transfer money|android|
  |Details|Account details|android|
  |My card|Banking|android|
  |Cheque book|Banking|android|

  @allSave @iosAutomated
  Scenario Outline: To verify the the top up feature using Quick Actions button from Dashboard
    And Already registered customer
    And User clicks on the Account
    When User clicks on TopUp Button from Quick Links
    Then user navigates to transfer details screen <Amount> , <Card> , <Name> , <Expiry Date> , <CVV>

    Examples:
      |Amount|Card|Name|Expiry Date|CVV|
      |65000|4000000000000002|Priya Bade|0929|123|


  @allSave @iosAutomated
  Scenario Outline: To verify the the top up feature using Quick Actions button from Banking Screen
    And Already registered customer
    And User clicks on the Account
    When User clicks on TopUp Button from Quick Links
    Then user navigates to transfer details screen <Amount> , <Card> , <Name> , <Expiry Date> , <CVV>

    Examples:
      |Amount|Card|Name|Expiry Date|CVV|
      |65000|4000000000000002|Priya Bade|0929|123|

################################################### UAE PASS ########################################################


  @uaepassUAE @allSave
  Scenario: Request documents for UAE National
    And Already registered customer
    And User clicks on the Bank Account
    When User scrolls to lets start icon
    And Select bundled accounts
    And Continue with uae pass
    And User navigates to UAE PASS App and validates documents
    And User toggles On and clicks Allow Documents sharing
    And User Authenticates uae pass "CIT"
