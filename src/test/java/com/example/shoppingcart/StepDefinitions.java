package com.example.shoppingcart;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepDefinitions {
    private ShoppingCart cart = new ShoppingCart();

    @Given("I am a logged-in customer")
    public void i_am_a_logged_in_customer() {
        // Simulate logged-in customer
    }

    @Given("I have an empty shopping cart")
    public void i_have_an_empty_shopping_cart() {
        cart = new ShoppingCart();
    }

    @When("I add a {string} to the cart")
    public void i_add_a_to_the_cart(String item) {
        cart.addItem(item);
    }

    @Then("the cart should contain {int} item")
    public void the_cart_should_contain_item(int itemCount) {
        Assert.assertEquals(itemCount, cart.getItems().size());
    }

    @Then("the cart should display {string}")
    public void the_cart_should_display(String item) {
        Assert.assertTrue(cart.getItems().contains(item));
    }

    @When("I add a {string} and a {string} to the cart")
    public void i_add_a_and_a_to_the_cart(String item1, String item2) {
        cart.addItem(item1);
        cart.addItem(item2);
    }

    @Then("the cart should contain {int} items")
    public void the_cart_should_contain_items(int itemCount) {
        Assert.assertEquals(itemCount, cart.getItems().size());
    }

    @Then("the cart should display {string} and {string}")
    public void the_cart_should_display_and(String item1, String item2) {
        Assert.assertTrue(cart.getItems().contains(item1));
        Assert.assertTrue(cart.getItems().contains(item2));
    }

    @Given("I have a {string} in my shopping cart")
    public void i_have_a_in_my_shopping_cart(String item) {
        cart.addItem(item);
    }

    @When("I remove the {string} from the cart")
    public void i_remove_the_from_the_cart(String item) {
        cart.removeItem(item);
    }

    @Then("the cart should be empty")
    public void the_cart_should_be_empty() {
        Assert.assertTrue(cart.isEmpty());
    }
}
