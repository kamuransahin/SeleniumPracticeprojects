package com.cydeo.tests.AutomationExercises;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test25_VerifyScrollUpWithArrow {

    @Test
    public void verify_scroll_up_with_arrow(){

     //1. Launch browser
     //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

     //3. Verify that home page is visible successfully
        String homePage=Driver.getDriver().getTitle();
        Assert.assertTrue(homePage.equals("Automation Exercise"));

     //4. Scroll down page to bottom
        WebElement copyright=Driver.getDriver().findElement(By.xpath("//p[@class='pull-left']"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(copyright).perform();


     //5. Verify 'SUBSCRIPTION' is visible

        WebElement subscription=Driver.getDriver().findElement(By.xpath("//h2[.='Subscription']"));
        Assert.assertTrue(subscription.isDisplayed());


     //6. Click on arrow at bottom right side to move upward
        WebElement arrow=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-angle-up']"));
        arrow.click();


     //7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation
     //Engineers' text is visible on screen

        WebElement fullFledgedText=Driver.getDriver().findElement(By.xpath("//h2[.='Full-Fledged practice website for Automation Engineers']"));
        Assert.assertTrue(fullFledgedText.isDisplayed());

    }
}
/*








 */