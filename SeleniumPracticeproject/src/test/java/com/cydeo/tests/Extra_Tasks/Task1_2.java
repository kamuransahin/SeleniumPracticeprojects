package com.cydeo.tests.Extra_Tasks;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.SmartBearUtils;
import com.cydeo.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1_2 {

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

        //6. Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());


        //7. Print out each link text on this page
        List<WebElement> allLinksText = driver.findElements(By.xpath("//a[@href]"));
        for (WebElement each : allLinksText) {

            System.out.println("Text of link: " + each.getText());
            //System.out.println("HREF Values: " + each.getAttribute("href"));


        }
    }

    @Test
    public void smartBearMethod_test(){
        SmartBearUtils.getProperty("");
        }

    @Test
    public void SmartBear_order_placing_test() throws InterruptedException {

        /*
        TC#2: Smartbear software order placing
        1. Open browser
        2. Go to website:
        http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        */
        //3. Enter username: “Tester”
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginButton.click();

        //6.Click the Order
        WebElement orderButton=driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderButton.click();

        //7. Select familyAlbum from product, set quantity to 2
        Select familyAlbum=new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        familyAlbum.selectByIndex(1);

        WebElement quantity=(driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")));
         quantity.clear();
         Thread.sleep(2000);
        quantity.sendKeys("2");

        //8. Click to “Calculate” button
        WebElement calculateButton=driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        //9. Fill address Info with JavaFaker
        //• Generate: name, street, city, state, zip code
        Faker faker=new Faker();
        WebElement customerName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        customerName.sendKeys(faker.name().firstName()+" "+faker.name().lastName());

        WebElement streetName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        streetName.sendKeys(faker.address().streetName());

       WebElement cityName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        cityName.sendKeys(faker.address().cityName());

        WebElement stateName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        stateName.sendKeys(faker.address().state());

        WebElement zipCode=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        zipCode.sendKeys(faker.address().zipCode().replaceAll("-",""));

        //10. Click on “visa” radio button
        WebElement radioButtonVisa=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        radioButtonVisa.click();

        //11. Generate card number using JavaFaker
        WebElement cardNumber=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        WebElement expireDate=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
        expireDate.sendKeys(faker.numerify("##/##"));

        //12. Click on “Process”
        WebElement processButton=driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        processButton.click();

        //13. Verify success message “New order has been successfully added.”
        String expectedMessage="New order has been successfully added.";
        WebElement message=driver.findElement(By.xpath("//strong"));
        String actualMessage=message.getText();

        Assert.assertEquals(actualMessage,expectedMessage);

    }


    }



