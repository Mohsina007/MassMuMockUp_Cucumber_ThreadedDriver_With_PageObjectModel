package com.mohsina.qa.testScripts.functional;

import com.mohsina.qa.framework.ScriptBase;
import org.junit.Test;

public class HomePageFunctionality extends ScriptBase {

    @Test
    public void validUserAndValidPasswordTest() {

        massMutual().navigateToApplication();
        massMutual().homePage().verifyTitleOfHomepage();



    }
}