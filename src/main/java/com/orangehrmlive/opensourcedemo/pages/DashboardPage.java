package com.orangehrmlive.opensourcedemo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.opensourcedemo.customlisteners.CustomListeners;
import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DashboardPage extends Utility {

    //Declaring WebElement type variable
    @CacheLookup
    @FindBy(css = "h6[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement dashboardText;

    //This method will get message upon successful login
    public String getDashboardTextAfterSignIn() {
        Reporter.log("The Dashboard Text is " + dashboardText.toString());
        CustomListeners.test.log(Status.PASS, "The Dashboard Text is "+dashboardText.getText());
        return getTextFromElement(dashboardText);
    }
}
