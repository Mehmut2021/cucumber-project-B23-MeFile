package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WCommonArea {

    @FindBy(id = "ctl00_logout")
    public WebElement logoutLink ;

    @FindBy(linkText = "View All Order")
    public WebElement viewAllOrderTab ;

    @FindBy(linkText = "View All Product")
    public WebElement viewAllProductTab ;

    @FindBy(linkText = "Order") //annootation
    public WebElement orderTab ;

    public WCommonArea(){
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
