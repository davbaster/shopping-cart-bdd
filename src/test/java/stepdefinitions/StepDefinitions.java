package stepdefinitions;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
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

    @Then("the cart should contain {int} item")
    public void the_cart_should_contain_item(int itemCount) {
        Assert.assertEquals(itemCount, shoppingCart.size());
    }

    @Then("the cart should display {string}")
    public void the_cart_should_display(String expectedItems) {
        String[] items = expectedItems.split(" and ");
        Assert.assertTrue(shoppingCart.containsAll(List.of(items)));
    }

    @Then("the cart should be empty")
    public void the_cart_should_be_empty() {
        Assert.assertTrue(shoppingCart.isEmpty());
    }
}
