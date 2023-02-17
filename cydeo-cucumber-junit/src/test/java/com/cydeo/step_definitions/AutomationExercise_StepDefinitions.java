package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationExercise_StepDefinitions {

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {

        Driver.getDriver().get("http://automationexercise.com");
    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String homePage=Driver.getDriver().getTitle();
        Assert.assertEquals(homePage,"Automation Exercise");

    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {
        WebElement clickButton=Driver.getDriver().findElement(By.xpath("//a[@href='/contact_us']"));
        clickButton.click();

    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {

    }
    @Then("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {

    }
    @Then("Upload file")
    public void upload_file() {

    }
    @When("Click {string} button")
    public void click_button(String string) {

    }
    @Then("Click OK button")
    public void click_ok_button() {

    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {

    }
    @Then("Click {string} button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully(String string) {

    }


}
