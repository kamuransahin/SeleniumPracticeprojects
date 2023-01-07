package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

       WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();

       driver.get("https://login1.nextbasecrm.com/");

       // syntax: "tagName[attribute='value']"
       // WebElement signInButton=driver.findElement(By.className("login-btn"));
       // WebElement signInButton=driver.findElement(By.cssSelector("input[class='login-btn']"));
       WebElement signInButton=driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText="Log In";
        String actualButtonText= signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);
        
        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification passed!");
        }else {
            System.out.println("Log In button text verification failed!");

        }
    }
}
