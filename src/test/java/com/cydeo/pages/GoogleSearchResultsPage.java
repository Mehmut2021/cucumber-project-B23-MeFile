package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchResultsPage {


    @FindBy(id="result-stats")
    private WebElement searchResultCount ;

    // grab all the links with below style
    @FindBy(xpath = "//h3[@class='LC20lb DKV0Md']")
    private List<WebElement> resultLinks ;

    public GoogleSearchResultsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * Get the text of result element that contains search result total
     * @return the text of search Result Count element
     */
    public String getResultCountText(){

        return  searchResultCount.getText();

    }

    public void printAllSearchResultLinks(){
        System.out.println("resultLinks.size() = " + resultLinks.size());
        for (WebElement eachLink : resultLinks) {
            System.out.println("eachLink.getText() = " + eachLink.getText());
        }
    }






}
