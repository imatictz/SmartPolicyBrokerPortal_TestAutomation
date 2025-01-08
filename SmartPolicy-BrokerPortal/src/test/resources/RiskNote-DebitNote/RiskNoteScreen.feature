@All
Feature: Risk note screen

Background: 

When user navigate on operation dropdown menu
Then user select risk note menu

@icons
Scenario: RiskNote Screen Icons
When user click on display icon
Then user able to view bonds risk note screen
When user click on GoTo Quotation button
Then user able to navigate on quotation screen and view quote
When user click on GoTo DebitNote button
Then user able to navigate on debitnote screen and view debit No
When user click on print icon

@optionsIcon 
Scenario: Options icon
When user click on options icon
When user click on edit option
Then user click on update button
When user click on information option
Then user click on reprocess button
When user click on email cover notes option
And user enter "pravin.wagh@itl.co.tz" as email
Then user click on send email button	
When user click on co-insurance option
When user click on update commission option
And user enter "15" to update commission rate%
Then user click on save button
When user click on collection reminder option
Then user click on send SMS button
When user click on individual risknote print option      
When user click on select insurer name to print
When user enter "All" in search box
And user select ALL as insurer name
Then user click on print button
				
@policyCancel					
Scenario: (Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "36566" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on proceed cancellation button
Then user able to view status as "Cancellation Approval Required"
#Insurer Portal
When user open new tab
When user enter "https://apps.itl.co.tz/insurer/wfLogin.aspx" as url
When user enter "AL-5" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu (InsurerPortal)
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "36566" as risk note number
When user click on branch dropdown
And user enter "All" as branch
Then user select All as branch
Then user click on search button for the respective Risk Note for cancellation
When user click on display icon insurer
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
And user enter "36566" as risk note number (BrokerPortal)
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Proceed for Cancellation" as status1
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on proceed cancellation button
Then user able to view "Cancelled" as status2

@Report1
Scenario: (Cancel Advice to Customer) Verify user able to print Cancel Advice to Customer giving him a complete information of
policy cancellation and refund

When user click on dropdown 
When user enter "Cancel Advice - Customer" in search box
When user select Cancel Advice to Customer to print report
And user click on print option for getting complete information of policy cancellation and refund
Then user able to view Cancel Advice to Customer report

@Report2
Scenario: (Cancel Advice to Insurer) Verify user able to print Cancel Advice to Insurer giving him a complete information of
policy cancellation and refund

When user click on dropdown 
When user enter "Cancel Advice - Insurer" in search box
When user select Cancel Advice to Insurer to print report
And user click on print option for getting complete information of policy cancellation and refund
Then user able to view Cancel Advice to Insurer report	
