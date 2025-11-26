Feature: Save Scenarios Execution file


  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard


  @savekids @allSave
  Scenario: Validate transactions filters
    And Already registered customer
    When I click on banking Tab
    When User scrolls to child account filter icon
    When User clicks on filter icon and select filter by month
    Then user redirects to child accounts tab and validate transactions by month

  @savekids @allSave
  Scenario Outline: Validate transactions filters
    And Already registered customer
    When I click on banking Tab
    When User scrolls to child account filter icon
    Then user redirects to child accounts tab and validate transactions by date range <From Month> <To Month> <date>
    Then user redirects to child accounts tab and validate transactions by month

    Examples:
      |From Month|To Month|date|
      |November|December|26|

  @savekids @allSave @kids-sanity
  Scenario: Validate transactions filters
    And Already registered customer
    When I click on banking Tab
    When User scrolls to child account filter icon
    Then user selects Transaction type as credit
    Then user redirects to child accounts tab and validate transactions by filter credit

  @savekids @allSave
  Scenario Outline: Validate transactions filters
    And Already registered customer
    When I click on banking Tab
    When User scrolls to child account filter icon
    Then user navigate to child select date range <Min> <Max>
    Then user redirects to child accounts tab and validate transactions by filter

    Examples:
      |Min|Max|
      |3|500|

  @savekids @allSave
  Scenario: Child trying to unfreeze card
    And Already registered customer
    When I click on banking Tab
    And Select cards
    And scroll to Unfreeze card section and selects unfreeze

  @savekids @allSave
  Scenario: Validate Transactions dropdown for Credited
    And Already registered customer
    When I click on banking Tab
    When User scrolls to all transactions arrow
    Then User selects received Transactions
    Then user redirects to child accounts tab and validate transactions by filter credit

  @savekids @allSave @kids-sanity
  Scenario: Validate Transactions dropdown for Debited
    And Already registered customer
    When I click on banking Tab
    When User scrolls to all transactions arrow
    Then User selects Spent Transactions
    Then user redirects to child accounts tab and validate transactions by filter Debited


