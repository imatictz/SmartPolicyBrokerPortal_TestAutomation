Feature: Dashboard Language Switch
  @All
  Scenario: Validate dashboard elements in Swahili language after language switch
   When user is on dashboard page able to view "Tazama Dashibodi"
   Then user validate all dashboard page elements
   |Element|Text|
   |Hi     |Habari|
   |UserName|TestProject|
   |Clients|Wateja|
   |Quotations|Manukuu|
   |Risk Notes|Vidokezo vya Hatari|
   |Claims|Madai|
   |Renewals|Marejeleo|
   |Reports|Ripoti|
   |Knowledge Base|Msingi wa Maarifa|
   |Knowledge Base Description |Msingi wa maarifa utaorodhesha taarifa zote za utendakazi kwenye Smart Policy Platform ili kukupa mwongozo wa matumizi bora ya mfumo.|
   |Support Forum|Jukwaa la Usaidizi|
   |Support Forum Description|Jukwaa linawahimiza watumiaji kuchangia na kuuliza maswali kwa Jumuiya ya Smart Policy. Wazo ni kukusanya Pamoja Jumuiya ya Watumiaji wa Smart Policy na kuwa sehemu ya jukwaa kubwa kwa matumizi bora ya mfumo.|
   |FAQ|Maswali Yanayoulizwa Mara kwa Mara|
   |FAQ Description|Sehemu hii itajibu maswali yanayoulizwa mara kwa mara ili kusaidia watumiaji kuelewa vizuri.|
   |Whatsapp Support|Msaada wa Whatsapp|
   |Whatsapp Support1|1. +255 22 212 72 17 (Simu ya Nyumbani)|
   |Whatsapp Support2|2. +255 22 212 72 18 (Simu ya Nyumbani)|
   |Whatsapp Support3|3. +255 746 986 110 (Kituo cha Simu)|
   |Whatsapp Call Support|Mawasiliano ya Usaidizi wa Whatsapp / Simu.|
   |Skype Support|Msaada wa Skype|
   |Skype Support1|1. smartpolicy_1|
   |Skype Support2|1. smartpolicy_2|
   |Skype Support IDs|Tafadhali ongeza vitambulisho hivi kwenye skype kwa msaada.|
   |Email Support|Msaada wa Barua pepe|
   |SmartPolicy Email|smartpolicy@itl.co.tz|
   |Email Us|Kwa maswali yoyote, tutumie barua pepe kwenye anwani ya barua pepe hapo juu.|
  