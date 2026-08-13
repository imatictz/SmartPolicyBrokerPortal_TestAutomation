Feature: Dashboard Language Switch
  @All
  Scenario: Validate dashboard elements in English language after language switch
   When user is on dashboard page able to view "View Dashboard"
   Then user validate all dashboard page elements
   |Element|Text|
   |Hi     |Hi|
   |UserName|TestProject|
   |Clients|Clients|
   |Quotations|Quotations|
   |Risk Notes|Risk Notes|
   |Claims|Claims|
   |Renewals|Renewals|
   |Reports|Reports|
   |Knowledge Base|Knowledge Base|
   |Knowledge Base Description |Knowledge base will list all the functional information on Smart Policy Platform to guide you on the better use of the system.|
   |Support Forum|Support Forum|
   |Support Forum Description|The forum encourages users to contribute and post questions for Smart Policy Community. The idea is to bring together Smart Policy User Community and be part of a larger forum for the better use of the system.|
   |FAQ|FAQ|
   |FAQ Description|The section will answer frequently asked questions to assist the users for better understanding.|
   |Whatsapp Support|Whatsapp Support|
   |Whatsapp Support1|1. +255 22 212 72 17 (Landline)|
   |Whatsapp Support2|2. +255 22 212 72 18 (Landline)|
   |Whatsapp Support3|3. +255 746 986 110 (Call Center)|
   |Whatsapp Call Support|Whatsapp / Call Support Contacts.|
   |Skype Support|Skype Support|
   |Skype Support1|1. smartpolicy_1|
   |Skype Support2|1. smartpolicy_2|
   |Skype Support IDs|Please add these IDs on skype for assistance.|
   |Email Support|Email Support|
   |SmartPolicy Email|smartpolicy@itl.co.tz|
   |Email Us|For any queries, email us on the above Email Id.|
  