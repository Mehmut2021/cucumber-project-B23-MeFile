package com.cydeo.pages;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibLogInPage {

    @FindBy(id="inputEmail")
private WebElement usernameBox;

@FindBy(id= "inputPassword")
private WebElement passwordBox;

    @FindBy(xpath= "//button[.='Sign in']")
private WebElement logInBtn;

    public LibLogInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
        Driver.getDriver().get(ConfigReader.read("library2.ui.url"));
    }

    public void login(String userName, String password){
        usernameBox.sendKeys(userName);
        passwordBox.sendKeys(password);
        logInBtn.click();

    }



}
