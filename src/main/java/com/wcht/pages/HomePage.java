package com.wcht.pages;/*
 *Vinay Creation
 *Date of Creation
 */

import com.wcht.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

//    //list of elements and their locations
//    By downArrowButton = By.xpath("//button[@class='home-carousel__down-arrow js-to-content']");
//    By betterHomesText = By.xpath("//div[@class='grid-column']//h1");

    @FindBy(xpath = "//button[@class='home-carousel__down-arrow js-to-content']" )
    WebElement _downArrowButton;
    @FindBy(xpath = "//div[@class='grid-column']//h1")
    WebElement _betterHomesText;


    //methods performing actions on elements
    public void clickOnDownArrowButton() {
        Reporter.log("Clicking on Down Arrow Button " + _downArrowButton + "<br>");
        clickOnElement(_downArrowButton);
        log.info("Clicking on Down Arrow Button " + _downArrowButton);

    }

    public void verifyBetterHomesText() {
        Reporter.log("verify betterHomes Text " + _betterHomesText + "<br>");
        verifyTextAssertMethod(_betterHomesText,"Better homes, friendlier communities – together");
        log.info("verify betterHomes Text " + _betterHomesText);
    }

}
