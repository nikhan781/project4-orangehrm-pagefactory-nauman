package com.orangehrmlive.opensourcedemo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.opensourcedemo.customlisteners.CustomListeners;
import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {

    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(css = "h6[class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement resetPasswordMessage;

    //This method will get message when new page is loaded
    public String getResetPasswordText() {
        Reporter.log("The Reset Password Text is " + resetPasswordMessage.toString());
        CustomListeners.test.log(Status.PASS, "The password reset text is " + resetPasswordMessage.getText());
        return getTextFromElement(resetPasswordMessage);
    }
}
