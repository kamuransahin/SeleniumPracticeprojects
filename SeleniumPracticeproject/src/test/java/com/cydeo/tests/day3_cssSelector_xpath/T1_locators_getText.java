package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver=new ChromeDriver();

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com/");

        WebElement username=driver.findElement(By.className("login-inp"));
        username.sendKeys("incorrect");

        WebElement password=driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        WebElement loginBtn=driver.findElement(By.className("login-btn"));
        loginBtn.click();

        WebElement errorMessage=driver.findElement(By.className("errortext"));

        String actualErrorMessage=errorMessage.getText();
        String expectedErrorMessage="Incorrect login or password";

        if (actualErrorMessage.equals(expectedErrorMessage))
            System.out.println("Error message verification PASSED!");
        else {
            System.out.println("Error message verification FAILED!");
        }

        //driver.close();
    }
}
