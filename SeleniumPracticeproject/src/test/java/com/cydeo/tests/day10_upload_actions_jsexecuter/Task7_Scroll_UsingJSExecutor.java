package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task7_Scroll_UsingJSExecutor {

    @Test
    public void scroll_using_jsExecutor(){


        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        //3- Scroll down to “Cydeo” link
        WebElement cydeoLink=Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));

        BrowserUtils.sleep(2);
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",cydeoLink);


        //4- Scroll up to “Home” link
        BrowserUtils.sleep(2);
        WebElement homeLink=Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        js.executeScript("arguments[0].scrollIntoView(true);",homeLink);

        //5- Use below provided JS method only
    }
}
