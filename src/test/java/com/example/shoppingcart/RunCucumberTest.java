package com.example.shoppingcart;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import java.nio.file.*;
import java.util.stream.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.example.shoppingcart")
public class RunCucumberTest {
    static {
        try {
            System.out.println("Current directory: " + System.getProperty("user.dir"));
            Files.list(Paths.get("src/test/resources/features"))
                 .forEach(path -> System.out.println(path.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
