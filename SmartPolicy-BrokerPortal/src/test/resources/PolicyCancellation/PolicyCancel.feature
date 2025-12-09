Feature: Motor Cover Cancellation

  Background:
  Given user navigate on "Vehicle" quotation screen
  
  @FullPaymentCancel
  Scenario Outline: Full payment cancellation
  Given user creates "<PolicyType>" cover with start date "<StartDate>"
  When user makes "<PaymentType>" payment
  And user cancels the cover
  Then cover should be cancelled successfully

  Examples:
  | PolicyType | StartDate  | PaymentType |
  | Motor      | Today      | Full        |
  
  Scenario: Create cover, make full payment and cancel the cover
    Given user has created a new cover with valid details
    And user has made full payment for the cover
    When user cancels the cover
    Then cover should be cancelled successfully

  @PartialPaymentCancel
  Scenario: Create cover, make partial payment and cancel the cover
    Given user has created a new cover with valid details
    And user has made partial payment for the cover
    When user cancels the cover
    Then cover should be cancelled successfully

  @BackDateFullPaymentCancel
  Scenario: Create back date cover, make full payment and cancel
    Given a back date cover is created
    And user has made full payment for the cover
    When user cancels the cover
    Then cancellation should be successful

  @BackDatePartialPaymentCancel
  Scenario: Create back date cover, make partial payment and cancel
    Given a back date cover is created
    And user has made partial payment for the cover
    When user cancels the cover
    Then cancellation should be successful
