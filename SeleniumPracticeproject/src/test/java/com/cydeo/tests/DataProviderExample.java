package com.cydeo.tests;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "searchData")
    public void test(String keyword, String expectedTitle) {
        Driver.getDriver().get("https://google.com");

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(keyword + Keys.ENTER);

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    @DataProvider(name = "searchData")

    public Object[][] testData() {

        return new Object[][]{
                {"selenium","selenium - Google'da Ara"},
                {"java", "java - Google'da Ara"},
                {"job","job - Google'da Ara"},
                {"cydeo","cydeo - Google'da Ara"}
        };
    }
}