package com.mohsina.qa.framework.pages;

import com.mohsina.qa.framework.ResourceFactory;
import org.openqa.selenium.WebDriver;


public class ApplicationController {

    private WebDriver driver;

    protected ValuesPage valuesPage;

    protected HomePage homePage;


    public ApplicationController(WebDriver driver) {
        this.driver = driver;

    }

    public ValuesPage valuesPage() {

        if (valuesPage == null) {
            valuesPage = new ValuesPage(driver);
        }

        return valuesPage;
    }


    public HomePage homePage() {

        if (homePage == null) {
            homePage = new HomePage(driver);
        }

        return homePage;

    }


    public WebDriver getDriver() {
        return driver;
    }

    public void navigateToApplication() {
        driver.navigate().to(ResourceFactory.getInstance().getProperty("APP_URL").toString());

    }
}


