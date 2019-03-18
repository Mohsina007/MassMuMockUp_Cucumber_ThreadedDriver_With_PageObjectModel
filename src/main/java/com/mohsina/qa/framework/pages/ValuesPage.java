package com.mohsina.qa.framework.pages;

import com.mohsina.qa.framework.util.CurrencyFormatter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ValuesPage extends PageBase {


    private WebDriver driver = null;
    private int TimeoutValue = 10;
    double allFiveFieldsTotal;


    public ValuesPage(WebDriver driver) {

        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);

    }


    public void validatedUserDeleteAllcookies(){

        driver.manage().deleteAllCookies();
    }

    public void verifyTitleOftheValuesPage() {

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("ValuePage", title);

    }

    public void verifyInputFieldValuesdDisplayedAsexpectedOnScreenWithCurrencyUSDollar(String arg1,String arg2){

        WebElement inputFieldValue= waitForElement(By.id(arg1));
         highlight(inputFieldValue);
        String actualOutputInputFieldValue=inputFieldValue.getAttribute("value");
        Assert.assertEquals(arg2,actualOutputInputFieldValue);


    }

    public void inputFieldValuesAreGreaterThanZeroAgainstExpectedValues(String arg1,String arg2){
        WebElement filedValues = driver.findElement(By.id(arg1));
        String FieldValuesActualOutPut = filedValues.getAttribute("value").substring(1);


        double OutPutVale = Double.parseDouble(FieldValuesActualOutPut);

        if (OutPutVale > 0) {
            Assert.assertEquals(arg2, FieldValuesActualOutPut);
        } else {
            Assert.assertFalse("Input field value less than zero", true);
        }

    }


    public void addAllInputFieldValuesBasedOntheScreen (){


        WebElement value1 = driver.findElement(By.id("txt_val_1"));
        String value1ActualOutPut = value1.getAttribute("value").substring(1);
        double OutPutOne = Double.parseDouble(value1ActualOutPut);


        WebElement value2 = driver.findElement(By.id("txt_val_2"));
        String value2ActualOutPut = value2.getAttribute("value").substring(1);
        double OutPutTwo = Double.parseDouble(value2ActualOutPut);


        WebElement value3 = driver.findElement(By.id("txt_val_4"));
        String value3ActualOutPut = value3.getAttribute("value").substring(1);
        double OutPutThree = Double.parseDouble(value3ActualOutPut);


        WebElement value4 = driver.findElement(By.id("txt_val_5"));
        String value4ActualOutPut = value4.getAttribute("value").substring(1);

        double OutPutFour = Double.parseDouble(value4ActualOutPut);


        WebElement value5 = driver.findElement(By.id("txt_val_6"));
        String value5ActualOutPut = value5.getAttribute("value").substring(1);
        double OutPutFive = Double.parseDouble(value5ActualOutPut);


        allFiveFieldsTotal = OutPutOne + OutPutTwo + OutPutThree + OutPutFour + OutPutFive;



    }
    public void verifyTotalBalanceIsCorrect(){
        WebElement totalValue = driver.findElement(By.id("txt_titl_val"));
        String totalOutValue = totalValue.getAttribute("value").substring(1);
        double totalOutPutValue = Double.parseDouble(totalOutValue);

        Assert.assertEquals(totalOutPutValue, allFiveFieldsTotal);

    }

    public void IdentifyingWebElementForvAluestovalidateCurrecyFormat(String arg1){

        WebElement value1 = driver.findElement(By.id(arg1));
        String value1ActualOutPut = value1.getAttribute("value");
        double OutPutOne = Double.parseDouble(value1ActualOutPut);
        if (value1ActualOutPut.contains("$")) {
            System.out.println("input values are formatted as currencies");
        } else {
            CurrencyFormatter.currencyConvert(OutPutOne);
        }

    }


}
