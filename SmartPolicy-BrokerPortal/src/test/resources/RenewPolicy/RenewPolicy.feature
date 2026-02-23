@All
Feature: Renew Policy

Background: Launch browser and open application
  When user navigate on operation dropdown
  And user navigate on policy renewals option
  Then user click on renew policy option

@AllFields
Scenario Outline: (RenewPolicy) Verify user able to create quotation for renewing policy - <CoverType>
  # Renew
  When user enter "01/01/2025" as expiry from date
  And user enter "<CoverType>" as cover information
  Then user click on search button
  When user click on renew option
  Then user click on renew button for renewal confirmation

  # New Quote
  When user click on quotations menu
  Then user able to view "Awaiting Receipt" as status

  @Accident
Examples:
  |            CoverType            |
  | Accidental Damage               |

  @Bonds
Examples:
  |            CoverType            |
  | Bonds                           |
  
  @Burglary
Examples:
  |            CoverType            |
  | Burglary/Theft                  |
  
  @Creditlife
Examples:
  |            CoverType            |
  | Credit life                     |
  
  @Fidelity
Examples:
  |            CoverType            |
  | Fidelity                        |
  
  @FireClass
Examples:
  |            CoverType            |
  | Fire Class                      |
  
  @GroupLife
Examples:
  |            CoverType            |
  | Group Life                      |
  
  @Medical
Examples:
  |            CoverType            |
  | Medical                         |
  
  @Pension
Examples:
  |            CoverType            |
  | Pension                         |
  
  @Motor
Examples:
  |            CoverType            |
  | Mcycle-2                        |
  
  @EducareLifeInsurance
Examples:
  |            CoverType            |
  | Educare Life Insurance          |

@TravelInsurance
Examples:
  |            CoverType            |
  | Travel Insurance                |
  
   @Marine
Examples:
  |            CoverType            |
  | Marine                          |
  
   @PackagePolicy
Examples:
  |            CoverType            |
  | Package Policy                  |

  
