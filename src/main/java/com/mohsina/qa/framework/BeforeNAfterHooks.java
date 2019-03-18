package com.mohsina.qa.framework;


import com.mohsina.qa.framework.util.SpecializedScreenRecorder;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BeforeNAfterHooks {


    private ScreenRecorder screenRecorder;
    private String executionFeature;
    private String executingScenario;


    @Before
    public void before(Scenario scenario) throws Exception {


        DriverFactory.getInstance().getDriver().manage().window().maximize();
        DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String scenarioId = scenario.getId();
        String featureName = scenarioId.substring(0, scenarioId.indexOf(";"));

        this.executionFeature = featureName;
        this.executingScenario = scenario.getName();

        startRecording();
    }


    @After
    public  void after(Scenario scenario) throws Exception {

       WebDriver driver = DriverFactory.getInstance().getDriver();
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
        }

       DriverFactory.getInstance().getDriver().close();
       DriverFactory.getInstance().getDriver().quit();
        DriverFactory.getInstance().removeDriver();

        stopRecording();
    }

    private void startRecording() throws Exception {


        String useDir = System.getProperty("user.dir");

        File file = new File(useDir + "/CucumberBDDVideo/"
                + this.executionFeature.replaceAll("[^a-zA-Z0-9.-]", "_"));
        String fileNameStartWith = this.executingScenario.replaceAll(
                "[^a-zA-Z0-9.-]", "_");

        this.screenRecorder = new SpecializedScreenRecorder(file,fileNameStartWith);
        this.screenRecorder.start();

    }

    private void stopRecording() throws Exception {
        this.screenRecorder.stop();
    }

    }

