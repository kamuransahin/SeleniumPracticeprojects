package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_RegistrationForm {

    WebDriver driver;
    @Test
    public void registration_form_test(){

        //1. Open browser
        driver= Driver.getDriver();

        //2. Go to website: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
       // Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));


        Faker faker=new Faker();
        //3. Enter first name
        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.bothify("???-###-???").replaceAll("-",""));

        //6. Enter email address
        WebElement eMail=driver.findElement(By.xpath("//input[@name='email']"));
        eMail.sendKeys(faker.internet().emailAddress());

        //7. Enter password
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());

        //8. Enter phone number
        WebElement phoneNumber=driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.bothify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement radioButtonGender=driver.findElement(By.xpath("//input[@value='male']"));
        radioButtonGender.click();

        //10. Enter date of birth
       WebElement dateOfBirth=driver.findElement(By.xpath("//input[@name='birthday']"));
       dateOfBirth.sendKeys("01/01/1981");

        //11. Select Department/Office
        Select departmentDropdown=new Select(driver.findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByValue("DE");

        //12. Select Job Title
        Select jobTitleDropdown=new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropdown.selectByIndex(faker.number().numberBetween(1,9));

        //13. Select programming language from checkboxes
        WebElement checkBoxJava= driver.findElement(By.xpath("//input[@value='java']"));
        checkBoxJava.click();

        //14. Click to sign up button
        WebElement signInButton= driver.findElement(By.xpath("//button"));
        signInButton.click();
        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.
        String expectedVerifyMessage="You've successfully completed registration!";
        WebElement verifyMessage=driver.findElement(By.xpath("//p"));
        String actualVerifyMessage=verifyMessage.getText();

        Assert.assertEquals(expectedVerifyMessage,actualVerifyMessage);
    }
}
/*
TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10. Enter date of birth
11. Select Department/Office
12. Select Job Title
13. Select programming language from checkboxes
14. Click to sign up button
15. Verify success message “You’ve successfully completed registration.” is
displayed.


Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sense
 */