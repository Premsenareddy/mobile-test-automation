Feature: Kids Documents feature

  @bac @bac-kidsDocuments
  Scenario: [SC01] Verify if expected documents for child can be viewed by the Father in case child's debit card is delivered
    When I login to the application with mobile number as "kidsDocuments.SC01.mobileNumber" and passcode as "kidsDocuments.SC01.passcode" and debit pin as "kidsDocuments.SC01.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account for my child "kidsDocuments.SC01.childName"
    Then verify if My documents option is present in child profile settings
    When I tap on My documents dropdown
    Then I should see the list of documents for my child
    And "AC_OPEN_SAVINGS.pdf" document should be present
    And "CRS.pdf" document should be present
    And "IBAN_SAVINGS.pdf" document should be present
    And "W8.pdf" document should be present
    And "GRANTOR.pdf" document should not be present

  @bac @bac-kidsDocuments
  Scenario: [SC02] Verify if documents section is not present for child in case my child's debit card is not delivered
    When I login to the application with mobile number as "kidsDocuments.SC02.mobileNumber" and passcode as "kidsDocuments.SC02.passcode" and debit pin as "kidsDocuments.SC02.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account for my child "kidsDocuments.SC02.childName"
    Then verify if My documents option is not present in child profile settings

  @bac @bac-kidsDocuments
  Scenario: [SC03] Verify if documents section is not present for child in case my child is a marketplace user
    When I login to the application with mobile number as "kidsDocuments.SC03.mobileNumber" and passcode as "kidsDocuments.SC03.passcode" and debit pin as "kidsDocuments.SC03.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account for my child "kidsDocuments.SC02.childName"
    Then verify if My documents option is not present in child profile settings

  @bac @bac-kidsDocuments
  Scenario: [SC04] Verify if expected documents for child can be viewed by the Mother in case child's debit card is delivered
    When I login to the application with mobile number as "kidsDocuments.SC04.mobileNumber" and passcode as "kidsDocuments.SC04.passcode" and debit pin as "kidsDocuments.SC04.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account for my child "kidsDocuments.SC04.childName"
    Then verify if My documents option is present in child profile settings
    When I tap on My documents dropdown
    Then I should see the list of documents for my child
    And "AC_OPEN_SAVINGS.pdf" document should be present
    And "CRS.pdf" document should be present
    And "IBAN_SAVINGS.pdf" document should be present
    And "W8.pdf" document should be present
    And "GRANTOR.pdf" document should be present

  @bac @bac-kidsDocuments
  Scenario: [SC05] Verify if option to open or download documents for child appears by tapping on each documents
    When I login to the application with mobile number as "kidsDocuments.SC05.mobileNumber" and passcode as "kidsDocuments.SC05.passcode" and debit pin as "kidsDocuments.SC05.debitPin"
    And I tap on Family tab
    And I tap on settings of my child's account for my child "kidsDocuments.SC05.childName"
    Then verify if My documents option is present in child profile settings
    When I tap on My documents dropdown
    Then I should see the list of documents for my child
    And tap on "AC_OPEN_SAVINGS.pdf" document and check if option to view or download the documents appear
    And tap on "CRS.pdf" document and check if option to view or download the documents appear
    And tap on "IBAN_SAVINGS.pdf" document and check if option to view or download the documents appear
    And tap on "W8.pdf" document and check if option to view or download the documents appear
    And tap on "GRANTOR.pdf" document and check if option to view or download the documents appear
