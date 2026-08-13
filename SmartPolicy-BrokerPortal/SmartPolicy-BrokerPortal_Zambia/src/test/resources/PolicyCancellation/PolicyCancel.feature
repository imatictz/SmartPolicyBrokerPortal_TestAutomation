@All
Feature: Motor Cover Cancellation

  Background:
  Given user navigate on "Vehicle" quotation screen
  
  @Motor_FullPaymentCancel_Today @Motor
   Scenario Outline: (Motor) Create cover, make full payment and cancel the today policy
   Given user creates "<PolicyType>" cover with start date "<StartDate>"
   When user makes "<PaymentType>" payment
   And user enter details to cancels the cover:
       | Field                    | Value                                      |
       | Notes                    | Cancel cover                               |
  
   Then cover should be cancelled successfully

   Examples:
       | PolicyType | StartDate  | PaymentType |
       | Motor      | Today      | Full        |
  
  
  @Motor_PartialPaymentCancel_Today @Motor
   Scenario Outline: (Motor) Create cover, make Partial payment and cancel the today policy
   Given user creates "<PolicyType>" cover with start date "<StartDate>"
   When user makes "<PaymentType>" payment
   And user enter details to cancels the cover:
       | Field                    | Value                                      |
       | Notes                    | Cancel cover                               |
  
   Then cover should be cancelled successfully

   Examples:
       | PolicyType | StartDate  | PaymentType |
       | Motor      | Today      | Partial     |
       
       
   @FireClass_FullPaymentCancel_Today
   Scenario Outline: (Fire Class) Create cover, make full payment and cancel the today policy
   Given user creates (Fire Class) "<PolicyType>" cover with start date "<StartDate>"
   When user makes "<PaymentType>" payment
   And user enter details to cancels the cover:
       | Field                    | Value                                      |
       | Notes                    | Cancel cover                               |
  
   Then cover should be cancelled successfully

   Examples:
       | PolicyType | StartDate  | PaymentType |
       | Fire Class | Today      | Full        |
  
   
