package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue="com/cydeo/step_definitions",
        dryRun = false,
        tags = "student"

)
public class CukesRunner {
}

  /*

  UNDERSTANDING HOW FEATURE FILES AND STEP DEFINITIONS WORK TOGETHER

  TC#50: Create a new feature file and new scenarios
  1. Create a new feature file named Login.feature
  2. Create 3 new scenarios from the below provided user story.
  3. User Story:
  As a user, I should be able to login with correct credentials to different accounts.
    And dashboard should be displayed.
  Accounts are: librarian, student, admin
  4. Create a new step definition class under step_definitions package
  named: LoginStepDefs
  5. Run the code. Get the step definitions from the console
  6. No Java-selenium code implementation needed. Just add printing line in the
  implementation regarding what should be happening when the code is ran.
  Ex: “User is on the login page”

    */