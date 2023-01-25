package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
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

        WebElement poweredByCydeo=Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

        Actions actions=new Actions(Driver.getDriver());

        //3- Scroll down to “Powered by CYDEO”

        BrowserUtils.sleep(2);
        actions.moveToElement(poweredByCydeo);

        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(poweredByCydeo).perform();
       // actions.keyDown("Powered by ").perform();

        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button
        WebElement homeLink=Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));
        //actions.sendKeys().keyUp(Keys.PAGE_UP).perform();
        actions.moveToElement(homeLink);


    }
}
