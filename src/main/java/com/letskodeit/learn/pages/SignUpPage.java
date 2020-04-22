package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignUpPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    @FindBy(xpath = "//h1")
    WebElement _signUpToLetsKodeIt;

    public void verifyTextSignUpToLetsKodeIt(String verifyTxt) {
        Reporter.log(" Verify text" + verifyTxt + " is displayed " + _signUpToLetsKodeIt.toString() + "<br>");
        verifyTextAssertMethod(_signUpToLetsKodeIt, verifyTxt);
        log.info(" Verify text" + verifyTxt + " is displayed " + _signUpToLetsKodeIt.toString());
    }

}
