Feature: Login Functionality

Background: Launch browser and open application


@SmokeTest  
Scenario: (Login)To check Authentication and Authorization functionality by providing valid user id and valid password
When user enter username
When user enter password
And user click on login button
Then application shows home page to user


@RegressionTest1  
Scenario: To check Authentication and Authorization functionality by providing valid user id and invalid password
When user enter "PravinS" as username
When user enter "Kp@254" as password
And user click on login button
Then application shows error message as 2031-Invalid User / Password entered


@RegressionTest 
Scenario: To check Authentication and Authorization functionality by providing invalid user id and invalid password
When user enter "Vijay" as username
When user enter "Ytlp@0" as password
And user click on login button
Then application shows error message as 2024-Invalid User / Password entered


@RegressionTest 
Scenario: To check Authentication and Authorization functionality by providing valid user id and invalid UC password
When user enter "PravinS" as username
When user enter "SPTYHYR" as password
And user click on login button
Then application shows error message as 2031-Invalid User / Password entered


@RegressionTest 
Scenario: To check Authentication and Authorization functionality by providing Invalid UC user id and valid password
When user enter "GLOBALTECH" as username
When user enter "Sp@12345" as password
And user click on login button
Then application shows error message as 2024-Invalid User / Password entered


@RegressionTest 
Scenario: To check Authentication and Authorization functionality by providing Invalid LC user id and valid password
When user enter "pravinitl" as username
When user enter "Sp@12345" as password
And user click on login button
Then application shows error message as 2024-Invalid User / Password entered


@RegressionTest 
Scenario: To check Authentication and Authorization functionality by providing valid user id and Invalid LC password
When user enter "PravinS" as username
When user enter "sptitl" as password
And user click on login button
Then application shows error message as 2031-Invalid User / Password entered


@RegressionTest0 
Scenario: To check Authentication and Authorization functionality by providing Invalid UC,LC user id and valid password
When user enter "Vijayitl" as username
When user enter "Sp@12345" as password
And user click on login button
Then application shows error message as 2024-Invalid User / Password entered


@RegressionTest
Scenario: To check Authentication and Authorization functionality by providing valid user id and Invalid UC,LC password
When user enter "PravinS" as username
When user enter "ITLteam" as password
And user click on login button
Then application shows error message as 2031-Invalid User / Password entered


@RegressionTest 
Scenario: To check Authentication and Authorization functionality by providing valid user id and Invalid NUM password
When user enter "PravinS" as username
When user enter "654321" as password
And user click on login button
Then application shows error message as 2031-Invalid User / Password entered


@RegressionTest
Scenario: To check Authentication and Authorization functionality by providing Invalid NUM user id and valid password
When user enter "987654321" as username
When user enter "Sp@12345" as password
And user click on login button
Then application shows error message as 2024-Invalid User / Password entered


@RegressionTest
Scenario: To check Authentication and Authorization functionality by providing Invalid UC,LC,NUM user id and valid password
When user enter "VIPitl12345" as username
When user enter "Sp@12345" as password
And user click on login button
Then application shows error message as 2024-Invalid User / Password entered


@RegressionTest 
Scenario: To check Authentication and Authorization functionality by providing valid user id and Invalid UC,LC,NUM password
When user enter "PravinS" as username
When user enter "VIPitl12345" as password
And user click on login button
Then application shows error message as 2028-Invalid User / Password entered


@RegressionTest 
Scenario: To check Authentication and Authorization functionality by providing valid user id and Invalid UC,SC password
When user enter "PravinS" as username
When user enter "PRAVIN@" as password
And user click on login button
Then application shows error message as 2028-Invalid User / Password entered


@RegressionTest
Scenario: To check Authentication and Authorization functionality by providing Invalid UC,SC user id and valid password
When user enter "PRAVIN@" as username
When user enter "Sp@12345" as password
And user click on login button
Then application shows error message as 2024-Invalid User / Password entered


@RegressionTest 
Scenario: To check Authentication and Authorization functionality by providing valid user id and no password
When user enter "PravinS" as username
When user enter "" as password
And user click on login button
Then application shows error message as 2002-Password cannot be empty


@RegressionTest @One
Scenario: To check Authentication and Authorization functionality by providing no user id and valid password
When user enter "" as username
When user enter "Sp@12345" as password
And user click on login button
Then application shows error message as 2001-Please specify Login User



