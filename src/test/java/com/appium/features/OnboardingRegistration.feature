@tag
Feature: Registration of onboarding Marketplace Customer

  @all @Onboarding @Registration
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
    And "Email verification pending" message should be displayed

    Examples: 
      | First Name | DOB        | Nationality | Email | Gender | Passcode |
      | Namekapil  | 17/01/1989 | Indonesia   | kapil | female |     1234 |

  @all @Onboarding @Registration
  Scenario Outline: To verify that the user details are correct on more section
    And Already registered customer
    When I go to more menu tab
    When I open account section
    When I click on user profile details section
    Then I validate the "<First Name>" on profile section is same as provide at registration

    Examples: 
      | First Name |
      | Namekapil  |

  @all @Onboarding @Registration
  Scenario Outline: To verify that the user details are correct on more section
    And Already registered customer
    When I go to more menu tab
    When I open account section
    When I click on user profile details section
    Then I validate the "<Email>" on profile section is same as provide at registration

    Examples: 
      | Email   |
      | Shekhar |
         
      
  @all @Onboarding @Registration
  Scenario: To verify the email and check the account opening options
  And Already registered customer
  When I validate the email
  When I return back to the dashboard screen
  When I click on bank onboarding banner
  When I select open bank account option
  Then I verify Account options
  
  @all @Onboarding @Registration
  Scenario: To select savings and current account options and validate uae pass screen elements
  And Already registered customer
  When I click on bank onboarding banner
  When I select open bank account option
  When User accepts banking terms & conditions
  Then User lands on UAE Pass Selection Screen and validates the elements
  
  
  @all @Onboarding @Registration
  Scenario: To select savings and current account options and go for standard account opening
  And Already registered customer
  When I click on bank onboarding banner
  When I select open bank account option
  When User accepts banking terms & conditions
  When User lands on UAE Pass Selection Screen and selects standard account option
  Then User validates passport screen details
  
  @all @Onboarding @Registration
  Scenario: Validate Passport Details
  And Already registered customer
  When I click on bank onboarding banner
  When I select open bank account option
  When User accepts banking terms & conditions
  When User lands on UAE Pass Selection Screen and selects standard account option
  Then User selects passport scanning option
  Then Validate passport details from backend
  
  @all @Onboarding @Registration
  Scenario: Validate EID Details
    And Already registered customer
    When I click on your bank account is waiting banner
    Then User selects EID scanning option
    Then Validate EID details from backend

  @all @Onboarding @Registration
  Scenario: Validate ID validation successful message after scanning passport and EID Details
    And Already registered customer
    Then User is on dashboard
    Then User validates ID verification successful message
    
  @all @Onboarding @Registration
  Scenario: Validate Details on review and verify screen and continue with account creation
    And Already registered customer
    When User clicks ID verification successful message
    Then User validates data on review screen
    Then User selects continue option

    
    @all @Onboarding @Registration
  Scenario Outline: Validate Details on your address screen
    And Already registered customer
    When User clicks ID verification successful message
    And User selects continue option
    And User Enters Villa as "<Villa>",Street as "<Street>", city as "<City>" and Emirate as "<Emirate>"
      Examples: 
      | Villa | Street     | City | Emirate |
      | villa | homestreet | Abu Dhabi| Abu Dhabi |
      
    @all @Onboarding @Registration
  Scenario Outline: User enters current employment details
    And Already registered customer
    When User clicks ID verification successful message
    And User selects continue option
    And User bypasses your address screen
    Then User enters "<Income>"
      Examples: 
      | Income |
      | 12000 | 
      
    @all @Onboarding @Registration
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
      
     @all @Onboarding @Registration
  Scenario Outline: User completes details on Tax declaration screen
    And Already registered customer
    When User clicks ID verification successful message
    And User selects continue option
    And User bypasses your address screen
    And User bypasses current employment screen
    And User bypasses fatca screen
    Then User enters "<Country>" and tax identification details
    And Select no from tax identification
    And User Accepts terms and conditions for tax declaration
      Examples: 
      | Country |
      | Indonesia |    
      
       #@all @Onboarding @Registration
  #Scenario Outline: User validates application pin
    #And Already registered customer
    #When User clicks ID verification successful message
    #And User selects continue option
    #And User bypasses your address screen
    #And User bypasses current employment screen
    #And User bypasses fatca screen
    #And User bypasses tax declaration screen
    #And Select no from tax identification
    #And User confirms pin  
    
