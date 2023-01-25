package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CRM_Utilities {

/*
Method #1 info:
• Name: crm_login()
• Return type: void
• Arg1: WebDriver

This method will login with helpdesk1@cybertekschool.com
user when it is called
 */
    public static void crm_login(WebDriver driver){

        //3. Enter valid username
        WebElement userNameButton=driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userNameButton.sendKeys("helpdesk1@cybertekschool.com");
        //Thread.sleep(3000);

        //4. Enter valid password
        WebElement passwordButton=driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        passwordButton.sendKeys("UserUser");
        //Thread.sleep(3000);

        //5. Click to `Log In` button
        WebElement LogIn=driver.findElement(By.xpath("//input[@type='submit']"));
        LogIn.click();


    }
    /*
        Method #2 info:
    • Name: login_crm()
    • Return type: void
    • Arg1: WebDriver
    • Arg2: String username
    • Arg3: String password

     */
    public static void crm_login(WebDriver driver,String username, String password){

        //3. Enter valid username
        WebElement userNameButton=driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userNameButton.sendKeys(username);
        //Thread.sleep(3000);

        //4. Enter valid password
        WebElement passwordButton=driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        passwordButton.sendKeys(password);
        //Thread.sleep(3000);

        //5. Click to `Log In` button
        WebElement LogIn=driver.findElement(By.xpath("//input[@type='submit']"));
        LogIn.click();


    }

    /*1. Create a new method for title verification
        Method info:
    • Name: verifyTitle()
    • Return type: void
    • Arg1: WebDriver
    • Arg2: String expectedTitle
     */

    public static void verifyTitle(WebDriver driver,String expectedTitle){

        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
