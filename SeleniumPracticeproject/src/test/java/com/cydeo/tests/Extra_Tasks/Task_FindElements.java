package com.cydeo.tests.Extra_Tasks;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task_FindElements {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //1. Open browser
        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    /*
    TC #1: Checking the number of links on the page
    1. Open Chrome browser
    2. Go to https://www.openxcell.com
    3. Count the number of the links on the page and verify
     Expected: 332

     */
    @Test
    public void numberOfLinks_test() {
        //2.Go to website:
        //https://www.openxcell.com
        driver.get("https://www.openxcell.com");

        //3. Count the number of the links on the page and verify
        // Expected: 332
        List<WebElement> numberOfLinks = driver.findElements(By.tagName("a"));
        System.out.println("numberOfLinks.size() = " + numberOfLinks.size());

        int expectedNumOfLink = 355;
        int actualNumOfLink = numberOfLinks.size();

        Assert.assertEquals(expectedNumOfLink, actualNumOfLink);

    }

    /* TC #2: Printing out the texts of the links on the page
       1. Open Chrome browser
       2. Go to https://www.openxcell.com
       3. Print out all of the texts of the links on the page*/
    @Test
    public void printAllLinks_test() {

        driver.get("https://www.openxcell.com");

        List<WebElement> allLinksText = driver.findElements(By.xpath("//a[@href]"));
        for (WebElement each : allLinksText) {
            System.out.println("Text of link = " + each.getText());
        }

    }

    /*TC #3: Counting the number of links that does not have text
    1. Open Chrome browser
    2. Go to https://www.openxcell.com
    3. Count the number of links that does not have text and verify
    Expected: 109 */
   @Test
    public void numOfEmptyLinks_test() {

        driver.get("https://www.openxcell.com");

        int numOfEmptyLink =0;

        List<WebElement> allLinksText = driver.findElements(By.tagName("a"));
        for (WebElement each : allLinksText) {

            if ((each.getText().equals(""))) {
                numOfEmptyLink++;
            }
            System.out.println("numOfEmptyLink = " + numOfEmptyLink);
        }


    }


}
//


//


/*







NOTE: EXPECTED NUMBER OF LINKS FOR THIS PRACTICE MAY BE DIFFERENT
FROM COMPUTER TO COMPUTER, OR FOR DIFFERENT OS (MAC-WINDOWS). SO
IF YOU ARE GETTING A DIFFERENT NUMBER, JUST USE THAT NUMBER FOR
VERIFICATION.

 */