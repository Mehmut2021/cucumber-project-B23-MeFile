package com.cydeo.step_definitions;

import com.cydeo.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before("@ui")
    public void setupDriver(){
        System.out.println("This is from @Before");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Driver.getDriver().manage().window().maximize();
    }


    @After("@ui")
    public void tearDown(){
        System.out.println("This is from @After inside hooks");
        Driver.closeBrowser();
    }



}
