Feature: Personal Finance


  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard

  @personalFinance
  Scenario: Validate Apply New Finance Feature
    And Already registered customer
    When User clicks on Personal Finance
    Then User applies for New Finance
    Then Verify Personal Finance Eligibility Content
    And User clicks on Calculate Monthly Payments Button
    Then Verify Calculator Screen
    And Verify Lead Confirmation Screen

  @personalFinance
  Scenario: Validate Available Finances Flow
    When Already registered customer
    Then User clicks on Personal Finance
    And Verify Previous loans
    Then Verify Previous Loan Summary