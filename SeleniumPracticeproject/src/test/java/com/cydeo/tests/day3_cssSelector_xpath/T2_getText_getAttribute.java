package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox_label"));

        String expectedRememberMeLabel= "Remember me on this computer";
        String actualRememberMeLabel=rememberMeLabel.getText();

        if (expectedRememberMeLabel.equalsIgnoreCase(actualRememberMeLabel))
            System.out.println("Label verification PASSED!");
        else {
            System.out.println("Label verification FAIlED!");
        }

        WebElement forgotPasswordLink=driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText="FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLinkText=forgotPasswordLink.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText))
            System.out.println("Forgot password link verification PASSED!");
        else {
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
            System.out.println("Forgot password link verification FAILED!!");
        }
    }
    //href bölümünü kendin ekle

}
