@smoke
Feature: Women Page
  As User I want to verify the women page on luma website

  Scenario: User should verify the sortBy ProductName filter
    Given I am on home page
    When I Mouse Hover on Women Menu
    And I Mouse Hover on Tops
    And I Click on Jackets
    And I Select Sort By filter “Product Name”
    And I Verify the products name display inalphabetical order

    Scenario: User should verify the sort by price filter
      Given I am on home page
      When I Mouse Hover on Women Menu
      And I Mouse Hover on Tops
      And I Click on Jackets
      And I  Select Sort By filter “Price”
      And I  Verify the products price display in Low to High

