#Auto generated Octane revision tag
@TID59001REV0.2.0
Feature: Online Shopping Cart

  As a customer
  I want to add items to my shopping cart
  So that I can manage my purchases before checkout

  Scenario: Adding a single item to the shopping cart
    Given I am a logged-in customer
    And I have an empty shopping cart
    When I add a "Blue T-shirt" to the cart
    Then the cart should contain 1 item
    And the cart should display "Blue T-shirt"

  Scenario: Adding multiple items to the shopping cart
    Given I am a logged-in customer
    And I have an empty shopping cart
    When I add a "Red Hoodie" to the cart
    And I add a "Green Cap" to the cart
    Then the cart should contain 2 items
    And the cart should display "Red Hoodie" and "Green Cap"

  Scenario: Removing an item from the shopping cart
    Given I am a logged-in customer
    And I have a "Black Sneakers" in my shopping cart
    When I remove the "Black Sneakers" from the cart
    Then the cart should be empty

  Scenario: Clearing all items from the cart
    Given I am a logged-in customer
    And I have multiple items in my shopping cart
    When I clear all items from the cart
    Then the cart should be empty

  Scenario: Verifying the cart is empty after clearing
    Given I am a logged-in customer
    And I have multiple items in my shopping cart
    When I clear all items from the cart
    Then the cart should contain 0 items

  Scenario: Adding items and checking the cart count
    Given I am a logged-in customer
    And I have an empty shopping cart
    When I add a "Yellow Hat" to the cart
    And I add a "Blue Jeans" to the cart
    Then the cart should contain 2 items
    And the cart should display "Yellow Hat" and "Blue Jeans"
