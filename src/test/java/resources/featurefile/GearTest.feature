@regression
Feature: GearPage
  As User I want to verify the gear page on luma website

  Scenario: User should add products successFully to shopping cart
    Given I am on home page
    When I Mouse Hover on Gear Menu
    And I Click on Bags
    And I Click on Product Name ‘Overnight Duffle’
    And I Verify the text "Overnight Duffle"
    And I Change Qty "3"
    And I Click on ‘Add to Cart’ Button
    And I Verify the texts "You added Overnight Duffle to your shopping cart."
    And I click on ‘shopping cart’ Link into message

    And I Verify the product price "$135.00"
    And I change quantity "5"
    And I set Update Cart
    And I verify ProductPrice

