Feature: JCrew shopping bag check out.
  As a user I should able to put items in
  the shopping bag and check it out.

  @JCrew
  Scenario:
    Given User is on the home page
    #When User clicks on the menu
    When User clicks on the Woman
    And User  chooses Sweaters
    And User chooses an item
    And User chooses color of item
    And User chooses the size of item
    And User chooses the quantity of item
    Then User clicks Add To Bag button
    Then User clicks on Shopping Bag sign



