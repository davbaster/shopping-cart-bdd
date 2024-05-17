package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;

public class StepDefinitions {

    private List<String> shoppingCart = new ArrayList<>();
    private boolean isLoggedIn = false;

    @Given("I am a logged-in customer")
    public void i_am_a_logged_in_customer() {
        // Simulate the customer logging in
        isLoggedIn = true;
    }

    @Given("I have an empty shopping cart")
    public void i_have_an_empty_shopping_cart() {
        // Clear any items in the shopping cart for simplicity
        shoppingCart.clear();
    }

    @Given("I have a {string} in my shopping cart")
    public void i_have_a_in_my_shopping_cart(String item) {
        // Clear previous items for simplicity
        shoppingCart.clear();
        shoppingCart.add(item);
    }

    @Given("I have multiple items in my shopping cart")
    public void i_have_multiple_items_in_my_shopping_cart() {
        // Add multiple items to the cart
        shoppingCart.clear();
        shoppingCart.add("Item1");
        shoppingCart.add("Item2");
    }

    @When("I add a {string} to the cart")
    public void i_add_a_to_the_cart(String item) {
        shoppingCart.add(item);
    }

    @When("I remove the {string} from the cart")
    public void i_remove_the_from_the_cart(String item) {
        shoppingCart.remove(item);
    }

    @When("I clear all items from the cart")
    public void i_clear_all_items_from_the_cart() {
        shoppingCart.clear();
    }

    @Then("the cart should contain {int} item")
    public void the_cart_should_contain_item(Integer itemCount) {
        Assertions.assertEquals(itemCount.intValue(), shoppingCart.size(), "The number of items in the cart is incorrect.");
    }

    @Then("the cart should display {string}")
    public void the_cart_should_display(String item) {
        Assertions.assertTrue(shoppingCart.contains(item), "The cart does not contain the expected item: " + item);
    }

    @Then("the cart should display {string} and {string}")
    public void the_cart_should_display_and(String item1, String item2) {
        Assertions.assertTrue(shoppingCart.contains(item1) && shoppingCart.contains(item2), "The cart does not contain the expected items: " + item1 + " and " + item2);
    }

    @Then("the cart should be empty")
    public void the_cart_should_be_empty() {
        Assertions.assertTrue(shoppingCart.isEmpty(), "The cart is not empty.");
    }
}
