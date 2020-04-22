package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(css = "h1.text-center")
    WebElement _logInToLetsKodeIt;

    public void verifyTextLogInToLetsKodeIt(String loginText) {
        Reporter.log(" Verify text on login screen: " + loginText + " is displayed " + _logInToLetsKodeIt.toString() + "<br>");
        verifyTextAssertMethod(_logInToLetsKodeIt, loginText);
        log.info(" Verify text on login screen: " + loginText + " is displayed " + _logInToLetsKodeIt.toString());
    }

}