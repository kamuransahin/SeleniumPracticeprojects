package com.cydeo.step_definitions;

import com.cydeo.pages.Workgroup;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class Workgroup_StepDefinitions {

    Workgroup workgroup = new Workgroup();

    @Given("user is enter username and password")
    public void userIsEnterAnd() {

    }

    @Then("user should click the Workgroups button")
    public void user_should_click_the_workgroups_button() {

        workgroup.workgroupsButton.click();
    }

    @When("user click the join button under New Corporate Identity project")
    public void user_click_the_join_button_under() {
        workgroup.corporateJoin.click();
        workgroup.corporateProjectButton.click();
        workgroup.revokeGroup.click();
    }

    @When("user click the join button under New company web site development")
    public void user_click_the_join_button_under_new_company_web_site_development() {
        workgroup.companyJoin.click();
        workgroup.newCompanyButton.click();
        workgroup.revokeGroup.click();
    }

    @When("user click the join button under New product development")
    public void user_click_the_join_button_under_new_product_development() {
        workgroup.productJoin.click();
        workgroup.newProductButton.click();
        workgroup.revokeGroup.click();
    }

    @When("user click the join button under PR and advertising")
    public void user_click_the_join_button_under_pr_and_advertising() {

        workgroup.prJoin.click();
        workgroup.prAdvertisingButton.click();
        workgroup.revokeGroup.click();
    }

    @When("user click the join button under Sales")
    public void user_click_the_join_button_under_sales() {

        workgroup.salesJoin.click();
        workgroup.salesButton.click();
        workgroup.revokeGroup.click();
    }

    @When("user click the join button under Technology")
    public void user_click_the_join_button_under_technology() {
        workgroup.technologyJoin.click();
        workgroup.technologyButton.click();
        workgroup.revokeGroup.click();
        Driver.closeDriver();
    }


    @Then("user should click the SortBy button")
    public void userShouldClickTheSortByButton() {
        workgroup.sortByButton.click();
    }

    @Then("user can click ABC order button")
    public void userCanClickABCOrderButton() {
        workgroup.selectAbcOrderButton.click();
        Driver.getDriver().findElement(By.xpath("//*[.='ABC order']")).isDisplayed();

    }

    @Then("user can click Time joined button")
    public void userCanClickTimeJoinedButton() {
        workgroup.sortByButton.click();
        workgroup.selectTimeJoinedButton.click();
        Driver.getDriver().findElement(By.xpath("//*[.='Time joined']")).isDisplayed();

    }

    @Then("user can click Number of members button")
    public void userCanClickNumberOfMembersButton() {
        workgroup.sortByButton.click();
        workgroup.selectNumOfMembersButton.click();
        Driver.getDriver().findElement(By.xpath("//*[.='Number of members']")).isDisplayed();

    }


    @Then("user can click Last active button")
    public void userCanClickLastActiveButton()  {
        workgroup.sortByButton.click();
        workgroup.selectLastActiveButton.click();
        Driver.getDriver().findElement(By.xpath("//*[.='Last active']")).isDisplayed();

    }

    @Then("user can click Time created button")
    public void userCanClickTimeCreatedButton() {
        workgroup.sortByButton.click();
        workgroup.selectTimeCreatedButton.click();
        Driver.getDriver().findElement(By.xpath("//*[.='Time created']")).isDisplayed();
    }

   @Then("user can click Last viewed button")
    public void userCanClickLastViewedButton()  {
       workgroup.sortByButton.click();
        workgroup.selectLastViewedButton.click();
        Driver.getDriver().findElement(By.xpath("//*[.='Last viewed']")).isDisplayed();


    }
}
