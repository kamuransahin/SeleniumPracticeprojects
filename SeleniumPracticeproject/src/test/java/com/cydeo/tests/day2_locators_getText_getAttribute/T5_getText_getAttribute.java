package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");

        //Verify header text is as expected
        WebElement headerText=driver.findElement(By.tagName("h2"));

        //Expected:Registration form
        String expectedHeaderText= "Registration form";
        String actualHeaderText=headerText.getText();

        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Header text verification PASSED!");
        }else {
            System.out.println("Header text verification FAILED!!");
        }

        //Locate "First name" input box
        WebElement firstName= driver.findElement(By.name("firstname"));

        //Verify placeholder attribute's value is as expected:
        //Expected: first name
        String expectedPlaceHolder="first name";
        String actualPlaceHolder= firstName.getAttribute("placeholder");

        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Placeholder text verification PASSED!");
        }else {
            System.out.println("Placeholder text verification FAILED!");
        }
       // driver.close();
    }
}
