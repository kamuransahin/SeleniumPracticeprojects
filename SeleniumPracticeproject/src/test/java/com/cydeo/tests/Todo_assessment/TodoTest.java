package com.cydeo.tests.Todo_assessment;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TodoTest {

    @Test
    public void todo_test() {

        Driver.getDriver().get("http://todomvc.com/");
        Actions actions = new Actions(Driver.getDriver());

        WebElement javascript = Driver.getDriver().findElement(By.xpath("//div[.='JavaScript']"));
        javascript.click();

        WebElement polymer = Driver.getDriver().findElement(By.xpath("//a[@data-content='Polymer is a new type of library for the web, built on top of Web Components, and designed to leverage the evolving web platform on modern browsers. It is comprised of core platform features (e.g Shadow DOM, Custom Elements, MDV) enabled with polyfills and a next generation web application framework built on these technologies.']"));
        polymer.click();

        WebElement addBar1 = Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));
        addBar1.sendKeys("Wooden Spoon" + Keys.ENTER);

        WebElement addBar2 = Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));
        addBar2.sendKeys("Awesome Group 6" + Keys.ENTER);

        BrowserUtils.sleep(3);
        WebElement editContent = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        editContent.click();

        BrowserUtils.sleep(3);
        WebElement clearCompleted = Driver.getDriver().findElement(By.xpath("//button[@class='clear-completed style-scope td-todos']"));
        clearCompleted.click();
        addBar1.sendKeys("Best Mentor & Group" + Keys.ENTER);

    }


}
