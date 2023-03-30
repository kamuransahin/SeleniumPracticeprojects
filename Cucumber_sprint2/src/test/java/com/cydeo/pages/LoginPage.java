package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;


    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;


    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement incorrectLoginOrPassword;

    @FindBy(xpath = "//span[.='CRM']")
    public WebElement homepage;



    }





