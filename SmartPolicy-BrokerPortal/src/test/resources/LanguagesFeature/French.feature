Feature: Dashboard Language Switch
  @All
  Scenario: Validate dashboard elements in French language after language switch
   When user is on dashboard page able to view "Voir le tableau de bord"
   Then user validate all dashboard page elements
   |Element|Text|
   |Hi     |Salut|
   |UserName|TestProject|
   |Clients|Clients|
   |Quotations|Devis|
   |Risk Notes|Notes de Risque|
   |Claims|Réclamations|
   |Renewals|Renouvellements|
   |Reports|Rapports|
   |Knowledge Base|Base de Connaissances|
   |Knowledge Base Description |La base de connaissances répertoriera toutes les informations fonctionnelles sur la plateforme Smart Policy pour vous guider dans une meilleure utilisation du système.|
   |Support Forum|Forum de Support|
   |Support Forum Description|Le forum encourage les utilisateurs à contribuer et à poser des questions pour la communauté Smart Policy. L'idée est de rassembler la communauté des utilisateurs de Smart Policy et de faire partie d'un forum plus large pour une meilleure utilisation du système.|
   |FAQ|FAQ|
   |FAQ Description|Cette section répondra aux questions fréquemment posées pour aider les utilisateurs à mieux comprendre.|
   |Whatsapp Support|Support Whatsapp|
   |Whatsapp Support1|1. +255 22 212 72 17 (Ligne fixe)|
   |Whatsapp Support2|2. +255 22 212 72 18 (Ligne fixe)|
   |Whatsapp Support3|3. +255 746 986 110 (Centre d'appels)|
   |Whatsapp Call Support|Contacts de support Whatsapp / Appel.|
   |Skype Support|Support Skype|
   |Skype Support1|1. smartpolicy_1|
   |Skype Support2|1. smartpolicy_2|
   |Skype Support IDs|Veuillez ajouter ces identifiants sur skype pour obtenir de l'aide.|
   |Email Support|Support par e-mail|
   |SmartPolicy Email|smartpolicy@itl.co.tz|
   |Email Us|Pour toute question, envoyez-nous un e-mail à l'adresse ci-dessus.|
  