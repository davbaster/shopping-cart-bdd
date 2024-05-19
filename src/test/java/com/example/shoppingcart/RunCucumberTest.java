package com.example.shoppingcart;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.example.shoppingcart")
public class RunCucumberTest {
    static {
        // This line will print the current working directory to the console when tests are initialized
        System.out.println("Current directory: " + System.getProperty("user.dir"));
    }
}
