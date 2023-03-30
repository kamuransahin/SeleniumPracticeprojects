package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login_StepDefinitions {
    LoginPage loginPage=new LoginPage();
   /* @Given("user is on CRM home page")
    public void userIsOnHomePage() {

        loginPage.homepage.isDisplayed();
    }*/


    @Given("user is enter {string} and {string}")
    public void userIsEnterAnd(String login, String password) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.username.sendKeys(login);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("user should see home page")
    public void userShouldSeeHomePage() {
        Assert.assertTrue(loginPage.homepage.isDisplayed());
        //Driver.closeDriver();
    }

    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        Assert.assertTrue(loginPage.incorrectLoginOrPassword.isDisplayed());
        //Driver.closeDriver();
    }

}
