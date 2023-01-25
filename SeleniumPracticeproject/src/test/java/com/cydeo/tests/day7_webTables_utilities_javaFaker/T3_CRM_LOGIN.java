package com.cydeo.tests.day7_webTables_utilities_javaFaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {

    @Test
    public void crm_login_test() throws InterruptedException {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement userNameButton = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        userNameButton.sendKeys("helpdesk1@cybertekschool.com");
        Thread.sleep(3000);

        //4. Enter valid password
        WebElement passwordButton = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        passwordButton.sendKeys("UserUser");
        Thread.sleep(3000);

        //5. Click to `Log In` button
        WebElement LogIn = driver.findElement(By.xpath("//input[@type='submit']"));
        LogIn.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "My tasks");
    }

    @Test
    public void crm_login_test_2() throws InterruptedException {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver);

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "My tasks");
    }

    @Test
    public void crm_login_test_3() throws InterruptedException {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk
        CRM_Utilities.crm_login(driver, "helpdesk1@cybertekschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "My tasks");
    }

    @Test
    public void verifyTitle_test() throws InterruptedException {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver,"helpdesk1@cybertekschool.com","UserUser");

        CRM_Utilities.verifyTitle(driver, "My tasks");


    }
}


