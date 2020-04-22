package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.LoginPage;
import com.letskodeit.learn.pages.PracticePage;
import com.letskodeit.learn.pages.SignUpPage;
import com.letskodeit.learn.resources.testdata.TestData;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends TestBase {

    HomePage homePage;
    PracticePage practicePage;
    LoginPage loginPage;
    SignUpPage signUpPage;

    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void setUp() {
        homePage = new HomePage();
        practicePage = new PracticePage();
        loginPage = new LoginPage();
        signUpPage = new SignUpPage();
    }

    @Test (groups = {"Regression","Smoke","Sanity"} , dataProvider = "PracticePage", dataProviderClass = TestData.class)
    public void navigateSuccessfullyToPracticePage(String verifyText) {
        //click on Practice link
        homePage.clickOnPracticeLink();
        //verify text on Practice page
        practicePage.verifyTextPracticePage(verifyText);
    }

    @Test (groups = {"Regression","Smoke"}, dataProvider = "LoginPage", dataProviderClass = TestData.class)
    public void navigateSuccessfullyToLoginPage(String loginText) {
        //click on Login link
        homePage.clickOnLoginLink();
        //verify text on Login page
        loginPage.verifyTextLogInToLetsKodeIt(loginText);
    }

    @Test (groups = {"Regression"}, dataProvider = "SignUpPage", dataProviderClass = TestData.class)
    public void navigateSuccessfullyToSignupPage(String verifyText) {
        //click on SignUp button
        homePage.clickOnSignUpBtn();
        //verify text on SignUp page
        signUpPage.verifyTextSignUpToLetsKodeIt(verifyText);
    }

    @Test (groups = {"Regression"})
    public void userShouldSelectHondaElementFromDropDownMenu() {
        //click on Practice link
        homePage.clickOnPracticeLink();
        //select Honda from dropdown menu
        practicePage.selectFromDropDownMenu();
    }

}
