package com.orangehrmlive.opensourcedemo.testsuite;

import com.orangehrmlive.opensourcedemo.customlisteners.CustomListeners;
import com.orangehrmlive.opensourcedemo.pages.DashboardPage;
import com.orangehrmlive.opensourcedemo.pages.LoginPage;
import com.orangehrmlive.opensourcedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    //Creating objects of 2 pages classes
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Invoking method from Login Page class to enter username
        loginPage.enterUserName("Admin");
        //Invoking method from Login Page class to enter password
        loginPage.enterPassword("admin123");
        //Invoking method from Login Page class to click on login button
        loginPage.clickOnLoginButton();
        //Invoking method from dashboard Page class to verify text
        Assert.assertEquals(dashboardPage.getDashboardTextAfterSignIn(), "Dashboard", "Dashboard is not displayed");
    }

}
