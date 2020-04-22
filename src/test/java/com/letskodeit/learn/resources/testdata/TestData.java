package com.letskodeit.learn.resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    //data provider
    @DataProvider(name = "PracticePage")
    //method returning a two dimensional object
    public Object[][] getDataPracticePage() {
        //object creation of the two dimensional Object[][]
        return new Object[][]{
                //adding data to the two dimensional Object[][]
                {"Practice Page"}
        };
    }

    @DataProvider(name = "LoginPage")
    public Object[][] getDataLoginPage() {
        return new Object[][]{
                {"Log In to Let's Kode It"}
        };
    }


    @DataProvider(name = "SignUpPage")
    public Object[][] getDataSignUpPage() {
        return new Object[][]{
                {"Sign Up to Let's Kode It"}
        };
    }

}