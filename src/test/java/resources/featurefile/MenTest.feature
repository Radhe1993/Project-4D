@sanity
Feature: Men page
  As a User I want to verify Men page of luma website

  Scenario: User should add product successfully to shopping cart
    Given I am on home page
    When I Mouse Hover on Men Menu
    And I Mouse Hover on Bottoms
    And I Click on Pants
    And I Mouse Hover on product name ‘Cronus Yoga Pant’
    And I click on size 32.
    And I click on colour Black
    And I click on ‘Add To Cart’ Button
    And I should Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    And I Click on ‘shopping cart’ Link into message
    And I Verify the text "Shopping Cart"
    And I Verify the product name "Cronus Yoga Pant"
    And I Verify the product size "32"
    And I Verify the product colour "Black"