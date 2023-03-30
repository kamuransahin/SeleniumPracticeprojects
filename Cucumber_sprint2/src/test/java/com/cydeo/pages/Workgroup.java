package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Workgroup {

    public Workgroup(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[4]")
    public WebElement workgroupsButton;


    @FindBy(xpath = "//span[@id='bx-sonet-groups-sort-value']")
    public WebElement sortByButton;

    @FindBy(xpath = "//span[.='ABC order']")
    public WebElement selectAbcOrderButton;

    @FindBy(xpath = "//*[.='Time joined']")
    public WebElement selectTimeJoinedButton;

    @FindBy(xpath = "//span[.='Number of members']")
    public WebElement selectNumOfMembersButton;

    @FindBy(xpath = "//span[.='Last viewed']")
    public WebElement selectLastViewedButton;


    @FindBy(xpath = "//span[.='Last active']")
    public WebElement selectLastActiveButton;

    @FindBy(xpath = "//span[.='Time created']")
    public WebElement selectTimeCreatedButton;



    @FindBy(xpath = "//span[@id='bx-sonet-groups-request-8']")
    public WebElement corporateJoin;
    @FindBy(xpath = "(//a[.='\"New Corporate Identity\" project'])[3]")
    public WebElement corporateProjectButton;

    @FindBy(xpath = "//a[@class='ui-btn ui-btn-sm ui-btn-primary']")
    public WebElement upperSideJoin;

    @FindBy(xpath = "//button[@id='bx-group-join-submit']")
    public WebElement joinWorkGroup;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-md ui-btn-danger']")
    public WebElement revokeGroup;


    @FindBy(xpath = "//*[@id='bx-sonet-groups-request-sent-8']")
    public WebElement corporateMessage;

    @FindBy(xpath = "(//a[.='New company web site development'])[3]")
    public WebElement newCompanyButton;

    @FindBy(xpath = "//span[@id='bx-sonet-groups-request-1']")
    public WebElement companyJoin;

    @FindBy(xpath = "//span[@id='bx-sonet-groups-request-6']")
    public WebElement productJoin;

    @FindBy(xpath = "(//a[.='New product development'])[3]")
    public WebElement newProductButton;

    @FindBy(xpath = "(//a[.='PR and advertising'])[3]")
    public WebElement prAdvertisingButton;

    @FindBy(xpath = "//span[@id='bx-sonet-groups-request-2']")
    public WebElement prJoin;

    @FindBy(xpath = "//span[@id='bx-sonet-groups-request-3']")
    public WebElement salesJoin;

    @FindBy(xpath = "(//a[.='Sales'])[3]")
    public WebElement salesButton;

    @FindBy(xpath = "//span[@id='bx-sonet-groups-request-5']")
    public WebElement technologyJoin;

    @FindBy(xpath = "(//a[.='Technology'])[3]")
    public WebElement technologyButton;

}
