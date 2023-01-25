package com.cydeo.tests.Extra_Tasks;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //1. Open browser
        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2.Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }


    @Test
    public void smartBear_test() {

        //3. Enter username: “Tester”
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginButton.click();

        //2. Click on View all orders
        WebElement viewAllOrders=driver.findElement(By.xpath("//a[@href='Default.aspx']"));
        viewAllOrders.click();

        //3. Verify Susan McLaren has order on date “01/05/2010”
        String expectedDate="01/05/2010";
        WebElement susanMclarenDate=driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Susan McLaren']/following-sibling::td[3]"));
        String actualDate=susanMclarenDate.getText();

        Assert.assertEquals(expectedDate,actualDate);

    }
}
/*
TC#3: Smartbear software order verification
1. Open browser and login to Smartbear software
2. Click on View all orders
3. Verify Susan McLaren has order on date “01/05/2010”

 */