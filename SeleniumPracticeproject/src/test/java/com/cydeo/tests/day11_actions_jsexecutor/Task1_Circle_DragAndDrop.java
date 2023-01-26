package com.cydeo.tests.day11_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_Circle_DragAndDrop {

    @Test
    public void test_drag_and_drop(){

        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");


        BrowserUtils.sleep(3);
        //Locate and click the accept cookies button
        WebElement acceptCookies=Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptCookies.click();

        BrowserUtils.sleep(3);
        WebElement anotherPopUp=Driver.getDriver().findElement(By.xpath("//*[local-name()='svg' and @class='qual_x_svg_dash']"));
        anotherPopUp.click();

        //2. Drag and drop the small circle to bigger circle.
        WebElement smallCircle=Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle=Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        Actions actions=new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(bigCircle)
                .pause(2000)
                .release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String expectedText="You did great!";
        String actualText= bigCircle.getText();

        Assert.assertEquals(expectedText,actualText);



    }


}
/*
TC #: Drag and drop



 */