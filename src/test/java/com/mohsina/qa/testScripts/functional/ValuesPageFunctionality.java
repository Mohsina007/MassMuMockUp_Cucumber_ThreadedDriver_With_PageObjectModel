package com.mohsina.qa.testScripts.functional;

import com.mohsina.qa.framework.ScriptBase;
import org.junit.Test;


public class ValuesPageFunctionality extends ScriptBase {

    @Test
    public  void valiidateInputFieldValuesdDisplayedAsexpectedOnScreenWithCurrencyUSDollar(){
        massMutual().navigateToApplication();
        massMutual().valuesPage().verifyInputFieldValuesdDisplayedAsexpectedOnScreenWithCurrencyUSDollar("txt_val_1","$122,365.24");

    }
}
