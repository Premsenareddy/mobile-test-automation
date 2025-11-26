Feature: User wants to perform different Type of money transfers
#User Wants to perform money transfer and bill payments under payments section
 #
 #An End-to End Scenario to test payments functionalities:-
 #1. Login with registered customer 
 #2. Go to payments tab 
 #3. Go to bill payments
  #
  #
  Background: 
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
  
 
 #Domestic Transfer outside AHB

  Scenario Outline: To perform a transaction to domestic bank in UAE
  And Already registered customer
  When I click on payments tab 
  And User navigate to Transfer money screen 
  And User selects Another bank option to Transfer money 
  And User selects a Domestic Bank option to Transfer money 
  And User enters a new IBAN number to Transfer money as "070331234567890123456"
  And User uncheck the checkbox for saving beneficiaries
  And User selects confirm details button
  And User enters Receipient Bank Details Account holder Name for domestic transfers as "<AccountHolderName>"
  And User clicks on proceed button
  And User enters amount to be transferred
  And User selects confirm amount
  And User selects Applicable fees paid by as "<ChargeBearer>"
  And User selects purpose from dropdown
  And User selects Confirm and Review
  And User selects Confirm and Send
  And User enters the pin 
  Then The money gets tranferred from Current account to digital bank account
  And user clicks on payment Done button to return back to payments tab

   @sanity
 Examples:
 |AccountHolderName|ChargeBearer|
 |Hasneet Domestic|Beneficary|

   @allspendPay @Transfers
   Examples:
    |AccountHolderName|ChargeBearer|
    |Hasneet Domestic|Beneficary|
    |Hasneet Domestic|Myself|
    |Hasneet Domestic|Shared|
 
 
 #Domestic Transfer Legacy AHB
  @allspendPay @Transfers @sanity
  Scenario Outline: To perform a domestic bank transfer to AHB legacy bank
  And Already registered customer
  When I click on payments tab 
  And User navigate to Transfer money screen 
  And User selects Another bank option to Transfer money 
  And User selects a Domestic Bank option to Transfer money 
  And User enters a new IBAN number to Transfer money as "260530000022391984011"
  And User uncheck the checkbox for saving beneficiaries
  And User selects confirm details button
  And User enters Receipient Bank Details Account holder Name for domestic transfers as "<AccountHolderName>"
  And User clicks on proceed button
  And User enters amount to be transferred
  And User selects confirm amount
  And User selects purpose from dropdown
  And User selects Confirm and Review
  And User selects Confirm and Send
  And User enters the pin 
  Then The money gets tranferred from Current account to digital bank account
  And user clicks on payment Done button to return back to payments tab
  
  Examples:
 |AccountHolderName|ChargeBearer|
 |Hasneet Legacy|Beneficiary|

  
  #Myself transfer
 @allspendPay @Transfers @sanity
  Scenario: To perform a transaction to myself in Payments tab
  And Already registered customer
  When I click on payments tab 
  And User navigate to Transfer money screen 
  And User selects myself option to Transfer money 
  And User clicks on proceed to payment
  And User enters amount to be transferred
  And User selects confirm amount
  And User selects Confirm and Review
  And User selects Confirm and Send  
  Then The money gets tranferred from Current account to savings account
 
  #AHB Transfer
  @allspendPay @Transfers @sanity
  Scenario: To perform a transaction to AHB digital bank in Payments tab via phone number
  And Already registered customer
  When I click on payments tab 
  And User navigate to Transfer money screen 
  And User selects Al Hilal Bank Digital option to Transfer money 
  And User selects a new account option to Transfer money
  And User enters a new mobile number to Transfer money
  And User uncheck the checkbox for saving beneficiaries
  And User selects confirm details button
  And User selects confirm details button again
  And User enters amount to be transferred
  And User selects confirm amount
  And User selects purpose from dropdown
  And User selects Confirm and Review
  And User selects Confirm and Send
  And User enters the pin 
  Then The money gets tranferred from Current account to digital bank account
  And user clicks on payment Done button to return back to payments tab
  
   #AHB Transfer
  @allspendPay @Transfers @sanity
  Scenario: To perform a transaction to AHB digital bank in Payments tab via account number
  And Already registered customer
  When I click on payments tab 
  And User navigate to Transfer money screen 
  And User selects Al Hilal Bank Digital option to Transfer money 
  And User selects a new account option to Transfer money 
  And User enters a new account number to Transfer money as "018891016002"
  And User uncheck the checkbox for saving beneficiaries
  And User selects confirm details button
  And User selects confirm details button again
  And User enters amount to be transferred
  And User selects confirm amount
  And User selects purpose from dropdown
  And User selects Confirm and Review
  And User selects Confirm and Send
  And User enters the pin 
  Then The money gets tranferred from Current account to digital bank account
  And user clicks on payment Done button to return back to payments tab
 
 
 
  
 #International Payment by IBAN
 @allspendPay @Transfers @sanity
  Scenario Outline: To perform a transaction to International bank in Payments tab using IBan number
  And Already registered customer
  When I click on payments tab 
  And User navigate to Transfer money screen
  And User selects Another bank option to Transfer money 
  And User selects a International bank to Transfer money
  And User selects a Country as "<Country>"
  And User enters IBAN Number as "<IBAN>"
  And User selects confirm details button on international Payment
  And User enters Beneficiary Address Line1 Details "<AddressLine1>"
  And User enters Beneficiary Address Line2 Details "<AddressLine2>"
  And User enters Beneficiary Address City Details "<City>"
  And User Select Beneficiary Address Country "<BenAddressCountry>"
  And User enters Receipient Bank Details Account holder Name  "<AccountHolderName>"
  Then Verify Add Beneficiary checbox should be checked by default
  When User Select Add Beneficiary checbox as "<AddBenFlag>"
  And User selects confirm details button on international Payment
  And User enters amount as "<Amount>" to be transferred on Payment
  And User selects confirm amount
  And User selects Applicable fees paid by as "<ChargeBearer>"
  And User selects purpose from dropdown on payment as "<PurposeCode>"
  And User enters Remarks as "<Review Comments>"
  And User selects Confirm and Review
  And User selects Confirm and Send
  And User enters the pin 
  Then The money gets tranferred from Current account to digital bank account
  And user clicks on payment Done button to return back to payments tab
  Examples:
  |Country		|IBAN		|AddressLine1	|AddressLine2	|City	|BenAddressCountry|AccountHolderName	|AddBenFlag|Amount|ChargeBearer|PurposeCode|Review Comments|
  |Jordan|JO71CBJO0000000000001234567890|Address Line 1|Address Line 2|London|Angola|Account IBAN Jordan|UnChecked|5000	|Beneficiary|Travel|Test Review Comments for JD|
  
  
  #International Payment Using Swift Code , Account Number & Secondary Identification

   Scenario Outline: To perform a transaction to Intrenational bank in Payments tab using Account number, Swift Code, Secondary Code i.e. BSB, Sort Code or IFSC, Transit Code
  And Already registered customer
  When I click on payments tab 
  And User navigate to Transfer money screen 
  And Get Balance Before Payment
  And User selects Another bank option to Transfer money 
  And User selects a International bank to Transfer money
  And User selects a Country as "<Country>"
  And User enters Account Number as "<AccountNo>"
  And User enters Swift Code as "<SwiftCode>"
  And User enters Secondary Identification as "<BSB_Sort_IFSC_Fedwire_Transit_Code>" for Country "<Country>"
  And User selects confirm details button on international Payment
  And User enters Beneficiary Address Line1 Details "<AddressLine1>"
  And User enters Beneficiary Address Line2 Details "<AddressLine2>"
  And User enters Beneficiary Address City Details "<City>"
  And User Select Beneficiary Address Country "<BenAddressCountry>"
  And User enters Receipient Bank Details Account holder Name  "<AccountHolderName>"
  Then Verify Add Beneficiary checbox should be checked by default
  When User Select Add Beneficiary checbox as "<AddBenFlag>"
  And User selects confirm details button on international Payment
  And User selects currency as "<Currency>"
  And User enters amount as "<Amount>" to be transferred on Payment
  And User selects confirm amount
  And User selects Applicable fees paid by as "<ChargeBearer>"
  And User selects purpose from dropdown on payment as "<PurposeCode>"
  And User enters Remarks as "<Review Comments>"
  And User selects Confirm and Review
  And User selects Confirm and Send
  And User enters the pin 
  Then The money gets tranferred from Current account to digital bank account
   And user clicks on payment Done button to return back to payments tab

   @sanity
 Examples:
  |Country		|AccountNo		|SwiftCode	|BSB_Sort_IFSC_Fedwire_Transit_Code|AddressLine1	|AddressLine2	|City	|BenAddressCountry|AccountHolderName	|AddBenFlag|Amount|Currency|ChargeBearer|PurposeCode|Review Comments|
  |Afghanistan|143456789100|AFIBAFKAXXX|null|Address Line 1|Address Line 2|London|Angola|Account Holder Afghanistan|Unchecked|30000	|JOD|Beneficiary|Travel|Test Review Comments|



   @allspendPay @Transfers
   Examples:
    |Country		|AccountNo		|SwiftCode	|BSB_Sort_IFSC_Fedwire_Transit_Code|AddressLine1	|AddressLine2	|City	|BenAddressCountry|AccountHolderName	|AddBenFlag|Amount|Currency|ChargeBearer|PurposeCode|Review Comments|
    |Afghanistan|143456789100|AFIBAFKAXXX|null|Address Line 1|Address Line 2|London|Angola|Account Holder Afghanistan|Unchecked|30000	|JOD|Beneficiary|Travel|Test Review Comments|
    |Japan|133456788100|ABOCJPJT||Address Line 1|Address Line 2|London|Angola|Account Holder Japan|UnChecked|30000	|USD|Beneficiary|Travel|Test Review Comments for Japan|
    |Ireland|153456779122|ULSBIE2D|981234|Address Line 1|Address Line 2|London|Angola|Account Holder Ireland|UnChecked|30000	|JPY|Beneficiary|Travel|Test Review Comments for Ireland|

  
  