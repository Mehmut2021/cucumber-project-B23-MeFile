package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_Search_StepDef {
    GoogleHomePage homePage;
    @Given("user is at home page")
    public void user_is_at_home_page() {
        homePage = new GoogleHomePage();
        homePage.goTo();

    }
    @When("user search for keyword {string}")
    public void user_search_for_keyword(String string) {
        homePage.searchKeyword(string);
    }
    @Then("we should see result page")
    public void we_should_see_result_page() {

    }
    @Then("the title should start with {string}")
    public void the_title_should_start_with(String KeyWord) {

    }
}
