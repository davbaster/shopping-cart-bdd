Feature: Online Shopping Cart 2

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
