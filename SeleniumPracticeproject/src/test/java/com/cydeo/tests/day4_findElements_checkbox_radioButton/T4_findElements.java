package com.cydeo.tests.day4_findElements_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        //Locate all the links in the page
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));

        //Print out the number of the links on the page
        System.out.println("allLinks.size() = " + allLinks.size());

        //Print out the texts of the links
        //Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {

            System.out.println("Text of link: "+ each.getText());
            System.out.println("HREF Values: "+ each.getAttribute("href"));

        }




    }
}
