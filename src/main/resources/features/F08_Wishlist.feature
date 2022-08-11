@smoke
Feature: Adding Wishlist
  Scenario: click on favorite icon
    When user click on hart icon on from the product
    Then wishlist banner is displayed and in green color
  Scenario: Adding a product to wishlist
      When user click on hart icon on from the product
      And click on wishlist
      Then the wish list value and verify it's bigger than zero