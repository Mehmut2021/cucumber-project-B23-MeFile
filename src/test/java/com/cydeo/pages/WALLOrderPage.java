package com.cydeo.pages;

import com.cydeo.utility.Driver;
import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WALLOrderPage {

    @FindBy(xpath = "//h2[normalize-space(.)= 'List of All Orders']" )
    public WebElement header ;

    @FindBy(id = "ctl00_MainContent_btnCheckAll")
    public WebElement checkAllButton ;

    @FindBy(id = "ctl00_MainContent_btnUncheckAll")
    public WebElement unCheckAllButton ;

    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr[1]/th") //all cells in row one
    public List<WebElement> headerCells ;



    public WALLOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
