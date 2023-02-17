package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class ContactUs_StepDefinitions {

    @Given("Navigate to website")
    public void navigate_to_website() {

        Driver.getDriver().get("https://automationexercise.com/");
    }
    @Then("Click on contact us button")
    public void click_on_contact_us_button() {
        WebElement contactUsButton=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-envelope']"));
        contactUsButton.click();

    }
    @Then("Type Name")
    public void select_subject_heading() {
        WebElement name=Driver.getDriver().findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("Group 6");

    }
    @Then("Type Email")
    public void type_email() {
        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("group6@cydeo.com");
    }
    @Then("Type Subject")
    public void type_order_reference() {
        WebElement subject=Driver.getDriver().findElement(By.xpath("//input[@name='subject']"));
        subject.sendKeys("cucumber");

    }
    @Then("Type a Message")
    public void type_a_message() {
        WebElement messageBar=Driver.getDriver().findElement(By.xpath("//textarea[@id='message']"));
        messageBar.sendKeys("Awesome mentor and her group");

    }
    @When("Click on Submit button")
    public void click_on_submit_button() {
        WebElement submitButton=Driver.getDriver().findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();

        Alert alert=Driver.getDriver().switchTo().alert();

        alert.accept();

    }
    @Then("Verify success message")
    public void verify_success_message() {
        String expectedText="Success! Your details have been submitted successfully.";

        WebElement successMessage=Driver.getDriver().findElement(By.xpath("//div[.='Success! Your details have been submitted successfully.']"));
        String actualText=successMessage.getText();
        Assert.assertEquals(expectedText,actualText);

    }
}
