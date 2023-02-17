package com.cydeo.tests.AutomationExercises;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1_Register_User {


    @Test
    public void register_user_test(){


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        Assert.assertTrue(!Driver.getDriver().getTitle().isBlank());

        //4. Click on 'Signup / Login' button
        WebElement signup_login=Driver.getDriver().findElement(By.xpath("//a[@href='/login']"));
        signup_login.click();

        //5. Verify 'New User Signup!' is visible
        String expectedMessage="New User Signup!";

        WebElement actualText=Driver.getDriver().findElement(By.xpath("//h2[.='New User Signup!']"));
        String actualMessage=actualText.getText();
        Assert.assertEquals(actualMessage,expectedMessage);

        Faker faker=new Faker();
        //6. Enter name and email address
        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@data-qa='signup-name']"));
        email.sendKeys(faker.name().fullName());

        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@data-qa='signup-email']"));
        password.sendKeys(faker.internet().emailAddress());

        //7. Click 'Signup' button
        WebElement signup=Driver.getDriver().findElement(By.xpath("//button[@data-qa='signup-button']"));
        signup.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        String expectedAccountText="ENTER ACCOUNT INFORMATION";
        WebElement accountText=Driver.getDriver().findElement(By.xpath("//b[.='Enter Account Information']"));

        String actualAccountText=accountText.getText();
        Assert.assertEquals(expectedAccountText,actualAccountText);

        //9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement title=Driver.getDriver().findElement(By.xpath("//input[@id='id_gender1']"));
        title.click();

        WebElement name=Driver.getDriver().findElement(By.xpath("//input[@id='name']"));
       // name.sendKeys(faker.name().fullName());

        WebElement email1=Driver.getDriver().findElement(By.xpath("//input[@id='email']"));
        //email1.sendKeys(faker.internet().emailAddress());

        WebElement password1=Driver.getDriver().findElement(By.xpath("//input[@id='password']"));
        password1.sendKeys(faker.bothify("###???###"));

        Select dayOfBirth=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='days']")));
        dayOfBirth.selectByIndex(5);

        Select monthOfBirth=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='months']")));
        monthOfBirth.selectByValue("2");

        Select yearOfBirth=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='years']")));
        yearOfBirth.selectByVisibleText("1981");

        //10. Select checkbox 'Sign up for our newsletter!'
        WebElement newsletter=Driver.getDriver().findElement(By.xpath("//input[@id='newsletter']"));
        newsletter.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        WebElement receiveSpecial=Driver.getDriver().findElement(By.xpath("//input[@id='optin']"));
        receiveSpecial.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@id='first_name']"));
        firstName.sendKeys(faker.name().firstName());

        WebElement lastName=Driver.getDriver().findElement(By.xpath("//input[@id='last_name']"));
        lastName.sendKeys(faker.name().lastName());

        WebElement companyName=Driver.getDriver().findElement(By.xpath("//input[@id='company']"));
        companyName.sendKeys(faker.company().name());

        WebElement address1=Driver.getDriver().findElement(By.xpath("//input[@id='address1']"));
        address1.sendKeys(faker.address().streetName()+faker.address().zipCode());

        WebElement address2=Driver.getDriver().findElement(By.xpath("//input[@id='address2']"));
        address2.sendKeys(faker.address().state());

        Select country=new Select(Driver.getDriver().findElement(By.xpath("//select[@id='country']")));
        country.selectByValue("United States");

        WebElement state=Driver.getDriver().findElement(By.xpath("//input[@id='state']"));
        state.sendKeys(faker.address().state());

        WebElement city=Driver.getDriver().findElement(By.xpath("//input[@id='city']"));
        city.sendKeys(faker.address().cityName());

        WebElement zipcode=Driver.getDriver().findElement(By.xpath("//input[@id='zipcode']"));
        zipcode.sendKeys(faker.address().zipCode());

        WebElement mobileNumber=Driver.getDriver().findElement(By.xpath("//input[@id='mobile_number']"));
        mobileNumber.sendKeys(faker.numerify("###-###-####"));

        //13. Click 'Create Account button'
        WebElement createAccountButton=Driver.getDriver().findElement(By.xpath("//button[.='Create Account']"));
        createAccountButton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement visibleText=Driver.getDriver().findElement(By.xpath("//b"));

        String expectedVisibleText="ACCOUNT CREATED!";
        String actualVisibleText=visibleText.getText();

        Assert.assertEquals(expectedVisibleText,actualVisibleText);

        //15. Click 'Continue' button
        WebElement clickButton=Driver.getDriver().findElement(By.xpath("//a[.='Continue']"));
        clickButton.click();

        BrowserUtils.sleep(3);
        Actions actions=new Actions(Driver.getDriver());
        WebElement popUp=Driver.getDriver().findElement(By.xpath("//div[@id='ad_position_box']"));
        //actions.moveToElement(popUp).doubleClick().perform();
        popUp.click();

        //16. Verify that 'Logged in as username' is visible
        String expectedLoggedMessage="Logged in as username";
        WebElement loggedMessage=Driver.getDriver().findElement(By.xpath("//a[.='Continue']"));

        String actualLoggedMessage=loggedMessage.getText();

        Assert.assertEquals(expectedLoggedMessage,actualLoggedMessage);

        //17. Click 'Delete Account' button
        WebElement deleteAccountButton=Driver.getDriver().findElement(By.xpath("//a[@href='/delete_account']"));
        deleteAccountButton.click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        WebElement accountDeletedText=Driver.getDriver().findElement(By.xpath("//b"));
        String expectedDeletedText="ACCOUNT DELETED!";
        String actualDeletedText=accountDeletedText.getText();

        Assert.assertEquals(expectedDeletedText,actualDeletedText);



    }


}
