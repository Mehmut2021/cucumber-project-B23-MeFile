package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DatatableStepDef {

    @Given("I have a {string}")
    //@Given("I have a {word}")
    public void i_have_a(String animal) {
        System.out.println("Given I have an "+ animal);
    }
    @When("I call their names")
    public void i_call_their_names() {
        System.out.println("When I call their names ");

    }
    @Then("They come to me")
    public void they_come_to_me() {
        System.out.println("They come to me");

    }

    @Given("I have a following animals")
    public void i_have_a_following_animals(List<String> animalLst) {
        System.out.println("animalLst = " + animalLst);
    }

    @Then("they come to me.")
    public void theyComeToMe() {
        System.out.println("Then they come to me");
    }
}
