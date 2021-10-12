package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JaobsStepDef {

    @Given("student attend all the classes")
    public void student_attend_all_the_classes() {
        System.out.println("Condition 1: student attends all classes");
    }
    @When("student learn all the topics")
    public void student_learn_all_the_topics() {
        System.out.println("When student learns all subjects");
    }
    @Then("student should be ready for the job")
    public void student_should_be_ready_for_the_job() {
        System.out.println("Student is ready for the job");
    }


    @Given("student is prepared")
    public void student_is_prepared() {
        System.out.println("student is prepared");
    }
    @When("student upload their resume")
    public void student_upload_their_resume() {
        System.out.println("student upload their resume");
    }
    @Then("student will be in the market")
    public void student_will_be_in_the_market() {
        System.out.println("student will be in the market");
    }

    @Given("you are prepared for the job")
    public void you_are_prepared_for_the_job() {
        System.out.println("Condition 1: you are prepared for the job");
    }
    @Given("you are in the market")
    public void you_are_in_the_market() {
        System.out.println("Condition 2: you are in the market");
    }
    @When("you apply for {int} jobs a day")
    public void you_apply_for_jobs_a_day(Integer jobCount) {
        System.out.println("When you apply for " + jobCount+" jobs a day");
    }
    @Then("you will eventually ge the job")
    public void you_will_eventually_ge_the_job() {
        System.out.println("Result: you will eventually ge the the job");
    }


}
