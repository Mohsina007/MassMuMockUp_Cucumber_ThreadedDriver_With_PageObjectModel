package com.mohsina.qa.framework.Steps;

import com.mohsina.qa.framework.BaseSteps;
import com.mohsina.qa.framework.util.CurrencyFormatter;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValuesPageSteps  extends BaseSteps {

    double allFiveFieldsTotal;

   /* @Then("^Exercise_one values page should show$")
    public void exercise_one_values_page_should_show() throws Throwable {

        massMutual.valuesPage().verifyTitleOftheValuesPage();
    }*/

    @Then("^Input Field values \"([^\"]*)\" are displayed as expected values on the screen with Currency as US Dollar \"([^\"]*)\"$")
    public void Input_Field_values_are_displayed_as_expected_values_on_the_screen_with_Currency_as_US_Dollar(String arg1,String arg2) throws Throwable {

        massMutual.valuesPage().verifyInputFieldValuesdDisplayedAsexpectedOnScreenWithCurrencyUSDollar(arg1,arg2);

    }


    @Then("^Input Field \"([^\"]*)\" values are greater than zero against expected values \"([^\"]*)\"$")
    public void Input_Field_values_are_greater_than_zero_against_expected_values(String arg1,String arg2) throws Throwable {


     massMutual.valuesPage().inputFieldValuesAreGreaterThanZeroAgainstExpectedValues(arg1,arg2);

    }

    @When("^Add all input field values based on the screen$")
    public void add_all_input_field_values_based_on_the_screen() throws Throwable {

       massMutual.valuesPage().addAllInputFieldValuesBasedOntheScreen();
    }

    @Then("^verify total balance is correct$")
    public void verify_total_balance_is_correct() throws Throwable {
        massMutual.valuesPage().verifyTotalBalanceIsCorrect();

    }


    @Then ("^Identifying WebElement for values \"([^\"]*)\" to validate currency format$")
    public void Identifying_WebElement_for_values_to_validate_currency_format(String arg1)throws Throwable {

        massMutual.valuesPage().IdentifyingWebElementForvAluestovalidateCurrecyFormat(arg1);
    }



}
