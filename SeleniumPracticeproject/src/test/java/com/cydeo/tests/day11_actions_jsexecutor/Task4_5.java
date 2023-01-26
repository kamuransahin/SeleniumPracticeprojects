package com.cydeo.tests.day11_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task4_5 {

    @Test
    public void scroll_test(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com");


        BrowserUtils.sleep(2);
        //3- Scroll down to “Powered by CYDEO”
        //Create object of Actions and pass our "driver"instance
        Actions actions=new Actions(Driver.getDriver());
        WebElement poweredByCydeo=Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

       //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(poweredByCydeo).pause(2000).perform();

        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();
       // WebElement homeLink=Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
       // actions.moveToElement(homeLink);


    }
}
