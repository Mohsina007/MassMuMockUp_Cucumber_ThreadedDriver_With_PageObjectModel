package com.mohsina.qa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    private DriverFactory()
    {

    }

    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {
        return instance;
    }


    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>()
    {
        @Override
        protected WebDriver initialValue()
        {



            String driverName = ResourceFactory.getInstance().getProperty("DRIVER").toString();
            if(driverName.toUpperCase().contentEquals("CH")){
                String chromeBinayPath;
                chromeBinayPath =  System.getProperty("user.dir") + "/Drivers/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromeBinayPath);
                return new ChromeDriver();

            }
            else if(driverName.toUpperCase().contentEquals("IE")){
                String ieBinayPath;
                ieBinayPath = System.getProperty("user.dir") + "/Drivers/IEDriverServer.exe";
                if(!new File(ieBinayPath).exists()){
                ieBinayPath=System.getProperty("user.home")+"/WebDriver/IEDriverServer.exe";
                }
                System.setProperty("webdriver.ie.driver", ieBinayPath );
                return new InternetExplorerDriver();
            }


            return new ChromeDriver();//it can be replaced with any other brwserdriver u want;
        }

    };



    public WebDriver getDriver()
    {
        return driver.get();
    }

    public  void removeDriver()
    {
        driver.get().quit();
        driver.remove();
    }



}

