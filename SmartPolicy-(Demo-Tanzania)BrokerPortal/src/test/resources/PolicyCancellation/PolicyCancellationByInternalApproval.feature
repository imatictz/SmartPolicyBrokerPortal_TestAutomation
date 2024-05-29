@All
Feature: Policy Cancellation By Internal Approval

Background: 

When user navigate on operation dropdown menu
Then user select risk note menu


@MotorPolicyCancel					
Scenario: (Motor Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancelled" as status after internal approval

@BondPolicyCancel					
Scenario: (Bond Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancelled" as status after internal approval

@MoneyPolicyCancel					
Scenario: (Money Insurance Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancelled" as status after internal approval

@AccidentalPolicyCancel					
Scenario: (Accidental Damage Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancelled" as status after internal approval

@BurglaryPolicyCancel					
Scenario: (Burglary/Theft Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation

@FidelityPolicyCancel					
Scenario: (Fidelity Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancelled" as status after internal approval


@FirePolicyCancel					
Scenario: (Fire and Burglary Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancelled" as status after internal approval

@PensionPolicyCancel					
Scenario: (Pension Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancelled" as status after internal approval

@CreditLifePolicyCancel					
Scenario: (Credit Life Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancelled" as status after internal approval

@MedicalPolicyCancel					
Scenario: (Medical Policy Cancellation) Verify user able to cancel policy successfully
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
When user click on options button
Then user click on cancel button to cancel the Risk note
When user select Cancel & Issue credit note button
When user enter "Cancellation of Policy" as cancellation notes
When user click on preview button
When user enter "12000" as refund to customer
And user click on preview button
And user click on proceed cancellation button
Then user able to view "Cancellation Internal Approval Required" as status after proceed cancellation

#Broker Portal
When user open new tab
When user enter "https://apps.itl.co.tz/broker/wfLogin.aspx" as url
When user enter "Demo" as username
When user enter "Sp@12345" as password
When user click on login button
When user navigate on operation dropdown menu
Then user select risk note menu
When user select "01/01/2023" as from date
And user enter "37152" as risk note number
Then user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancellation Internal Approval Required" as status for risk note no
When user click on options button
Then user click on cancel button to cancel the Risk note
Then user click on accept button

#Broker Portal
#When user select "01/01/2023" as from date
When user enter "37152" as risk note number (BrokerPortal)
And user click on search button for the respective Risk Note for cancellation
Then user able to view "Cancelled" as status after internal approval
