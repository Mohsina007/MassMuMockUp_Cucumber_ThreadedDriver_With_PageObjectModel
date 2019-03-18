package com.mohsina.qa.framework.Steps;


import com.mohsina.qa.framework.BaseSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BaseSteps {

    @Then("^MyStore home page should show$")
    public void mystore_home_page_should_show() throws Throwable {
        massMutual.homePage().verifyTitleOfHomepage();
    }




}
