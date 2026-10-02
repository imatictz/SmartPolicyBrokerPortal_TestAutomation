@All @CLIENT
Feature: New Client details

Background:

When user click on client icon from quick menu


@RegressionTest       @MandatoryFields @main @CLIENT
Scenario: (ClientDetails) Enter new client details with mandatory fields

When user click on add button
When user click on title dropdown
When user enter "Mr" as title in search box
When user click on Mr from dropdown
When user enter Pravin Test Client as client name
When user click in account number field
When user enter "5412502145021004" as account number
When user click on ID type dropdown
When user enter "Birth certificate" to search ID type in search box
When user click on birth certificate as ID type from dropdown
When user enter "Value" as ID number
When user enter "01-Jan-2000" as date of birth
When user click on nationality dropdown
When user enter "Tanzania" to search nationality in search box
When user click on tanzania as nationality
When user enter "Bahi" as place of birth
When user click on gender dropdown
When user enter "Male" to search gender in search box
When user click on male as gender
When user click on region/province dropdown
When user enter "Dodoma" to search region/province in search box
When user click on dodoma as region/province
When user click on district dropdown
When user enter "Bahi" to search district in search box
When user click on bahi as district
When user enter "Tree" as cell/street
When user enter "House No.12 XYZ World" as address
When user enter "659544202" as mobile No One
When user enter "xxxxxxx503@gmail.com" as email id one
When user click on save button to save client details
Then user able to view "1001-New information recorded successfully" as message

@AllFields @main  @CLIENT
Scenario: (ClientDetails) Enter new client details with all fields

When user click on add button
When user click on title dropdown
When user enter "Mr" as title in search box
When user click on Mr from dropdown
When user enter "TestAutomation204" as client name
When user click in account number field
When user enter "564548465468482004" as account number
When user click on ID type dropdown
When user enter "Birth certificate" to search ID type in search box
When user click on birth certificate as ID type from dropdown
When user enter "Value" as ID number
When user enter "987654321" as TIN/PAN
When user enter "32189412349515" as ZRB No
When user enter "01-Jan-2000" as date of birth
When user click on nationality dropdown
When user enter "Tanzania" to search nationality in search box
When user click on tanzania as nationality
When user enter "Bahi" as place of birth
When user click on gender dropdown
When user enter "Male" to search gender in search box
When user click on male as gender
When user click on occupation dropdown
When user enter "Banker" as occupation
When user select banker as occupation 
When user select "None" as Disability Status 
When user select "Corporates" as Client Sub Status
Then user select related party checkbox
When user enter "TPKUT152AB" as VRN/GST
When user click on region/province dropdown
When user enter "Dodoma" to search region/province in search box
When user click on dodoma as region/province
When user click on district dropdown
When user enter "Bahi" to search district in search box
When user click on bahi as district
When user enter "Sector 5" as sector
When user enter "Tree" as cell/street
When user enter "Bahi" as village
#When user enter "212-693-2377" as fax
When user enter "Person10" as profile ID
When user click on profile category dropdown
When user enter "Main" as profile category
When user select main as profile category
When user enter "Indo251TC" as screening group ID
When user enter "255-145236962" as Telephone No One
When user enter "255-145236961" as Telephone No Two
When user enter "255-145236963" as Telephone No Three
When user enter "House No.12 XYZ World" as address
When user enter "659544202" as mobile No One
When user enter "659544202" as mobile No Two
When user enter "659544202" as mobile No Three
#When user select email checkbox
When user enter "xxxxxxx102@gmail.com" as email id one
When user enter "xxxxxxx302@gmail.com" as email id two
When user enter "xxxxxxx402@gmail.com" as email id three
When user select Email checkbox
When user select tax exempted checkbox
When user select PEP customer radio button
When user click on AML risk category dropdown
When user enter "Medium" as AML risk category
When user select medium as AML risk category
When user enter "12/08/2023" as appointment date
When user enter "02/06/2025" as mandate expiry
When user click on save button to save client details
Then user able to view "1001-New information recorded successfully" as message

@Corporate    @CLIENT @main
Scenario: (ClientDetails) Enter new client details with all fields for corporate

When user click on add button
When user click on title dropdown
When user enter "M/S" as title in search box
When user click on Mr from dropdown
When user enter "TestAutomation304" as client name
When user click in account number field
When user enter "654851846543004" as account number
When user click on ID type dropdown
When user enter "Company Incorporation Certificate Number" to search ID type in search box
When user click on Company Incorporation Certificate Number as ID type from dropdown
When user enter "Value" as ID number
When user enter "987654321" as TIN/PAN
When user enter "321894123495" as ZRB No
When user select "None" as Disability Status 
When user select "Corporates" as Client Sub Status
When user click on business type dropdown
When user enter "Automobile Manufacturing" as business type
When user select Automobile Manufacturing as business type
When user click on country of registration dropdown
When user enter "South Africa" as country of registration
When user select South Africa as country of registration
When user enter "04-Jan-2025" as registration date
When user enter "Manager1520" as contact person
When user enter "TPKUT152ABK" as VRN/GST
When user click on region/province dropdown
When user enter "Dodoma" to search region/province in search box
When user click on dodoma as region/province
When user click on district dropdown
When user enter "Bahi" to search district in search box
When user click on bahi as district
When user enter "Sector 5" as sector
When user enter "Tree" as cell/street
When user enter "Bahi" as village
#When user enter "212-693-2377" as fax
When user enter "Person10" as profile ID
When user click on profile category dropdown
When user enter "Main" as profile category
When user select main as profile category
When user enter "Indo251TC" as screening group ID
When user enter "255-145236962" as Telephone No One
When user enter "255-145236961" as Telephone No Two
When user enter "255-145236963" as Telephone No Three
When user enter "House No.12 XYZ World" as address
Then user select related party checkbox
When user select "Shareholders" as related party
When user select "Direct" as relationship
When user enter "659544202" as mobile No One
When user enter "659544202" as mobile No Two
When user enter "659544202" as mobile No Three
#When user select email checkbox
When user enter "xxxxxxx502@gmail.com" as email id one
When user enter "xxxxxxx602@gmail.com" as email id two
When user enter "xxxxxxx702@gmail.com" as email id three
When user select Email checkbox
When user select tax exempted checkbox
When user select PEP customer radio button
When user click on AML risk category dropdown
When user enter "Medium" as AML risk category
When user select medium as AML risk category
When user enter "12-july-2023" as appointment date
When user enter "02-dec-2025" as mandate expiry
When user click on save button to save client details
Then user able to view "1001-New information recorded successfully" as message


    



@One
Scenario: (ClientDetails) Verify dropdown options for Gender field
When user click on add button
When user select gender dropdown to view options

@validDOB
  Scenario Outline: System should retain valid DOB formats
  When user click on add button
    When I enter "<inputDate>" into the Date of Birth field
    Then the system should "<expectedResult>" in the Date of Birth field

    Examples:
      | inputDate     | expectedResult |
      | 01-Jan-2000    | valid          |
      | 21-Jul-2025   | valid          |
      | 1990-05-10    | valid          |
      | 10-12-1985    | valid          |

  @invalid @DOB
  Scenario Outline: System should replace invalid DOB with today's date
  When user click on add button
    When I enter "<inputDate>" into the Date of Birth field
    Then the system should "<expectedResult>" in the Date of Birth field

    Examples:
      | inputDate    | expectedResult |
      | abcd         | invalid        |
      | 99-99-9999   | invalid        |
      | 32/13/2020   | invalid        |
      | 07/35/1990   | invalid        |

  

  @special @DOB
  Scenario Outline: System should reject special characters in DOB
  When user click on add button
    When I enter "<inputDate>" into the Date of Birth field
    Then the system should "<expectedResult>" in the Date of Birth field

    Examples:
      | inputDate  | expectedResult |
      | @#$%       | invalid        |
      | 1234!      | invalid        |
      | --/--/---- | invalid        |
      
      @range @DOB
  Scenario Outline: System should validate logical DOB range
  When user click on add button
    When I enter "<inputDate>" into the Date of Birth field
    Then the system should "<expectedResult>" in the Date of Birth field

    Examples:
      | inputDate    | expectedResult |
      | 31/12/2050   | invalid        |
      | 01/01/1800   | invalid        |

  @boundary @DOB
  Scenario Outline: System should accept edge valid DOBs
  When user click on add button
    When I enter "<inputDate>" into the Date of Birth field
    Then the system should "<expectedResult>" in the Date of Birth field

    Examples:
      | inputDate   | expectedResult |
      | 01/01/1900  | valid          |
      | 31/12/2099  | valid          |
      
      
@MobileNumber @MOB1
  Scenario Outline: (Mobile No Field 1)Validate Mobile Number field accepts only 9 digits starting with 62 after +255
    When user click on add button
    When I enter "<mobileDigits>" into the Mobile No field one
    Then I should see the validation result as "<expectedAlert>"

    Examples:
      | mobileDigits | expectedAlert                          |
      | 62123456     | The phone number entered is too short. |
      | 62123456789  | The phone number entered is too long.  |
      | 123456789    | Invalid phone number                   |
      
@MobileNumber @MOB2
  Scenario Outline: (Mobile No Field 2)Validate Mobile Number field accepts only 9 digits starting with 62 after +255
    When user click on add button
    When I enter "<mobileDigits>" into the Mobile No field two
    Then I should see the validation result as "<expectedAlert>"

    Examples:
      | mobileDigits | expectedAlert                          |
      | 62123456     | The phone number entered is too short. |
      | 62123456789  | The phone number entered is too long.  |
      | 123456789    | Invalid phone number                   |
      
@MobileNumber @MOB3
  Scenario Outline: (Mobile No Field 3)Validate Mobile Number field accepts only 9 digits starting with 62 after +255
    When user click on add button
    When I enter "<mobileDigits>" into the Mobile No field three
    Then I should see the validation result as "<expectedAlert>"

    Examples:
      | mobileDigits | expectedAlert                          |
      | 62123456     | The phone number entered is too short. |
      | 62123456789  | The phone number entered is too long.  |
      | 123456789    | Invalid phone number                   |     
 
 @Individual   @FieldsCorInd
 Scenario: When Individual is selected, Corporate fields should be disabled
    When user click on add button
    When user click on title dropdown
    When user enter "Mr" as title in search box
    When user click on Mr from dropdown
    Then user able to view "Individual" as client status
    Then following Individual fields should be enabled
      | Individual fields    |
      | Date of Birth        |
      | Nationality          |
      | Place Of Birth       |
      | Gender               |
      | Marital Status       |
      | Occupation           |
      | Disability Status    |
      
    And following Corporate fields should be disabled
      | Corporate fields        |
      | Business Type           |
      | Country Of Registration |
      | Registration Date       |
      | Contact Person          |
      | Registration Number     |

@Corporate1 @FieldsCorInd
  Scenario: When Corporate is selected, Individual fields should be disabled
    When user click on add button
    When user click on title dropdown
    When user enter "M/S" as title in search box
    When user click on MS from dropdown
    Then user able to view "Corporate" as client status
    Then following Corporate fields should be enabled
      | Corporate fields        |
      | Business Type           |
      | Country Of Registration |
      | Registration Date       |
      | Contact Person          |
      
    And following Individual fields should be disabled 
      | Individual fields    |
      | Date of Birth        |
      | Nationality          |
      | Place Of Birth       |
      | Gender               |
      | Registration Number  |
      
      
@email
Scenario: Verify multiple email inputs in one test

When user click on add button
When user click on title dropdown
When user enter "Mr" as title in search box
When user click on Mr from dropdown
When user enter "TestAutomation104" as client name
When user click in account number field
When user enter "5412502145021004" as account number
When user click on ID type dropdown
When user enter "Birth certificate" to search ID type in search box
When user click on birth certificate as ID type from dropdown
When user enter "Value" as ID number
When user enter "01-Jan-2000" as date of birth
When user click on nationality dropdown
When user enter "Tanzania" to search nationality in search box
When user click on tanzania as nationality
When user enter "Bahi" as place of birth
When user click on gender dropdown
When user enter "Male" to search gender in search box
When user click on male as gender
When user click on region/province dropdown
When user enter "Dodoma" to search region/province in search box
When user click on dodoma as region/province
When user click on district dropdown
When user enter "Bahi" to search district in search box
When user click on bahi as district
When user enter "Tree" as cell/street
When user enter "House No.12 XYZ World" as address
When user enter "659544202" as mobile No One
    When the user submits the following email addresses
      | email               | expectedResult                   |
      | userexample.com     | 2009-Invalid email address !     |
      | user@               | 2009-Invalid email address !     |
      | @example.com        | 2009-Invalid email address !     |
      | user @example.com   | 2009-Invalid email address !     |
      | user%@example.com   | 2009-Invalid email address !     |
      
         
    @SearchByName     @Search
    Scenario: Search client by valid Name
    When the user enters the client name "TestAutomation104" in Name field
    And clicks on the search button
    Then the system should display client(s) with the name "TestAutomation104"
    #And the displayed client details should include "Client ID", "Email", "Mobile", and "Account Number"     
    
    @SearchByMobile     @Search
    Scenario: Search client by valid Mobile Number
    When the user enters the mobile number "+255659544202" in mobile number field
    And clicks on the search button
    Then the system should display client(s) whose mobile number is "+255659544202"
    #And the displayed client details should include "Name", "Email", and "Client ID" 
    
    @SearchByEmail    @Search
    Scenario: Search client by valid Email ID
    When the user enters the client email "xxxxxxx102@gmail.com" in the Email ID field
    And clicks on the search button
    Then the system should display client(s) whose email is "xxxxxxx102@gmail.com"
    #And the displayed details should include "Name", "Mobile", and "Client ID"

    @SearchByClientID    @Search
    Scenario: Search client by valid Client ID
    When the user enters the client ID "140" in the Client ID field
    And clicks on the search button
    Then the system should display the client with Client ID "140"
    #And the displayed details should include "Name", "Email", and "Mobile"

    @SearchByAccountNumber    @Search
    Scenario: Search client by valid Account Number
    When the user enters the account number "5412502145021004" in the Account Number field
    And clicks on the search button
    Then the system should display the client(s) linked with account number "5412502145021004"
    #And the displayed details should include "Name", "Email", and "Client ID"

    @SearchByDateOfBirth  @Search
    Scenario: Search client by valid Date of Birth
    When the user enters the date of birth "01-Jan-2000" in the Date of Birth field
    And clicks on the search button
    Then the system should display client(s) date of birth "01-Jan-2000"
    #And the displayed details should include "Name", "Email", and "Client ID"

    @CombinedSearch    @Search
    Scenario: Search client by multiple valid fields
    When the user enters the following search criteria:
      | Field Name     | Value                 |
      | Name           | TestAutomation204     |
      | Mobile         | +255659544202         |
      | Email ID       | xxxxxxx102@gmail.com  |
      | Client ID      | 141                   |
      | Account No     | 564548465468482004    |
      | Date Of Birth  | 01-Jan-2000           |
    And clicks on the search button
    Then the system should display the exact client record matching all entered criteria
      | Field Name     | Value                 |
      | Name           | TestAutomation204     |
      | Mobile         | +255659544202         |
      | Email ID       | xxxxxxx102@gmail.com  |
      | Client ID      | 141                   |
      | Account No     | 564548465468482004    |
      | Date Of Birth  | 01-Jan-2000           |
    #And the displayed details should include "Client ID", "Account Number", and "Date of Birth"     
      
    @EditClientDetails     
    Scenario: Verify user able to edit an existing client details successfully
    #Search client
    When the user enters the client name "TestAutomation104" in Name field
    And clicks on the search button
    
    #Select And Edit Details
    When user click on edit icon
    When user click on title dropdown
    When user enter "Mr" as title in search box
    When user click on Mr from dropdown
    When user enter "Pravin Test Client Edit" as client name
    When user click in account number field
    When user enter "5412502145021004" as account number
    When user click on ID type dropdown
    When user enter "Birth certificate" to search ID type in search box
    When user click on birth certificate as ID type from dropdown
    When user enter "5412502145021004" as ID number
    When user enter "01-Jan-2000" as date of birth
    When user click on nationality dropdown
    When user enter "Tanzania" to search nationality in search box
    When user click on tanzania as nationality
    When user enter "Bahi" as place of birth
    When user click on gender dropdown
    When user enter "Male" to search gender in search box
    When user click on male as gender
    When user click on region/province dropdown
    When user enter "Dodoma" to search region/province in search box
    When user click on dodoma as region/province
    When user click on district dropdown
    When user enter "Bahi" to search district in search box
    When user click on bahi as district
    When user enter "Tree" as cell/street
    #When user enter "659544202" as mobile No One
    When user enter "House No.12 XYZ World" as address
    When user enter "xxxxxxx503@gmail.com" as email id one
    When user click on save button to save client details
    Then user able to view "1003-Information modified successfully" as message   
    
    
    
