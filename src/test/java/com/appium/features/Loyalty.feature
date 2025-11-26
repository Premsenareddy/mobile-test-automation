Feature: Verify Loyalty Screen

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    And Already registered customer

  @allEngage @engage-loyaltyScreen @iosengage @iosloyality
  Scenario: Verify Loyalty balance on dashboard
    When I land on Explore tab
    Then Verify Loyalty Balance
    And Verify Loyalty Transaction Screen UI

  @allEngage @engage-loyaltyScreen @sanity @iosengage @iosloyality
  Scenario: Verify Loyalty Earn More UI
    When I land on Explore tab
    Then Navigate to Loyalty Balance
    And Verify Loyalty Transaction Earn More Screen UI
    And Verify FAQ Earn More Screen UI

  @allEngage @engage-loyaltyScreen @iosengage @iosloyality
  Scenario: Verify Loyalty Redeem UI
    When I land on Explore tab
    Then Navigate to Loyalty Balance
    And Verify Loyalty Transaction Redeem Screen UI
    And Verify FAQ Redeem Screen UI