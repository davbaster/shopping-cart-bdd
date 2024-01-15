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
        // Simulate the customer login process
        isLoggedIn = true;
    }

    @Given("I have an empty shopping cart")
    public void i_have_an_empty_shopping_cart() {
        shoppingCart.clear();
    }

    @Given("I have a {string} in my shopping cart")
    public void i_have_item_in_my_shopping_cart(String item) {
        shoppingCart.clear(); // Clear previous items for simplicity
        shoppingCart.add(item);
    }

    @When("I add a {string} to the cart")
    public void i_add_a_to_the_cart(String item) {
        shoppingCart.add(item);
    }

    @When("I remove the {string} from the cart")
    public void i_remove_the_from_the_cart(String item) {
        shoppingCart.remove(item);
    }

    @Then("the cart should contain {int} items")
    public void the_cart_should_contain_items(Integer itemCount) {
        // Implement the step
        Assertions.assertEquals(itemCount, shoppingCart.size(), "The number of items in the cart is incorrect.");
    }

    @Then("the cart should display {string} and {string}")
    public void the_cart_should_display_and(String firstItem, String secondItem) {
        // Implement the step
        Assertions.assertTrue(shoppingCart.contains(firstItem) && shoppingCart.contains(secondItem),
                "The cart does not contain the expected items.");
    }

    @Then("the cart should be empty")
    public void the_cart_should_be_empty() {
        Assertions.assertTrue(shoppingCart.isEmpty());
    }
}
