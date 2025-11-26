Feature: Verify Family Screens

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    And Already registered customer

  @allEngage @engage-familyScreen @sanity @iosfamily @iosengage
  Scenario: Verify Family Tab Kids Card UI
    Then I land on Family Tab
    And Verify Kids Card UI

  @allEngage @engage-familyScreen @sanity @iosfamily @iosengage
  Scenario: Verify Family Tab Kids Card Settings UI
    Then I land on Family Tab
    And Verify Kids Card Settings UI