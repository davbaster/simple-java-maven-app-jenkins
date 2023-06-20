package com.mycompany.app;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTestSteps {
    private App app1;
    private App app2;
    private App app;

    @Given("two app instances")
    public void two_app_instances() {
        app1 = new App();
        app2 = new App();
    }

    @Then("they should have the same message")
    public void they_should_have_the_same_message() {
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Given("an app instance")
    public void an_app_instance() {
        app = new App();
    }

    @Then("it should return the message {string}")
    public void it_should_return_the_message(String message) {
        assertEquals(message, app.getMessage());
    }
}
