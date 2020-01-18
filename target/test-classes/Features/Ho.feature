Feature: To validate the Adactin hotel booking

  Scenario Outline: To validate the Adactin hotel webpage with valid crendentials
    Given User should in Adactin hotel login page
    When User should Enter "<User>" and "<Pass>" and click login
    And User should fill the Search page detalis "<Location>" and "<Hotel>" and "<Roomtype>" and click next page
    And User should select hotel
    And User should fill Book a hotel page "<Fname>" and "<Lname>" and "<Address>" and "<Cardtype>" and "<Expdate>" and book
    Then User should have booked the hotel room

    Examples: 
      | User        |  | Pass   |  | Location |  | Hotel       |  | Roomtype |  | Fname   |  | Lname |  | Address                            |  | Cardtype |  | Expdate |
      | Hemanth7010 |  | qwerty |  | London   |  | Hotel Creek |  | Double   |  | Hemanth |  | K     |  | Customscolony,thoraipakkam,chennai |  | VISA     |  | June    |
