@All
Feature: Renew Policy

Background: Launch browser and open application

When user navigate on operation dropdown
And user navigate on policy renewals option
Then user click on renew policy option

@AllFields
Scenario: (RenewPolicy) Verify user able to create the quotation for the renewing policy successfully
#Renew (Bonds Quote)
When user enter "01/04/2024" as expiry from date
And user enter "32222" as risk note
Then user click on search button
When user click on renew option
Then user click on renew button for renewal confirmation

#New Quote (Bonds)
When user click on quotations menu
Then user able to view "Awaiting Receipt" as status
