package com.mohsina.qa.framework;

import com.mohsina.qa.framework.pages.ApplicationController;
import org.openqa.selenium.WebDriver;

public class BaseSteps{

 protected WebDriver driver=DriverFactory.getInstance().getDriver();
 protected ResourceFactory resources = ResourceFactory.getInstance();
 protected ApplicationController massMutual = new ApplicationController(driver);


}
