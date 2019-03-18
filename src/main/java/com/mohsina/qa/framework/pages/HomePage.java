package com.mohsina.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends PageBase {

    private int TimeoutValue = 30;

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);

    }

    public  void verifyTitleOfHomepage(){
        String title = driver.getTitle();
        Assert.assertEquals("ExpectedTilte",title);
    }


}


