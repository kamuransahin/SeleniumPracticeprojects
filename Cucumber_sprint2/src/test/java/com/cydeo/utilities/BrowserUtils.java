package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;




    public class BrowserUtils {


        /*
        This method will accept int(in seconds) and execute Thread.sleep
        for given duration
         */
        public static void sleep(int second) {
            second *= 1000;

            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {

            }
        }

    /*
    This method accepts 3 arguments.
    • Arg1: WebDriver
    • Arg2: expectedInUrl:for verify if the url contains given String.
        -If condition matches, will break loop.
    • Arg3: expectedInTitle to be compared against actualTitle
     */


        /*Method info:
        • Name: switchWindowAndVerify
        • Return type: void
        */
        public static void switchWindowAndVerify(String expectedInURL, String expectedInTitle) {

            Set<String> allWindowsHandles =Driver.getDriver().getWindowHandles();

            for (String each : Driver.getDriver().getWindowHandles()) {

                Driver.getDriver().switchTo().window(each);

                System.out.println("Current URL:  " + Driver.getDriver().getCurrentUrl());

                if (Driver.getDriver().getCurrentUrl().contains(expectedInURL)) {
                    break;
                }
            }

            //5. Assert: Title contains “expectedTitle”

            String actualTitle = Driver.getDriver().getTitle();

            Assert.assertTrue(actualTitle.contains(expectedInTitle));

        }

        // This method accepts a String "expectedTitle" and Asserts if it is true
        public static void verifyTitle(String expectedTitle) {

            Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
        }

        //Creating a utility method for ExplicitWait so we don't have to repeat the lines
        public static void waitForInvisibilityOf(WebElement webElement){
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

            wait.until(ExpectedConditions.invisibilityOf(webElement));

        }


        /**
         * This method will verify if the current URL contains expected value.
         * @param expectedInUrl
         */
        public static void verifyUrlContains(String expectedInUrl){

            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInUrl));

        }


        /**
         * This method will accept a dropdown as a WebElement
         * and return all the options' text in a List of String.
         * @param dropdownElement
         * @return List<String>actualOptionsAsString
         */
        public static List<String> dropdownOptionsAsString(WebElement dropdownElement){
            //System.out.println("expectedMonths = " + expectedMonths);
            Select select=new Select(dropdownElement);

            //List of all ACTUAL month <options> as a web element
            List<WebElement>actualOptionsAsWebElement= select.getOptions();

            //List of all ACTUAL month <options> as a string
            List<String>actualOptionsAsString=new ArrayList<>();

            for (WebElement each : actualOptionsAsWebElement) {
                actualOptionsAsString.add(each.getText());
            }
            return actualOptionsAsString;
        }


        /**
         *This method will accept a group radio buttons as a List of WebElement.
         * It will loop through the List, and click to the radio button with provided attributeValue
         * @param radioButtons
         * @param attributeValue
         */
        public static void clickRadioButton(List<WebElement> radioButtons,String attributeValue){

            //List<WebElement> cardTypes=orderPage.cardType;----->Delete it

            for (WebElement each : radioButtons) {

                if (each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                    each.click();
                }
            }
        }
    }


