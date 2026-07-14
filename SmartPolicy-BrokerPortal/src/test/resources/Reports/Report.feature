@All
Feature: Reports

Background: 
Given user navigate on reports dropdown
Given user click on all reports

@206 @one
Scenario: Verify user able to view Admin Fee Report (REPORT206) successfully
When user search "Admin Fee Report" as report name in search box
Then user click to select Admin Fee Report as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "admin fee" report in pdf format

@198 @one
Scenario: Verify user able to view Business Summary (Branch wise with Risk Note) Report (REPORT198) successfully
When user search "Business Summary (Branch wise with Risk Note)" as report name in search box
Then user click to select Business Summary (Branch wise with Risk Note) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Branch wise with Risk Note)" report in pdf format

@197
Scenario: Verify user able to view Business Summary (Branch wise with Type) Report (REPORT197) successfully
When user search "Business Summary (Branch wise with Type)" as report name in search box
Then user click to select Business Summary (Branch wise with Type) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Branch wise with Type)" report in pdf format

@72
Scenario: Verify user able to view Business Summary (Branch wise) Report (REPORT72) successfully
When user search "Business Summary (Branch wise)" as report name in search box
Then user click to select Business Summary (Branch wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Branch wise)" report in pdf format

@164
Scenario: Verify user able to view Business Summary (by Cover Period start date) Report (REPORT164) successfully
When user search "Business Summary (by Cover Period start date)" as report name in search box
Then user click to select Business Summary (by Cover Period start date) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (by Cover Period start date)" report in pdf format

@135
Scenario: Verify user able to view Business Summary (By total premium booked for each customer) Report (REPORT135) successfully
When user search "Business Summary (By total premium booked for each customer)" as report name in search box
Then user click to select Business Summary (By total premium booked for each customer) as report
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (By total premium booked for each customer)" report in pdf format

@218
Scenario: Verify user able to view Business Summary (By total premium booked for each insurance company Cover period start date)Report (REPORT218) successfully
When user search "Business Summary (By total premium booked for each insurance company Cover period start date)" as report name in search box
Then user click to select Business Summary (By total premium booked for each insurance company Cover period start date) as report
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (By total premium booked for each insurance company Cover period start date)" report in pdf format

@134
Scenario: Verify user able to view Business Summary (By total premium booked for each insurance company) Report (REPORT134) successfully
When user search "Business Summary (By total premium booked for each insurance company)" as report name in search box
Then user click to select Business Summary (By total premium booked for each insurance company) as report
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (By total premium booked for each insurance company)" report in pdf format

@76
Scenario: Verify user able to view Business Summary (Class wise) Report (REPORT76) successfully
When user search "Business Summary (Class wise)" as report name in search box
Then user click to select Business Summary (Class wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Class wise)" report in pdf format

@202
Scenario: Verify user able to view Business Summary (Client type) Report (REPORT202) successfully
When user search "Business Summary (Client type)" as report name in search box
Then user click to select Business Summary (Client type) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Client type)" report in pdf format

@129
Scenario: Verify user able to view Business Summary (Client wise) Report (REPORT129) successfully
When user search "Business Summary (Client wise)" as report name in search box
Then user click to select Business Summary (Client wise) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Client wise)" report in pdf format

@163
Scenario: Verify user able to view Business Summary (Client wise-Cover Period start date) Report (REPORT163) successfully
When user search "Business Summary (Client wise-Cover Period start date)" as report name in search box
Then user click to select Business Summary (Client wise-Cover Period start date) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Client wise-Cover Period start date)" report in pdf format

@73
Scenario: Verify user able to view Business Summary (Customer Segment) Report (REPORT73) successfully
When user search "Business Summary (Customer Segment)" as report name in search box
Then user click to select Business Summary (Customer Segment) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Commercial Banking" as Customer Segment
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Customer Segment)" report in pdf format

@128
Scenario: Verify user able to view Business Summary (Insurer wise with type) Report (REPORT128) successfully
When user search "Business Summary (Insurer wise with type)" as report name in search box
Then user click to select Business Summary (Insurer wise with type) as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Insurer wise with type)" report in pdf format

@75
Scenario: Verify user able to view Business Summary (Insurer wise) Report(REPORT75) successfully
When user search "Business Summary (Insurer wise)" as report name in search box
Then user click to select Business Summary (Insurer wise)as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Insurer wise)" report in pdf format

@162
Scenario: Verify user able to view Business Summary (Insurer wise-Cover Period start date) Report (REPORT162) successfully
When user search "Business Summary (Insurer wise-Cover Period start date)" as report name in search box
Then user click to select Business Summary (Insurer wise-Cover Period start date)as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Insurer wise-Cover Period start date)" report in pdf format

@71
Scenario: Verify user able to view Business Summary (Region wise) Report (REPORT71) successfully
When user search "Business Summary (Region wise)" as report name in search box
Then user click to select Business Summary (Region wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Region wise)" report in pdf format

@70
Scenario: Verify user able to view Business Summary (Zone) Report (REPORT70) successfully
When user search "Business Summary (Zone)" as report name in search box
Then user click to select Business Summary (Zone)as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary (Zone)" report in pdf format

@226
Scenario: Verify user able to view Business Summary by Charts Report (REPORT226)successfully
When user search "Business Summary by Charts" as report name in search box
Then user click to select Business Summary by Charts as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary by Charts" report in pdf format

@238
Scenario: Verify user able to view Business Summary by insurer/category (Base Currency) Report (REPORT238)successfully
When user search "Business Summary by insurer/category (Base Currency)" as report name in search box
Then user click to select Business Summary by insurer/category (Base Currency) as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary by insurer/category (Base Currency)" report in pdf format

@160
Scenario: Verify user able to view Business Summary(User wise) Report (REPORT160) successfully
When user search "Business Summary(User wise)" as report name in search box
Then user click to select Business Summary(User wise)as report
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Business Summary(User wise)" report in pdf format

@195
Scenario: Verify user able to view claim Payment Request Report Report (REPORT195)successfully
When user search "Claim Payment Request Report" as report name in search box
Then user click to select claim Payment Request Report as report
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "claim Payment Request Report" report in pdf format

@83
Scenario: Verify user able to view Claims Incured but not reported on time (IBNR)Report (REPORT83)successfully
When user search "Claims Incured but not reported on time (IBNR)" as report name in search box
Then user click to select Claims Incured but not reported on time (IBNR)as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Incured but not reported on time (IBNR)" report in pdf format

@141
Scenario: Verify user able to view Claims Pending (Assessor wise) Report (REPORT141)successfully
When user search "Claims Pending (Assessor wise)" as report name in search box
Then user click to select Claims Pending (Assessor wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending (Assessor wise)" report in pdf format

@232
Scenario: Verify user able to view Claims Pending (by Assigned users) Report (REPORT232)successfully
When user search "Claims Pending (by Assigned users)" as report name in search box
Then user click to select Claims Pending (by Assigned users)as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending (by Assigned users)" report in pdf format

@58
Scenario: Verify user able to view Claims Pending (Status wise) Report (REPORT58)successfully
When user search "Claims Pending (Status wise)" as report name in search box
Then user click to select Claims Pending (Status wise)as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending (Status wise)" report in pdf format

@32
Scenario: Verify user able to view Claims Pending Report Report (REPORT32) successfully
When user search "Claims Pending Report" as report name in search box
Then user click to select Claims Pending Report as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending Report" report in pdf format

@242
Scenario: Verify user able to view Claims Pending Report (Branch Wise) Report (REPORT242) successfully
When user search "Claims Pending Report (Branch Wise)" as report name in search box
Then user click to select Claims Pending Report (Branch Wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending Report (Branch Wise)" report in pdf format

@154
Scenario: Verify user able to view Claims Pending Report (Covering Branch) Report (REPORT154)successfully
When user search "Claims Pending Report (Covering Branch)" as report name in search box
Then user click to select Claims Pending Report (Covering Branch) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending Report (Covering Branch)" report in pdf format

@172
Scenario: Verify user able to view Claims Pending Report (Time taken between Accident & Reporting) Report (REPORT172)successfully
When user search "Claims Pending Report (Time taken between Accident & Reporting)" as report name in search box
Then user click to select Claims Pending Report (Time taken between Accident & Reporting) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending Report (Time taken between Accident & Reporting)" report in pdf format

@91
Scenario: Verify user able to view Claims Pending Report - no activity for last 7 Days Report (REPORT91) successfully
When user search "Claims Pending Report - no activity for last 7 Days" as report name in search box
Then user click to select Claims Pending Report no activity for last seven Days as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending Report no activity for last seven Days" report in pdf format

@170
Scenario: Verify user able to view Claims Pending Report(Covering Branch) Not Initiated To Insurer Report (REPORT170) successfully
When user search "Claims Pending Report(Covering Branch) Not Initiated To Insurer" as report name in search box
Then user click to select Claims Pending Report(Covering Branch) Not Initiated To Insurer as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending Report(Covering Branch) Not Initiated To Insurer" report in pdf format

@171
Scenario: Verify user able to view Claims Pending Report(Covering Branch) Time Taken to Initiate to Insurer Report (REPORT171) successfully
When user search "Claims Pending Report(Covering Branch) Time Taken to Initiate to Insurer" as report name in search box
Then user click to select Claims Pending Report(Covering Branch) Time Taken to Initiate to Insurer as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Pending Report(Covering Branch) Time Taken to Initiate to Insurer" report in pdf format

@86
Scenario: Verify user able to view Claims Ratio Report(Branch wise) Report (REPORT86)successfully
When user search "Claims Ratio Report(Branch wise)" as report name in search box
Then user click to select Claims Ratio Report(Branch wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Ratio Report(Branch wise) to Insurer" report in pdf format

@90
Scenario: Verify user able to view Claims Ratio Report(Client wise) Report (REPORT90)successfully
When user search "Claims Ratio Report(Client wise)" as report name in search box
Then user click to select Claims Ratio Report(Client wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Ratio Report(Client wise)" report in pdf format

@89
Scenario: Verify user able to view Claims Ratio Report(Insurer wise) Report (REPORT89) successfully
When user search "Claims Ratio Report(Insurer wise)" as report name in search box
Then user click to select Claims Ratio Report(Insurer wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Ratio Report(Insurer wise)" report in pdf format

@87
Scenario: Verify user able to view Claims Ratio Report(Region wise) Report (REPORT87) successfully
When user search "Claims Ratio Report(Region wise)" as report name in search box
Then user click to select Claims Ratio Report(Region wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Ratio Report(Region wise)" report in pdf format

@88
Scenario: Verify user able to view Claims Ratio Report(Zone wise) Report (REPORT88) successfully
When user search "Claims Ratio Report(Zone wise)" as report name in search box
Then user click to select Claims Ratio Report(Zone wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Ratio Report(Zone wise)" report in pdf format

@240
Scenario: Verify user able to view Claims Register (Branch Wise) Report (REPORT240) successfully
When user search "Claims Register (Branch Wise)" as report name in search box
Then user click to select Claims Register (Branch Wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Register (Branch Wise)" report in pdf format

@27
Scenario: Verify user able to view Claims Register Report (REPORT27) successfully
When user search "Claims Register" as report name in search box
Then user click to select Claims Register as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Register" report in pdf format

@60
Scenario: Verify user able to view Claims Rejected Report Report (REPORT60)successfully
When user search "Claims Rejected Report" as report name in search box
Then user click to select Claims Rejected Report as report
When user select "Automated Testing Company" as insurer
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Rejected Report" report in pdf format

@203
Scenario: Verify user able to view Claims Report (Retrenchment wise) Report (REPORT203) successfully
When user search "Claims Report (Retrenchment wise)" as report name in search box
Then user click to select Claims Report (Retrenchment wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Report (Retrenchment wise)" report in pdf format

@31
Scenario: Verify user able to view Claims Settled Report Report (REPORT31) successfully
When user search "Claims Settled Report" as report name in search box
Then user click to select Claims Settled Report as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Settled Report" report in pdf format

@241
Scenario: Verify user able to view Claims Settled Report (Branch Wise) Report (REPORT241) successfully
When user search "Claims Settled Report (Branch Wise)" as report name in search box
Then user click to select Claims Settled Report (Branch Wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Settled Report (Branch Wise)" report in pdf format

@67
Scenario: Verify user able to view Claims Settled Report (Time Taken between DV & Settlement) Report (REPORT67) successfully
When user search "Claims Settled Report (Time Taken between DV & Settlement)" as report name in search box
Then user click to select Claims Settled Report (Time Taken between DV & Settlement) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Settled Report (Time Taken between DV & Settlement)" report in pdf format

@84
Scenario: Verify user able to view Claims Settled Report - Life Report (REPORT84)successfully
When user search "Claims Settled Report - Life" as report name in search box
Then user click to select Claims Settled Report Life as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Settled Report Life" report in pdf format

@85
Scenario: Verify user able to view Claims Settlement beyond 45 Days Report (REPORT85) successfully
When user search "Claims Settlement beyond 45 Days" as report name in search box
Then user click to select Claims Settlement beyond fourty five Days Life as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Claims Settlement beyond fourty five Days" report in pdf format

@10
Scenario: Verify user able to view Client Ledger Report (REPORT10) successfully
When user search "Client Ledger" as report name in search box
Then user click to select Client Ledger as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Client Ledger" report in pdf format

@211
Scenario: Verify user able to view Comesa Booking Report (REPORT211) successfully
When user search "Comesa Booking" as report name in search box
Then user click to select Comesa Booking as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Comesa Booking" report in pdf format

@223
Scenario: Verify user able to view Commision Rebate Report Report (REPORT223) successfully
When user search "Commision Rebate Report" as report name in search box
Then user click to select Commision Rebate Report as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Commision Rebate Report" report in pdf format

@181
Scenario: Verify user able to view Commission Allocated Report Report (REPORT181) successfully
When user search "Commission Allocated Report" as report name in search box
Then user click to select Commission Allocated Report as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Commission Allocated Report" report in pdf format

@205
Scenario: Verify user able to view Commission Receivable Ageing Report Report (REPORT205) successfully
When user search "Commission Receivable Ageing Report" as report name in search box
Then user click to select Commission Receivable Ageing Report as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Commission Receivable Ageing Report" report in pdf format

@121
Scenario: Verify user able to view Commission Receivable Report Report (REPORT121) successfully
When user search "Commission Receivable Report" as report name in search box
Then user click to select Commission Receivable Report as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Commission Receivable Report" report in pdf format

@207
Scenario: Verify user able to view Commission Receivable Report (With VAT Commission) Report (REPORT207) successfully
When user search "Commission Receivable Report (With VAT Commission)" as report name in search box
Then user click to select Commission Receivable Report (With VAT Commission) as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Commission Receivable Report (With VAT Commission)" report in pdf format

@200
Scenario: Verify user able to view Commission Receivable Report(WH TAX) Report (REPORT200) successfully
When user search "Commission Receivable Report(WH TAX)" as report name in search box
Then user click to select Commission Receivable Report(WH TAX) as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Commission Receivable Report(WH TAX)" report in pdf format

@140
Scenario: Verify user able to view Commission Refundable Report Report (REPORT140)successfully
When user search "Commission Refundable Report" as report name in search box
Then user click to select Commission Refundable Report as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Commission Refundable Report" report in pdf format

@122
Scenario: Verify user able to view Commission Statement Report Report (REPORT122) successfully
When user search "Commission Statement Report" as report name in search box
Then user click to select Commission Statement Report as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Commission Statement Report" report in pdf format

@132
Scenario: Verify user able to view Commission Statement Report 1 Report (REPORT132) successfully
When user search "Commission Statement Report 1" as report name in search box
Then user click to select Commission Statement Report one as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Commission Statement Report one" report in pdf format

@59 
Scenario: Verify user able to view CSV Data Extraction Report successfully
#Add validation bcz pdf download in folder
When user search "CSV Data Extraction" as report name in search box
Then user click to select CSV Data Extraction as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view CSV Data Extraction report in pdf format

@43
Scenario: Verify user able to view Customer Sales Statistics Report Report (REPORT43) successfully
When user search "Customer Sales Statistics Report" as report name in search box
Then user click to select Customer Sales Statistics Report as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Customer Sales Statistics Report" report in pdf format

@07
Scenario: Verify user able to view Daily Cover Notes Report (REPORT07) successfully
When user search "Daily Cover Notes" as report name in search box
Then user click to select Daily Cover Notes as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes Report" report in pdf format

@179
Scenario: Verify user able to view Daily Cover Notes (Borrower Wise) Report (REPORT179) successfully
When user search "Daily Cover Notes (Borrower Wise)" as report name in search box
Then user click to select Daily Cover Notes (Borrower Wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (Borrower Wise)" report in pdf format

@07_P
Scenario: Verify user able to view Daily Cover Notes (Broker Partner Business) Report (REPORT07_P) successfully
When user search "Daily Cover Notes (Broker Partner Business)" as report name in search box
Then user click to select Daily Cover Notes (Broker Partner Business) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (Broker Partner Business)" report in pdf format

@222
Scenario: Verify user able to view Daily Cover Notes (Business By) Report (REPORT222) successfully
When user search "Daily Cover Notes (Business By)" as report name in search box
Then user click to select Daily Cover Notes (Business By) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (Business By)" report in pdf format

@161
Scenario: Verify user able to view Daily Cover Notes (Cover Period start date) Report (REPORT161) successfully
When user search "Daily Cover Notes (Cover Period start date)" as report name in search box
Then user click to select Daily Cover Notes (Cover Period start date) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (Cover Period start date)" report in pdf format

@63
Scenario: Verify user able to view Daily Cover Notes (Different Policy Issued Date & TIRA Issued Date) Report (REPORT63) successfully
When user search "Daily Cover Notes (Different Policy Issued Date & TIRA Issued Date)" as report name in search box
Then user click to select Daily Cover Notes (Different Policy Issued Date & TIRA Issued Date) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (Different Policy Issued Date & TIRA Issued Date)" report in pdf format

@185		
Scenario: Verify user able to view Daily Cover Notes (Insurer wise) Report (REPORT185) successfully
When user search "Daily Cover Notes (Insurer wise)" as report name in search box
Then user click to select Daily Cover Notes (Insurer wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (Insurer wise)" report in pdf format

@155		
Scenario: Verify user able to view Daily Cover Notes (User wise) Report (REPORT155) successfully
When user search "Daily Cover Notes (User wise)" as report name in search box
Then user click to select Daily Cover Notes (User wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (User wise)" report in pdf format

@177		
Scenario: Verify user able to view Daily Cover Notes (With First Loss Payee) Report (REPORT177) successfully
When user search "Daily Cover Notes (With First Loss Payee)" as report name in search box
Then user click to select Daily Cover Notes (With First Loss Payee) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (With First Loss Payee)" report in pdf format

@95		
Scenario: Verify user able to view Daily Cover Notes (With Levy) Report (REPORT95) successfully
When user search "Daily Cover Notes (With Levy)" as report name in search box
Then user click to select Daily Cover Notes (With Levy) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (With Levy)" report in pdf format

@143	
Scenario: Verify user able to view Daily Cover Notes (With Reg No.) Report (REPORT143) successfully
When user search "Daily Cover Notes (With Reg No.)" as report name in search box
Then user click to select Daily Cover Notes (With Reg No) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (With Reg No)" report in pdf format

@194
Scenario: Verify user able to view Daily Cover Notes (With Stamp Duty) Report (REPORT194) successfully
When user search "Daily Cover Notes (With Stamp Duty)" as report name in search box
Then user click to select Daily Cover Notes (With Stamp Duty) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes (With Stamp Duty)" report in pdf format

@227
Scenario: Verify user able to view Daily Cover Notes Online Channels Report (REPORT227) successfully
When user search "Daily Cover Notes Online Channels" as report name in search box
Then user click to select Daily Cover Notes Online Channels as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes Online Channels" report in pdf format

@150
Scenario: Verify user able to view Daily Cover Notes(Lien Clause) Report (REPORT150) successfully
When user search "Daily Cover Notes(Lien Clause)" as report name in search box
Then user click to select Daily Cover Notes(Lien Clause) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes(Lien Clause)" report in pdf format

@176
Scenario: Verify user able to view Daily Cover Notes(New business & renewals) Report (REPORT176) successfully
When user search "Daily Cover Notes(New business & renewals" as report name in search box
Then user click to select Daily Cover Notes(New business & renewals) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover Notes(New business & renewals)" report in pdf format

@220
Scenario: Verify user able to view Daily Cover/Notes (Expiry Date wise) Report (REPORT220) successfully
When user search "Daily Cover/Notes (Expiry Date wise)" as report name in search box
Then user click to select Daily Cover/Notes (Expiry Date wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Cover/Notes (Expiry Date wise)" report in pdf format

@175
Scenario: Verify user able to view Daily Credit Note Report (REPORT175) successfully
When user search "Daily Credit Note" as report name in search box
Then user click to select Daily Credit Note as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Credit Note" report in pdf format

@30
Scenario: Verify user able to view Daily Debit Notes/ Tax Invoices Report (REPORT30) successfully
When user search "Daily Debit Notes/ Tax Invoices" as report name in search box
Then user click to select Daily Debit Notes/ Tax Invoices as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
When user select "New Policy" as policy type
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Debit Notes/ Tax Invoices" report in pdf format

@213
Scenario: Verify user able to view Daily Debit Notes/ Tax Invoices(Un-Allocated/Allocated Report (REPORT213) successfully
When user search "Daily Debit Notes/ Tax Invoices(Un-Allocated/Allocated" as report name in search box
Then user click to select Daily Debit Notes/ Tax Invoices(Un-Allocated/Allocated as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Debit Notes/ Tax Invoices(Un-Allocated/Allocated" report in pdf format

@180
Scenario: Verify user able to view Daily Debit Notes/ Tax Invoices(with Levy) (REPORT180) Report successfully
When user search "Daily Debit Notes/ Tax Invoices(with Levy)" as report name in search box
Then user click to select Daily Debit Notes/ Tax Invoices(with Levy) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Debit Notes/ Tax Invoices(with Levy)" report in pdf format

@12
Scenario: Verify user able to view Daily Payments Report (REPORT12)successfully
When user search "Daily Payments" as report name in search box
Then user click to select Daily Payments as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Payments" report in pdf format

@13
Scenario: Verify user able to view Daily Receipts Report (REPORT13) successfully
When user search "Daily Receipts" as report name in search box
Then user click to select Daily Receipts as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Receipts" report in pdf format

@187
Scenario: Verify user able to view Daily Receipts (Business Type) Report (REPORT187) successfully
When user search "Daily Receipts (Business Type)" as report name in search box
Then user click to select Daily Receipts (Business Type) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Receipts (Business Type)" report in pdf format

@65
Scenario: Verify user able to view Daily Receipts (Insurer wise) Report (REPORT65) successfully
When user search "Daily Receipts (Insurer wise)" as report name in search box
Then user click to select Daily Receipts (Insurer wise) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Receipts (Insurer wise)" report in pdf format

@204
Scenario: Verify user able to view Daily Remittance Report Report (REPORT204) successfully
When user search "Daily Remittance Report" as report name in search box
Then user click to select Daily Remittance Report as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Daily Remittance report" report in pdf format

@16
Scenario: Verify user able to view Debit Note Ageing Report (REPORT16) successfully
When user search "Debit Note Ageing" as report name in search box
Then user click to select Debit Note Ageing as report
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Debit Note Ageing" report in pdf format

@178
Scenario: Verify user able to view Debtors Age Analysis report Report (REPORT178) successfully
When user search "Debtors Age Analysis report" as report name in search box
Then user click to select Debtors Age Analysis report as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user click on show report button
Then user able to view "Debtors Age Analysis report" report in pdf format

@239
Scenario: Verify user able to view Debtors Analysis Report(by date) Report (REPORT239) successfully
When user search "Debtors Analysis Report(by date)" as report name in search box
Then user click to select Debtors Analysis Report(by date) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Debtors Analysis Report(by date)" report in pdf format

@92
Scenario: Verify user able to view Details of the Policy issued on Credit Report (REPORT92) successfully
When user search "Details of the Policy issued on Credit" as report name in search box
Then user click to select Details of the Policy issued on Credit as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Details of the Policy issued on credit" report in pdf format

@119
Scenario: Verify user able to view Direct Payment Transaction Report (REPORT119) successfully
When user search "Direct Payment Transaction" as report name in search box
Then user click to select Direct Payment Transaction as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Direct Payment Transaction" report in pdf format

@235
Scenario: Verify user able to view Exchange Rate Report For Insurer Report (REPORT235) successfully
When user search "Exchange Rate Report For Insurer" as report name in search box
Then user click to select Exchange Rate Report For Insurer as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Exchange Rate Report For Insurer" report in pdf format

@78
Scenario: Verify user able to view Expired Risk Notes Report (REPORT78) successfully
When user search "Expired Risk Notes" as report name in search box
Then user click to select Expired Risk Notes as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Expired Risk Notes" report in pdf format

@110
Scenario: Verify user able to view Financial Statement - Balance Sheet Report (REPORT110) successfully
When user search "Financial Statement - Balance Sheet" as report name in search box
Then user click to select Financial Statement - Balance Sheet as report
And user click on show report button
Then user able to view "Financial Statement - Balance Sheet" report in pdf format

@138
Scenario: Verify user able to view Financial Statement - Balance Sheet(Summarized) Report (REPORT138) successfully
When user search "Financial Statement - Balance Sheet(Summarized)" as report name in search box
Then user click to select Financial Statement - Balance Sheet(Summarized) as report
And user click on show report button
Then user able to view "Financial Statement - Balance Sheet(Summarized)" report in pdf format

@111
Scenario: Verify user able to view Financial Statement - Profit and Loss account Report (REPORT111) successfully
When user search "Financial Statement - Profit and Loss account" as report name in search box
Then user click to select Financial Statement - Profit and Loss account as report
And user click on show report button
Then user able to view "Financial Statement - Profit and Loss account" report in pdf format

@139
Scenario: Verify user able to view Financial Statement - Profit and Loss account(Summarized) Report (REPORT139) successfully
When user search "Financial Statement - Profit and Loss account(Summarized)" as report name in search box
Then user click to select Financial Statement - Profit and Loss account(Summarized) as report
And user click on show report button
Then user able to view "Financial Statement - Profit and Loss account(Summarized)" report in pdf format


@18
Scenario: Verify user able to view Front Office - Daily Performance Report (REPORT18) successfully
When user search "Front Office - Daily Performance" as report name in search box
Then user click to select Front Office - Daily Performance as report
And user click on show report button
Then user able to view "Front Office - Daily Performance" report in pdf format

@145
Scenario: Verify user able to view Front Office - Overall Performance Report (REPORT145) successfully
When user search "Front Office - Overall Performance" as report name in search box
Then user click to select Front Office - Overall Performance as report
When user select "TestProject0001" as user name
When user select "All" as business By
And user click on show report button
Then user able to view "Front Office - Overall Performance" report in pdf format

@107
Scenario: Verify user able to view General Ledger Report (REPORT107)successfully
When user search "General Ledger" as report name in search box
Then user click to select General Ledger as report
When user select "Inventory" as account
And user click on show report button
Then user able to view "General Ledger" report in pdf format

@100
Scenario: Verify user able to view Ledger (Client/Supplier) Report successfully
When user search "Ledger (Client/Supplier)" as report name in search box
Then user click to select Ledger (Client/Supplier) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view Ledger (Client/Supplier) report in pdf format

@11
Scenario: Verify user able to view Ledger (Insurer) Report (REPORT11) successfully
When user search "Ledger (Insurer)" as report name in search box
Then user click to select Ledger (Insurer) as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Ledger (Insurer)" report in pdf format

@46
Scenario: Verify user able to view List of Policies Report (REPORT46) successfully
When user search "List of Policies" as report name in search box
Then user click to select List of Policies as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "List of Policies" report in pdf format

@26
Scenario: Verify user able to view List Policies (Customer wise) Report (REPORT26) successfully
When user search "List Policies (Customer wise)" as report name in search box
Then user click to select List Policies (Customer wise) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user click on show report button
Then user able to view "List Policies (Customer wise)" report in pdf format

@52
Scenario: Verify user able to view MIS - Performance Report (Quarterly) Report (REPORT52) successfully
When user search "MIS - Performance Report (Quarterly)" as report name in search box
Then user click to select MIS - Performance Report (Quarterly) as report
When user select "2025" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view "MIS - Performance Report (Quarterly)" report in pdf format

@53
Scenario: Verify user able to view MIS - Performance Report (Yearly) Report (REPORT53) successfully
When user search "MIS - Performance Report (Yearly)" as report name in search box
Then user click to select MIS - Performance Report (Yearly) as report
When user select "2025" as year
And user click on show report button
Then user able to view "MIS - Performance Report (Yearly)" report in pdf format


@120
Scenario: Verify user able to view Mobile Money Transaction Report (REPORT120) successfully
When user search "Mobile Money Transaction" as report name in search box
Then user click to select Mobile Money Transaction as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Mobile Money Transaction" report in pdf format

@156
Scenario: Verify user able to view Mobile Money Transaction (User Wise) Report (REPORT156) successfully
When user search "Mobile Money Transaction (User Wise)" as report name in search box
Then user click to select Mobile Money Transaction (User Wise)as report
When user select "Automated Testing Company" as insurer
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Mobile Money Transaction (User Wise)" report in pdf format

@61
Scenario: Verify user able to view Modified / Endorsed Cover Notes Report (REPORT61) successfully
When user search "Modified / Endorsed Cover Notes" as report name in search box
Then user click to select Modified / Endorsed Cover Notes as report
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Modified / Endorsed Cover Notes" report in pdf format

@17
Scenario: Verify user able to view Motor Schedule Report (REPORT17) successfully
When user search "Motor Schedule" as report name in search box
Then user click to select Motor Schedule as report
When user enter "4651654" as debit No
And user click on show report button
Then user able to view "Motor Schedule" report in pdf format

@51
Scenario: Verify user able to view Multi Policies Quotation Report (REPORT51) successfully
When user search "Multi Policies Quotation" as report name in search box
Then user click to select Multi Policies Quotation as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Multi Policies Quotation" report in pdf format

@146
Scenario: Verify user able to view Not Renewed Policies[REPORT146] Report successfully
When user search "Not Renewed Policies" as report name in search box
Then user click to select Not Renewed Policies as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Not Renewed Policies" report in pdf format

@124
Scenario: Verify user able to view Outstanding Commission Ageing Report[REPORT124] Report successfully
When user search "Outstanding Commission Ageing Report" as report name in search box
Then user click to select Outstanding Commission Ageing Report as report
When user select "Tanzanian Shillings" as curreny
And user click on show report button
Then user able to view "Outstanding Commission Ageing report" report in pdf format

@123
Scenario: Verify user able to view Outstanding Commission Statement[REPORT123] Report successfully
When user search "Outstanding Commission Statement" as report name in search box
Then user click to select Outstanding Commission Statement as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Outstanding Commission Statement" report in pdf format

@216
Scenario: Verify user able to view Outstanding Premium Ageing Report(Details)[REPORT216] Report successfully
When user search "Outstanding Premium Ageing Report(Details)" as report name in search box
Then user click to select Outstanding Premium Ageing Report(Details) as report
When user select "Tanzanian Shillings" as curreny
And user click on show report button
Then user able to view "Outstanding Premium Ageing Report(Details)" report in pdf format

@209
Scenario: Verify user able to view Outstanding Premium Report(Business Group)[REPORT209] Report successfully
When user search "Outstanding Premium Report(Business Group)" as report name in search box
Then user click to select Outstanding Premium Report(Business Group) as report
When user select "Tanzanian Shillings" as curreny
And user click on show report button
Then user able to view "Outstanding Premium Report(Business Group)" report in pdf format

@108
Scenario: Verify user able to view Payment Cheque Register[REPORT108] Report successfully
When user search "Payment Cheque Register" as report name in search box
Then user click to select Payment Cheque Register as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "All" as Supplier Name
When user select "UBL Bank (TZS)" as account
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Payment Cheque Register" report in pdf format

@98
Scenario: Verify user able to view Pending Quotation[REPORT98] Report successfully
When user search "Pending Quotation" as report name in search box
Then user click to select Pending Quotation as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Pending Quotation" report in pdf format

@64
Scenario: Verify user able to view Performance Incentive Report[REPORT64] Report successfully
When user search "Performance Incentive Report" as report name in search box
Then user click to select Performance Incentive Report as report
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "2025" as year
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Performance Incentive report" report in pdf format

@56
Scenario: Verify user able to view Policy Cancellation[REPORT56] Report successfully
When user search "Policy Cancellation" as report name in search box
Then user click to select Policy Cancellation as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Policy Cancellation" report in pdf format

@196
Scenario: Verify user able to view Policy Push Error Records[REPORT196] Report successfully
When user search "Policy Push Error Records" as report name in search box
Then user click to select Policy Push Error Records as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Direct" as Business type
When user select "Tanzanian Shillings" as curreny
When user enter "36516" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Policy Push Error Records" report in pdf format

@169
Scenario: Verify user able to view Policy Renewable[REPORT169] Report successfully
When user search "Policy Renewable" as report name in search box
Then user click to select Policy Renewable as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "Tanzanian Shillings" as curreny
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Policy Renewable" report in pdf format

@167
Scenario: Verify user able to view Policy Retention Report (Quarterly)[REPORT167] Report successfully
When user search "Policy Retention Report (Quarterly)" as report name in search box
Then user click to select Policy Retention Report (Quarterly) as report
When user select "2025" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view "Policy Retention Report (Quarterly)" report in pdf format

@168
Scenario: Verify user able to view Policy Retention Report (Yearly)[REPORT168] Report successfully
When user search "Policy Retention Report (Yearly)" as report name in search box
Then user click to select Policy Retention Report (Yearly) as report
When user select "2025" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view "Policy Retention Report (Yearly)" report in pdf format

@68
Scenario: Verify user able to view Premium Financed Risk Notes[REPORT68] Report successfully
When user search "Premium Financed Risk Notes" as report name in search box
Then user click to select Premium Financed Risk Notes as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Premium Financed Risk Notes" report in pdf format

@229  
Scenario: Verify user able to view Print Multiple Certificate[REPORT229] Report successfully
#Risk note and to remaining
When user search "Print Multiple Certificate" as report name in search box
Then user click to select Print Multiple Certificate as report
When user enter "4651654" as debit No
When user enter "32120" as risk note from
When user enter "32140" as To
And user click on show report button
Then user able to view "Print Multiple Certificate" report in pdf format

@REPORT_PD  
Scenario: Verify user able to view Print Multiple Policy Documents[REPORT_PD] Report successfully
#Risk note and to remaining
When user search "Print Multiple Policy Documents" as report name in search box
Then user click to select Print Multiple Policy Documents as report
When user enter "4651654" as debit No
When user enter "32120" as risk note from
When user enter "32140" as To
And user click on show report button
Then user able to view "Print Multiple Policy Documents" report in pdf format

@02 
Scenario: Verify user able to view Print Multiple Risk Notes[REPORT02] Report successfully
#Risk note and to remaining
When user search "Print Multiple Risk Notes" as report name in search box
Then user click to select Print Multiple Risk Notes as report
When user enter "4651654" as debit No
When user enter "32120" as risk note from
When user enter "32140" as To
And user click on show report button
Then user able to view "Print Multiple Risk Notes" report in pdf format

@147 
Scenario: Verify user able to view Print Multiple TIRA Stickers (New)[REPORT147] Report successfully
#Risk note and to remaining
When user search "Print Multiple TIRA Stickers (New)" as report name in search box
Then user click to select Print Multiple TIRA Stickers (New) as report
When user enter "4651654" as debit No
When user enter "32120" as risk note from
When user enter "32140" as To
And user click on show report button
Then user able to view "Print Multiple TIRA Stickers (New)" report in pdf format

@189
Scenario: Verify user able to view Regulatory Document Inventory[REPORT189] Report successfully
When user search "Regulatory Document Inventory" as report name in search box
Then user click to select Regulatory Document Inventory as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Regulatory Document Inventory" report in pdf format

@14
Scenario: Verify user able to view Renewal List[REPORT14] Report successfully
When user search "Renewal List" as report name in search box
Then user click to select Renewal List as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Renewal List" report in pdf format

@221
Scenario: Verify user able to view Renewal List (User wise)[REPORT221] Report successfully
When user search "Renewal List (User wise)" as report name in search box
Then user click to select Renewal List (User wise) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Renewal List (User wise)" report in pdf format

@15
Scenario: Verify user able to view Renewal Reminder Letter[REPORT15] Report successfully
When user search "Renewal Reminder Letter" as report name in search box
Then user click to select Renewal Reminder Letter as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Renewal Reminder Letter" report in pdf format

@62
Scenario: Verify user able to view Show Expired, Active or Renewed Risk Notes.[REPORT62] Report successfully
When user search "Show Expired, Active or Renewed Risk Notes." as report name in search box
Then user click to select Show Expired, Active or Renewed Risk Notes. as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Show Expired, Active or Renewed Risk Notes." report in pdf format

@09
Scenario: Verify user able to view Statement (Client-wise)[REPORT09] Report successfully
When user search "Statement (Client-wise)" as report name in search box
Then user click to select Statement (Client-wise) as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Statement (Client-wise)" report in pdf format

@59
Scenario: Verify user able to view Statement (Insurer-wise) Comprehensive[REPORT59] Report successfully
When user search "Statement (Insurer-wise) Comprehensive" as report name in search box
Then user click to select Statement (Insurer-wise) Comprehensive as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Statement (Insurer-wise) Comprehensive" report in pdf format

@87
Scenario: Verify user able to view Statement (Insurer-wise) Kenya[REPORT87] Report successfully
When user search "Statement (Insurer-wise) Kenya" as report name in search box
Then user click to select Statement (Insurer-wise) Kenya as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Statement (Insurer-wise) Kenya" report in pdf format

@08
Scenario: Verify user able to view Statement (Insurer-wise)Type 1[REPORT08] Report successfully
When user search "Statement (Insurer-wise)Type 1" as report name in search box
Then user click to select Statement (Insurer-wise)Type one as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Statement (Insurer-wise)Type one" report in pdf format

@44
Scenario: Verify user able to view Statement (Insurer-wise)Type 2[REPORT44] Report successfully
When user search "Statement (Insurer-wise)Type 2" as report name in search box
Then user click to select Statement (Insurer-wise)Type two as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Statement (Insurer-wise)Type two" report in pdf format

@47
Scenario: Verify user able to view Statement (Insurer-wise)Type 3[REPORT47] Report successfully
When user search "Statement (Insurer-wise)Type 3" as report name in search box
Then user click to select Statement (Insurer-wise)Type three as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Statement (Insurer-wise)Type three" report in pdf format

@140
Scenario: Verify user able to view Statement Statement (Client-wise) - on Risk Note[REPORT217] Report successfully
When user search "Statement Statement (Client-wise) - on Risk Note" as report name in search box
Then user click to select Statement Statement (Client-wise) - on Risk Note as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user enter "32156" as debit No
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view Statement Statement (Client-wise) - on Risk Note report in pdf format

@186
Scenario: Verify user able to view Sticker Replacement[REPORT186] Report successfully
When user search "Sticker Replacement" as report name in search box
Then user click to select Sticker Replacement as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Sticker Replacement" report in pdf format

@105
Scenario: Verify user able to view Supplier Invoice Ageing Report[REPORT105] Report successfully
When user search "Supplier Invoice Ageing Report" as report name in search box
Then user click to select Supplier Invoice Ageing Report as report
And user click on show report button
Then user able to view "Supplier Invoice Ageing" report in pdf format

@104
Scenario: Verify user able to view Supplier Statement[REPORT104] Report successfully
When user search "Supplier Statement" as report name in search box
Then user click to select Supplier Statement as report
When user select "All" as Supplier Name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Supplier Statement" report in pdf format

@117
Scenario: Verify user able to view Targets[REPORT117] Report successfully
When user search "Targets" as report name in search box
Then user click to select Targets as report
When user select "Tanzanian Shillings" as curreny
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Targets" report in pdf format

@159
Scenario: Verify user able to view Targets (Zone wise)[REPORT159] Report successfully
When user search "Targets (Zone wise)" as report name in search box
Then user click to select Targets (Zone wise) as report
When user select "Tanzanian Shillings" as curreny
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Targets (Zone wise)" report in pdf format

@166
Scenario: Verify user able to view Targets (Zone wise) BY Policy Count[REPORT166] Report successfully
When user search "Targets (Zone wise) BY Policy Count" as report name in search box
Then user click to select Targets (Zone wise) BY Policy Count as report
When user select "Tanzanian Shillings" as curreny
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Targets (Zone wise) BY Policy Count" report in pdf format

@165
Scenario: Verify user able to view Targets By Policy Count[REPORT165] Report successfully
When user search "Targets By Policy Count" as report name in search box
Then user click to select Targets By Policy Count as report
When user select "Tanzanian Shillings" as curreny
When user select "General Insurance" as product
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Targets By Policy Count" report in pdf format

@79
Scenario: Verify user able to view TIRA MIS Report[REPORT79] Report successfully
When user search "TIRA MIS Report" as report name in search box
Then user click to select TIRA MIS Report as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "TIRA MIS report" report in pdf format

@40
Scenario: Verify user able to view TIRA Reports - Broker Premium Remittance Statement[REPORT40] Report successfully
When user search "TIRA Reports - Broker Premium Remittance Statement" as report name in search box
Then user click to select TIRA Reports - Broker Premium Remittance Statement as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "TIRA Reports - Broker Premium Remittance Statement" report in pdf format

@80
Scenario: Verify user able to view TIRA Reports - Broker Premium Remittance Statement(Quarterly)[REPORT80] Report successfully
When user search "TIRA Reports - Broker Premium Remittance Statement(Quarterly)" as report name in search box
Then user click to select TIRA Reports - Broker Premium Remittance Statement(Quarterly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view "TIRA Reports - Broker Premium Remittance Statement(Quarterly)" report in pdf format

@48
Scenario: Verify user able to view TIRA Reports - Brokers Premium Collection Report (Quarterly)[REPORT48] Report successfully
When user search "TIRA Reports - Brokers Premium Collection Report (Quarterly)" as report name in search box
Then user click to select TIRA Reports - Brokers Premium Collection Report (Quarterly) as report
When user select "2025" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view "TIRA Reports - Brokers Premium Collection Report (Quarterly)" report in pdf format

@42
Scenario: Verify user able to view TIRA Reports - Commission Income Statemnt (Quarterly)[REPORT42] Report successfully
When user search "TIRA Reports - Commission Income Statemnt (Quarterly)" as report name in search box
Then user click to select TIRA Reports - Commission Income Statemnt (Quarterly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view "TIRA Reports - Commission Income Statemnt (Quarterly)" report in pdf format

@41
Scenario: Verify user able to view TIRA Reports - Commission Income Statemnt (Yearly)[REPORT41] Report successfully
When user search "TIRA Reports - Commission Income Statemnt (Yearly)" as report name in search box
Then user click to select TIRA Reports - Commission Income Statemnt (Yearly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
And user click on show report button
Then user able to view "TIRA Reports - Commission Income Statemnt (Yearly)" report in pdf format

@100
Scenario: Verify user able to view TIRA Reports - Commission IncomeStatement (Monthly)[REPORT100] Report successfully
When user search "TIRA Reports - Commission IncomeStatement (Monthly)" as report name in search box
Then user click to select TIRA Reports - Commission IncomeStatement (Monthly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
When user select "January" as monthly
And user click on show report button
Then user able to view "TIRA Reports - Commission IncomeStatement (Monthly)" report in pdf format

@38
Scenario: Verify user able to view TIRA Reports - Payables Outstanding to Insurers[REPORT38] Report successfully
When user search "TIRA Reports - Payables Outstanding to Insurers" as report name in search box
Then user click to select TIRA Reports - Payables Outstanding to Insurers as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
And user click on show report button
Then user able to view "TIRA Reports - Payables Outstanding to Insurers" report in pdf format

@115
Scenario: Verify user able to view TIRA Reports - Payables Outstanding to Insurers (Quaterly)[REPORT115] Report successfully
When user search "TIRA Reports - Payables Outstanding to Insurers (Quaterly)" as report name in search box
Then user click to select TIRA Reports - Payables Outstanding to Insurers (Quaterly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view "TIRA Reports - Payables Outstanding to Insurers (Quaterly)" report in pdf format

@148
Scenario: Verify user able to view TIRA Reports - Premium Booked Statement (Monthly)[REPORT148] Report successfully
When user search "TIRA Reports - Premium Booked Statement (Monthly)" as report name in search box
Then user click to select TIRA Reports - Premium Booked Statement (Monthly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
When user select "January" as monthly
And user click on show report button
Then user able to view "TIRA Reports - Premium Booked Statement (Monthly)" report in pdf format

@36
Scenario: Verify user able to view TIRA Reports - Premium Booked Statement (Quarterly)[REPORT36] Report successfully
When user search "TIRA Reports - Premium Booked Statement (Quarterly)" as report name in search box
Then user click to select TIRA Reports - Premium Booked Statement (Quarterly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view "TIRA Reports - Premium Booked Statement (Quarterly)" report in pdf format

@35
Scenario: Verify user able to view TIRA Reports - Premium Booked Statement (Yearly)[REPORT35] Report successfully
When user search "TIRA Reports - Premium Booked Statement (Yearly)" as report name in search box
Then user click to select TIRA Reports - Premium Booked Statement (Yearly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
And user click on show report button
Then user able to view "TIRA Reports - Premium Booked Statement (Yearly)" report in pdf format

@39
Scenario: Verify user able to view TIRA Reports - Premium Booked Statement-Life Assurance (Quarterly)[REPORT39] Report successfully
When user search "TIRA Reports - Premium Booked Statement-Life Assurance (Quarterly)" as report name in search box
Then user click to select TIRA Reports - Premium Booked Statement-Life Assurance (Quarterly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
When user select "January to March" as quarter
And user click on show report button
Then user able to view "TIRA Reports - Premium Booked Statement-Life Assurance (Quarterly)" report in pdf format

@37
Scenario: Verify user able to view TIRA Reports - Premium Booked Statement-Life Assurance (Yearly)[REPORT37] Report successfully
When user search "TIRA Reports - Premium Booked Statement-Life Assurance (Yearly)" as report name in search box
Then user click to select TIRA Reports - Premium Booked Statement-Life Assurance (Yearly) as report
When user select "Automated Testing Company" as insurer
When user select "2025" as year
And user click on show report button
Then user able to view "TIRA Reports - Premium Booked Statement-Life Assurance (Yearly)" report in pdf format

@93
Scenario: Verify user able to view TIRA Sticker Inventory[REPORT93] Report successfully
When user search "TIRA Sticker Inventory" as report name in search box
Then user click to select TIRA Sticker Inventory as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "TIRA Sticker Inventory" report in pdf format

@214
Scenario: Verify user able to view Total Outstanding Payments (Client wise)[REPORT214] Report successfully
When user search "Total Outstanding Payments (Client wise)" as report name in search box
Then user click to select Total Outstanding Payments (Client wise) as report
And user click on show report button
Then user able to view "Total Outstanding Payments (Client wise)" report in pdf format

@29
Scenario: Verify user able to view Total Outstanding Payments (Detailed)[REPORT29] Report successfully
When user search "Total Outstanding Payments (Detailed)" as report name in search box
Then user click to select Total Outstanding Payments (Detailed) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Total Outstanding Payments (Detailed)" report in pdf format

@22
Scenario: Verify user able to view Total Outstanding Payments (Summarized)[REPORT22] Report successfully
When user search "Total Outstanding Payments (Summarized)" as report name in search box
Then user click to select Total Outstanding Payments (Summarized) as report
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Total Outstanding Payments (Summarized)" report in pdf format

@28
Scenario: Verify user able to view Total Outstanding Receipts (Detailed)[REPORT28] Report successfully
When user search "Total Outstanding Receipts (Detailed)" as report name in search box
Then user click to select Total Outstanding Receipts (Detailed) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Total Outstanding Receipts (Detailed)" report in pdf format

@21
Scenario: Verify user able to view Total Outstanding Receipts (Summarized)[REPORT21] Report successfully
When user search "Total Outstanding Receipts (Summarized)" as report name in search box
Then user click to select Total Outstanding Receipts (Summarized) as report
And user click on show report button
Then user able to view "Total Outstanding Receipts (Summarized)" report in pdf format

@236
Scenario: Verify user able to view Unallocated Credit Note[REPORT236] Report successfully
When user search "Unallocated Credit Note" as report name in search box
Then user click to select Unallocated Credit Note as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Unallocated Credit Note" report in pdf format

@24
Scenario: Verify user able to view Unallocated Payments[REPORT24] Report successfully
When user search "Unallocated Payments" as report name in search box
Then user click to select Unallocated Payments as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Unallocated Payments" report in pdf format

@23
Scenario: Verify user able to view Unallocated Receipts[REPORT23] Report successfully
When user search "Unallocated Receipts" as report name in search box
Then user click to select Unallocated Receipts as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Unallocated Receipts" report in pdf format

@133
Scenario: Verify user able to view Unrequested Customer Tax Invoice Transactions[REPORT133] Report successfully
When user search "Unrequested Customer Tax Invoice Transactions" as report name in search box
Then user click to select Unrequested Customer Tax Invoice Transactions as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Unrequested Customer Tax Invoice Transactions" report in pdf format

@219
Scenario: Verify user able to view User Details[REPORT219] Report successfully
When user search "User Details" as report name in search box
Then user click to select User Details as report
And user click on show report button
Then user able to view "User Details" report in pdf format

@109
Scenario: Verify user able to view VAT submission Report[REPORT109] Report successfully
When user search "VAT submission Report" as report name in search box
Then user click to select VAT submission Report as report
And user click on show report button
Then user able to view "VAT submission report" report in pdf format

@49
Scenario: Verify user able to view VAT submission Report for Insurance Companies[REPORT49] Report successfully
When user search "VAT submission Report for Insurance Companies" as report name in search box
Then user click to select VAT submission Report for Insurance Companies as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "VAT submission Report for Insurance Companies" report in pdf format

@54
Scenario: Verify user able to view VAT submission Report for Insurance Companies 1[REPORT54] Report successfully
When user search "VAT submission Report for Insurance Companies 1" as report name in search box
Then user click to select VAT submission Report for Insurance Companies one as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "VAT submission Report for Insurance Companies one" report in pdf format

@106
Scenario: Verify user able to view Vouchers Report[REPORT106] Report successfully
When user search "Vouchers Report" as report name in search box
Then user click to select Vouchers Report as report
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "Inventory" as account
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Vouchers report" report in pdf format

@158
Scenario: Verify user able to view Insurance Company Fiscal Tax Invoices[REPORT158] Report successfully
When user search "Insurance Company Fiscal Tax Invoices" as report name in search box
Then user click to select Insurance Company Fiscal Tax Invoices as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Insurance Company Fiscal Tax Invoices" report in pdf format

@130
Scenario: Verify user able to view Insurance Premium Levy Tax Payable Report (REPORT130) successfully
When user search "Insurance Premium Levy Tax Payable" as report name in search box
Then user click to select Insurance Premium Levy Tax Payable as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "2 Wheelers/ 3 Wheelers" as insurance type
When user select "TestProject0001" as user name
When user select "All" as business By
When user select "Tanzanian Shillings" as curreny
When user enter "4651654" as debit No
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Insurance Premium Levy Tax Payable" report in pdf format

@149
Scenario: Verify user able to view Insurer Commission Rates Report (REPORT149) successfully
When user search "Insurer Commission Rates" as report name in search box
Then user click to select Insurer Commission Rates as report
When user select "Automated Testing Company" as insurer
When user select "2 Wheelers/ 3 Wheelers" as insurance type
And user click on show report button
Then user able to view "Insurer Commission Rates" report in pdf format

@74
Scenario: Verify user able to view Insurer Remitance Report Report (REPORT74) successfully
When user search "Insurer Remitance Report" as report name in search box
Then user click to select Insurer Remitance Report as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Insurer Remitance Report" report in pdf format

@157
Scenario: Verify user able to view Insurer Remitance Report 2 Report (REPORT157) successfully
When user search "Insurer Remitance Report 2" as report name in search box
Then user click to select Insurer Remitance Report 2 as report
When user select "Automated Testing Company" as insurer
When user select "Tanzanian Shillings" as curreny
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Insurer Remitance Report 2" report in pdf format

@96
Scenario: Verify user able to view Insurer Remitance Report(Kenya) Report (REPORT96) successfully
When user search "Insurer Remitance Report(Kenya)" as report name in search box
Then user click to select Insurer Remitance Report(Kenya) as report
When user select "Automated Testing Company" as insurer
When user enter "Pravin Testing Broker" as client name
And user select Pravin Testing Broker as client name
When user select "TestProject0001" as user name
When user select "All" as business By
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Insurer Remitance Report(Kenya)" report in pdf format

@45
Scenario: Verify user able to view Insurer Tax Invoice Report (REPORT45) successfully
When user search "Insurer Tax Invoice" as report name in search box
Then user click to select Insurer Tax Invoice as report
When user select "Automated Testing Company" as insurer
And user select "01-Jan-2026" as from date
And user click on show report button
Then user able to view "Insurer Tax Invoice" report in pdf format






