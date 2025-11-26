Feature: Verify More MenuScreens

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    And Already registered customer

  @allEngage @engage-moreScreen @iosengage
  Scenario: Verify More Tab
    Then I land on More Tab
    And Verify More Screen UI

  @allEngage @engage-moreScreen @iosengage
  Scenario: Verify More Tab My Interests Screen
    Then I land on More Tab
    And I land On My Interests
    And Verify My Interests Screen

  @allEngage @engage-moreScreen @sanity @iosengage
  Scenario: Verify More Tab Saved My Interests
    Then I land on More Tab
    And I land On My Interests
    And Verify My Interests Saved

  @allEngage @engage-moreScreen @iosengage
  Scenario: Verify More Tab Notifications UI
    Then I land on More Tab
    And Verify Notifications UI

  @allEngage @engage-moreScreen @iosengage
  Scenario: Verify More Tab Get In Touch Marketplace FAQ UI
    Then I land on More Tab
    And Verify Marketplace FAQ UI

  @allEngage @engage-moreScreen @iosengage
  Scenario: Verify More Tab Terms and Conditions UI
    Then I land on More Tab
    And Verify Terms and Conditions UI

  @allEngage @engage-moreScreen @sanity @iosengage
  Scenario: Verify More Tab Privacy Policy UI
    Then I land on More Tab
    And Verify Privacy Policy UI

  @allEngage @engage-moreScreen @iosengage
  Scenario: Verify More Tab Transparency UI
    Then I land on More Tab
    And Verify Transparency UI

  @allEngage @engage-moreScreen @iosengage
  Scenario: Verify My Orders Screen UI
    Then I land on More Tab
    And I land on My Orders Screen
    And Verify My Orders Screen

  @allEngage @engage-moreScreen @iosengage
  Scenario: Verify My Order Summary Screen UI
    Then I land on More Tab
    And I land on My Orders Screen
    And I land on Order Summary Screen