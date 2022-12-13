package com.orangehrmlive.opensourcedemo.testbase;

import com.orangehrmlive.opensourcedemo.propertyreader.PropertyReader;
import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Jay Vaghani
 */
public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod (alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod (alwaysRun = true)
    public void tearDown(){
        closeBrowser();
    }
}
