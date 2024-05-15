@All
Feature: Reports

Background: 
Given user navigate on reports dropdown
Given user click on all reports

@One
Scenario: Verify user able to view Admin Fee Report successfully
When user search "Admin Fee Report" as report name in search box
Then user click to select Admin Fee Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view admin fee report in pdf format

@Two
Scenario: Verify user able to view Business Summary by Charts Report successfully
When user search "Business Summary by Charts" as report name in search box
Then user click to select Business Summary by Charts as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary by Charts report in pdf format

@Three
Scenario: Verify user able to view AON Reports Report successfully
When user search "AON Reports" as report name in search box
Then user click to select AON Reports as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view AON Reports in pdf format

@Four
Scenario: Verify user able to view Business Summary (Branch wise with Risk Note) Report successfully
When user search "Business Summary (Branch wise with Risk Note)" as report name in search box
Then user click to select Business Summary (Branch wise with Risk Note) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Branch wise with Risk Note) in pdf format

@Five
Scenario: Verify user able to view Business Summary (Branch wise with Type) Report successfully
When user search "Business Summary (Branch wise with Type)" as report name in search box
Then user click to select Business Summary (Branch wise with Type) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Branch wise with Type) in pdf format

@Six
Scenario: Verify user able to view Business Summary (Branch wise) Report successfully
When user search "Business Summary (Branch wise)" as report name in search box
Then user click to select Business Summary (Branch wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Branch wise) in pdf format

@Seven
Scenario: Verify user able to view Business Summary (by Cover Period start date) Report successfully
When user search "Business Summary (by Cover Period start date)" as report name in search box
Then user click to select Business Summary (by Cover Period start date) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (by Cover Period start date) in pdf format

@Eight
Scenario: Verify user able to view Business Summary (By total premium booked for each customer) Report successfully
When user search "Business Summary (By total premium booked for each customer)" as report name in search box
Then user click to select Business Summary (By total premium booked for each customer) as report
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (By total premium booked for each customer) in pdf format

@Nine
Scenario: Verify user able to view Business Summary (By total premium booked for each insurance company cover Report successfully
When user search "Business Summary (By total premium booked for each insurance company cover" as report name in search box
Then user click to select Business Summary (By total premium booked for each insurance company cover as report
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (By total premium booked for each insurance company cover in pdf format

@Ten
Scenario: Verify user able to view Business Summary (By total premium booked for each insurance company) Report successfully
When user search "Business Summary (By total premium booked for each insurance company)" as report name in search box
Then user click to select Business Summary (By total premium booked for each insurance company) as report
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (By total premium booked for each insurance company) in pdf format

@Elevan
Scenario: Verify user able to view Business Summary (Class wise) Report successfully
When user search "Business Summary (Class wise)" as report name in search box
Then user click to select Business Summary (Class wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Class wise) in pdf format

@Twelve
Scenario: Verify user able to view Business Summary (Client type) Report successfully
When user search "Business Summary (Client type)" as report name in search box
Then user click to select Business Summary (Client type) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Client type) in pdf format

@Thirteen
Scenario: Verify user able to view Business Summary (Client wise) Report successfully
When user search "Business Summary (Client wise)" as report name in search box
Then user click to select Business Summary (Client wise) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Client wise) in pdf format

@Fourteen
Scenario: Verify user able to view Business Summary (Client wise-Cover Period start date) Report successfully
When user search "Business Summary (Client wise-Cover Period start date)" as report name in search box
Then user click to select Business Summary (Client wise-Cover Period start date) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Client wise-Cover Period start date) in pdf format

@Fifteen
Scenario: Verify user able to view Business Summary (Customer Segment) Report successfully
When user search "Business Summary (Customer Segment)" as report name in search box
Then user click to select Business Summary (Customer Segment) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Commercial Banking" as Customer Segment
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Customer Segment)in pdf format

@16
Scenario: Verify user able to view Business Summary (Insurer wise with type) Report successfully
When user search "Business Summary (Insurer wise with type)" as report name in search box
Then user click to select Business Summary (Insurer wise with type) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Insurer wise with type)in pdf format

@17
Scenario: Verify user able to view Business Summary (Insurer wise) Report successfully
When user search "Business Summary (Insurer wise)" as report name in search box
Then user click to select Business Summary (Insurer wise)as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Insurer wise)in pdf format

@18
Scenario: Verify user able to view Business Summary (Insurer wise-Cover Period start date)Report successfully
When user search "Business Summary (Insurer wise-Cover Period start date)" as report name in search box
Then user click to select Business Summary (Insurer wise-Cover Period start date)as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Insurer wise-Cover Period start date)in pdf format

@19
Scenario: Verify user able to view Business Summary (Region wise) Report successfully
When user search "Business Summary (Region wise)" as report name in search box
Then user click to select Business Summary (Region wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Region wise) in pdf format

@20
Scenario: Verify user able to view Business Summary (Zone) Report successfully
When user search "Business Summary (Zone)" as report name in search box
Then user click to select Business Summary (Zone)as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary (Zone)in pdf format

@21
Scenario: Verify user able to view Business Summary by insurer/category (Base Currency) Report successfully
When user search "Business Summary by insurer/category (Base Currency)" as report name in search box
Then user click to select Business Summary by insurer/category (Base Currency) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary by insurer/category (Base Currency) report in pdf format

@22
Scenario: Verify user able to view Business Summary(User wise) Report successfully
When user search "Business Summary(User wise)" as report name in search box
Then user click to select Business Summary(User wise)as report
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Business Summary(User wise) report in pdf format

@23
Scenario: Verify user able to view claim Payment Request Report Report successfully
When user search "Claim Payment Request Report" as report name in search box
Then user click to select claim Payment Request Report as report
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view claim Payment Request Report in pdf format

@24
Scenario: Verify user able to view Claims Incured but not reported on time (IBNR)Report successfully
When user search "Claims Incured but not reported on time (IBNR)" as report name in search box
Then user click to select Claims Incured but not reported on time (IBNR)as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Incured but not reported on time (IBNR)in pdf format

@25
Scenario: Verify user able to view Claims Pending (Assessor wise) Report successfully
When user search "Claims Pending (Assessor wise)" as report name in search box
Then user click to select Claims Pending (Assessor wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending (Assessor wise)in pdf format

@26
Scenario: Verify user able to view Claims Pending (by Assigned users) Report successfully
When user search "Claims Pending (by Assigned users)" as report name in search box
Then user click to select Claims Pending (by Assigned users)as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending (by Assigned users)in pdf format

@27
Scenario: Verify user able to view Claims Pending (Status wise) Report successfully
When user search "Claims Pending (Status wise)" as report name in search box
Then user click to select Claims Pending (Status wise)as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending (Status wise)in pdf format

@28
Scenario: Verify user able to view Claims Pending Report Report successfully
When user search "Claims Pending Report" as report name in search box
Then user click to select Claims Pending Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending Report in pdf format

@29
Scenario: Verify user able to view Claims Pending Report (Branch Wise) Report successfully
When user search "Claims Pending Report (Branch Wise)" as report name in search box
Then user click to select Claims Pending Report (Branch Wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending Report (Branch Wise) in pdf format

@30
Scenario: Verify user able to view Claims Pending Report (Covering Branch) Report successfully
When user search "Claims Pending Report (Covering Branch)" as report name in search box
Then user click to select Claims Pending Report (Covering Branch) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending Report (Covering Branch)in pdf format

@31
Scenario: Verify user able to view Claims Pending Report (Time taken between Accident & Reporting) Report successfully
When user search "Claims Pending Report (Time taken between Accident & Reporting)" as report name in search box
Then user click to select Claims Pending Report (Time taken between Accident & Reporting) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending Report (Time taken between Accident & Reporting)in pdf format

@32
Scenario: Verify user able to view Claims Pending Report - no activity for last 7 Days Report successfully
When user search "Claims Pending Report - no activity for last 7 Days" as report name in search box
Then user click to select Claims Pending Report no activity for last seven Days as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending Report no activity for last seven Days in pdf format

@33
Scenario: Verify user able to view Claims Pending Report(Covering Branch) Not Initiated To Insurer Report successfully
When user search "Claims Pending Report(Covering Branch) Not Initiated To Insurer" as report name in search box
Then user click to select Claims Pending Report(Covering Branch) Not Initiated To Insurer as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending Report(Covering Branch) Not Initiated To Insurer in pdf format

@34
Scenario: Verify user able to view Claims Pending Report(Covering Branch) Time Taken to Initiate to Insurer Report successfully
When user search "Claims Pending Report(Covering Branch) Time Taken to Initiate to Insurer" as report name in search box
Then user click to select Claims Pending Report(Covering Branch) Time Taken to Initiate to Insurer as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Pending Report(Covering Branch) Time Taken to Initiate to Insurer in pdf format

@35
Scenario: Verify user able to view Claims Ratio Report(Branch wise) Report successfully
When user search "Claims Ratio Report(Branch wise)" as report name in search box
Then user click to select Claims Ratio Report(Branch wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Ratio Report(Branch wise) to Insurer in pdf format

@36
Scenario: Verify user able to view Claims Ratio Report(Client wise) Report successfully
When user search "Claims Ratio Report(Client wise)" as report name in search box
Then user click to select Claims Ratio Report(Client wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Ratio Report(Client wise)in pdf format

@37
Scenario: Verify user able to view Claims Ratio Report(Insurer wise) Report successfully
When user search "Claims Ratio Report(Insurer wise)" as report name in search box
Then user click to select Claims Ratio Report(Insurer wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Ratio Report(Insurer wise)in pdf format

@38
Scenario: Verify user able to view Claims Ratio Report(Region wise) Report successfully
When user search "Claims Ratio Report(Region wise)" as report name in search box
Then user click to select Claims Ratio Report(Region wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Ratio Report(Region wise)in pdf format

@39
Scenario: Verify user able to view Claims Ratio Report(Zone wise) Report successfully
When user search "Claims Ratio Report(Zone wise)" as report name in search box
Then user click to select Claims Ratio Report(Zone wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Ratio Report(Zone wise)in pdf format

@40
Scenario: Verify user able to view Claims Register (Branch Wise) Report successfully
When user search "Claims Register (Branch Wise)" as report name in search box
Then user click to select Claims Register (Branch Wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Register (Branch Wise) in pdf format

@41
Scenario: Verify user able to view Claims Register Report successfully
When user search "Claims Register" as report name in search box
Then user click to select Claims Register as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Register in pdf format

@42
Scenario: Verify user able to view Claims Rejected Report Report successfully
When user search "Claims Rejected Report" as report name in search box
Then user click to select Claims Rejected Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Rejected Report in pdf format

@43
Scenario: Verify user able to view Claims Report (Retrenchment wise) Report successfully
When user search "Claims Report (Retrenchment wise)" as report name in search box
Then user click to select Claims Report (Retrenchment wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Report (Retrenchment wise) in pdf format

@44
Scenario: Verify user able to viewClaims Settled Report Report successfully
When user search "Claims Settled Report" as report name in search box
Then user click to select Claims Settled Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Settled Report in pdf format

@45
Scenario: Verify user able to view Claims Settled Report (Branch Wise) Report successfully
When user search "Claims Settled Report (Branch Wise)" as report name in search box
Then user click to select Claims Settled Report (Branch Wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Settled Report (Branch Wise) in pdf format

@46
Scenario: Verify user able to view Claims Settled Report (Time Taken between DV & Settlement) Report successfully
When user search "Claims Settled Report (Time Taken between DV & Settlement)" as report name in search box
Then user click to select Claims Settled Report (Time Taken between DV & Settlement) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "General Insurance" as product
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Settled Report (Time Taken between DV & Settlement) in pdf format

@47
Scenario: Verify user able to view Claims Settled Report - Life Report successfully
When user search "Claims Settled Report - Life" as report name in search box
Then user click to select Claims Settled Report Life as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Settled Report Life in pdf format

@48
Scenario: Verify user able to view Claims Settlement beyond 45 Days Report successfully
When user search "Claims Settlement beyond 45 Days" as report name in search box
Then user click to select Claims Settlement beyond fourty five Days Life as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Claims Settlement beyond fourty five Days in pdf format

@49
Scenario: Verify user able to view Comesa Booking Report successfully
When user search "Comesa Booking" as report name in search box
Then user click to select Comesa Booking as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Comesa Booking in pdf format

@50
Scenario: Verify user able to view Commision Rebate Report Report successfully
When user search "Commision Rebate Report" as report name in search box
Then user click to select Commision Rebate Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Commision Rebate Report in pdf format

@51
Scenario: Verify user able to view Commission Allocated Report Report successfully
When user search "Commission Allocated Report" as report name in search box
Then user click to select Commission Allocated Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Commission Allocated Report in pdf format

@52
Scenario: Verify user able to view Commission Receivable Ageing Report Report successfully
When user search "Commission Receivable Ageing Report" as report name in search box
Then user click to select Commission Receivable Ageing Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Commission Receivable Ageing Report in pdf format

@53
Scenario: Verify user able to view Commission Receivable Report Report successfully
When user search "Commission Receivable Report" as report name in search box
Then user click to select Commission Receivable Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Commission Receivable Report in pdf format

@54
Scenario: Verify user able to view Commission Receivable Report (With VAT Commission) Report successfully
When user search "Commission Receivable Report (With VAT Commission)" as report name in search box
Then user click to select Commission Receivable Report (With VAT Commission) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Commission Receivable Report (With VAT Commission) in pdf format

@55
Scenario: Verify user able to view Commission Receivable Report(WH TAX) Report successfully
When user search "Commission Receivable Report(WH TAX)" as report name in search box
Then user click to select Commission Receivable Report(WH TAX) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Commission Receivable Report(WH TAX) in pdf format

@56
Scenario: Verify user able to view Commission Refundable Report Report successfully
When user search "Commission Refundable Report" as report name in search box
Then user click to select Commission Refundable Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Commission Refundable Report in pdf format

@57
Scenario: Verify user able to view Commission Statement Report Report successfully
When user search "Commission Statement Report" as report name in search box
Then user click to select Commission Statement Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Commission Statement Report in pdf format

@58
Scenario: Verify user able to view Commission Statement Report 1 Report successfully
When user search "Commission Statement Report 1" as report name in search box
Then user click to select Commission Statement Report one as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Commission Statement Report one in pdf format

@59
Scenario: Verify user able to view CSV Data Extraction Report successfully
When user search "CSV Data Extraction" as report name in search box
Then user click to select CSV Data Extraction as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view CSV Data Extraction in pdf format

@60
Scenario: Verify user able to view Customer Sales Statistics Report Report successfully
When user search "Customer Sales Statistics Report" as report name in search box
Then user click to select Customer Sales Statistics Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Customer Sales Statistics Report in pdf format

@61
Scenario: Verify user able to view Daily Cover Notes Report successfully
When user search "Daily Cover Notes" as report name in search box
Then user click to select Daily Cover Notes as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes Report in pdf format

@62
Scenario: Verify user able to view Daily Cover Notes (Borrower Wise) Report successfully
When user search "Daily Cover Notes (Borrower Wise)" as report name in search box
Then user click to select Daily Cover Notes (Borrower Wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (Borrower Wise) in pdf format

@63
Scenario: Verify user able to view Daily Cover Notes (Broker Partner Business) Report successfully
When user search "Daily Cover Notes (Broker Partner Business)" as report name in search box
Then user click to select Daily Cover Notes (Broker Partner Business) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (Broker Partner Business) in pdf format

@64
Scenario: Verify user able to view Daily Cover Notes (Business By) Report successfully
When user search "Daily Cover Notes (Business By)" as report name in search box
Then user click to select Daily Cover Notes (Business By) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (Business By) in pdf format

@65
Scenario: Verify user able to view Daily Cover Notes (Cover Period start date) Report successfully
When user search "Daily Cover Notes (Cover Period start date)" as report name in search box
Then user click to select Daily Cover Notes (Cover Period start date) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (Cover Period start date) in pdf format

@66
Scenario: Verify user able to view Daily Cover Notes (Different Policy Issued Date & TIRA Issued Date) Report successfully
When user search "Daily Cover Notes (Different Policy Issued Date & TIRA Issued Date)" as report name in search box
Then user click to select Daily Cover Notes (Different Policy Issued Date & TIRA Issued Date) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (Different Policy Issued Date & TIRA Issued Date) in pdf format

@67		
Scenario: Verify user able to view Daily Cover Notes (Insurer wise) Report successfully
When user search "Daily Cover Notes (Insurer wise)" as report name in search box
Then user click to select Daily Cover Notes (Insurer wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (Insurer wise) in pdf format

@68		
Scenario: Verify user able to view Daily Cover Notes (User wise) Report successfully
When user search "Daily Cover Notes (User wise)" as report name in search box
Then user click to select Daily Cover Notes (User wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (User wise) in pdf format

@69		
Scenario: Verify user able to view Daily Cover Notes (With First Loss Payee) Report successfully
When user search "Daily Cover Notes (With First Loss Payee)" as report name in search box
Then user click to select Daily Cover Notes (With First Loss Payee) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (With First Loss Payee) in pdf format

@70		
Scenario: Verify user able to view Daily Cover Notes (With Levy) Report successfully
When user search "Daily Cover Notes (With Levy)" as report name in search box
Then user click to select Daily Cover Notes (With Levy) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (With Levy) in pdf format

@71	
Scenario: Verify user able to view Daily Cover Notes (With Reg No.) Report successfully
When user search "Daily Cover Notes (With Reg No.)" as report name in search box
Then user click to select Daily Cover Notes (With Reg No) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (With Reg No) in pdf format

@72
Scenario: Verify user able to view Daily Cover Notes (With Stamp Duty) Report successfully
When user search "Daily Cover Notes (With Stamp Duty)" as report name in search box
Then user click to select Daily Cover Notes (With Stamp Duty) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes (With Stamp Duty) in pdf format

@73
Scenario: Verify user able to view Daily Cover Notes Online Channels) Report successfully
When user search "Daily Cover Notes Online Channels" as report name in search box
Then user click to select Daily Cover Notes Online Channels as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes Online Channels in pdf format

@74
Scenario: Verify user able to view Daily Cover Notes(Lien Clause) Report successfully
When user search "Daily Cover Notes(Lien Clause)" as report name in search box
Then user click to select Daily Cover Notes(Lien Clause) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes(Lien Clause) in pdf format

@75
Scenario: Verify user able to view Daily Cover Notes(New business & renewals Report successfully
When user search "Daily Cover Notes(New business & renewals" as report name in search box
Then user click to select Daily Cover Notes(New business & renewals) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover Notes(New business & renewals) in pdf format

@76
Scenario: Verify user able to view Daily Cover/Notes (Expiry Date wise) Report successfully
When user search "Daily Cover/Notes (Expiry Date wise)" as report name in search box
Then user click to select Daily Cover/Notes (Expiry Date wise) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Cover/Notes (Expiry Date wise) in pdf format

@77
Scenario: Verify user able to view Daily Credit Note Report successfully
When user search "Daily Credit Note" as report name in search box
Then user click to select Daily Credit Note as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Credit Note in pdf format

@78
Scenario: Verify user able to view Daily Debit Notes/ Tax Invoices Report successfully
When user search "Daily Debit Notes/ Tax Invoices" as report name in search box
Then user click to select Daily Debit Notes/ Tax Invoices as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Debit Notes/ Tax Invoices in pdf format

@79
Scenario: Verify user able to view Daily Debit Notes/ Tax Invoices(Un-Allocated/Allocated Report successfully
When user search "Daily Debit Notes/ Tax Invoices(Un-Allocated/Allocated" as report name in search box
Then user click to select Daily Debit Notes/ Tax Invoices(Un-Allocated/Allocated as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Debit Notes/ Tax Invoices(Un-Allocated/Allocated in pdf format

@80
Scenario: Verify user able to view Daily Debit Notes/ Tax Invoices(with Levy) Report successfully
When user search "Daily Debit Notes/ Tax Invoices(with Levy)" as report name in search box
Then user click to select Daily Debit Notes/ Tax Invoices(with Levy) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Debit Notes/ Tax Invoices(with Levy) in pdf format

@81
Scenario: Verify user able to view Daily Payments Report successfully
When user search "Daily Payments" as report name in search box
Then user click to select Daily Payments as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Payments in pdf format

@82
Scenario: Verify user able to view Daily Receipts Report successfully
When user search "Daily Receipts" as report name in search box
Then user click to select Daily Receipts as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Receipts in pdf format

@83
Scenario: Verify user able to view Daily Receipts (Business Type) Report successfully
When user search "Daily Receipts (Business Type)" as report name in search box
Then user click to select Daily Receipts (Business Type) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Receipts (Business Type) in pdf format

@84
Scenario: Verify user able to view Daily Receipts (Insurer wise) Report successfully
When user search "Daily Receipts (Insurer wise)" as report name in search box
Then user click to select Daily Receipts (Insurer wise) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Receipts (Insurer wise) in pdf format

@85
Scenario: Verify user able to view Daily Remittance Report Report successfully
When user search "Daily Remittance Report" as report name in search box
Then user click to select Daily Remittance Report as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "PravinS" as user name
When user select "Demo User" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Daily Remittance Report in pdf format

@86
Scenario: Verify user able to view Debit Note Ageing Report successfully
When user search "Debit Note Ageing" as report name in search box
Then user click to select Debit Note Ageing as report
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Debit Note Ageing in pdf format

@87
Scenario: Verify user able to view Debtors Age Analysis report Report successfully
When user search "Debtors Age Analysis report" as report name in search box
Then user click to select Debtors Age Analysis report as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Debtors Age Analysis report in pdf format

@88
Scenario: Verify user able to view Debtors Analysis Report(by date) Report successfully
When user search "Debtors Analysis Report(by date)" as report name in search box
Then user click to select Debtors Analysis Report(by date) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Debtors Analysis Report(by date) in pdf format

@89
Scenario: Verify user able to view Details of the Policy issued on Credit Report successfully
When user search "Details of the Policy issued on Credit" as report name in search box
Then user click to select Details of the Policy issued on Credit as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Details of the Policy issued on credit in pdf format

@90
Scenario: Verify user able to view Exchange Rate Report For Insurer Report successfully
When user search "Exchange Rate Report For Insurer" as report name in search box
Then user click to select Exchange Rate Report For Insurer as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Exchange Rate Report For Insurer in pdf format

@91
Scenario: Verify user able to view Expired Risk Notes Report successfully
When user search "Expired Risk Notes" as report name in search box
Then user click to select Expired Risk Notes as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Expired Risk Notes in pdf format

@92
Scenario: Verify user able to view Financial Statement - Balance Sheet Report successfully
When user search "Financial Statement - Balance Sheet" as report name in search box
Then user click to select Financial Statement - Balance Sheet as report
And user click on show report button
Then user able to view Financial Statement - Balance Sheet in pdf format

@93
Scenario: Verify user able to view Financial Statement - Balance Sheet(Summarized) Report successfully
When user search "Financial Statement - Balance Sheet(Summarized)" as report name in search box
Then user click to select Financial Statement - Balance Sheet(Summarized) as report
And user click on show report button
Then user able to view Financial Statement - Balance Sheet(Summarized) in pdf format

@94
Scenario: Verify user able to view Financial Statement - Profit and Loss account Report successfully
When user search "Financial Statement - Profit and Loss account" as report name in search box
Then user click to select Financial Statement - Profit and Loss account as report
And user click on show report button
Then user able to view Financial Statement - Profit and Loss account in pdf format

@95
Scenario: Verify user able to view Financial Statement - Profit and Loss account(Summarized) Report successfully
When user search "Financial Statement - Profit and Loss account(Summarized)" as report name in search box
Then user click to select Financial Statement - Profit and Loss account(Summarized) as report
And user click on show report button
Then user able to view Financial Statement - Profit and Loss account(Summarized) in pdf format

@96
Scenario: Verify user able to view Financial Statement - Trial Balance Report successfully
When user search "Financial Statement - Trial Balance" as report name in search box
Then user click to select Financial Statement - Trial Balance as report
And user click on show report button
Then user able to view Financial Statement - Trial Balance in pdf format

@97
Scenario: Verify user able to view Front Office - Daily Performance Report successfully
When user search "Front Office - Daily Performance" as report name in search box
Then user click to select Front Office - Daily Performance as report
And user click on show report button
Then user able to view Front Office - Daily Performance in pdf format

@98
Scenario: Verify user able to view Front Office - Overall Performance Report successfully
When user search "Front Office - Overall Performance" as report name in search box
Then user click to select Front Office - Overall Performance as report
When user select "PravinS" as user name
When user select "Demo User" as business By
And user click on show report button
Then user able to view Front Office - Overall Performance in pdf format

@99
Scenario: Verify user able to view General Ledger Report successfully
When user search "General Ledger" as report name in search box
Then user click to select General Ledger as report
When user select "Inventory" as account
And user click on show report button
Then user able to view General Ledger in pdf format

@100
Scenario: Verify user able to view Ledger (Client/Supplier) Report successfully
When user search "Ledger (Client/Supplier)" as report name in search box
Then user click to select Ledger (Client/Supplier) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Ledger (Client/Supplier) in pdf format

@101
Scenario: Verify user able to view Ledger (Insurer) Report successfully
When user search "Ledger (Insurer)" as report name in search box
Then user click to select Ledger (Insurer) as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Ledger (Insurer) in pdf format

@102
Scenario: Verify user able to view List of Policies Report successfully
When user search "List of Policies" as report name in search box
Then user click to select List of Policies as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view List of Policies in pdf format

@103
Scenario: Verify user able to view List Policies (Customer wise) Report successfully
When user search "List Policies (Customer wise)" as report name in search box
Then user click to select List Policies (Customer wise) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user click on show report button
Then user able to view List Policies (Customer wise) in pdf format

@104
Scenario: Verify user able to view MIS - Performance Report (Quarterly) Report successfully
When user search "MIS - Performance Report (Quarterly)" as report name in search box
Then user click to select MIS - Performance Report (Quarterly) as report
When user select "2024" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view MIS - Performance Report (Quarterly) in pdf format

@105
Scenario: Verify user able to view MIS - Performance Report (Yearly) Report successfully
When user search "MIS - Performance Report (Yearly)" as report name in search box
Then user click to select MIS - Performance Report (Yearly) as report
When user select "2024" as year
And user click on show report button
Then user able to view MIS - Performance Report (Yearly) in pdf format


@106
Scenario: Verify user able to view Mobile Money Transaction Report successfully
When user search "Mobile Money Transaction" as report name in search box
Then user click to select Mobile Money Transaction as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Mobile Money Transaction in pdf format

@107
Scenario: Verify user able to view Mobile Money Transaction (User Wise) Report successfully
When user search "Mobile Money Transaction (User Wise)" as report name in search box
Then user click to select Mobile Money Transaction (User Wise)as report
When user select "Alliance Insurance Company (T) Ltd." as insurer
When user select "PravinS" as user name
When user select "Demo User" as business By
And user select "01/01/2024" as from date
And user click on show report button
Then user able to view Mobile Money Transaction (User Wise)in pdf format








