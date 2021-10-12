
Feature: Getting jobs
  As a student I should be able to get job after learning all good tools


  @jobs
  Scenario: student prepare for a job
    Given student attend all the classes
    When student learn all the topics
    Then student should be ready for the job


    @addition
  Scenario: student go to market
    Given student is prepared
    When student upload their resume
    Then student will be in the market


@smoke
  Scenario: student ready for the job
    Given you are prepared for the job
    And you are in the market
    When you apply for 50 jobs a day
    Then you will eventually ge the job
