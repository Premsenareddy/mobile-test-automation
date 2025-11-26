Feature: Verify More MenuScreens

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    And Already registered customer

  @customerService @sanity
  Scenario: User Rating for the first time
    Then User Clicks More Option
    And User should see Rate us option with 5 start being empty

  @customerService @sanity
  Scenario: User Enters the rating and verify all the  comments in popup
    Then User Clicks More Option
    And User should see Rate us option with 5 start being empty
    And User Clicks on one of five star as rating for the app

  @customerService @sanity
  Scenario: Verify the  maximum limit for feedback is upto 500 characters
    Then User Clicks More Option
    And User should see Rate us option with 5 start being empty
    And User Clicks on one of five star as rating for the app
    And Verify the maximum character limit

  @customerService @sanity
  Scenario Outline: User Select the rating and Enter the all allowed special characters
    Then User Clicks More Option
    And User should see Rate us option with 5 start being empty
    And User Clicks on one of five star as rating for the app
    And Verify the maximum character limit
    And User can enter the allowed special characters <comment>
    And Verify the submit button in the application

    Examples:
      | comment         |
      | Testing ,.:()!? |

  @customerService @sanity
  Scenario Outline: User Enters the rating and feedback
    Then User Clicks More Option
    And User should see Rate us option with 5 start being empty
    And User Clicks on one of five star as rating for the app
    And Verify the maximum character limit
    And User succesfully able to submit the comments <comment>
    And Verify the submit button in the application

    Examples:
      | comment              |
      | Testing ,.:()!? 1234 |

  @customerService @sanity
  Scenario Outline: User Enters the rating and verify all the elements
    Then User Clicks More Option
    And User should see Rate us option with 5 start being empty
    And User Clicks on one of five star as rating for the app
    And Verify the maximum character limit
    And User succesfully able to submit the comments <comment>
    And Verify the submit button in the application

    Examples:
      | comment              |
      | Testing ,.:()!? 1234 |

  @customerService @sanity
  Scenario Outline: User Enters the rating and view comment for the app
    Then User Clicks More Option
    And User should see Rate us option with 5 start being empty
    And User Clicks on one of five star as rating for the app
    And User succesfully able to submit the comments <comment>
    And Click on submit button
    And Verify the success Screen
    And User should be able to close Comments popup screen if needed
    And Verify selected rating should be reset to previous rating in More screen

    Examples:
      | comment              |
      | Testing ,.:()!? 1234 |





