package com.mycompany.app;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class AppTestSteps {
    private App app;
    private String prefixedMessage;
    private int characterCount;
    private String replacedMessage;
    private int charCount;


    @Given("an app instance")
    public void an_app_instance() {
        app = new App();
    }

    @Then("the message should be {string}")
    public void the_message_should_be(String message) {
        assertEquals(message, app.getMessage());
    }

    @Then("the message should be long")
    public void the_message_should_be_long() {
        assertTrue(app.isMessageLong());
    }

    @When("I add the prefix {string} to the message")
    public void i_add_the_prefix_to_the_message(String prefix) {
        prefixedMessage = app.getMessageWithPrefix(prefix);
    }

    @Then("the message should start with {string}")
    public void the_message_should_start_with(String prefix) {
        assertTrue(prefixedMessage.startsWith(prefix));
    }

    @When("I count the character {string} in the message")
    public void i_count_the_character_in_the_message(String character) {
        charCount = app.countCharacter(character.charAt(0));
    }


    @Then("the count should be {int}")
    public void the_count_should_be(int count) {
        assertEquals(count, characterCount);
    }

    @When("I replace {string} with {string} in the message")
    public void i_replace_with_in_the_message(String oldStr, String newStr) {
        replacedMessage = app.replaceInMessage(oldStr, newStr);
    }

    @Then("the replaced message should be {string}")
    public void the_replaced_message_should_be(String message) {
        assertEquals(message, replacedMessage);
    }

}
