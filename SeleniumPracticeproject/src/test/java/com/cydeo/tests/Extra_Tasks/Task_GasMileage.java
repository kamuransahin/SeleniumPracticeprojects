package com.cydeo.tests.Extra_Tasks;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_GasMileage {


    WebDriver driver;

 /*   @BeforeMethod
    public void setupMethod() {

        //1. Open browser
        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }*/

    @Test
    public void gas_Mileage_Calculator_Test() {

       // String browserType = ConfigurationReader.getProperty("browser");
       driver = Driver.getDriver();
        //2. Go to https://www.calculator.net
        driver.get("https://www.calculator.net");

        //3. Search for “gas mileage” using search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='calcSearchTerm']"));
        searchBox.sendKeys("gas mileage");

        WebElement searchButton = driver.findElement(By.xpath("//span[@id='bluebtn']"));
        searchButton.click();

        //4. Click on the “Gas Mileage Calculator” link
        WebElement gasMileageCalculator = driver.findElement(By.xpath("//a[.='Gas Mileage Calculator']"));
        gasMileageCalculator.click();

        /*
        5. On Next page verify:
        a. Title equals: “Gas Mileage Calculator”
        b. “Gas Mileage Calculator” label is displayed
         */

        String expectedTitle="Gas Mileage Calculator";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

        String expectedLabel="Gas Mileage Calculator";
        WebElement actualLabel=driver.findElement(By.xpath("//h1"));

        Assert.assertEquals(expectedLabel,actualLabel.getText());
    }
}
/*

Task #: Gas Mileage Calculator Automation Test

1. Add a new class GasMileageCalculatorTest
2. Go to https://www.calculator.net
3. Search for “gas mileage” using search box
4. Click on the “Gas Mileage Calculator” link


5. On Next page verify:
a. Title equals: “Gas Mileage Calculator”
b. “Gas Mileage Calculator” label is displayed






6. Locate, clear and type “7925” into “Current odometer” field
7. Locate, clear and type “7550” into “Previous odometer” field
8. Locate, clear and type “16” into “Gas added” field
9. Locate, clear and type “3.55” into “Gas price” field
10. Click on Calculate button
11. Verify mpg value is as expected:
Expected value: “23.44 mpg”
 */