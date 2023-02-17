package com.cydeo.tests.day12_POM_Syncronization;

import com.cydeo.pages.DynamicLoadPage1;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T5_DynamicLoadPage1 {

    @Test
    public void Dynamically_Loaded_Page_Elements_1(){

        //TC#5 : Dynamically Loaded Page Elements 1
        //1. Go to https://practice.cydeo.com/dynamic_loading/1

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoadPage1 dynamicLoadPage1=new DynamicLoadPage1();

        //2. Click to start
        dynamicLoadPage1.startButton.click();

        //3. Wait until loading bar disappears
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoadPage1.loadingBar));

        //4. Assert username inputBox is displayed
        Assert.assertTrue(dynamicLoadPage1.username.isDisplayed());

        // 5. Enter username: tomsmith
        dynamicLoadPage1.username.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamicLoadPage1.password.sendKeys("password");

        //7. Click to Submit button
        dynamicLoadPage1.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoadPage1.errorMessage.isDisplayed());


    }


}
