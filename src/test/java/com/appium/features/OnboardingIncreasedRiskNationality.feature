@tag
Feature: Registration of onboarding Marketplace Customer

  @all @Onboarding @IRNationality
  Scenario Outline: Market place user Registeration
    Given User Opens the App
    When User clicks on Skip button on Explore,shop & Earn page
    And User Clicks on Start Exploring on Registration page
    And User enters mobile number as "58111" to register the device
    And User click next button
    And Enter OTP received by APIs
    And User click on next button
    And User Enters personal info first name as "<First Name>", Date of Birth as "<DOB>", nationality as "<Nationality>", Unique Email Address as "<Email>", Gender as "<Gender>"
    And User accepts terms & conditions
    And User enter passcode as "<Passcode>" and click next
    And User confirms passcode as "<Passcode>" and click next
    And User selects interests
    And User clicks on Start Exploring button
    And verify "Open an Al Hilal Bank Digital Account" banner is dsiplayed on page
    When I validate the email
 		When I return back to the dashboard screen
 	  When I click on bank onboarding banner
    When I select open bank account option
    When User accepts banking terms & conditions
    When User lands on UAE Pass Selection Screen and selects standard account option
    Then User selects passport scanning option
    Then Validate IR passport details from backend

    Examples: 
      | First Name | DOB        | Nationality | Email | Gender | Passcode |
      | Namekapil  | 17/01/1989 | Afghanistan   | kapil | female |     1234 |
      

  @all @Onboarding @IRNationality
  Scenario: Validate EID Details
    And Already registered customer
    When I click on your bank account is waiting banner
    Then User selects EID scanning option
    Then Validate IR EID details from backend

  @all @Onboarding @IRNationality
  Scenario Outline: Validate ID validation successful message after scanning passport and EID Details
    And Already registered customer
    Then User is on dashboard
    Then User validates ID verification successful message
    When User clicks ID verification successful message
    Then User validates data on review screen
    Then User selects continue option
    And User Enters Villa as "<Villa>",Street as "<Street>", city as "<City>" and Emirate as "<Emirate>"
      Examples: 
      | Villa | Street     | City | Emirate |
      | villa | homestreet | Abu Dhabi| Abu Dhabi |
      
    @all @Onboarding @IRNationality
  Scenario Outline: User enters current employment details
    And Already registered customer
    When User clicks ID verification successful message
    And User selects continue option
    And User bypasses your address screen
    Then User enters "<Income>"
      Examples: 
      | Income |
      | 12000 | 
      
    @all @Onboarding @IRNationality
  Scenario Outline: User completes details on FATCA screen
    And Already registered customer
    When User clicks ID verification successful message
    And User selects continue option
    And User bypasses your address screen
    And User bypasses current employment screen
    Then User enters "<Country>" and "<City>" on FATCA screen 
      Examples: 
      | Country |City|
      | India | Delhi|    
      
     @all @Onboarding @IRNationality
  Scenario Outline: User completes details on Tax declaration screen and validates end message
    And Already registered customer
    When User clicks ID verification successful message
    And User selects continue option
    And User bypasses your address screen
    And User bypasses current employment screen
    And User bypasses fatca screen
    Then User enters "<Country>" and tax identification details
    And Select no from tax identification
    And User Accepts terms and conditions for tax declaration
    And Validate banner for IR Nationality
      Examples: 
      | Country | Passcode |
      | Indonesia |  1234|  
      
    
