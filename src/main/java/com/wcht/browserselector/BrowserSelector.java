package com.wcht.browserselector;/*
 *Vinay Creation
 *Date of Creation
 */

import com.wcht.basepage.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends BasePage {

    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    public String projectpath = System.getProperty("user.dir");



    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", projectpath + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            log.info("chrome browser selected");

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.getProperty("webdriver.gecko.driver", projectpath + "/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {

            System.getProperty("webdriver.ie.driver", projectpath + "/driver/IEDriverServer.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong browser name");
        }


    }

}
