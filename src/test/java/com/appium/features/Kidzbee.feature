Feature: Kids navigate to game view and perform certain actions

  Background:
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard

  #Kidzbee - Entry Point 1 Visibility from Explore Screen
  @allKidzbee
  Scenario: Validate the Entry Point 1 Visibility from Explore Screen
    And Already registered customer
    And I click on Tasks tab
    And I click on explorer tab
    When I land on the Explore tab
    And Tap Play Now

  @allKidzbee
  Scenario: Validate the Entry Point 1 Visibility from Explore Screen
    And Already registered customer
    And I click on Tasks tab
    And I click on explorer tab
    When I land on the Explore tab
    And Tap Play Now

  @allKidzbee
  Scenario: Validate the Entry Point 2 Visibility from Explore Screen
    And Already registered customer
    And I click on Tasks tab
    And I click on explorer tab
    When I land on the Explore tab
    And Tap Play Now

  @allKidzbee
  Scenario: Validate the Payment Connector in Game View for banking user
    And Already registered customer
    And I click on Tasks tab
    And I click on explorer tab
    When I land on the Explore tab
    And Tap Play Now
    

      #Kidzbee Login - Switch from Normal View to game view
  @allKidzbee
  Scenario: Verify Switch from Normal View to game view
    And Already registered customer
    And I click on Tasks tab
    And User navigate to Tasks Screen
    And I Click on playnow in Tasks header section
    And I Click on back button in game view

          #Kidzbee Login - Validate the page loader for game view
  @allKidzbee
  Scenario: Validate the page loader for game view
    And Already registered customer
    And I click on Tasks tab
    And User navigate to Tasks Screen
    And I Click on playnow in Tasks header section
    When I land on the Game View
    And I Click on back button in game view

  @allKidzbee
  Scenario:  Entry Point 2 from other tabs excluding Explore tab
    And Already registered customer
    And I click on Banking tab
    And User navigate to Banking Screen
    And I Click on playnow in Banking header section
    And I Click on back button in game view
    And I click on Tasks tab
    And User navigate to Tasks Screen
    And I Click on playnow in Tasks header section
    And I Click on back button in game view

  @allKidzbee
  Scenario: To validate the kids game view
    And Already registered customer
    And Tap Play Now
    And User Clicks on transactionlistview
    And User Clicks on earnedTab
    And User Clicks on spentTab
    And User Clicks on receivedTab
    And I see the AED and Touchpoint Icons in the App
    And User Clicks on back button

  @allKidzbee
  Scenario: To validate the earned tab in transactionlist of game view
    And Already registered customer
    And Tap Play Now
    And User Clicks on transactionlistview
    And User Clicks on earnedTab
    And User Clicks on spentTab
    And User Clicks on receivedTab
    And I see the AED and Touchpoint Icons in the App
    And User Clicks on back button

    #Kidzbee : To validate the transactionlist in game view
  @allKidzbee
  Scenario: To validate the spent tab in transactionlist of game view
    And Already registered customer
    And Tap Play Now
    And User Clicks on transactionlistview
    And User Clicks on earnedTab
    And User Clicks on spentTab
    And User Clicks on receivedTab
    And I see the AED and Touchpoint Icons in the App
    And User Clicks on back button

  @allKidzbee
  Scenario: To validate the recieved tab in transactionlist of game view
    And Already registered customer
    And Tap Play Now
    And User Clicks on transactionlistview
    And User Clicks on earnedTab
    And User Clicks on spentTab
    And User Clicks on receivedTab
    And I see the AED and Touchpoint Icons in the App
    And User Clicks on back button

  #Kidzbee - Verify AED and Toucpoints Transactions in the APP
  @allKidzbee
  Scenario: Verify AED transactions in game view
    And Already registered customer
    And Tap Play Now
    And User Clicks on transactionlistview
    And User Clicks on earnedTab
    And I see the AED and Touchpoint Icons in the App

  @allKidzbee
  Scenario: Verify TP transactions in game view
    And Already registered customer
    And Tap Play Now
    And User Clicks on transactionlistview
    And User Clicks on earnedTab
    And I see the AED and Touchpoint Icons in the App

  #Kidzbee Login - Verify the Game view header for all the tabs
  @allKidzbee
  Scenario: To validate the game view header for all the tabs
    And Already registered customer
    And I click on Banking tab
    And User navigate to Banking Screen
    And I Click on playnow in Banking header section
    And I Click on back button in game view
    And I click on Tasks tab
    And User navigate to Tasks Screen
    And I Click on playnow in Tasks header section
    And I Click on back button in game view

  # Transfer the Touchpoint to child using Touchpoints

  @kidzbee
  Scenario: To validate the Login
    And Login through API on Parents Account
    And I add Chores through an API

#  @allKidzbee
#  Scenario Outline: Outgoing AED transaction List in Spent Through Market place with TP[Spent]
#    And Already registered customer
#    When I land on the Explore tab
#    Then User search for product "<Product>"
#    And Verify "<Title>" is displayed
#    And Select the first product
#    And Select Buy Now
#    And Choose shipping address
#    And Make payment by TP
#    And I Click on GotoHomepage
#    When I land on the Explore tab
#    And Tap Play Now
#    And User Clicks on transactionlistview
#    And User Clicks on earnedTab
#    And User Clicks on spentTab
#    And Verify the poduct in marketplace
#    And User Clicks on back button
#    Examples:
#      | Product | Title          |
#      | canon   | Search results |
#
#  @allKidzbee
#  Scenario Outline: Outgoing AED transaction List in Spent Through Market place with AED[Spent]
#    And Already registered customer
#    When I land on the Explore tab
#    Then User search for product "<Product>"
#    And Verify "<Title>" is displayed
#    And Select the first product
#    And Select Buy Now
#    And Choose shipping address
##    And Add a card flow
##    And Verify "<Title2>" is displayed
##    And Make payment by card in AED "<CardNumber>", "<CVN>"
##    And I Click on GotoHomepage
##    When I land on the Explore tab
##    And Tap Play Now
##    And User Clicks on transactionlistview
##    And User Clicks on earnedTab
##    And User Clicks on spentTab
##    And Verify the poduct in marketplace
##    And User Clicks on back button
#
#
#    Examples:
#      |Product	|  Title           |  Title2  |  CardNumber   |   CVN  |
#      |canon    |   Search results | Payment |  4000000000000002  | 111 |






