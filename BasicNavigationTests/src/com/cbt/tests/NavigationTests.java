package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NavigationTests {
    WebDriver driver;
    @Test
    public void different_browsers_test1(){

        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://google.com
        driver.get("https://google.com");
    }
    @Test
    public void different_browsers_test2(){

        driver= BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://google.com
        driver.get("https://google.com");
    }
    @Test
    public void different_browsers_test3(){

        driver= BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://google.com
        driver.get("https://google.com");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void testCase(){

        //1. Open	browser
        driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://google.com
        driver.get("https://google.com");

        //3. Save the	title in a string	variable
        String title1=driver.getTitle();
        System.out.println("title1 = " + title1);

        //4. Go	to	https://etsy.com
        driver.get("https://etsy.com");

        //5. Save the title	in	a string	variable
        String title2=driver.getTitle();
        System.out.println("title2 = " + title2);

        //6. Navigate back to previous page
        driver.navigate().back();

        //7. Verify	that title is same is in step 3
        String title3=driver.getTitle();
        Assert.assertEquals(title1,title3);

        //8. Navigate	forward	to	previous	page
        driver.navigate().forward();

        //9. Verify	that title	is	same is	in	step 5
        String title4= driver.getTitle();
        Assert.assertEquals(title2,title4);

    }

}
