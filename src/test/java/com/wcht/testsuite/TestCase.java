package com.wcht.testsuite;/*
 *Vinay Creation
 *Date of Creation
 */

import com.wcht.pages.HomePage;
import com.wcht.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends TestBase {

    HomePage homePage;

    @BeforeMethod(groups = {"Regration","Smoke","Sanity"})
    public void setUp(){
        homePage = new HomePage();

    }
    @Test(groups = {"regression","Smoke","Sanity"})
    public void verifyScrollDownHomepageViaDownArrowButton(){
        homePage.clickOnDownArrowButton();
        homePage.verifyBetterHomesText();
    }

}
