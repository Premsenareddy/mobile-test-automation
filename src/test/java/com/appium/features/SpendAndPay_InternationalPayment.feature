Feature: User wants to perform different scenarios for international payment

 Background: 
    Given User Opens the App
    And Successfully registered
    Then User is on dashboard
    

#   Scenario Outline: Validate User should be able to do intrenational payment only when mandatory details are entered in case of country having account number & swift code and secondary identification
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And Get Balance Before Payment
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And Verify User should not be able to do payment without mandatory details and confirm button should be disabled
#  And User selects a Country as "<Country>"
#  And Verify User should not be able to do payment without mandatory details and confirm button should be disabled
#  And User enters Account Number as "<AccountNo>"
#  And Verify User should not be able to do payment without mandatory details and confirm button should be disabled
#  And User enters Swift Code as "<SwiftCode>"
#  And Verify User should not be able to do payment without mandatory details and confirm button should be disabled
#  And User enters Secondary Identification as "<BSB_Sort_IFSC_Fedwire_Transit_Code>" for Country "<Country>"
#  And Verify User should be able to proceed for payment when all mandatory details are entered and confirm button should be enabled
#
#
# Examples:
#  |Country			|AccountNo		|SwiftCode	|BSB_Sort_IFSC_Fedwire_Transit_Code|
#  |Ireland			|153456779122|ULSBIE2D		|981234|
#  |Great Britain|123455789220|IIIGGB22		|400515|
#  #|Australia		|126356789320|AMPBAU2STRY	|939200|
#  #|Canada				|193456789520|ROYCCAT2VIC	|000300002|
#  #|India				|123456789520|ICICINBB012	|ICI00000012|
#  #|Oman					|123456789521|IZZBOMRU		|null|
#
#
#   Scenario Outline: Validate User should be able to do intrenational payment only when mandatory details are entered in case of country having account number & swift code
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And Get Balance Before Payment
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And Verify User should not be able to do payment without mandatory details and confirm button should be disabled
#  And User selects a Country as "<Country>"
#  And Verify User should not be able to do payment without mandatory details and confirm button should be disabled
#  And User enters Account Number as "<AccountNo>"
#  And Verify User should not be able to do payment without mandatory details and confirm button should be disabled
#  And User enters Swift Code as "<SwiftCode>"
#  And Verify User should be able to proceed for payment when all mandatory details are entered and confirm button should be enabled
#  Examples:
#  |Country			|AccountNo		|SwiftCode	|
#  |Afghanistan	|143456789100|AFIBAFKAXXX	|
#
#
#
#
#   Scenario Outline: Validate User should be able to do intrenational payment only when mandatory details are entered in case of country having Iban
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And Get Balance Before Payment
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And Verify User should not be able to do payment without mandatory details and confirm button should be disabled
#  And User selects a Country as "<Country>"
#  And Verify User should not be able to do payment without mandatory details and confirm button should be disabled
#  And User enters IBAN Number as "<IBAN>"
# 	And Verify User should be able to proceed for payment when all mandatory details are entered and confirm button should be enabled
#
# Examples:
#
# 	|Country			|IBAN		|
# 	|Ireland			|IE64IRCE92050112345678|
# 	##|Great Britain|GB33BUKB20201555555555|
#
#
#
#   Scenario Outline: Validate Error messages for Account Number, Swift Code and Secondary Identification i.e. sort code, bsb code, fedwire, transit code, ifsc code
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And User selects a Country as "<Country>"
#  And User enters Account Number as " "
#  And User verify error message as "<AccountErrorMessage>"
#  And User enters Swift Code as "<SwiftCode>"
#  And User verify error message as "<SwiftCodeErrMessage>"
#  And User enters Secondary Identification as "<BSB_Sort_IFSC_Fedwire_Transit_Code>" for Country "<Country>"
#  And User verify error message as "<SwiftCodeErrMessage>"
#
#
# Examples:
#  |Country			|AccountNo		|SwiftCode	|BSB_Sort_IFSC_Fedwire_Transit_Code|AccountErrorMessage|SwiftCodeErrMessage|BSBSortIfscFedwireTransitCode_ErrMessage|
#  |Australia	|143456789100|AMPBAU2ST	|93920|Must include between 1 and 19 characters|Must include either 8 or 11 characters|Must include 6 characters only|
#  |Australia	|143456789100|AMPBAU2	|939200|Must include between 1 and 19 characters|Must include either 8 or 11 characters|Must include 6 characters only|
#  |Canada	|143456789100|ROYCCAT2VI	|0003|Must include between 1 and 19 characters|Must include either 8 or 11 characters|Must include either 5 or 9 characters|
#  |Canada	|143456789100|ROYCCAT2VI	|000305|Must include between 1 and 19 characters|Must include either 8 or 11 characters|Must include either 5 or 9 characters|
#  |India	|143456789100|ICI0000012	|0003|Must include between 1 and 19 characters|Must include either 8 or 11 characters|Must include 11 characters only|
#  |Great Britain	|143456789100|IIIGGB2	|40051|Must include between 1 and 19 characters|Must include either 8 or 11 characters|Must include 6 characters only|
#  |Ireland	|143456789100|ULSBIE2	|98123|Must include between 1 and 19 characters|Must include either 8 or 11 characters|Must include 6 characters only|
#  |USA	|143456789100|FEBKUS6LX	|12345678|Must include between 1 and 19 characters|Must include either 8 or 11 characters|Must include 9 characters only|
#
#
#
#   Scenario Outline: Validate Error messages for IBAN field
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And User selects a Country as "<Country>"
#  And User enters IBAN Number as " "
#  And User verify error message as "<IBANErrorMessage>"
#
#
#
# Examples:
#  |Country			|IBANErrorMessage												|
#  |Jordan				|Must include between 1 and 34 characters|
#  |Great Britain|Must include between 1 and 34 characters|
#  |Ireland			|Must include between 1 and 34 characters|
#
#
#
#
#
#   Scenario Outline: Validate Beneficiary detail page and address & fields length validations for Intrenational payment using Account number, Swift Code, Secondary Code i.e. BSB, Sort Code or IFSC, Transit Code
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And Get Balance Before Payment
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And User selects a Country as "<Country>"
#  And User enters Account Number as "<AccountNo>"
#  And User enters Swift Code as "<SwiftCode>"
#  And User enters Secondary Identification as "<BSB_Sort_IFSC_Fedwire_Transit_Code>" for Country "<Country>"
#  And User selects confirm details button on international Payment
#  And User enters Beneficiary Address Line1 Details " "
#  And User verify error message as "Must include between 1 and 35 characters"
#  And User enters Beneficiary Address City Details " "
#  And User verify error message as "Must include between 1 and 35 characters"
#  And User Select Beneficiary Address Country "<BenAddressCountry>"
#  And User enters Receipient Bank Details Account holder Name  "Ac"
#  And User verify error message as "Must include between 3 and 35 characters"
#  Then Verify User should not be able to do payment without mandatory or invalid details and "Confirm details" button should be disabled
#
#
#   Examples:
#  |Country		|AccountNo		|SwiftCode	|BSB_Sort_IFSC_Fedwire_Transit_Code|AddressLine1	|AddressLine2	|City	|BenAddressCountry|AccountHolderName|
#  |Afghanistan|143456789100|AFIBAFKAXXX|null|Address Line 1|Address Line 2|London|Angola|Ac|
# # |Japan|133456788100|ABOCJPJT||Address Line 1|Address Line 2|London|Angola|Account Holder Japan|
#
#
#   Scenario Outline: Validate amount page and confirm & review validations for International payment using Account number, Swift Code, Secondary Code i.e. BSB, Sort Code or IFSC, Transit Code
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And Get Balance Before Payment
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And User selects a Country as "<Country>"
#  And User enters Account Number as "<AccountNo>"
#  And User enters Swift Code as "<SwiftCode>"
#  And User enters Secondary Identification as "<BSB_Sort_IFSC_Fedwire_Transit_Code>" for Country "<Country>"
#  And User selects confirm details button on international Payment
#  And User enters Beneficiary Address Line1 Details "<AddressLine1>"
#  And User enters Beneficiary Address Line2 Details "<AddressLine2>"
#  And User enters Beneficiary Address City Details "<City>"
#  And User Select Beneficiary Address Country "<BenAddressCountry>"
#   And User enters Receipient Bank Details Account holder Name  "<AccountHolderame>"
#  Then Verify Add Beneficiary checbox should be checked by default
#  When User Select Add Beneficiary checbox as "<AddBenFlag>"
#  And User selects confirm details button on international Payment
#  And User selects currency as "<Currency>"
#   And User enters amount as "0" to be transferred on Payment
#   And User verify error message as "Transaction amount cannot be 0"
#   And Verify User should not be able to do payment without mandatory or invalid details and "Confirm amount" button should be disabled
#   And User enters amount more than available balance on Payment
#   And User verify error message as "Insufficient balance"
#  And Verify User should not be able to do payment without mandatory or invalid details and "Confirm amount" button should be disabled
#  And User enters amount as "<Amount>" to be transferred on Payment
#  And User selects confirm amount
#  And User selects Applicable fees paid by as "<ChargeBearer>"
#  And Verify User should not be able to do payment without mandatory or invalid details and "Confirm & review" button should be disabled
#  And User selects purpose from dropdown on payment as "<PurposeCode>"
#  And User enters Remarks as "2t"
#  And User verify error message as "Must include between 3 and 35 characters"
#
#   Examples:
#  |Country		|AccountNo		|SwiftCode	|BSB_Sort_IFSC_Fedwire_Transit_Code|AddressLine1	|AddressLine2	|City	|BenAddressCountry|AccountHolderName	|AddBenFlag|Amount|Currency|ChargeBearer|PurposeCode|Review Comments|
#  |Afghanistan|143456789100|AFIBAFKAXXX|null|Address Line 1|Address Line 2|London|Angola|Account Holder Afghanistan|Unchecked|15	|JOD|Beneficiary|Travel|Test Review Comments|
#
# # |Japan|133456788100|ABOCJPJT||Address Line 1|Address Line 2|London|Angola|Account Holder Japan|UnChecked|15|USD|Beneficiary|Travel|Test Review Comments for Japan|
#
#
#
#
#  Scenario Outline: To validate a transaction to Intrenational bank should not be allowed if entered amount is less than bearer charges and charge beaer is benficiary or credit amount becomes negative
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And Get Balance Before Payment
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And User selects a Country as "<Country>"
#  And User enters Account Number as "<AccountNo>"
#  And User enters Swift Code as "<SwiftCode>"
#  And User enters Secondary Identification as "<BSB_Sort_IFSC_Fedwire_Transit_Code>" for Country "<Country>"
#  And User selects confirm details button on international Payment
#  And User enters Beneficiary Address Line1 Details "<AddressLine1>"
#  And User enters Beneficiary Address Line2 Details "<AddressLine2>"
#  And User enters Beneficiary Address City Details "<City>"
#  And User Select Beneficiary Address Country "<BenAddressCountry>"
#  And User enters Receipient Bank Details Account holder Name  "<AccountHolderName>"
#  When User Select Add Beneficiary checbox as "<AddBenFlag>"
#  And User selects confirm details button on international Payment
#  And User selects currency as "<Currency>"
#  And User enters amount as "<ChargeBearerFee>" to be transferred on Payment in AED
#  And User selects confirm amount
#  And User selects Applicable fees paid by as "Beneficiary"
#  And User selects purpose from dropdown on payment as "<PurposeCode>"
#  And User enters Remarks as "<Review Comments>"
#  And User selects Confirm and Review
#  And Verify User should not be able to do payment without mandatory or invalid details and "Confirm & send" button should be disabled
#
#   Examples:
#  |Country		|AccountNo		|SwiftCode	|BSB_Sort_IFSC_Fedwire_Transit_Code|AddressLine1	|AddressLine2	|City	|BenAddressCountry|AccountHolderName	|AddBenFlag|ChargeBearerFee|Currency|ChargeBearer|PurposeCode|Review Comments|
#  |Afghanistan|143456789100|AFIBAFKAXXX|null|Address Line 1|Address Line 2|London|Angola|Account Holder Afghanistan|Unchecked|62	|JOD|Beneficiary|Travel|Test Review Comments|
#
#
#
#
#   Scenario Outline: To validate a transaction to Intrenational bank should not be allowed in case of sum of entered amount and bearer charge is greater than available balance
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And Get Balance Before Payment
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And User selects a Country as "<Country>"
#  And User enters Account Number as "<AccountNo>"
#  And User enters Swift Code as "<SwiftCode>"
#  And User enters Secondary Identification as "<BSB_Sort_IFSC_Fedwire_Transit_Code>" for Country "<Country>"
#  And User selects confirm details button on international Payment
#  And User enters Beneficiary Address Line1 Details "<AddressLine1>"
#  And User enters Beneficiary Address Line2 Details "<AddressLine2>"
#  And User enters Beneficiary Address City Details "<City>"
#  And User Select Beneficiary Address Country "<BenAddressCountry>"
#	And User enters Receipient Bank Details Account holder Name  "<AccountHolderName>"
#  When User Select Add Beneficiary checbox as "<AddBenFlag>"
#  And User selects confirm details button on international Payment
#  And User selects currency as "<Currency>"
#  And User enters amount as available balance on Payment
#  And User selects confirm amount
#  And User selects Applicable fees paid by as "Myself"
#  And Verify User should not be able to do payment without mandatory or invalid details and "Confirm & review" button should be disabled
#  And User selects purpose from dropdown on payment as "<PurposeCode>"
#  And User enters Remarks as "<Review Comments>"
#  And User selects Confirm and Review
#  And User selects Confirm and Send
#  Then Verify User should not be able to do payment without mandatory or invalid details and "Confirm & send" button should be disabled
#
#
#
#   Examples:
#  |Country		|AccountNo		|SwiftCode	|BSB_Sort_IFSC_Fedwire_Transit_Code|AddressLine1	|AddressLine2	|City	|BenAddressCountry|AccountHolderName	|AddBenFlag|Amount|Currency|ChargeBearer|ChargeBearerFee|PurposeCode|Review Comments|
#  |Afghanistan|143456789100|AFIBAFKAXXX|null|Address Line 1|Address Line 2|London|Angola|Account Holder Afghanistan|Unchecked|151	|JOD|Myself|63|Travel|Test Review Comments|
#  #|Japan|133456788100|ABOCJPJT||Address Line 1|Address Line 2|London|Angola|Account Holder Japan|UnChecked|151	|USD|Beneficiary|63|Travel|Test Review Comments for Japan|
#
#
#
#   Scenario Outline: To validate a transaction to Intrenational bank should not be allowed if transaction amount is or sum of transaction is more than daily allowed limit
#  And Already registered customer
#  When I click on payments tab
#  And User navigate to Transfer money screen
#  And Get Balance Before Payment
#  And User selects Another bank option to Transfer money
#  And User selects a International bank to Transfer money
#  And User selects a Country as "<Country>"
#  And User enters Account Number as "<AccountNo>"
#  And User enters Swift Code as "<SwiftCode>"
#  And User enters Secondary Identification as "<BSB_Sort_IFSC_Fedwire_Transit_Code>" for Country "<Country>"
#  And User selects confirm details button on international Payment
#  And User enters Beneficiary Address Line1 Details "<AddressLine1>"
#  And User enters Beneficiary Address Line2 Details "<AddressLine2>"
#  And User enters Beneficiary Address City Details "<City>"
#  And User Select Beneficiary Address Country "<BenAddressCountry>"
#  And User enters Receipient Bank Details Account holder Name  "<AccountHolderName>"
#  When User Select Add Beneficiary checbox as "<AddBenFlag>"
#  And User selects confirm details button on international Payment
#  And User selects currency as "<Currency>"
# 	And User enters amount as "<AmountInAED>" to be transferred on Payment in AED
#  And User selects confirm amount
#  And User selects Applicable fees paid by as "<ChargeBearer>"
#  And Verify User should not be able to do payment without mandatory or invalid details and "Confirm & review" button should be disabled
#  And User selects purpose from dropdown on payment as "<PurposeCode>"
#  And User enters Remarks as "<Review Comments>"
#  And User selects Confirm and Review
#  And User selects Confirm and Send
#  And User enters the pin
#  Then validate failure screen of international Payment
#
#   Examples:
#  |Country		|AccountNo		|SwiftCode	|BSB_Sort_IFSC_Fedwire_Transit_Code|AddressLine1	|AddressLine2	|City	|BenAddressCountry|AccountHolderName	|AddBenFlag|AmountInAED|Currency|ChargeBearer|PurposeCode|Review Comments|
#  #|Afghanistan|143456789100|AFIBAFKAXXX|null|Address Line 1|Address Line 2|London|Angola|Account Holder Afghanistan|Unchecked|250001	|JOD|Beneficiary|Travel|Test Review Comments|
#  |Ireland|153456779122|ULSBIE2D|981234|Address Line 1|Address Line 2|London|Angola|Account Holder Ireland|UnChecked|250001	|AUD|Beneficiary|Travel|Test Review Comments for Ireland|
#  ##|Japan|133456788100|ABOCJPJT||Address Line 1|Address Line 2|London|Angola|Account Holder Japan|UnChecked|151	|USD|Beneficiary|Travel|Test Review Comments for Japan|
#  #
#  #
#
#  #Need to find a way to capture error message
#  #@regression @payments @valid
#   #Scenario Outline: Validate Error message for entering invalid IBAN value
#  #And Already registered customer
#  #When I click on payments tab
#  #And User navigate to Transfer money screen
#  #And User selects Another bank option to Transfer money
#  #And User selects a International bank to Transfer money
#  #And User selects a Country as "<Country>"
#  #And User enters IBAN Number as "<IBAN>"
#  #And User selects confirm details button on international Payment
#  #And User verify error message as "<ErrorMessage>" on invalid details
##
# #Examples:
#  #|Country			|IBAN														|ErrorMessage				|
#  #|Jordan				|JO71CBJO000000000000123456789|Internal server error|
#