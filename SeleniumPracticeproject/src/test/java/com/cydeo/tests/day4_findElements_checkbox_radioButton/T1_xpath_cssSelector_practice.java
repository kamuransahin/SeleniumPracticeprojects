package com.cydeo.tests.day4_findElements_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

        //syntax1
       WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));
       //syntax2
       WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));

      // WebElement homeLink_ex3= driver.findElement(By.cssSelector("a[href=/]"));


       //locate parent element to h2
       WebElement header_ex1= driver.findElement(By.cssSelector("div.example>h2"));

       //locate header using xpath using web element text 'Forgot Password'
        //WebElement header_ex2= driver.findElement(By.xpath("//h2[.='Forgot Password']");
       WebElement header_ex2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //Email text
        WebElement emailLabel_ex1= driver.findElement(By.xpath("//label[@for='email']"));

        //Email inbox
        WebElement emailInbox_ex1=driver.findElement(By.xpath("//input[@type='text']"));
      //  WebElement emailInbox_ex2=driver.findElement(By.xpath("//input[contains(pattern,'a-z]"));

        //Retrieve password
        WebElement retrievePassword=driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));

        //Powered by Cydeo
        WebElement poweredByCydeoText=driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel_ex1.isDisplayed() = " + emailLabel_ex1.isDisplayed());
        System.out.println("emailInbox_ex1.isDisplayed() = " + emailInbox_ex1.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

    }
}
