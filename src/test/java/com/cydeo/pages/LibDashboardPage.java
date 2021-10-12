package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibDashboardPage {


    // add 3 element that hold numbers
    @FindBy (id="user_count")
    private WebElement userCount;

    @FindBy (id="book_count")
    //add @FindBy annotation
    private WebElement BookCount;

    @FindBy (id="borrowed_books")
    private WebElement BorrowedBookCount;



    //add constructor
    //add 3  methods for getting the numbers
    public LibDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public String getUserCountText(){
        return userCount.getText();
    }
    public String getBookCountText(){
        return BookCount.getText();
    }
    public String getBorrowedBookCountText(){
        return BorrowedBookCount.getText();
    }
}
