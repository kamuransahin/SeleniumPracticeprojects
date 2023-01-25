package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_UploadPractice {

    @Test
    public void upload_test(){


        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path="C:/Users/HP/Desktop/Screenshot_15.png";

        //3. Upload the file.
        WebElement fileUpload=Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        fileUpload.sendKeys(path);

        WebElement uploadButton=Driver.getDriver().findElement(By.xpath("//input[@class='button']"));
        uploadButton.click();
        //4. Assert:
        //-File uploaded text is displayed on the page
        String expectedText="File Uploaded!";

        WebElement fileUploadText=Driver.getDriver().findElement(By.xpath("//h3"));

        String actualText= fileUploadText.getText();;

        Assert.assertEquals(expectedText,actualText);

    }
}

