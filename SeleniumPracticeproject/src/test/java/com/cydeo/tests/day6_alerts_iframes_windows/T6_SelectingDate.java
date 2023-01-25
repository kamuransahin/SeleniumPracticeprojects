package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_SelectingDate {
    WebDriver driver;

    @BeforeMethod

    public void setupMethod() {

        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }


    @Test
    public void date() {

    //3. Select “December 1st, 1923” and verify it is selected.
    Select selectYear=new Select(driver.findElement(By.xpath("//select[@id='year']")));

    //Select year using  : visible text
    selectYear.selectByVisibleText("1981");

    Select selectMonth=new Select(driver.findElement(By.xpath("//select[@id='month']")));

    //Select month using   : value attribute
    selectMonth.selectByValue("2");


    Select selectDay=new Select(driver.findElement(By.xpath("//select[@id='day']")));
    selectDay.selectByIndex(1);

    //creating expected values
    String expectedYear="1981";
    String expectedMonth="March";
    String expectedDay="2";

    //getting actual values from browser
    String actualYear=selectYear.getFirstSelectedOption().getText();
    String actualMonth=selectMonth.getFirstSelectedOption().getText();
    String actualDay=selectDay.getFirstSelectedOption().getText();

    //create assertions
    Assert.assertTrue(actualYear.equals(expectedYear));
    Assert.assertEquals(actualMonth,expectedMonth);
    Assert.assertEquals(actualDay,expectedDay);


    }

    /*@AfterMethod
    public void teardownMethod(){
        driver.close();
    }*/
}
/*





Select day using : index number */