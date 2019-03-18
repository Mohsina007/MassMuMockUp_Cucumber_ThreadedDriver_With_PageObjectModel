package com.mohsina.qa.framework.Steps;


import com.mohsina.qa.framework.BaseSteps;
import com.mohsina.qa.framework.DriverFactory;
import com.mohsina.qa.framework.ResourceFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class AppSteps extends BaseSteps {




    @Given("^As a validated user$")
    public void As_a_validated_user() throws Throwable {

      massMutual.valuesPage().validatedUserDeleteAllcookies();


    }

    @When("^Navigate to the url$")
    public void browse_to_the_url() throws Throwable {
        String url= resources.getProperty("APP_URL");

        driver.navigate().to(url);

    }



    @Then("^Exercise_one values page should show$")
    public void exercise_one_values_page_should_show() throws Throwable {

        massMutual.valuesPage().verifyTitleOftheValuesPage();
    }


}
