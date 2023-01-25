package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

 /*   WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

    //We are getting the browserType dynamically from our configuration.properties file
        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }
*/
    @Test
    public void google_search_test() {

    //Driver.getDriver()--> driver

        Driver.getDriver().get("https://www.google.com");
    //3-Write "apple" in the search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);


        //Verify title:
        //Expected : apple - Google Search
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "apple - Google'da Ara";

        Assert.assertEquals(expectedTitle, actualTitle);


    }

    //@Test
}
