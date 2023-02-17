package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class TodoTask {

    WebDriver driver;
    @Test
    public void todo_test() {

        BrowserFactory.getDriver("chrome") ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://todomvc.com/");

        WebElement javascript= driver.findElement(By.xpath("//div[.='JavaScript']"));
        javascript.click();


    }
}
