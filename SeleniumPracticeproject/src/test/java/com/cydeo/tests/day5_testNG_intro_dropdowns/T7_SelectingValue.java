package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_SelectingValue {

    WebDriver driver;

    @BeforeMethod

    public void setupMethod() {

        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void dropdown(){
    //3. Click to non-select dropdown


    //4. Select Facebook from dropdown
    Select facebook=new Select(driver.findElement(By.xpath("//a[@class='dropdown-item'](3)")));
    // facebook.selectByVisibleText("Facebook");
    }



}
/*




5. Verify title is “Facebook - Log In or Sign Up”
 */