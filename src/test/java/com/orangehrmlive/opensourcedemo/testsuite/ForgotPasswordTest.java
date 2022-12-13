package com.orangehrmlive.opensourcedemo.testsuite;

import com.orangehrmlive.opensourcedemo.customlisteners.CustomListeners;
import com.orangehrmlive.opensourcedemo.pages.ForgotPasswordPage;
import com.orangehrmlive.opensourcedemo.pages.LoginPage;
import com.orangehrmlive.opensourcedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ForgotPasswordTest extends BaseTest {

    //Declaring two classes Objects
    LoginPage loginPage;
    ForgotPasswordPage forgotPasswordPage;

    // This method contains objects of Pages
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        forgotPasswordPage = new ForgotPasswordPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //Invoking method from Login Page class to click on forgot password link
        loginPage.clickOnForgotPasswordLink();
        //Invoking method from forgot password page to verify text
        Assert.assertEquals(forgotPasswordPage.getResetPasswordText(), "Reset Password", "Forgot Password page is not displayed");
    }
}
