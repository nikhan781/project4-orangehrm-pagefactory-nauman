package com.orangehrmlive.opensourcedemo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.opensourcedemo.customlisteners.CustomListeners;
import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class LoginPage extends Utility {

    //Declaring WebElement type variables
    @CacheLookup
    @FindBy(name = "username")
    WebElement userNameField;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(css = "button[type='submit']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPasswordLink;

    //This method will send text to user field
    public void enterUserName(String userName) {
        Reporter.log("Enter user name " + userName + " to username field " + userNameField.toString());
        sendTextToElement(userNameField, userName);
        CustomListeners.test.log(Status.PASS, "Enter user name " + userName);
    }

    //This method will send text to password field
    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter password " + password);
    }

    //This method will click on log in button
    public void clickOnLoginButton() {

        Reporter.log("Clicking on Login Button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on Login Button");
    }

    //This method will click on forgot password link
    public void clickOnForgotPasswordLink() {
        Reporter.log("Click on forgot password link" + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
        CustomListeners.test.log(Status.PASS, "Click on password link");
    }

}
