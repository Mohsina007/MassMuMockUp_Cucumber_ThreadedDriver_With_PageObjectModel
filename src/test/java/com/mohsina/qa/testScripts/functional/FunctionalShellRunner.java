package com.mohsina.qa.testScripts.functional;

import com.mohsina.qa.framework.util.ParallelSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


//@RunWith(Suite.class)
@RunWith(ParallelSuite.class)
@Suite.SuiteClasses({
        ValuesPageFunctionality.class,
        HomePageFunctionality.class,


})
public class FunctionalShellRunner {
}

