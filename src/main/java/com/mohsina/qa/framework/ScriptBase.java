package com.mohsina.qa.framework;

import com.mohsina.qa.framework.pages.ApplicationController;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class ScriptBase {

    protected WebDriver driver;
    private ThreadLocal<ApplicationController> threadedApplication = null;

    @Before
    public void startUp(){
        driver = DriverFactory.getInstance().getDriver();
        driver.manage().window().maximize();
        threadedApplication = new ThreadLocal<ApplicationController>(){
            @Override
            protected ApplicationController initialValue()
            {
                return new ApplicationController(DriverFactory.getInstance().getDriver());
            }
        };

    }

    public ApplicationController massMutual(){
        return threadedApplication.get();
    }

    @After
    public void tearDown(){
        DriverFactory.getInstance().removeDriver();
    }
}

