package com.wcht.testbase;/*
 *Vinay Creation
 *Date of Creation
 */

import com.wcht.browserselector.BrowserSelector;
import com.wcht.loadproperty.Loadproperty;
import com.wcht.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends Utility {
    BrowserSelector browserSelector = new BrowserSelector();
    Loadproperty loadProperty = new Loadproperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    //opens Browser
    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    //closes Browser
    @AfterMethod(groups = {"Regression","Smoke","Sanity"})
    public void closeBrowser() {
        driver.quit();
    }

}
